/**
 * InheritancePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.InheritanceTest;

public interface InheritancePortType extends java.rmi.Remote {
    public float getLastTradePrice(java.lang.String tickerSymbol) throws java.rmi.RemoteException;
    public float getRealtimeLastTradePrice(java.lang.String tickerSymbol) throws java.rmi.RemoteException;
}
