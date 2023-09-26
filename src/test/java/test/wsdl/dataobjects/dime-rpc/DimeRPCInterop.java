/**
 * DimeRPCInterop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.dime-rpc;

public interface DimeRPCInterop extends javax.xml.rpc.Service {
    public java.lang.String getDimeRPCSoapPortAddress();

    public test.wsdl.dataobjects.dime-rpc.AttachmentsPortType getDimeRPCSoapPort() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.dime-rpc.AttachmentsPortType getDimeRPCSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
