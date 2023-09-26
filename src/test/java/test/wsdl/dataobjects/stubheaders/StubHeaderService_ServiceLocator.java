/**
 * StubHeaderService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.stubheaders;

public class StubHeaderService_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.stubheaders.StubHeaderService_Service {

    public StubHeaderService_ServiceLocator() {
    }


    public StubHeaderService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StubHeaderService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StubHeaderService
    private java.lang.String StubHeaderService_address = "http://localhost:8080/axis/services/StubHeaderService";

    public java.lang.String getStubHeaderServiceAddress() {
        return StubHeaderService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StubHeaderServiceWSDDServiceName = "StubHeaderService";

    public java.lang.String getStubHeaderServiceWSDDServiceName() {
        return StubHeaderServiceWSDDServiceName;
    }

    public void setStubHeaderServiceWSDDServiceName(java.lang.String name) {
        StubHeaderServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.stubheaders.StubHeaderInterface getStubHeaderService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StubHeaderService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStubHeaderService(endpoint);
    }

    public test.wsdl.dataobjects.stubheaders.StubHeaderInterface getStubHeaderService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.stubheaders.StubHeaderStub _stub = new test.wsdl.dataobjects.stubheaders.StubHeaderStub(portAddress, this);
            _stub.setPortName(getStubHeaderServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStubHeaderServiceEndpointAddress(java.lang.String address) {
        StubHeaderService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.stubheaders.StubHeaderInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.stubheaders.StubHeaderStub _stub = new test.wsdl.dataobjects.stubheaders.StubHeaderStub(new java.net.URL(StubHeaderService_address), this);
                _stub.setPortName(getStubHeaderServiceWSDDServiceName());
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
        if ("StubHeaderService".equals(inputPortName)) {
            return getStubHeaderService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://echo.services", "StubHeaderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://echo.services", "StubHeaderService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StubHeaderService".equals(portName)) {
            setStubHeaderServiceEndpointAddress(address);
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
