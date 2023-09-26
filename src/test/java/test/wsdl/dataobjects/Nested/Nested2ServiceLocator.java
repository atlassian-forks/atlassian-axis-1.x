/**
 * Nested2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.Nested;

public class Nested2ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.Nested.Nested2Service {

    public Nested2ServiceLocator() {
    }


    public Nested2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Nested2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Nested
    private java.lang.String Nested_address = "http://localhost:8080/axis/services/Nested";

    public java.lang.String getNestedAddress() {
        return Nested_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NestedWSDDServiceName = "Nested";

    public java.lang.String getNestedWSDDServiceName() {
        return NestedWSDDServiceName;
    }

    public void setNestedWSDDServiceName(java.lang.String name) {
        NestedWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.Nested.Nested2PortType getNested() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Nested_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNested(endpoint);
    }

    public test.wsdl.dataobjects.Nested.Nested2PortType getNested(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.Nested.Nested2BindingStub _stub = new test.wsdl.dataobjects.Nested.Nested2BindingStub(portAddress, this);
            _stub.setPortName(getNestedWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNestedEndpointAddress(java.lang.String address) {
        Nested_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.Nested.Nested2PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.Nested.Nested2BindingStub _stub = new test.wsdl.dataobjects.Nested.Nested2BindingStub(new java.net.URL(Nested_address), this);
                _stub.setPortName(getNestedWSDDServiceName());
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
        if ("Nested".equals(inputPortName)) {
            return getNested();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:Nested", "Nested2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:Nested", "Nested"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Nested".equals(portName)) {
            setNestedEndpointAddress(address);
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
