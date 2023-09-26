/**
 * WrappedInOut_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.wrapped_inout;

public class WrappedInOut_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.wrapped_inout.WrappedInOut_Service {

    public WrappedInOut_ServiceLocator() {
    }


    public WrappedInOut_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WrappedInOut_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WrappedInOut
    private java.lang.String WrappedInOut_address = "http://localhost:8080/axis/services/WrappedInOut";

    public java.lang.String getWrappedInOutAddress() {
        return WrappedInOut_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WrappedInOutWSDDServiceName = "WrappedInOut";

    public java.lang.String getWrappedInOutWSDDServiceName() {
        return WrappedInOutWSDDServiceName;
    }

    public void setWrappedInOutWSDDServiceName(java.lang.String name) {
        WrappedInOutWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.wrapped_inout.WrappedInOutInterface getWrappedInOut() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WrappedInOut_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWrappedInOut(endpoint);
    }

    public test.wsdl.dataobjects.wrapped_inout.WrappedInOutInterface getWrappedInOut(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.wrapped_inout.WrappedInOutSoapStub _stub = new test.wsdl.dataobjects.wrapped_inout.WrappedInOutSoapStub(portAddress, this);
            _stub.setPortName(getWrappedInOutWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWrappedInOutEndpointAddress(java.lang.String address) {
        WrappedInOut_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.wrapped_inout.WrappedInOutInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.wrapped_inout.WrappedInOutSoapStub _stub = new test.wsdl.dataobjects.wrapped_inout.WrappedInOutSoapStub(new java.net.URL(WrappedInOut_address), this);
                _stub.setPortName(getWrappedInOutWSDDServiceName());
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
        if ("WrappedInOut".equals(inputPortName)) {
            return getWrappedInOut();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WrappedInOut");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WrappedInOut"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WrappedInOut".equals(portName)) {
            setWrappedInOutEndpointAddress(address);
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
