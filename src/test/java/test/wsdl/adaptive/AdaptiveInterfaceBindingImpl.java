/**
 * AdaptiveInterfaceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.adaptive;

import wsdl.adaptive.types.internal.Vector;

public class AdaptiveInterfaceBindingImpl implements wsdl.adaptive.AdaptiveInterface{
    public java.lang.String getServiceDescription() throws java.rmi.RemoteException {
        return null;
    }

    public wsdl.adaptive.types.ResourceInfo[] rankResources(wsdl.adaptive.types.ResourceInfo[] arrayOfResourceInfo_1, wsdl.adaptive.types.ApplicationInfo applicationInfo_2) throws java.rmi.RemoteException {
        wsdl.adaptive.types.ResourceInfo[] resources = new wsdl.adaptive.types.ResourceInfo[1];
        resources[0] = new wsdl.adaptive.types.ResourceInfo();
        resources[0].setId("Adaptive #1");
        wsdl.adaptive.types.internal.Vector v = new wsdl.adaptive.types.internal.Vector();
        v.setCollection(new String[]{"A","B","C"});
        resources[0].setProperties(v);
        return resources;
    }

    public int[] estimateTransferTime(boolean boolean_1, wsdl.adaptive.types.ResourceInfo resourceInfo_2, wsdl.adaptive.types.ResourceInfo[] arrayOfResourceInfo_3, long long_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException {
        return null;
    }

    public void logDataTransfer(wsdl.adaptive.types.ResourceInfo resourceInfo_1, wsdl.adaptive.types.ResourceInfo resourceInfo_2, long long_3, java.util.Calendar calendar_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException {
    }

    public java.lang.String estimateUsage(boolean boolean_1, wsdl.adaptive.types.ResourceInfo resourceInfo_2, java.lang.String string_3, int int_4, java.util.Calendar calendar_5, java.util.Calendar calendar_6) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String[][] estimateMultipleUsage(boolean boolean_1, wsdl.adaptive.types.ResourceInfo[] arrayOfResourceInfo_2, java.lang.String[] arrayOfString_3, int int_4, java.util.Calendar calendar_5, java.util.Calendar calendar_6) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String[][] estimateNetworkGraph(boolean boolean_1, wsdl.adaptive.types.ResourceInfo[] arrayOfResourceInfo_2, int int_3, java.util.Calendar calendar_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException {
        return null;
    }

}
