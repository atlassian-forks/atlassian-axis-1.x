/**
 * Compound1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.Compound1;

public class Compound1Locator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.Compound1.Compound1 {

    public Compound1Locator() {
    }


    public Compound1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Compound1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapInteropCompound1Port
    private java.lang.String SoapInteropCompound1Port_address = "http://mssoapinterop.org/stkv3/wsdl/Compound1.wsdl";

    public java.lang.String getSoapInteropCompound1PortAddress() {
        return SoapInteropCompound1Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapInteropCompound1PortWSDDServiceName = "SoapInteropCompound1Port";

    public java.lang.String getSoapInteropCompound1PortWSDDServiceName() {
        return SoapInteropCompound1PortWSDDServiceName;
    }

    public void setSoapInteropCompound1PortWSDDServiceName(java.lang.String name) {
        SoapInteropCompound1PortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.Compound1.SoapInteropCompound1PortType getSoapInteropCompound1Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapInteropCompound1Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapInteropCompound1Port(endpoint);
    }

    public test.wsdl.dataobjects.Compound1.SoapInteropCompound1PortType getSoapInteropCompound1Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.Compound1.SoapInteropCompound1BindingStub _stub = new test.wsdl.dataobjects.Compound1.SoapInteropCompound1BindingStub(portAddress, this);
            _stub.setPortName(getSoapInteropCompound1PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapInteropCompound1PortEndpointAddress(java.lang.String address) {
        SoapInteropCompound1Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.Compound1.SoapInteropCompound1PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.Compound1.SoapInteropCompound1BindingStub _stub = new test.wsdl.dataobjects.Compound1.SoapInteropCompound1BindingStub(new java.net.URL(SoapInteropCompound1Port_address), this);
                _stub.setPortName(getSoapInteropCompound1PortWSDDServiceName());
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
        if ("SoapInteropCompound1Port".equals(inputPortName)) {
            return getSoapInteropCompound1Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapinterop.org/", "Compound1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapinterop.org/", "SoapInteropCompound1Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapInteropCompound1Port".equals(portName)) {
            setSoapInteropCompound1PortEndpointAddress(address);
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
