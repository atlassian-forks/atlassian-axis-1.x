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
package test.client;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.axis.client.Service;
import org.apache.axis.client.ServiceFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Test cases for ServiceFactory.
 */
public class TestServiceFactory extends TestCase {

    public TestServiceFactory(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(TestServiceFactory.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        // Set the mock JNDI context factory
        System.setProperty(javax.naming.Context.INITIAL_CONTEXT_FACTORY, MockInitialContextFactory.class.getName());
        MockInitialContextFactory.reinit();
    }

    @Override
    protected void tearDown() throws Exception {
        System.clearProperty(javax.naming.Context.INITIAL_CONTEXT_FACTORY);
        super.tearDown();
    }

    /**
     * Tests the security fix for CVE-2023-51441 which validates JNDI names
     * and blocks dangerous protocols (LDAP, RMI, JMS, JMX, JRMP, JAVA, DNS, IIOP, CORBANAME).
     */
    public void testGetServiceJndiSecurityValidation() {
        // Test cases for dangerous JNDI protocols that should be blocked
        String[] dangerousJndiNames = {
            "ldap://attacker.com:389/ou=evil",           // LDAP protocol
            "rmi://attacker.com:1099/evil",              // RMI protocol
            "jms://attacker.com:61616/queue",            // JMS protocol
            "jmx://attacker.com:7000",                   // JMX protocol
            "jrmp://attacker.com:1099",                  // JRMP protocol
            "java:comp/env/jdbc/datasource",             // JAVA protocol
            "dns://attacker.com",                        // DNS protocol
            "iiop://attacker.com:2809",                  // IIOP protocol
            "corbaname:iiop:attacker.com:2809#test",     // CORBANAME protocol
            "LDAP://ATTACKER.COM:389",                   // Case-insensitive (uppercase)
            "RmI://attacker.com:1099",                   // Case-insensitive (mixed case)
            "myprefix_LDAP_suffix",                      // Protocol in middle of string
            "ldap://server/rmi://other"                  // Multiple protocols
        };

        // Verify all dangerous JNDI names are blocked
        for (int i = 0; i < dangerousJndiNames.length; i++) {
            Map environment = new HashMap();
            environment.put("jndiName", dangerousJndiNames[i]);
            Service result = ServiceFactory.getService(environment);
            assertNull("Service should be null for dangerous JNDI name: " + dangerousJndiNames[i], result);
        }
    }

    public void testSafeJndiName() {
        // Safe JNDI names should not be blocked by security check and should not return null
        String[] safeJndiNames = {
                "http://localhost:8080/myservice",          // HTTP (not blocked)
                "https://localhost:8443/service",           // HTTPS (not blocked)
                "file:///var/services/axis",                // File protocol (not blocked)
                "local/axis/service",                       // Local namespace
                "comp/env/datasource",                      // Tomcat-like namespace
                "axisServiceName",                          // Default safe name
        };

        for (int i = 0; i < safeJndiNames.length; i++) {
            Map environment = new HashMap();
            environment.put("jndiName", safeJndiNames[i]);
            Service result = ServiceFactory.getService(environment);
            assertNotNull("Service should not be null for safe JNDI name: " + safeJndiNames[i], result);
        }
    }

    public void testInvalidJndiName() {
        // Invalid JNDI names should result in a null service
        for (String invalidName : MockInitialContextFactory.INVALID_JNDI_NAMES) {
            Map environment = new HashMap();
            environment.put("jndiName", invalidName);

            // The ServiceFactory should handle the NamingException and return null
            Service result = ServiceFactory.getService(environment);
            assertNull("Service should be null for invalid JNDI name: " + invalidName, result);
        }
    }

    public void testNullJndiName() {
        // Null jndiName should not throw NullPointerException
        Map environment = new HashMap();
        try {
            ServiceFactory.getService(environment);
        } catch (NullPointerException e) {
            fail("getService should not throw NullPointerException when jndiName is null: " + e.getMessage());
        }
    }

    public void testEmptyEnvironmentMap() {
        // Empty environment map should not throw exception
        Map environment = new HashMap();
        try {
            ServiceFactory.getService(environment);
        } catch (Exception e) {
            fail("getService should not throw exception with empty environment: " + e.getMessage());
        }
    }
}
