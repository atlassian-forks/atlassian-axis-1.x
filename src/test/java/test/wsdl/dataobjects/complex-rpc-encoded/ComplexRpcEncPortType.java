/**
 * ComplexRpcEncPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-rpc-encoded;

public interface ComplexRpcEncPortType extends java.rmi.Remote {
    public void echoSOAPStructFault(test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault;
    public void echoBaseStructFault(test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct;
    public void echoExtendedStructFault(test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct;
    public void echoMultipleFaults1(int whichFault, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStruct param1, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault;
    public void echoMultipleFaults2(int whichFault, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param1, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct param2, test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct param3) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct;
}
