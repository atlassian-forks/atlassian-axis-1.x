package test.wsdl.include;

import java.util.Hashtable;
import java.util.Map;

public class AddressBookSOAPBindingImpl implements test.wsdl.include.AddressBook {
    private static Map addresses = new Hashtable();

    public void addEntry(java.lang.String name, test.wsdl.include.Address address) throws java.rmi.RemoteException {
        addresses.put(name, address);
    }

    public test.wsdl.include.Address getAddressFromName(java.lang.String name) throws java.rmi.RemoteException {
        return (test.wsdl.include.Address) addresses.get(name);
    }
}