/**
 * MbService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.multibinding;

public interface MbService extends javax.xml.rpc.Service {
    public java.lang.String getallLiteralAddress();

    public test.wsdl.dataobjects.multibinding.MbPT getallLiteral() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.multibinding.MbPT getallLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getnoLiteralAddress();

    public test.wsdl.dataobjects.multibinding.MbPT getnoLiteral() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.multibinding.MbPT getnoLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getsomeLiteralAddress();

    public test.wsdl.dataobjects.multibinding.MbPT getsomeLiteral() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.multibinding.MbPT getsomeLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
