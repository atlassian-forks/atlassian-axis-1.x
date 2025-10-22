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
        // TBD - validate results
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

        // Test operation
        test.wsdl.names.javanames.MyAddress value = null;
        value = binding._public("John Doe");
        // TBD - validate results
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
        test.wsdl.names.javanames.MyPhone phone = new test.wsdl.names.javanames.MyPhone(555, "123", "4567");
        test.wsdl.names.javanames.MyAddress address = new test.wsdl.names.javanames.MyAddress(123, "Main St", "Anytown", "CA", 90210, phone);
        binding.capitalized("John Doe", address);
        // TBD - validate results
    }

}