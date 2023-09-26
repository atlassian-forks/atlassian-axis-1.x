/**
 * ComplexDocLitPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-doc-literal;

public interface ComplexDocLitPortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse echoSOAPStructFault(test.wsdl.dataobjects.complex-doc-literal.SOAPStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault;
    public test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse echoBaseStructFault(test.wsdl.dataobjects.complex-doc-literal.BaseStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.BaseStruct;
    public test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse echoExtendedStructFault(test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct;
    public test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response echoMultipleFaults1(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.BaseStruct, test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault;
    public test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response echoMultipleFaults2(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct, test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct, test.wsdl.dataobjects.complex-doc-literal.BaseStruct;
}
