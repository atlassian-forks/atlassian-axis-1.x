/**
 * SimpleDocLitServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public class SimpleDocLitServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitService {

    public SimpleDocLitServiceLocator() {
    }


    public SimpleDocLitServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleDocLitServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SimpleDocLitPort
    private java.lang.String SimpleDocLitPort_address = "http://localhost:8080/axis/services/SimpleDocLitPort";

    public java.lang.String getSimpleDocLitPortAddress() {
        return SimpleDocLitPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SimpleDocLitPortWSDDServiceName = "SimpleDocLitPort";

    public java.lang.String getSimpleDocLitPortWSDDServiceName() {
        return SimpleDocLitPortWSDDServiceName;
    }

    public void setSimpleDocLitPortWSDDServiceName(java.lang.String name) {
        SimpleDocLitPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitPortType getSimpleDocLitPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SimpleDocLitPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSimpleDocLitPort(endpoint);
    }

    public test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitPortType getSimpleDocLitPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitBindingStub _stub = new test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitBindingStub(portAddress, this);
            _stub.setPortName(getSimpleDocLitPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSimpleDocLitPortEndpointAddress(java.lang.String address) {
        SimpleDocLitPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitBindingStub _stub = new test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitBindingStub(new java.net.URL(SimpleDocLitPort_address), this);
                _stub.setPortName(getSimpleDocLitPortWSDDServiceName());
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
        if ("SimpleDocLitPort".equals(inputPortName)) {
            return getSimpleDocLitPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "SimpleDocLitService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "SimpleDocLitPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SimpleDocLitPort".equals(portName)) {
            setSimpleDocLitPortEndpointAddress(address);
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
