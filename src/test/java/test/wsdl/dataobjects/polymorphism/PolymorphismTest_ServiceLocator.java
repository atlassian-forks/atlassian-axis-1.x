/**
 * PolymorphismTest_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.polymorphism;

public class PolymorphismTest_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.polymorphism.PolymorphismTest_Service {

    public PolymorphismTest_ServiceLocator() {
    }


    public PolymorphismTest_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PolymorphismTest_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PolymorphismTest
    private java.lang.String PolymorphismTest_address = "http://localhost:8080/axis/services/PolymorphismTest";

    public java.lang.String getPolymorphismTestAddress() {
        return PolymorphismTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PolymorphismTestWSDDServiceName = "PolymorphismTest";

    public java.lang.String getPolymorphismTestWSDDServiceName() {
        return PolymorphismTestWSDDServiceName;
    }

    public void setPolymorphismTestWSDDServiceName(java.lang.String name) {
        PolymorphismTestWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.polymorphism.PolymorphismTest_PortType getPolymorphismTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PolymorphismTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPolymorphismTest(endpoint);
    }

    public test.wsdl.dataobjects.polymorphism.PolymorphismTest_PortType getPolymorphismTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.polymorphism.PolymorphismTestSoapStub _stub = new test.wsdl.dataobjects.polymorphism.PolymorphismTestSoapStub(portAddress, this);
            _stub.setPortName(getPolymorphismTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPolymorphismTestEndpointAddress(java.lang.String address) {
        PolymorphismTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.polymorphism.PolymorphismTest_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.polymorphism.PolymorphismTestSoapStub _stub = new test.wsdl.dataobjects.polymorphism.PolymorphismTestSoapStub(new java.net.URL(PolymorphismTest_address), this);
                _stub.setPortName(getPolymorphismTestWSDDServiceName());
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
        if ("PolymorphismTest".equals(inputPortName)) {
            return getPolymorphismTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.apache.org/axis/PolymorphismTest", "PolymorphismTest");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.apache.org/axis/PolymorphismTest", "PolymorphismTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PolymorphismTest".equals(portName)) {
            setPolymorphismTestEndpointAddress(address);
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
