/**
 * PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.header;

public interface PortType extends java.rmi.Remote {
    public float op1(int parm1, java.lang.String parm2, test.wsdl.dataobjects.header.HeaderType header) throws java.rmi.RemoteException, test.wsdl.dataobjects.header.Op1Fault;
    public void op2(int parm, test.wsdl.dataobjects.header.HeaderType header) throws java.rmi.RemoteException;
}
