package test.wsdl.names.javanames;

import java.util.HashMap;
import java.util.Map;

public class JavaNames_SOAPBindingImpl implements test.wsdl.names.javanames.JavaNames {
    private static Map addressBook = new HashMap();

    public void _new(java.lang.String name, test.wsdl.names.javanames.MyAddress address) throws java.rmi.RemoteException {
        addressBook.put(name, address);
    }

    public test.wsdl.names.javanames.MyAddress _public(java.lang.String name) throws java.rmi.RemoteException {
        return (test.wsdl.names.javanames.MyAddress) addressBook.get(name);
    }

    public void capitalized(java.lang.String name, test.wsdl.names.javanames.MyAddress address) throws java.rmi.RemoteException {
        addressBook.put(name, address);
    }
}
