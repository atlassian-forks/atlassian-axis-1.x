/**
 * DataServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataService;

public interface DataServiceSoap_PortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.DataService.GetTitleAuthorsResponseGetTitleAuthorsResult getTitleAuthors() throws java.rmi.RemoteException;
    public int putTitleAuthors(test.wsdl.dataobjects.DataService.PutTitleAuthorsDS DS) throws java.rmi.RemoteException;
}
