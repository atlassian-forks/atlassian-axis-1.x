/**
 * WhiteMesaSoap12TestSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-test;

public interface WhiteMesaSoap12TestSvc extends javax.xml.rpc.Service {
    public java.lang.String getSoap12TestDocPortAddress();

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeDoc getSoap12TestDocPort() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeDoc getSoap12TestDocPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getSoap12TestRpcPortAddress();

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeRpc getSoap12TestRpcPort() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeRpc getSoap12TestRpcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
