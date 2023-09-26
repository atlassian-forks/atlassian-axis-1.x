/**
 * MarshallTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall3;

public interface MarshallTest extends java.rmi.Remote {
    public test.wsdl.dataobjects.marshall3.ShortArrayTestResponse shortArrayTest(test.wsdl.dataobjects.marshall3.ShortArrayTest parameters) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.marshall3.StringArrayTestResponse stringArrayTest(test.wsdl.dataobjects.marshall3.StringArrayTest parameters) throws java.rmi.RemoteException;
    public short[] echoShortListTypeTest(short[] fooShortListTypeRequest) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.marshall3.QNameArrayTestResponse qnameArrayTest(test.wsdl.dataobjects.marshall3.QNameArrayTest parameters) throws java.rmi.RemoteException;
}
