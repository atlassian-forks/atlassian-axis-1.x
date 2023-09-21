/**
 * AddressBookNoImplSEI_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.addrNoImplSEI;

public interface AddressBookNoImplSEI_PortType extends java.rmi.Remote {
    public void addEntry(java.lang.String name, test.wsdl.addrNoImplSEI.Address address) throws java.rmi.RemoteException;
    public test.wsdl.addrNoImplSEI.Address getAddressFromName(java.lang.String name) throws java.rmi.RemoteException;
    public test.wsdl.addrNoImplSEI.Address[] getAddresses() throws java.rmi.RemoteException;
}
