/**
 * WSDLInteropTestDocLitPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.interoptestdoclitparameters;

public interface WSDLInteropTestDocLitPortType extends java.rmi.Remote {
    public java.lang.String echoString(java.lang.String param0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.interoptestdoclitparameters.ArrayOfstring_literal echoStringArray(test.wsdl.dataobjects.interoptestdoclitparameters.ArrayOfstring_literal param0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.interoptestdoclitparameters.SOAPStruct echoStruct(test.wsdl.dataobjects.interoptestdoclitparameters.SOAPStruct param0) throws java.rmi.RemoteException;
    public void echoVoid() throws java.rmi.RemoteException;
}
