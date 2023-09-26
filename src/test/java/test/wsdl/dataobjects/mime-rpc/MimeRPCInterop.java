/**
 * MimeRPCInterop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.mime-rpc;

public interface MimeRPCInterop extends javax.xml.rpc.Service {
    public java.lang.String getMimeRPCSoapPortAddress();

    public test.wsdl.dataobjects.mime-rpc.AttachmentsPortType getMimeRPCSoapPort() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.mime-rpc.AttachmentsPortType getMimeRPCSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
