/**
 * MyServiceServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2alpha Dec 06, 2003 (10:46:24 EST) WSDL2Java emitter.
 */

package test.wsdl.date;

import test.wsdl.dataobjects.testdate.MyBean;
import test.wsdl.dataobjects.testdate.MyServiceServiceLocator;
import test.wsdl.dataobjects.testdate.TestdateSoapBindingStub;

public class MyServiceServiceTestCase extends junit.framework.TestCase {
    public MyServiceServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testtestdateWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new MyServiceServiceLocator().gettestdateAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new MyServiceServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1testdateGetInfo() throws Exception {
        TestdateSoapBindingStub binding;
        try {
            binding = (TestdateSoapBindingStub)
                          new MyServiceServiceLocator().gettestdate();
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
        MyBean value = null;
        value = binding.getInfo();
        // TBD - validate results
        System.out.println(value.getDate());
    }

}
