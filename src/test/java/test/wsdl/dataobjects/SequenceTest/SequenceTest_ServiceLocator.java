/**
 * SequenceTest_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SequenceTest;

public class SequenceTest_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.SequenceTest.SequenceTest_Service {

    public SequenceTest_ServiceLocator() {
    }


    public SequenceTest_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SequenceTest_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SequenceTest
    private java.lang.String SequenceTest_address = "http://localhost:8080/axis/services/SequenceTest";

    public java.lang.String getSequenceTestAddress() {
        return SequenceTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SequenceTestWSDDServiceName = "SequenceTest";

    public java.lang.String getSequenceTestWSDDServiceName() {
        return SequenceTestWSDDServiceName;
    }

    public void setSequenceTestWSDDServiceName(java.lang.String name) {
        SequenceTestWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.SequenceTest.SequenceTestPortType getSequenceTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SequenceTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSequenceTest(endpoint);
    }

    public test.wsdl.dataobjects.SequenceTest.SequenceTestPortType getSequenceTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.SequenceTest.SequenceTestSoapBindingStub _stub = new test.wsdl.dataobjects.SequenceTest.SequenceTestSoapBindingStub(portAddress, this);
            _stub.setPortName(getSequenceTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSequenceTestEndpointAddress(java.lang.String address) {
        SequenceTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.SequenceTest.SequenceTestPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.SequenceTest.SequenceTestSoapBindingStub _stub = new test.wsdl.dataobjects.SequenceTest.SequenceTestSoapBindingStub(new java.net.URL(SequenceTest_address), this);
                _stub.setPortName(getSequenceTestWSDDServiceName());
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
        if ("SequenceTest".equals(inputPortName)) {
            return getSequenceTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:SequenceTest2", "SequenceTest");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:SequenceTest2", "SequenceTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SequenceTest".equals(portName)) {
            setSequenceTestEndpointAddress(address);
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
