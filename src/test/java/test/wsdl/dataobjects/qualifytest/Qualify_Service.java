/**
 * Qualify_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.qualifytest;

public interface Qualify_Service extends javax.xml.rpc.Service {
    public java.lang.String getQualifyAddress();

    public test.wsdl.dataobjects.qualifytest.Qualify_PortType getQualify() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.qualifytest.Qualify_PortType getQualify(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
