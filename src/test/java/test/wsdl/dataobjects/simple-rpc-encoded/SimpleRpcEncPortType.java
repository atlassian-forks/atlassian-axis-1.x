/**
 * SimpleRpcEncPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public interface SimpleRpcEncPortType extends java.rmi.Remote {
    public void echoEmptyFault() throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault;
    public void echoStringFault(java.lang.String param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault;
    public void echoIntArrayFault(int[] param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.IntArrayFault;
    public void echoMultipleFaults1(int whichFault, java.lang.String param1, float[] param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.FloatArrayFault;
    public void echoMultipleFaults2(int whichFault, java.lang.String param1, float param2, java.lang.String[] param3) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.FloatFault, test.wsdl.dataobjects.simple-rpc-encoded.StringArrayFault;
    public void echoMultipleFaults3(int whichFault, java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.String2Fault;
    public void echoMultipleFaults4(int whichFault, int param1, test.wsdl.dataobjects.simple-rpc-encoded.Enum param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.IntFault, test.wsdl.dataobjects.simple-rpc-encoded.EnumFault;
}
