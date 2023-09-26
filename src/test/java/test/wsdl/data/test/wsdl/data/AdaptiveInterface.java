/**
 * AdaptiveInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.data;

public interface AdaptiveInterface extends java.rmi.Remote {
    public java.lang.String getServiceDescription() throws java.rmi.RemoteException;
    public test.wsdl.data.ResourceInfo[] rankResources(test.wsdl.data.ResourceInfo[] arrayOfResourceInfo_1, test.wsdl.data.ApplicationInfo applicationInfo_2) throws java.rmi.RemoteException;
    public int[] estimateTransferTime(boolean boolean_1, test.wsdl.data.ResourceInfo resourceInfo_2, test.wsdl.data.ResourceInfo[] arrayOfResourceInfo_3, long long_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException;
    public void logDataTransfer(test.wsdl.data.ResourceInfo resourceInfo_1, test.wsdl.data.ResourceInfo resourceInfo_2, long long_3, java.util.Calendar calendar_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException;
    public java.lang.String estimateUsage(boolean boolean_1, test.wsdl.data.ResourceInfo resourceInfo_2, java.lang.String string_3, int int_4, java.util.Calendar calendar_5, java.util.Calendar calendar_6) throws java.rmi.RemoteException;
    public java.lang.String[][] estimateMultipleUsage(boolean boolean_1, test.wsdl.data.ResourceInfo[] arrayOfResourceInfo_2, java.lang.String[] arrayOfString_3, int int_4, java.util.Calendar calendar_5, java.util.Calendar calendar_6) throws java.rmi.RemoteException;
    public java.lang.String[][] estimateNetworkGraph(boolean boolean_1, test.wsdl.data.ResourceInfo[] arrayOfResourceInfo_2, int int_3, java.util.Calendar calendar_4, java.util.Calendar calendar_5) throws java.rmi.RemoteException;
}
