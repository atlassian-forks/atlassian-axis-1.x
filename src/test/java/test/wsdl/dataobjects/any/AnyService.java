/**
 * AnyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.any;

public interface AnyService extends javax.xml.rpc.Service {
    public java.lang.String getSoapAddress();

    public test.wsdl.dataobjects.any.Soap_PortType getSoap() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.any.Soap_PortType getSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
