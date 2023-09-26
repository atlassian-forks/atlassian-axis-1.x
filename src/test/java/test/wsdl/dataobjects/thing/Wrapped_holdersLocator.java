/**
 * Wrapped_holdersLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.thing;

public class Wrapped_holdersLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.thing.Wrapped_holders {

    public Wrapped_holdersLocator() {
    }


    public Wrapped_holdersLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Wrapped_holdersLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Thing
    private java.lang.String Thing_address = "http://localhost:8080/axis/services/Thing";

    public java.lang.String getThingAddress() {
        return Thing_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ThingWSDDServiceName = "Thing";

    public java.lang.String getThingWSDDServiceName() {
        return ThingWSDDServiceName;
    }

    public void setThingWSDDServiceName(java.lang.String name) {
        ThingWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.thing.Thing_PortType getThing() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Thing_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getThing(endpoint);
    }

    public test.wsdl.dataobjects.thing.Thing_PortType getThing(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.thing.Thing_BindingStub _stub = new test.wsdl.dataobjects.thing.Thing_BindingStub(portAddress, this);
            _stub.setPortName(getThingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setThingEndpointAddress(java.lang.String address) {
        Thing_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.thing.Thing_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.thing.Thing_BindingStub _stub = new test.wsdl.dataobjects.thing.Thing_BindingStub(new java.net.URL(Thing_address), this);
                _stub.setPortName(getThingWSDDServiceName());
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
        if ("Thing".equals(inputPortName)) {
            return getThing();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:Thing", "wrapped_holders");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:Thing", "Thing"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Thing".equals(portName)) {
            setThingEndpointAddress(address);
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
