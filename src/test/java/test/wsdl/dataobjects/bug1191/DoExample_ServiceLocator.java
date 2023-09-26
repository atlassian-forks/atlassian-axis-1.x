/**
 * DoExample_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.bug1191;

public class DoExample_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.bug1191.DoExample_Service {

    public DoExample_ServiceLocator() {
    }


    public DoExample_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DoExample_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WrapperHolder
    private java.lang.String WrapperHolder_address = "http://localhost:8080/axis/services/WrapperHolder";

    public java.lang.String getWrapperHolderAddress() {
        return WrapperHolder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WrapperHolderWSDDServiceName = "WrapperHolder";

    public java.lang.String getWrapperHolderWSDDServiceName() {
        return WrapperHolderWSDDServiceName;
    }

    public void setWrapperHolderWSDDServiceName(java.lang.String name) {
        WrapperHolderWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.bug1191.ExampleSoap getWrapperHolder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WrapperHolder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWrapperHolder(endpoint);
    }

    public test.wsdl.dataobjects.bug1191.ExampleSoap getWrapperHolder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.bug1191.ExampleSoapStub _stub = new test.wsdl.dataobjects.bug1191.ExampleSoapStub(portAddress, this);
            _stub.setPortName(getWrapperHolderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWrapperHolderEndpointAddress(java.lang.String address) {
        WrapperHolder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.bug1191.ExampleSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.bug1191.ExampleSoapStub _stub = new test.wsdl.dataobjects.bug1191.ExampleSoapStub(new java.net.URL(WrapperHolder_address), this);
                _stub.setPortName(getWrapperHolderWSDDServiceName());
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
        if ("WrapperHolder".equals(inputPortName)) {
            return getWrapperHolder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:wrapperHolder", "DoExample");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:wrapperHolder", "WrapperHolder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WrapperHolder".equals(portName)) {
            setWrapperHolderEndpointAddress(address);
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
