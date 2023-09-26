/**
 * WSDLInteropTestDocLitPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.interoptestdoclit;

public interface WSDLInteropTestDocLitPortType extends java.rmi.Remote {
    public java.lang.String echoString(java.lang.String a) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.interoptestdoclit.ArrayOfstring_literal echoStringArray(test.wsdl.dataobjects.interoptestdoclit.ArrayOfstring_literal a) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.interoptestdoclit.SOAPStruct echoStruct(test.wsdl.dataobjects.interoptestdoclit.SOAPStruct a) throws java.rmi.RemoteException;
    public void echoVoid() throws java.rmi.RemoteException;
}
