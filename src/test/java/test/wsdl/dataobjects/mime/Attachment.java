/**
 * Attachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.mime;

public interface Attachment extends javax.xml.rpc.Service {
    public java.lang.String getAttachmentPortRPCAddress();

    public test.wsdl.dataobjects.mime.Pt1 getAttachmentPortRPC() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.mime.Pt1 getAttachmentPortRPC(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
