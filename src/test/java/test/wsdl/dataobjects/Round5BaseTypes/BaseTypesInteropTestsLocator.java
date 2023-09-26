/**
 * BaseTypesInteropTestsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.Round5BaseTypes;

public class BaseTypesInteropTestsLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.Round5BaseTypes.BaseTypesInteropTests {

/**
 * BaseTypes SOAP services
 */

    public BaseTypesInteropTestsLocator() {
    }


    public BaseTypesInteropTestsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BaseTypesInteropTestsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InteropTestsPort
    private java.lang.String InteropTestsPort_address = "http://localhost:8080/axis/services/InteropTestsPort";

    public java.lang.String getInteropTestsPortAddress() {
        return InteropTestsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InteropTestsPortWSDDServiceName = "InteropTestsPort";

    public java.lang.String getInteropTestsPortWSDDServiceName() {
        return InteropTestsPortWSDDServiceName;
    }

    public void setInteropTestsPortWSDDServiceName(java.lang.String name) {
        InteropTestsPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.Round5BaseTypes.InteropTestsExpType getInteropTestsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InteropTestsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInteropTestsPort(endpoint);
    }

    public test.wsdl.dataobjects.Round5BaseTypes.InteropTestsExpType getInteropTestsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.Round5BaseTypes.InteropTestsBindingStub _stub = new test.wsdl.dataobjects.Round5BaseTypes.InteropTestsBindingStub(portAddress, this);
            _stub.setPortName(getInteropTestsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInteropTestsPortEndpointAddress(java.lang.String address) {
        InteropTestsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.Round5BaseTypes.InteropTestsExpType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.Round5BaseTypes.InteropTestsBindingStub _stub = new test.wsdl.dataobjects.Round5BaseTypes.InteropTestsBindingStub(new java.net.URL(InteropTestsPort_address), this);
                _stub.setPortName(getInteropTestsPortWSDDServiceName());
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
        if ("InteropTestsPort".equals(inputPortName)) {
            return getInteropTestsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("services.wsdl", "BaseTypesInteropTests");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("services.wsdl", "InteropTestsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InteropTestsPort".equals(portName)) {
            setInteropTestsPortEndpointAddress(address);
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
