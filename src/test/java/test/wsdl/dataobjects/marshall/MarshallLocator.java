/**
 * MarshallLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall;

public class MarshallLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.marshall.Marshall {

    public MarshallLocator() {
    }


    public MarshallLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MarshallLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MarshallPort
    private java.lang.String MarshallPort_address = "http://localhost:8080/axis/services/MarshallPort";

    public java.lang.String getMarshallPortAddress() {
        return MarshallPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MarshallPortWSDDServiceName = "MarshallPort";

    public java.lang.String getMarshallPortWSDDServiceName() {
        return MarshallPortWSDDServiceName;
    }

    public void setMarshallPortWSDDServiceName(java.lang.String name) {
        MarshallPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.marshall.MarshallPortType getMarshallPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MarshallPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMarshallPort(endpoint);
    }

    public test.wsdl.dataobjects.marshall.MarshallPortType getMarshallPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.marshall.MarshallBindingStub _stub = new test.wsdl.dataobjects.marshall.MarshallBindingStub(portAddress, this);
            _stub.setPortName(getMarshallPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMarshallPortEndpointAddress(java.lang.String address) {
        MarshallPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.marshall.MarshallPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.marshall.MarshallBindingStub _stub = new test.wsdl.dataobjects.marshall.MarshallBindingStub(new java.net.URL(MarshallPort_address), this);
                _stub.setPortName(getMarshallPortWSDDServiceName());
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
        if ("MarshallPort".equals(inputPortName)) {
            return getMarshallPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://marshall.wsdl.test", "Marshall");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://marshall.wsdl.test", "MarshallPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MarshallPort".equals(portName)) {
            setMarshallPortEndpointAddress(address);
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
