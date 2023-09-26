/**
 * MarshallPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall;

public interface MarshallPortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.marshall.MyBean[] myBeanArray(test.wsdl.dataobjects.marshall.MyBean[] arrayOfMyBean_1) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.marshall.MyBean[][] myBeanMultiArray(test.wsdl.dataobjects.marshall.MyBean[][] arrayOfarrayOfMyBean_1) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.marshall.MyBean myBean(test.wsdl.dataobjects.marshall.MyBean myBean_1) throws java.rmi.RemoteException;
    public java.lang.String[] arrayOfSoapEncString(java.lang.String[] parameter) throws java.rmi.RemoteException;
    public java.lang.String[] arrayOfXsdString(java.lang.String[] parameter) throws java.rmi.RemoteException;
    public java.lang.String[][] arrayOfArrayOfSoapEncString(java.lang.String[][] parameter) throws java.rmi.RemoteException;
    public java.math.BigInteger[][] arrayOfArrayOfinteger(java.math.BigInteger[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfbase64Binary(byte[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfhexBinary(byte[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfsoapencbase64(byte[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfbase64BinaryUnbounded(byte[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfhexBinaryUnbounded(byte[][] parameter) throws java.rmi.RemoteException;
    public byte[][] arrayOfsoapencbase64Unbounded(byte[][] parameter) throws java.rmi.RemoteException;
}
