/**
 * SharedName_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.clash;

public interface SharedName_PortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.clash.SharedName_Type sharedName() throws java.rmi.RemoteException;
    public void sharedName(test.wsdl.dataobjects.clash.SharedName_Type sharedName) throws java.rmi.RemoteException;
    public void sharedName(int sharedName) throws java.rmi.RemoteException;
    public void op1(test.wsdl.dataobjects.clash.SayHello in1) throws java.rmi.RemoteException;
}
