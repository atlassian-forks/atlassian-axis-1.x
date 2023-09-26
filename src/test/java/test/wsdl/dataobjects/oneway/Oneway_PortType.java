/**
 * Oneway_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.oneway;

public interface Oneway_PortType extends java.rmi.Remote {
    public void addEntry(java.lang.String name, test.wsdl.dataobjects.oneway.Address address) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.oneway.Address getAddressFromName(java.lang.String name) throws java.rmi.RemoteException;
    public void throwException() throws java.rmi.RemoteException;
}
