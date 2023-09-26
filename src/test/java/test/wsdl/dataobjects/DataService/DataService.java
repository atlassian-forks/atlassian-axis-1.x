/**
 * DataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataService;

public interface DataService extends javax.xml.rpc.Service {
    public java.lang.String getDataServiceSoapAddress();

    public test.wsdl.dataobjects.DataService.DataServiceSoap_PortType getDataServiceSoap() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.DataService.DataServiceSoap_PortType getDataServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
