/**
 * ExtensibilityQueryLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ExtensibilityQuery;

public class ExtensibilityQueryLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQuery {

    public ExtensibilityQueryLocator() {
    }


    public ExtensibilityQueryLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExtensibilityQueryLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExtensibilityQueryPort
    private java.lang.String ExtensibilityQueryPort_address = "http://localhost:8080/axis/services/ExtensibilityQueryPort";

    public java.lang.String getExtensibilityQueryPortAddress() {
        return ExtensibilityQueryPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExtensibilityQueryPortWSDDServiceName = "ExtensibilityQueryPort";

    public java.lang.String getExtensibilityQueryPortWSDDServiceName() {
        return ExtensibilityQueryPortWSDDServiceName;
    }

    public void setExtensibilityQueryPortWSDDServiceName(java.lang.String name) {
        ExtensibilityQueryPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryPortType getExtensibilityQueryPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExtensibilityQueryPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExtensibilityQueryPort(endpoint);
    }

    public test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryPortType getExtensibilityQueryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryBindingStub _stub = new test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryBindingStub(portAddress, this);
            _stub.setPortName(getExtensibilityQueryPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExtensibilityQueryPortEndpointAddress(java.lang.String address) {
        ExtensibilityQueryPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryBindingStub _stub = new test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityQueryBindingStub(new java.net.URL(ExtensibilityQueryPort_address), this);
                _stub.setPortName(getExtensibilityQueryPortWSDDServiceName());
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
        if ("ExtensibilityQueryPort".equals(inputPortName)) {
            return getExtensibilityQueryPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ExtensibilityQuery", "ExtensibilityQuery");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ExtensibilityQuery", "ExtensibilityQueryPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExtensibilityQueryPort".equals(portName)) {
            setExtensibilityQueryPortEndpointAddress(address);
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
