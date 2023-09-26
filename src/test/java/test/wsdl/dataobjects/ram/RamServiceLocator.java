/**
 * RamServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ram;

public class RamServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.ram.RamService {

    public RamServiceLocator() {
    }


    public RamServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RamServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Ram
    private java.lang.String Ram_address = "http://localhost:8080/axis/services/Ram";

    public java.lang.String getRamAddress() {
        return Ram_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RamWSDDServiceName = "Ram";

    public java.lang.String getRamWSDDServiceName() {
        return RamWSDDServiceName;
    }

    public void setRamWSDDServiceName(java.lang.String name) {
        RamWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.ram.Ram_PortType getRam() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Ram_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRam(endpoint);
    }

    public test.wsdl.dataobjects.ram.Ram_PortType getRam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.ram.RamSoapBindingStub _stub = new test.wsdl.dataobjects.ram.RamSoapBindingStub(portAddress, this);
            _stub.setPortName(getRamWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRamEndpointAddress(java.lang.String address) {
        Ram_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.ram.Ram_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.ram.RamSoapBindingStub _stub = new test.wsdl.dataobjects.ram.RamSoapBindingStub(new java.net.URL(Ram_address), this);
                _stub.setPortName(getRamWSDDServiceName());
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
        if ("Ram".equals(inputPortName)) {
            return getRam();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ram", "RamService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ram", "Ram"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Ram".equals(portName)) {
            setRamEndpointAddress(address);
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
