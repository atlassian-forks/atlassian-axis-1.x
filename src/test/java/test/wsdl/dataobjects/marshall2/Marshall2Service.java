/**
 * Marshall2Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public interface Marshall2Service extends javax.xml.rpc.Service {
    public java.lang.String getMarshall2PortAddress();

    public test.wsdl.dataobjects.marshall2.MarshallTest getMarshall2Port() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.marshall2.MarshallTest getMarshall2Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
