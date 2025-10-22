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
        
        binding.addEntry("Test Name", address);
        // TBD - validate results
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

        // Test operation
        test.wsdl.include.Address value = null;
        value = binding.getAddressFromName(new java.lang.String());
        // TBD - validate results
    }
}