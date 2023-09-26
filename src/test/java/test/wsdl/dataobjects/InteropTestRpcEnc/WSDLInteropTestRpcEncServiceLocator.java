/**
 * WSDLInteropTestRpcEncServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.InteropTestRpcEnc;

public class WSDLInteropTestRpcEncServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncService {

    public WSDLInteropTestRpcEncServiceLocator() {
    }


    public WSDLInteropTestRpcEncServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSDLInteropTestRpcEncServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSDLInteropTestRpcEncPort
    private java.lang.String WSDLInteropTestRpcEncPort_address = "http://mssoapinterop.org/stkv3/wsdl/interopTestRpcEnc.wsdl";

    public java.lang.String getWSDLInteropTestRpcEncPortAddress() {
        return WSDLInteropTestRpcEncPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSDLInteropTestRpcEncPortWSDDServiceName = "WSDLInteropTestRpcEncPort";

    public java.lang.String getWSDLInteropTestRpcEncPortWSDDServiceName() {
        return WSDLInteropTestRpcEncPortWSDDServiceName;
    }

    public void setWSDLInteropTestRpcEncPortWSDDServiceName(java.lang.String name) {
        WSDLInteropTestRpcEncPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortType getWSDLInteropTestRpcEncPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSDLInteropTestRpcEncPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSDLInteropTestRpcEncPort(endpoint);
    }

    public test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortType getWSDLInteropTestRpcEncPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortBindingStub _stub = new test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortBindingStub(portAddress, this);
            _stub.setPortName(getWSDLInteropTestRpcEncPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSDLInteropTestRpcEncPortEndpointAddress(java.lang.String address) {
        WSDLInteropTestRpcEncPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortBindingStub _stub = new test.wsdl.dataobjects.InteropTestRpcEnc.WSDLInteropTestRpcEncPortBindingStub(new java.net.URL(WSDLInteropTestRpcEncPort_address), this);
                _stub.setPortName(getWSDLInteropTestRpcEncPortWSDDServiceName());
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
        if ("WSDLInteropTestRpcEncPort".equals(inputPortName)) {
            return getWSDLInteropTestRpcEncPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapinterop.org/WSDLInteropTestRpcEnc", "WSDLInteropTestRpcEncService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapinterop.org/WSDLInteropTestRpcEnc", "WSDLInteropTestRpcEncPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSDLInteropTestRpcEncPort".equals(portName)) {
            setWSDLInteropTestRpcEncPortEndpointAddress(address);
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
