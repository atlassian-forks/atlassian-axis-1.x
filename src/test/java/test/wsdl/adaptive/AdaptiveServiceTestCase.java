/**
 * AdaptiveServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.adaptive;

import java.util.Arrays;

public class AdaptiveServiceTestCase extends junit.framework.TestCase {
    public AdaptiveServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testAdaptiveWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptiveAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new test.wsdl.adaptive.AdaptiveServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1AdaptiveGetServiceDescription() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        java.lang.String value = null;
        value = binding.getServiceDescription();
        // TBD - validate results
    }

    public void test2AdaptiveRankResources() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        // Fix for test case error,
        // faultString: java.io.IOException: java.io.IOException: Non nillable element &apos;dummy&apos; is null.
        test.wsdl.adaptive.types.KeyValue dummy = new test.wsdl.adaptive.types.KeyValue();
        dummy.setKey("someKey");
        dummy.setValue("someValue");
        test.wsdl.adaptive.types.ApplicationInfo appInfo = new test.wsdl.adaptive.types.ApplicationInfo();
        appInfo.setDummy(dummy);
        appInfo.setProperties(new test.wsdl.adaptive.types.internal.Vector());
        appInfo.setId("app123");
        test.wsdl.adaptive.types.ResourceInfo[] value = null;
        value = binding.rankResources(new test.wsdl.adaptive.types.ResourceInfo[0], appInfo);
        // TBD - validate results
        assertTrue(value.length > 0);
        assertEquals(value[0].getId(), "Adaptive #1");
        java.lang.Object[] collection = value[0].getProperties().getCollection();
        assertTrue(collection.length > 0);
        assertTrue(Arrays.equals(collection, new String[]{"A","B","C"}));
    }

    public void test3AdaptiveEstimateTransferTime() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        test.wsdl.adaptive.types.ResourceInfo resourceInfo = new test.wsdl.adaptive.types.ResourceInfo();
        // Fix for test case error,
        // faultString: java.io.IOException: java.io.IOException: Non nillable element &apos;properties&apos; is null.
        resourceInfo.setProperties(new test.wsdl.adaptive.types.internal.Vector());
        resourceInfo.setId("resource1");
        int[] value = null;
        value = binding.estimateTransferTime(true, resourceInfo, new test.wsdl.adaptive.types.ResourceInfo[0], 0, java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test4AdaptiveLogDataTransfer() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        test.wsdl.adaptive.types.ResourceInfo resourceInfo1 = new test.wsdl.adaptive.types.ResourceInfo();
        // Fix for test case error,
        // faultString: java.io.IOException: java.io.IOException: Non nillable element &apos;properties&apos; is null.
        resourceInfo1.setProperties(new test.wsdl.adaptive.types.internal.Vector());
        resourceInfo1.setId("resource1");
        test.wsdl.adaptive.types.ResourceInfo resourceInfo2 = new test.wsdl.adaptive.types.ResourceInfo();
        resourceInfo2.setProperties(new test.wsdl.adaptive.types.internal.Vector());
        resourceInfo2.setId("resource2");
        binding.logDataTransfer(resourceInfo1, resourceInfo2, 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test5AdaptiveEstimateUsage() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        test.wsdl.adaptive.types.ResourceInfo resourceInfo = new test.wsdl.adaptive.types.ResourceInfo();
        // Fix for test case error,
        // faultString: java.io.IOException: java.io.IOException: Non nillable element &apos;properties&apos; is null.
        resourceInfo.setProperties(new test.wsdl.adaptive.types.internal.Vector());
        resourceInfo.setId("resource1");
        java.lang.String value = null;
        value = binding.estimateUsage(true, resourceInfo, new java.lang.String(), 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test6AdaptiveEstimateMultipleUsage() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        java.lang.String[][] value = null;
        value = binding.estimateMultipleUsage(true, new test.wsdl.adaptive.types.ResourceInfo[0], new java.lang.String[0], 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test7AdaptiveEstimateNetworkGraph() throws Exception {
        test.wsdl.adaptive.AdaptiveInterfaceBindingStub binding;
        try {
            binding = (test.wsdl.adaptive.AdaptiveInterfaceBindingStub)
                          new test.wsdl.adaptive.AdaptiveServiceLocator().getAdaptive();
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
        java.lang.String[][] value = null;
        value = binding.estimateNetworkGraph(true, new test.wsdl.adaptive.types.ResourceInfo[0], 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

}
