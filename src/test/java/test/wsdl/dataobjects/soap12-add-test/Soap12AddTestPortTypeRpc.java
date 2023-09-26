/**
 * Soap12AddTestPortTypeRpc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-add-test;

public interface Soap12AddTestPortTypeRpc extends java.rmi.Remote {
    public void echoVoid() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-add-test.SOAPStruct echoSimpleTypesAsStruct(java.lang.String inputString, int inputInteger, float inputFloat) throws java.rmi.RemoteException;
    public java.lang.String echoString(java.lang.String inputString) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-add-test.SOAPStructTypes echoSimpleTypesAsStructOfSchemaTypes(java.lang.Object input1, java.lang.Object input2, java.lang.Object input3, java.lang.Object input4) throws java.rmi.RemoteException;
    public int echoInteger(int inputInteger) throws java.rmi.RemoteException;
    // getTime is a notification style operation and is unsupported.;
}
