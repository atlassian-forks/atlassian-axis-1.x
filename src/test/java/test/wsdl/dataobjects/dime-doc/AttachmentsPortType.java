/**
 * AttachmentsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.dime-doc;

public interface AttachmentsPortType extends java.rmi.Remote {
    public org.apache.axis.attachments.OctetStream echoAttachment(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException;
    public org.apache.axis.attachments.OctetStream[] echoAttachments(org.apache.axis.attachments.OctetStream[] item) throws java.rmi.RemoteException;
    public byte[] echoAttachmentAsBase64(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException;
    public org.apache.axis.attachments.OctetStream echoBase64AsAttachment(byte[] in) throws java.rmi.RemoteException;
    public void echoUnrefAttachments() throws java.rmi.RemoteException;
    public java.lang.String echoAttachmentAsString(java.lang.String in) throws java.rmi.RemoteException;
}
