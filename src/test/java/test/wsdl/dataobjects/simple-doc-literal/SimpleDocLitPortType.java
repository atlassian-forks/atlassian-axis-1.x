/**
 * SimpleDocLitPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public interface SimpleDocLitPortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse echoEmptyFault(test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultRequest param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.EmptyPart;
    public test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse echoStringFault(java.lang.String param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault;
    public test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse echoIntArrayFault(test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt;
    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response echoMultipleFaults1(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.EmptyPart, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat;
    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response echoMultipleFaults2(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.FloatFault, test.wsdl.dataobjects.simple-doc-literal.ArrayOfString;
    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response echoMultipleFaults3(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.String2Fault;
    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response echoMultipleFaults4(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.IntFault, test.wsdl.dataobjects.simple-doc-literal.EnumFault;
}
