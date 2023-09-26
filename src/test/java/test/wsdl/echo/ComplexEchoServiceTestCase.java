/**
 * ComplexEchoServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.echo;

import test.wsdl.dataobjects.echo.ArrayOfNamedValue;
import test.wsdl.dataobjects.echo.ComplexEchoServiceSoapBindingStub;
import test.wsdl.dataobjects.echo.ComplexEchoService_ServiceLocator;
import test.wsdl.dataobjects.echo.Echo;
import test.wsdl.dataobjects.echo.MyComplexType;
import test.wsdl.dataobjects.echo.MyComplexType2;
import test.wsdl.dataobjects.echo.MyElement2Response;
import test.wsdl.dataobjects.echo.NamedValue;
import test.wsdl.dataobjects.echo.NamedValueSet;
import test.wsdl.dataobjects.echo.holders.MyComplexTypeHolder;

public class ComplexEchoServiceTestCase extends junit.framework.TestCase {
    public ComplexEchoServiceTestCase(String name) {
        super(name);
    }

    public void testComplexEchoServiceWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ComplexEchoService_ServiceLocator().getComplexEchoServiceAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ComplexEchoService_ServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ComplexEchoServiceEcho() {
        Echo binding;
        try {
            binding = new ComplexEchoService_ServiceLocator().getComplexEchoService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertTrue("binding is null", binding != null);

        try {
            MyComplexType complexType = new MyComplexType();
            MyComplexTypeHolder complexTypeHolder =
                    new MyComplexTypeHolder(complexType);
            binding.echo(complexTypeHolder);
            assertTrue(complexTypeHolder.value.getSimpleItem().equals("MY_SIMPLE_ITEM"));
        }
        catch (java.rmi.RemoteException re) {
            throw new junit.framework.AssertionFailedError("Remote Exception caught: " + re);
        }
    }

    public void test2ComplexEchoServiceEcho2() throws Exception {
        ComplexEchoServiceSoapBindingStub binding;
        try {
            binding = (ComplexEchoServiceSoapBindingStub)
                    new ComplexEchoService_ServiceLocator().getComplexEchoService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);
        // Time out after a minute
        binding.setTimeout(60000);
        MyComplexType2 request = new MyComplexType2();
        request.setUsername("xxx");
        request.setPassword("yyy");
        request.setOptions(new NamedValue[]{
            new NamedValue("dummy1", "dummy_val1"),
            new NamedValue("dummy2",
                    new NamedValueSet(new ArrayOfNamedValue(new NamedValue[]{
                        new NamedValue("dummy2-1", "val2-1"),
                        new NamedValue("dummy2-2", new Integer(314))
                    })))
        });
        // Test operation
        MyElement2Response response = binding.echo2(request);
        // TBD - validate results
    }

    public void test2ComplexEchoServiceEcho21() throws Exception {
        ComplexEchoServiceSoapBindingStub binding;
        try {
            binding = (ComplexEchoServiceSoapBindingStub)
                    new ComplexEchoService_ServiceLocator().getComplexEchoService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);
        // Time out after a minute
        binding.setTimeout(60000);
        MyComplexType2 request = new MyComplexType2();
        request.setUsername("xxx");
        request.setPassword("yyy");
        request.setOptions(new NamedValue[]{
            new NamedValue("dummy1", "dummy_val1"),
            new NamedValue("dummy2", new NamedValue[]{
                new NamedValue("dummy2-1", "val2-1"),
                new NamedValue("dummy2-2", new Integer(314))
            })
        });
        // Test operation
        NamedValue[] value = null;

        MyElement2Response response = binding.echo2(request);
        // TBD - validate results
    }
}
