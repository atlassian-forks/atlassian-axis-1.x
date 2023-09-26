/**
 * AdaptiveInterfaceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.adaptive;

import test.wsdl.adaptive.ApplicationInfo;
import test.wsdl.adaptive.ResourceInfo;
import test.wsdl.adaptive.Vector;
import test.wsdl.adaptive.ApplicationInfo;
import test.wsdl.adaptive.AdaptiveInterface;
import test.wsdl.adaptive.ResourceInfo;

import java.rmi.RemoteException;
import java.util.Calendar;

public class AdaptiveInterfaceBindingImpl implements AdaptiveInterface{
    public java.lang.String getServiceDescription() throws java.rmi.RemoteException {
        return null;
    }


    @Override
    public int[] estimateTransferTime(boolean boolean_1, ResourceInfo resourceInfo_2, ResourceInfo[] arrayOfResourceInfo_3, long long_4, Calendar calendar_5) throws RemoteException {
        return new int[0];
    }

    @Override
    public void logDataTransfer(ResourceInfo resourceInfo_1, ResourceInfo resourceInfo_2, long long_3, Calendar calendar_4, Calendar calendar_5) throws RemoteException {

    }

    @Override
    public String estimateUsage(boolean boolean_1, ResourceInfo resourceInfo_2, String string_3, int int_4, Calendar calendar_5, Calendar calendar_6) throws RemoteException {
        return null;
    }

    @Override
    public String[][] estimateMultipleUsage(boolean boolean_1, ResourceInfo[] arrayOfResourceInfo_2, String[] arrayOfString_3, int int_4, Calendar calendar_5, Calendar calendar_6) throws RemoteException {
        return new String[0][];
    }

    @Override
    public String[][] estimateNetworkGraph(boolean boolean_1, ResourceInfo[] arrayOfResourceInfo_2, int int_3, Calendar calendar_4, Calendar calendar_5) throws RemoteException {
        return new String[0][];
    }
}
