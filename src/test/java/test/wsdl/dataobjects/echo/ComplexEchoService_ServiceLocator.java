/**
 * ComplexEchoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class ComplexEchoService_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.echo.ComplexEchoService_Service {

    public ComplexEchoService_ServiceLocator() {
    }


    public ComplexEchoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComplexEchoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComplexEchoService
    private java.lang.String ComplexEchoService_address = "http://localhost:8080/axis/services/ComplexEchoService";

    public java.lang.String getComplexEchoServiceAddress() {
        return ComplexEchoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComplexEchoServiceWSDDServiceName = "ComplexEchoService";

    public java.lang.String getComplexEchoServiceWSDDServiceName() {
        return ComplexEchoServiceWSDDServiceName;
    }

    public void setComplexEchoServiceWSDDServiceName(java.lang.String name) {
        ComplexEchoServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.echo.Echo getComplexEchoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ComplexEchoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getComplexEchoService(endpoint);
    }

    public test.wsdl.dataobjects.echo.Echo getComplexEchoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.echo.ComplexEchoServiceSoapBindingStub _stub = new test.wsdl.dataobjects.echo.ComplexEchoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getComplexEchoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setComplexEchoServiceEndpointAddress(java.lang.String address) {
        ComplexEchoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.echo.Echo.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.echo.ComplexEchoServiceSoapBindingStub _stub = new test.wsdl.dataobjects.echo.ComplexEchoServiceSoapBindingStub(new java.net.URL(ComplexEchoService_address), this);
                _stub.setPortName(getComplexEchoServiceWSDDServiceName());
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
        if ("ComplexEchoService".equals(inputPortName)) {
            return getComplexEchoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://echo.services", "ComplexEchoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://echo.services", "ComplexEchoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ComplexEchoService".equals(portName)) {
            setComplexEchoServiceEndpointAddress(address);
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
