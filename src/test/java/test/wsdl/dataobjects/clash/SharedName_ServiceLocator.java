/**
 * SharedName_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.clash;

public class SharedName_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.clash.SharedName_Service {

    public SharedName_ServiceLocator() {
    }


    public SharedName_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SharedName_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for nonSharedName
    private java.lang.String nonSharedName_address = "http://localhost:8080/axis/services/nonSharedName";

    public java.lang.String getnonSharedNameAddress() {
        return nonSharedName_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String nonSharedNameWSDDServiceName = "nonSharedName";

    public java.lang.String getnonSharedNameWSDDServiceName() {
        return nonSharedNameWSDDServiceName;
    }

    public void setnonSharedNameWSDDServiceName(java.lang.String name) {
        nonSharedNameWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.clash.SharedName_PortType getnonSharedName() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(nonSharedName_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getnonSharedName(endpoint);
    }

    public test.wsdl.dataobjects.clash.SharedName_PortType getnonSharedName(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.clash.NonSharedNameStub _stub = new test.wsdl.dataobjects.clash.NonSharedNameStub(portAddress, this);
            _stub.setPortName(getnonSharedNameWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setnonSharedNameEndpointAddress(java.lang.String address) {
        nonSharedName_address = address;
    }


    // Use to get a proxy class for anotherNonSharedName
    private java.lang.String anotherNonSharedName_address = "http://localhost:8080/axis/services/anotherNonSharedName";

    public java.lang.String getanotherNonSharedNameAddress() {
        return anotherNonSharedName_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String anotherNonSharedNameWSDDServiceName = "anotherNonSharedName";

    public java.lang.String getanotherNonSharedNameWSDDServiceName() {
        return anotherNonSharedNameWSDDServiceName;
    }

    public void setanotherNonSharedNameWSDDServiceName(java.lang.String name) {
        anotherNonSharedNameWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.clash.SharedName_PortType getanotherNonSharedName() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(anotherNonSharedName_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getanotherNonSharedName(endpoint);
    }

    public test.wsdl.dataobjects.clash.SharedName_PortType getanotherNonSharedName(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.clash.AnotherNonSharedNameStub _stub = new test.wsdl.dataobjects.clash.AnotherNonSharedNameStub(portAddress, this);
            _stub.setPortName(getanotherNonSharedNameWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setanotherNonSharedNameEndpointAddress(java.lang.String address) {
        anotherNonSharedName_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.clash.SharedName_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.clash.NonSharedNameStub _stub = new test.wsdl.dataobjects.clash.NonSharedNameStub(new java.net.URL(nonSharedName_address), this);
                _stub.setPortName(getnonSharedNameWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.clash.SharedName_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.clash.AnotherNonSharedNameStub _stub = new test.wsdl.dataobjects.clash.AnotherNonSharedNameStub(new java.net.URL(anotherNonSharedName_address), this);
                _stub.setPortName(getanotherNonSharedNameWSDDServiceName());
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
        if ("nonSharedName".equals(inputPortName)) {
            return getnonSharedName();
        }
        else if ("anotherNonSharedName".equals(inputPortName)) {
            return getanotherNonSharedName();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:clash.wsdl.test", "sharedName");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:clash.wsdl.test", "nonSharedName"));
            ports.add(new javax.xml.namespace.QName("urn:clash.wsdl.test", "anotherNonSharedName"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("nonSharedName".equals(portName)) {
            setnonSharedNameEndpointAddress(address);
        }
        else 
if ("anotherNonSharedName".equals(portName)) {
            setanotherNonSharedNameEndpointAddress(address);
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
