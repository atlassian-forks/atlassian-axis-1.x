/**
 * WSDLInteropTestRpcEncPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.InteropTestRpcEnc;

public interface WSDLInteropTestRpcEncPortType extends java.rmi.Remote {
    public java.lang.String echoString(java.lang.String param0) throws java.rmi.RemoteException;
    public java.lang.String[] echoStringArray(java.lang.String[] param0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.InteropTestRpcEnc.SOAPStruct echoStruct(test.wsdl.dataobjects.InteropTestRpcEnc.SOAPStruct param0) throws java.rmi.RemoteException;
    public void echoVoid() throws java.rmi.RemoteException;
}
