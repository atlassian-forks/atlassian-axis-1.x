/**
 * FaultServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.FaultService;

public interface FaultServicePortType extends java.rmi.Remote {
    public float getQuote(java.lang.String tickerSymbol) throws java.rmi.RemoteException, test.wsdl.dataobjects.FaultService.InvalidTickerFaultMessage;
    public int throwFault(int a, java.lang.String b, float c) throws java.rmi.RemoteException, test.wsdl.dataobjects.FaultService.DerivedFault;
    public int throwExtensionFault(java.lang.String description) throws java.rmi.RemoteException, test.wsdl.dataobjects.FaultService.ExtensionFault;
}
