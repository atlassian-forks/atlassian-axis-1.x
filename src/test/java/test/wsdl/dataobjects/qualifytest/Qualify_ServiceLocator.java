/**
 * Qualify_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.qualifytest;

public class Qualify_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.qualifytest.Qualify_Service {

    public Qualify_ServiceLocator() {
    }


    public Qualify_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Qualify_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Qualify
    private java.lang.String Qualify_address = "http://localhost:8080/axis/services/Qualify";

    public java.lang.String getQualifyAddress() {
        return Qualify_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QualifyWSDDServiceName = "Qualify";

    public java.lang.String getQualifyWSDDServiceName() {
        return QualifyWSDDServiceName;
    }

    public void setQualifyWSDDServiceName(java.lang.String name) {
        QualifyWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.qualifytest.Qualify_PortType getQualify() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Qualify_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQualify(endpoint);
    }

    public test.wsdl.dataobjects.qualifytest.Qualify_PortType getQualify(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.qualifytest.Qualify_BindingStub _stub = new test.wsdl.dataobjects.qualifytest.Qualify_BindingStub(portAddress, this);
            _stub.setPortName(getQualifyWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQualifyEndpointAddress(java.lang.String address) {
        Qualify_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.qualifytest.Qualify_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.qualifytest.Qualify_BindingStub _stub = new test.wsdl.dataobjects.qualifytest.Qualify_BindingStub(new java.net.URL(Qualify_address), this);
                _stub.setPortName(getQualifyWSDDServiceName());
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
        if ("Qualify".equals(inputPortName)) {
            return getQualify();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:qualifyTest", "Qualify");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:qualifyTest", "Qualify"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Qualify".equals(portName)) {
            setQualifyEndpointAddress(address);
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
