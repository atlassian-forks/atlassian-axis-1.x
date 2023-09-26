/**
 * AdaptiveServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.adaptive;

import java.util.Arrays;
import junit.framework.TestCase;
import test.wsdl.dataobjects.adaptive.AdaptiveInterfaceBindingStub;
import test.wsdl.dataobjects.adaptive.AdaptiveServiceLocator;
import test.wsdl.dataobjects.adaptive.ApplicationInfo;
import test.wsdl.dataobjects.adaptive.ResourceInfo;

public class AdaptiveServiceTestCase extends TestCase {
    public AdaptiveServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testAdaptiveWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new AdaptiveServiceLocator().getAdaptiveAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new AdaptiveServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1AdaptiveGetServiceDescription() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        ResourceInfo[] value = null;
        value = binding.rankResources(new ResourceInfo[0], new ApplicationInfo());
        // TBD - validate results
        assertTrue(value.length > 0);
        assertEquals(value[0].getId(), "Adaptive #1");
        java.lang.Object[] collection = value[0].getProperties().getCollection();
        assertTrue(collection.length > 0);
        assertTrue(Arrays.equals(collection, new String[]{"A","B","C"}));
    }

    public void test3AdaptiveEstimateTransferTime() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        int[] value = null;
        value = binding.estimateTransferTime(true, new ResourceInfo(), new ResourceInfo[0], 0, java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test4AdaptiveLogDataTransfer() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        binding.logDataTransfer(new ResourceInfo(), new ResourceInfo(), 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test5AdaptiveEstimateUsage() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        value = binding.estimateUsage(true, new ResourceInfo(), new java.lang.String(), 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test6AdaptiveEstimateMultipleUsage() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        value = binding.estimateMultipleUsage(true, new ResourceInfo[0], new java.lang.String[0], 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

    public void test7AdaptiveEstimateNetworkGraph() throws Exception {
        AdaptiveInterfaceBindingStub binding;
        try {
            binding = (AdaptiveInterfaceBindingStub)
                          new AdaptiveServiceLocator().getAdaptive();
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
        value = binding.estimateNetworkGraph(true, new ResourceInfo[0], 0, java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        // TBD - validate results
    }

}
