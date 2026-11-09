/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.faults;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.handlers.soap.SOAPService;
import org.apache.axis.message.SOAPFault;
import org.apache.axis.server.AxisServer;
import org.apache.axis.utils.ClassUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

/** Security regression coverage for inbound SOAP fault dispatch (CVE-2026-90436). */
public class TestFaultDispatch {
    private static final String SOAP11 = "http://schemas.xmlsoap.org/soap/envelope/";
    private static final String SOAP12 = "http://www.w3.org/2003/05/soap-envelope";
    private static final String ARGUMENT = "harmless-constructor-marker";

    @Test
    public void soap11MustNotConstructAnUntrustedClassBeforeServiceHandlers() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP11, true, false);
    }

    @Test
    public void soap11MustNotInitializeAnUntrustedClassWithoutData() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP11, false, false);
    }

    @Test
    public void soap11MustRejectExceptionNameBeforeData() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP11, true, true);
    }

    @Test
    public void soap12MustNotConstructAnUntrustedClassBeforeServiceHandlers() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP12, true, false);
    }

    @Test
    public void soap12MustNotInitializeAnUntrustedClassWithoutData() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP12, false, false);
    }

    @Test
    public void soap12MustRejectExceptionNameBeforeData() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP12, true, true);
    }

    @Test
    public void registeredClassLoaderMustNotInitializeAnUntrustedClass() throws Exception {
        assertUntrustedClassIsNotExecuted(SOAP11, false, false, true);
    }

    @Test
    public void legitimateCustomAxisFaultStillDeserializes() throws Exception {
        Message message = message(SOAP11, CustomFault.class.getName(), true, false, new AxisServer());
        SOAPFault body = (SOAPFault) message.getSOAPEnvelope().getFirstBody();
        assertTrue(body.getFault() instanceof CustomFault);
        assertEquals(ARGUMENT, ((CustomFault) body.getFault()).argument);
        assertEquals("constructor-probe", body.getFault().getFaultString());
    }

    private static void assertUntrustedClassIsNotExecuted(String namespace, boolean withData,
                                                         boolean exceptionNameFirst) throws Exception {
        assertUntrustedClassIsNotExecuted(namespace, withData, exceptionNameFirst, false);
    }

    private static void assertUntrustedClassIsNotExecuted(String namespace, boolean withData,
                                                         boolean exceptionNameFirst,
                                                         boolean registeredLoader) throws Exception {
        ProbeState.initialized = false;
        ProbeState.constructedWith = null;
        boolean[] serviceHandlerRan = {false};
        SOAPService service = new SOAPService(new BasicHandler() {
            @Override
            public void invoke(MessageContext context) {
                serviceHandlerRan[0] = true;
            }
        });
        SimpleProvider configuration = new SimpleProvider();
        configuration.deployService("fault-test-service", service);
        AxisServer server = new AxisServer(configuration);
        MessageContext context = new MessageContext(server);
        // An inbound fault reaches Axis's forced parsing during service resolution,
        // before the service-specific request/authentication handlers are invoked.
        Message request = message(namespace, ConstructorProbe.class.getName(), withData,
                exceptionNameFirst, server);
        context.setRequestMessage(request);

        ClassLoader previousLoader = Thread.currentThread().getContextClassLoader();
        try {
            // Use a fresh definition on every run: resetting a flag cannot reset JVM
            // class initialization, and would make repeated tests falsely pass.
            ClassLoader probeLoader = freshProbeLoader();
            Thread.currentThread().setContextClassLoader(probeLoader);
            if (registeredLoader) {
                ClassUtils.setClassLoader(ConstructorProbe.class.getName(), probeLoader);
            }
            assertThrows(AxisFault.class, () -> server.invoke(context));
            SOAPFault body = (SOAPFault) request.getSOAPEnvelope().getFirstBody();
            assertNotNull(body.getFault());
            assertEquals("constructor-probe", body.getFault().getFaultString());
            assertFalse("service handler should not run during fault dispatch", serviceHandlerRan[0]);
            assertFalse("Untrusted class executed: initialized=" + ProbeState.initialized
                    + ", constructor argument=" + ProbeState.constructedWith,
                    ProbeState.initialized || ProbeState.constructedWith != null);
        } finally {
            if (registeredLoader) {
                ClassUtils.removeClassLoader(ConstructorProbe.class.getName());
            }
            Thread.currentThread().setContextClassLoader(previousLoader);
        }
    }

    private static Message message(String namespace, String className, boolean withData,
                                   boolean exceptionNameFirst, AxisServer server) {
        String exceptionName = "<exceptionName>" + className + "</exceptionName>";
        String data = withData ? "<data xsi:type=\"xsd:string\">" + ARGUMENT + "</data>" : "";
        String details = exceptionNameFirst ? exceptionName + data : data + exceptionName;
        String fault = SOAP11.equals(namespace)
                ? "<faultcode>soap:Server</faultcode><faultstring>constructor-probe</faultstring>"
                    + "<detail>" + details + "</detail>"
                : "<soap:Code><soap:Value>soap:Receiver</soap:Value></soap:Code>"
                    + "<soap:Reason><soap:Text xml:lang=\"en\">constructor-probe</soap:Text></soap:Reason>"
                    + "<soap:Detail>" + details + "</soap:Detail>";
        Message message = new Message("<soap:Envelope xmlns:soap=\"" + namespace + "\""
                + " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
                + " xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"
                + "<soap:Body><soap:Fault>" + fault + "</soap:Fault></soap:Body></soap:Envelope>");
        message.setMessageContext(new MessageContext(server));
        return message;
    }

    private static ClassLoader freshProbeLoader() throws IOException {
        String name = ConstructorProbe.class.getName();
        byte[] bytes;
        try (InputStream stream = TestFaultDispatch.class.getResourceAsStream(
                "/" + name.replace('.', '/') + ".class")) {
            assertNotNull(stream);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int count;
            while ((count = stream.read(buffer)) != -1) {
                output.write(buffer, 0, count);
            }
            bytes = output.toByteArray();
        }
        return new ClassLoader(TestFaultDispatch.class.getClassLoader()) {
            @Override
            protected Class<?> loadClass(String className, boolean resolve) throws ClassNotFoundException {
                if (!name.equals(className)) {
                    return super.loadClass(className, resolve);
                }
                Class<?> probe = findLoadedClass(className);
                if (probe == null) {
                    probe = defineClass(className, bytes, 0, bytes.length);
                }
                if (resolve) {
                    resolveClass(probe);
                }
                return probe;
            }
        };
    }

    public static class ProbeState {
        public static boolean initialized;
        public static String constructedWith;
    }

    public static class ConstructorProbe {
        static {
            ProbeState.initialized = true;
        }

        public ConstructorProbe(String argument) {
            ProbeState.constructedWith = argument;
        }
    }

    public static class CustomFault extends AxisFault {
        public final String argument;

        public CustomFault(String argument) {
            this.argument = argument;
        }
    }
}
