/**
 * SharedName_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.clash;

public interface SharedName_Service extends javax.xml.rpc.Service {
    public java.lang.String getnonSharedNameAddress();

    public test.wsdl.dataobjects.clash.SharedName_PortType getnonSharedName() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.clash.SharedName_PortType getnonSharedName(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getanotherNonSharedNameAddress();

    public test.wsdl.dataobjects.clash.SharedName_PortType getanotherNonSharedName() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.clash.SharedName_PortType getanotherNonSharedName(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
