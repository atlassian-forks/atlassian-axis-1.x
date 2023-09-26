/**
 * OnewayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.oneway;

public interface OnewayService extends javax.xml.rpc.Service {
    public java.lang.String getOnewayAddress();

    public test.wsdl.dataobjects.oneway.Oneway_PortType getOneway() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.oneway.Oneway_PortType getOneway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
