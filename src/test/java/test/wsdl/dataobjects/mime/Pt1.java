/**
 * Pt1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.mime;

public interface Pt1 extends java.rmi.Remote {
    public java.lang.String getCompanyInfo2(float result, java.lang.String docs, java.awt.Image logo) throws java.rmi.RemoteException;
    public void inputPlainText(java.lang.String body) throws java.rmi.RemoteException;
    public java.lang.String inoutPlainText(java.lang.String body) throws java.rmi.RemoteException;
    public java.lang.String echoPlainText(java.lang.String body) throws java.rmi.RemoteException;
    public java.lang.String outputPlainText() throws java.rmi.RemoteException;
    public void inputMimeMultipart(javax.mail.internet.MimeMultipart body) throws java.rmi.RemoteException;
    public javax.mail.internet.MimeMultipart inoutMimeMultipart(javax.mail.internet.MimeMultipart body) throws java.rmi.RemoteException;
    public javax.mail.internet.MimeMultipart echoMimeMultipart(javax.mail.internet.MimeMultipart body) throws java.rmi.RemoteException;
    public javax.mail.internet.MimeMultipart outputMimeMultipart() throws java.rmi.RemoteException;
    public org.apache.axis.attachments.OctetStream echoAttachment(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException;
}
