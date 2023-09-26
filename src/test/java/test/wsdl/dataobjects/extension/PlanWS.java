/**
 * PlanWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.extension;

public interface PlanWS extends javax.xml.rpc.Service {
    public java.lang.String getPlanWSSoapAddress();

    public test.wsdl.dataobjects.extension.PlanWSSoap_PortType getPlanWSSoap() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.extension.PlanWSSoap_PortType getPlanWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
