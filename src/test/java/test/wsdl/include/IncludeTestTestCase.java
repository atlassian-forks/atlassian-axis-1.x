/**
 * IncludeTestTestCase.java
 *
 * Custom test case for include test to provide valid sample data
 * for non-nillable elements in the Address schema.
 */

package test.wsdl.include;

public class IncludeTestTestCase extends junit.framework.TestCase {
    public IncludeTestTestCase(java.lang.String name) {
        super(name);
    }

    public void testIncludeTestWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new test.wsdl.include.IncludeTestLocator().getIncludeTestAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new test.wsdl.include.IncludeTestLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1IncludeTestAddEntry() throws Exception {
        test.wsdl.include.AddressBookSOAPBindingStub binding;
        try {
            binding = (test.wsdl.include.AddressBookSOAPBindingStub)
                          new test.wsdl.include.IncludeTestLocator().getIncludeTest();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation - create a valid Address object with required fields
        test.wsdl.include.Address address = new test.wsdl.include.Address();
        address.setCity("Test City");  // Required field (non-nillable)
        address.setState(test.wsdl.include.StateType.TX);  // Required field
        address.setZip(12345);  // Required field

        // Create required Phone object
        test.wsdl.include.Phone phone = new test.wsdl.include.Phone();
        phone.setAreaCode(555);
        phone.setExchange("123");
        phone.setNumber("4567");
        address.setPhoneNumber(phone);  // Required field

        // Optional fields (nillable)
        address.setStreetNum(new java.lang.Integer(123));
        address.setStreetName("Test Street");

        // Test addEntry operation - should complete without throwing an exception
        try {
            binding.addEntry("Test Name", address);
        } catch (Exception e) {
            fail("addEntry should not throw an exception: " + e.getMessage());
        }
    }

    public void test2IncludeTestGetAddressFromName() throws Exception {
        test.wsdl.include.AddressBookSOAPBindingStub binding;
        try {
            binding = (test.wsdl.include.AddressBookSOAPBindingStub)
                          new test.wsdl.include.IncludeTestLocator().getIncludeTest();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation - Add an entry for retrieving later
        test.wsdl.include.Address testAddress = new test.wsdl.include.Address();
        testAddress.setCity("Test City");
        testAddress.setState(test.wsdl.include.StateType.TX);
        testAddress.setZip(90210);

        test.wsdl.include.Phone testPhone = new test.wsdl.include.Phone();
        testPhone.setAreaCode(555);
        testPhone.setExchange("123");
        testPhone.setNumber("4567");
        testAddress.setPhoneNumber(testPhone);

        testAddress.setStreetNum(new java.lang.Integer(456));
        testAddress.setStreetName("Test Avenue");

        // Add the test entry
        binding.addEntry("Test User", testAddress);

        // Retrieve and validate
        test.wsdl.include.Address retrievedAddress = binding.getAddressFromName("Test User");

        // Validate that it returns a valid address object
        assertNotNull("Retrieved address should not be null", retrievedAddress);
        assertEquals("City should match", "Test City", retrievedAddress.getCity());
        assertEquals("State should match", test.wsdl.include.StateType.TX, retrievedAddress.getState());
        assertEquals("Zip should match", 90210, retrievedAddress.getZip());

        // Validate phone number
        assertNotNull("Phone number should not be null", retrievedAddress.getPhoneNumber());
        assertEquals("Area code should match", 555, retrievedAddress.getPhoneNumber().getAreaCode());
        assertEquals("Exchange should match", "123", retrievedAddress.getPhoneNumber().getExchange());
        assertEquals("Number should match", "4567", retrievedAddress.getPhoneNumber().getNumber());

        // Validate optional fields
        assertEquals("Street number should match", new java.lang.Integer(456), retrievedAddress.getStreetNum());
        assertEquals("Street name should match", "Test Avenue", retrievedAddress.getStreetName());
    }
}
