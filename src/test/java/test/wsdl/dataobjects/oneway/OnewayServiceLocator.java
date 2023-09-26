/**
 * OnewayServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.oneway;

public class OnewayServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.oneway.OnewayService {

    public OnewayServiceLocator() {
    }


    public OnewayServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OnewayServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Oneway
    private java.lang.String Oneway_address = "http://localhost:8080/axis/services/Oneway";

    public java.lang.String getOnewayAddress() {
        return Oneway_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnewayWSDDServiceName = "Oneway";

    public java.lang.String getOnewayWSDDServiceName() {
        return OnewayWSDDServiceName;
    }

    public void setOnewayWSDDServiceName(java.lang.String name) {
        OnewayWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.oneway.Oneway_PortType getOneway() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Oneway_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOneway(endpoint);
    }

    public test.wsdl.dataobjects.oneway.Oneway_PortType getOneway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.oneway.OnewayBindingStub _stub = new test.wsdl.dataobjects.oneway.OnewayBindingStub(portAddress, this);
            _stub.setPortName(getOnewayWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnewayEndpointAddress(java.lang.String address) {
        Oneway_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.oneway.Oneway_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.oneway.OnewayBindingStub _stub = new test.wsdl.dataobjects.oneway.OnewayBindingStub(new java.net.URL(Oneway_address), this);
                _stub.setPortName(getOnewayWSDDServiceName());
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
        if ("Oneway".equals(inputPortName)) {
            return getOneway();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:oneway.wsdl.test", "OnewayService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:oneway.wsdl.test", "Oneway"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Oneway".equals(portName)) {
            setOnewayEndpointAddress(address);
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
