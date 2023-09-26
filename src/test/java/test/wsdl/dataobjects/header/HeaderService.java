/**
 * HeaderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.header;

public interface HeaderService extends javax.xml.rpc.Service {
    public java.lang.String getheaderAddress();

    public test.wsdl.dataobjects.header.PortType getheader() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.header.PortType getheader(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
