/**
 * AttachmentsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.mime-doc;

public interface AttachmentsPortType extends java.rmi.Remote {
    public org.apache.axis.attachments.OctetStream echoAttachment(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException;
    public org.apache.axis.attachments.OctetStream[] echoAttachments(org.apache.axis.attachments.OctetStream[] item) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.mime-doc.Binary echoAttachmentAsBase64(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException;
    public org.apache.axis.attachments.OctetStream echoBase64AsAttachment(test.wsdl.dataobjects.mime-doc.Binary in) throws java.rmi.RemoteException;
}
