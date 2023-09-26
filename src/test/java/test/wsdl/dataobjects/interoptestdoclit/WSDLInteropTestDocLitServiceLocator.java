/**
 * WSDLInteropTestDocLitServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.interoptestdoclit;

public class WSDLInteropTestDocLitServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitService {

    public WSDLInteropTestDocLitServiceLocator() {
    }


    public WSDLInteropTestDocLitServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSDLInteropTestDocLitServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSDLInteropTestDocLitPort
    private java.lang.String WSDLInteropTestDocLitPort_address = "http://mssoapinterop.org/stkv3/wsdl/interopTestDocLit.wsdl";

    public java.lang.String getWSDLInteropTestDocLitPortAddress() {
        return WSDLInteropTestDocLitPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSDLInteropTestDocLitPortWSDDServiceName = "WSDLInteropTestDocLitPort";

    public java.lang.String getWSDLInteropTestDocLitPortWSDDServiceName() {
        return WSDLInteropTestDocLitPortWSDDServiceName;
    }

    public void setWSDLInteropTestDocLitPortWSDDServiceName(java.lang.String name) {
        WSDLInteropTestDocLitPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortType getWSDLInteropTestDocLitPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSDLInteropTestDocLitPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSDLInteropTestDocLitPort(endpoint);
    }

    public test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortType getWSDLInteropTestDocLitPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortBindingStub _stub = new test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortBindingStub(portAddress, this);
            _stub.setPortName(getWSDLInteropTestDocLitPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSDLInteropTestDocLitPortEndpointAddress(java.lang.String address) {
        WSDLInteropTestDocLitPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortBindingStub _stub = new test.wsdl.dataobjects.interoptestdoclit.WSDLInteropTestDocLitPortBindingStub(new java.net.URL(WSDLInteropTestDocLitPort_address), this);
                _stub.setPortName(getWSDLInteropTestDocLitPortWSDDServiceName());
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
        if ("WSDLInteropTestDocLitPort".equals(inputPortName)) {
            return getWSDLInteropTestDocLitPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapinterop.org/WSDLInteropTestDocLit", "WSDLInteropTestDocLitService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapinterop.org/WSDLInteropTestDocLit", "WSDLInteropTestDocLitPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSDLInteropTestDocLitPort".equals(portName)) {
            setWSDLInteropTestDocLitPortEndpointAddress(address);
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
