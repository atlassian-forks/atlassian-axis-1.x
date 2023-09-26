/**
 * SimpleRpcEncServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class SimpleRpcEncServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncService {

    public SimpleRpcEncServiceLocator() {
    }


    public SimpleRpcEncServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleRpcEncServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SimpleRpcEncPort
    private java.lang.String SimpleRpcEncPort_address = "http://localhost:8080/axis/services/SimpleRpcEncPort";

    public java.lang.String getSimpleRpcEncPortAddress() {
        return SimpleRpcEncPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SimpleRpcEncPortWSDDServiceName = "SimpleRpcEncPort";

    public java.lang.String getSimpleRpcEncPortWSDDServiceName() {
        return SimpleRpcEncPortWSDDServiceName;
    }

    public void setSimpleRpcEncPortWSDDServiceName(java.lang.String name) {
        SimpleRpcEncPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncPortType getSimpleRpcEncPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SimpleRpcEncPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSimpleRpcEncPort(endpoint);
    }

    public test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncPortType getSimpleRpcEncPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncBindingStub _stub = new test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncBindingStub(portAddress, this);
            _stub.setPortName(getSimpleRpcEncPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSimpleRpcEncPortEndpointAddress(java.lang.String address) {
        SimpleRpcEncPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncBindingStub _stub = new test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncBindingStub(new java.net.URL(SimpleRpcEncPort_address), this);
                _stub.setPortName(getSimpleRpcEncPortWSDDServiceName());
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
        if ("SimpleRpcEncPort".equals(inputPortName)) {
            return getSimpleRpcEncPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "SimpleRpcEncService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "SimpleRpcEncPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SimpleRpcEncPort".equals(portName)) {
            setSimpleRpcEncPortEndpointAddress(address);
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
