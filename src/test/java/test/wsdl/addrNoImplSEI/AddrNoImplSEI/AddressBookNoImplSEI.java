/**
 * AddressBookNoImplSEI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AddrNoImplSEI;

public interface AddressBookNoImplSEI extends java.rmi.Remote {
    public void addEntry(java.lang.String name, AddrNoImplSEI.Address address) throws java.rmi.RemoteException;
    public AddrNoImplSEI.Address getAddressFromName(java.lang.String name) throws java.rmi.RemoteException;
    public AddrNoImplSEI.Address[] getAddresses() throws java.rmi.RemoteException;
}
