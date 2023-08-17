/**
 * PersonalInfoBookSOAPBindingImpl.java
 *
 * Hand-modified
 */

package test.wsdl.arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class PersonalInfoBookSOAPBindingImpl implements wsdl.arrays.PersonalInfoBook {
    private Map table = new HashMap();
    public void addEntry(java.lang.String name, wsdl.arrays.PersonalInfo info) throws java.rmi.RemoteException {
        this.table.put(name, info);
    }
    public wsdl.arrays.PersonalInfo getPersonalInfoFromName(java.lang.String name) throws java.rmi.RemoteException {
        return (wsdl.arrays.PersonalInfo) table.get(name);
    }
    public Vector getPetsFromName(java.lang.String name) throws java.rmi.RemoteException {
        return ((wsdl.arrays.PersonalInfo) table.get(name)).getPets();
    }
    public int[] getIDFromName(java.lang.String name) throws java.rmi.RemoteException {
        return ((wsdl.arrays.PersonalInfo) table.get(name)).getId();
    }
    public int getID2FromName(java.lang.String name) throws java.rmi.RemoteException {
        return ((wsdl.arrays.PersonalInfo) table.get(name)).getId2();
    }
}
