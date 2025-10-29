/**
 * JavaNamesServiceTestTestCase.java
 *
 * Custom test case that provides valid non-null data for required fields
 */

package test.wsdl.names.javanames;

public class JavaNamesServiceTestTestCase extends junit.framework.TestCase {
    public JavaNamesServiceTestTestCase(java.lang.String name) {
        super(name);
    }

    public void testJavaNamesWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new test.wsdl.names.javanames.JavaNamesServiceTestLocator().getJavaNamesAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new test.wsdl.names.javanames.JavaNamesServiceTestLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1JavaNames_new() throws Exception {
        test.wsdl.names.javanames.JavaNames_SOAPBindingStub binding;
        try {
            binding = (test.wsdl.names.javanames.JavaNames_SOAPBindingStub)
                          new test.wsdl.names.javanames.JavaNamesServiceTestLocator().getJavaNames();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation with valid data
        test.wsdl.names.javanames.MyPhone phone = new test.wsdl.names.javanames.MyPhone(555, "123", "4567");
        test.wsdl.names.javanames.MyAddress address = new test.wsdl.names.javanames.MyAddress(123, "Main St", "Anytown", "CA", 90210, phone);

        binding._new("John Doe", address);

        // Add a small delay to ensure the capitalized call completes
        Thread.sleep(100);

        // Verify the address was stored by retrieving it
        test.wsdl.names.javanames.MyAddress retrievedAddress = binding._public("John Doe");
        assertNotNull("Address should be retrievable after storing via capitalized", retrievedAddress);
        assertEquals("Street name should match", address.getStreetName(), retrievedAddress.getStreetName());
        assertEquals("Street number should match", address.getStreetNum(), retrievedAddress.getStreetNum());
        assertEquals("City should match", address.getCity(), retrievedAddress.getCity());
        assertEquals("State should match", address.getState(), retrievedAddress.getState());
        assertEquals("Zip should match", address.getZip(), retrievedAddress.getZip());

        // Verify the nested phone object round-trip
        test.wsdl.names.javanames.MyPhone retrievedPhone = retrievedAddress.getPhoneNumber();
        assertNotNull("Phone should be retrievable from address", retrievedPhone);
        assertEquals("Area code should match", phone.getAreaCode(), retrievedPhone.getAreaCode());
        assertEquals("Exchange should match", phone.getExchange(), retrievedPhone.getExchange());
        assertEquals("Number should match", phone.getNumber(), retrievedPhone.getNumber());
    }

    public void test2JavaNames_public() throws Exception {
        test.wsdl.names.javanames.JavaNames_SOAPBindingStub binding;
        try {
            binding = (test.wsdl.names.javanames.JavaNames_SOAPBindingStub)
                          new test.wsdl.names.javanames.JavaNamesServiceTestLocator().getJavaNames();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test _public operation - verify it returns null for unknown names
        test.wsdl.names.javanames.MyAddress value = binding._public("Unknown Person");
        assertNull("Should return null for unknown names", value);
    }

    public void test3JavaNamesCapitalized() throws Exception {
        test.wsdl.names.javanames.JavaNames_SOAPBindingStub binding;
        try {
            binding = (test.wsdl.names.javanames.JavaNames_SOAPBindingStub)
                          new test.wsdl.names.javanames.JavaNamesServiceTestLocator().getJavaNames();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation with valid data
        test.wsdl.names.javanames.MyPhone phone = new test.wsdl.names.javanames.MyPhone(415, "555", "0123");
        test.wsdl.names.javanames.MyAddress address = new test.wsdl.names.javanames.MyAddress(456, "Oak Ave", "Springfield", "NY", 12345, phone);

        binding.capitalized("Jane Smith", address);

        // Add a small delay to ensure the capitalized call completes
        Thread.sleep(100);

        // Verify the address was stored by retrieving it
        test.wsdl.names.javanames.MyAddress retrievedAddress = binding._public("Jane Smith");
        assertNotNull("Address should be retrievable after storing via capitalized", retrievedAddress);
        assertEquals("Street name should match", address.getStreetName(), retrievedAddress.getStreetName());
        assertEquals("Street number should match", address.getStreetNum(), retrievedAddress.getStreetNum());
        assertEquals("City should match", address.getCity(), retrievedAddress.getCity());
        assertEquals("State should match", address.getState(), retrievedAddress.getState());
        assertEquals("Zip should match", address.getZip(), retrievedAddress.getZip());

        // Verify the nested phone object
        test.wsdl.names.javanames.MyPhone retrievedPhone = retrievedAddress.getPhoneNumber();
        assertNotNull("Phone should be retrievable from address", retrievedPhone);
        assertEquals("Area code should match", phone.getAreaCode(), retrievedPhone.getAreaCode());
        assertEquals("Exchange should match", phone.getExchange(), retrievedPhone.getExchange());
        assertEquals("Number should match", phone.getNumber(), retrievedPhone.getNumber());
    }

}
