/**
 * Marshall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall;

public interface Marshall extends javax.xml.rpc.Service {
    public java.lang.String getMarshallPortAddress();

    public test.wsdl.dataobjects.marshall.MarshallPortType getMarshallPort() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.marshall.MarshallPortType getMarshallPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
