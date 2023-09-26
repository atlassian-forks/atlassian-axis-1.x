/**
 * DataTypes_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataTypes;

public interface DataTypes_Service extends javax.xml.rpc.Service {
    public java.lang.String getDataTypesAddress();

    public test.wsdl.dataobjects.DataTypes.DataTypes_PortType getDataTypes() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.DataTypes.DataTypes_PortType getDataTypes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
