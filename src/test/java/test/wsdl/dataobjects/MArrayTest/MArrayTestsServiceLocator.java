/**
 * MArrayTestsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MArrayTest;

public class MArrayTestsServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.MArrayTest.MArrayTestsService {

    public MArrayTestsServiceLocator() {
    }


    public MArrayTestsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MArrayTestsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MArrayTests
    private java.lang.String MArrayTests_address = "http://localhost:8080/axis/services/MArrayTests";

    public java.lang.String getMArrayTestsAddress() {
        return MArrayTests_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MArrayTestsWSDDServiceName = "MArrayTests";

    public java.lang.String getMArrayTestsWSDDServiceName() {
        return MArrayTestsWSDDServiceName;
    }

    public void setMArrayTestsWSDDServiceName(java.lang.String name) {
        MArrayTestsWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.MArrayTest.MArrayTests_PortType getMArrayTests() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MArrayTests_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMArrayTests(endpoint);
    }

    public test.wsdl.dataobjects.MArrayTest.MArrayTests_PortType getMArrayTests(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.MArrayTest.MArrayTestsSOAPBindingStub _stub = new test.wsdl.dataobjects.MArrayTest.MArrayTestsSOAPBindingStub(portAddress, this);
            _stub.setPortName(getMArrayTestsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMArrayTestsEndpointAddress(java.lang.String address) {
        MArrayTests_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.MArrayTest.MArrayTests_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.MArrayTest.MArrayTestsSOAPBindingStub _stub = new test.wsdl.dataobjects.MArrayTest.MArrayTestsSOAPBindingStub(new java.net.URL(MArrayTests_address), this);
                _stub.setPortName(getMArrayTestsWSDDServiceName());
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
        if ("MArrayTests".equals(inputPortName)) {
            return getMArrayTests();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:MArrayTests", "MArrayTestsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:MArrayTests", "MArrayTests"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MArrayTests".equals(portName)) {
            setMArrayTestsEndpointAddress(address);
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
