/**
 * AdaptiveServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.data;

public class AdaptiveServiceLocator extends org.apache.axis.client.Service implements test.wsdl.data.AdaptiveService {

    public AdaptiveServiceLocator() {
    }


    public AdaptiveServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdaptiveServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Adaptive
    private java.lang.String Adaptive_address = "http://localhost:8080/axis/services/Adaptive";

    public java.lang.String getAdaptiveAddress() {
        return Adaptive_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdaptiveWSDDServiceName = "Adaptive";

    public java.lang.String getAdaptiveWSDDServiceName() {
        return AdaptiveWSDDServiceName;
    }

    public void setAdaptiveWSDDServiceName(java.lang.String name) {
        AdaptiveWSDDServiceName = name;
    }

    public test.wsdl.data.AdaptiveInterface getAdaptive() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Adaptive_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdaptive(endpoint);
    }

    public test.wsdl.data.AdaptiveInterface getAdaptive(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.data.AdaptiveInterfaceBindingStub _stub = new test.wsdl.data.AdaptiveInterfaceBindingStub(portAddress, this);
            _stub.setPortName(getAdaptiveWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdaptiveEndpointAddress(java.lang.String address) {
        Adaptive_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.data.AdaptiveInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.data.AdaptiveInterfaceBindingStub _stub = new test.wsdl.data.AdaptiveInterfaceBindingStub(new java.net.URL(Adaptive_address), this);
                _stub.setPortName(getAdaptiveWSDDServiceName());
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
        if ("Adaptive".equals(inputPortName)) {
            return getAdaptive();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.test/wsdl/Adaptive", "AdaptiveService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.test/wsdl/Adaptive", "Adaptive"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Adaptive".equals(portName)) {
            setAdaptiveEndpointAddress(address);
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
