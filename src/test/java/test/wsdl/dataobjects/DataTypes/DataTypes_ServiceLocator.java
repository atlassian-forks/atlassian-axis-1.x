/**
 * DataTypes_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataTypes;

public class DataTypes_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.DataTypes.DataTypes_Service {

    public DataTypes_ServiceLocator() {
    }


    public DataTypes_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DataTypes_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DataTypes
    private java.lang.String DataTypes_address = "http://localhost:8080/axis/services/DataTypes";

    public java.lang.String getDataTypesAddress() {
        return DataTypes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DataTypesWSDDServiceName = "DataTypes";

    public java.lang.String getDataTypesWSDDServiceName() {
        return DataTypesWSDDServiceName;
    }

    public void setDataTypesWSDDServiceName(java.lang.String name) {
        DataTypesWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.DataTypes.DataTypes_PortType getDataTypes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DataTypes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDataTypes(endpoint);
    }

    public test.wsdl.dataobjects.DataTypes.DataTypes_PortType getDataTypes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.DataTypes.DataTypes_BindingStub _stub = new test.wsdl.dataobjects.DataTypes.DataTypes_BindingStub(portAddress, this);
            _stub.setPortName(getDataTypesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDataTypesEndpointAddress(java.lang.String address) {
        DataTypes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.DataTypes.DataTypes_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.DataTypes.DataTypes_BindingStub _stub = new test.wsdl.dataobjects.DataTypes.DataTypes_BindingStub(new java.net.URL(DataTypes_address), this);
                _stub.setPortName(getDataTypesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DataTypes".equals(inputPortName)) {
            return getDataTypes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:dataTypes", "DataTypes");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:dataTypes", "DataTypes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DataTypes".equals(portName)) {
            setDataTypesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
