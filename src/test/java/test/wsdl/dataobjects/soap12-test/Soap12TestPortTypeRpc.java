/**
 * Soap12TestPortTypeRpc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-test;

public interface Soap12TestPortTypeRpc extends java.rmi.Remote {
    public void returnVoid() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-test.SOAPStruct echoStruct(test.wsdl.dataobjects.soap12-test.SOAPStruct inputStruct) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-test.SOAPStruct[] echoStructArray(test.wsdl.dataobjects.soap12-test.SOAPStruct[] inputStructArray) throws java.rmi.RemoteException;
    public void echoStructAsSimpleTypes(test.wsdl.dataobjects.soap12-test.SOAPStruct inputStruct, javax.xml.rpc.holders.StringHolder outputString, javax.xml.rpc.holders.IntHolder outputInteger, javax.xml.rpc.holders.FloatHolder outputFloat) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-test.SOAPStruct echoSimpleTypesAsStruct(java.lang.String inputString, int inputInteger, float inputFloat) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-test.SOAPStructStruct echoNestedStruct(test.wsdl.dataobjects.soap12-test.SOAPStructStruct inputStruct) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.soap12-test.SOAPArrayStruct echoNestedArray(test.wsdl.dataobjects.soap12-test.SOAPArrayStruct inputStruct) throws java.rmi.RemoteException;
    public float[] echoFloatArray(float[] inputFloatArray) throws java.rmi.RemoteException;
    public java.lang.String[] echoStringArray(java.lang.String[] inputStringArray) throws java.rmi.RemoteException;
    public int[] echoIntegerArray(int[] inputIntegerArray) throws java.rmi.RemoteException;
    public byte[] echoBase64(byte[] inputBase64) throws java.rmi.RemoteException;
    public boolean echoBoolean(boolean inputBoolean) throws java.rmi.RemoteException;
    public java.util.Calendar echoDate(java.util.Calendar inputDate) throws java.rmi.RemoteException;
    public java.math.BigDecimal echoDecimal(java.math.BigDecimal inputDecimal) throws java.rmi.RemoteException;
    public float echoFloat(float inputFloat) throws java.rmi.RemoteException;
    public java.lang.String echoString(java.lang.String inputString) throws java.rmi.RemoteException;
    public int countItems(java.lang.String[] inputStringArray) throws java.rmi.RemoteException;
    public boolean isNil(java.lang.String inputString) throws java.rmi.RemoteException;
}
