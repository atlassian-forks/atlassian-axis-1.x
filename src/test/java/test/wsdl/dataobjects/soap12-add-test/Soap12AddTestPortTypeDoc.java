/**
 * Soap12AddTestPortTypeDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-add-test;

public interface Soap12AddTestPortTypeDoc extends java.rmi.Remote {
    // getTime is a notification style operation and is unsupported.;
    public java.lang.String echoString(java.lang.String inputString) throws java.rmi.RemoteException;
    public void echoSenderFault(java.lang.Object inElement) throws java.rmi.RemoteException;
    public void echoReceiverFault(java.lang.Object inElement) throws java.rmi.RemoteException;
}
