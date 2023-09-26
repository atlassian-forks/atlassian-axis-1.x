/**
 * EsrTestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.esr;

public class EsrTestServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.esr.EsrTestService {

    public EsrTestServiceLocator() {
    }


    public EsrTestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EsrTestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EsrTest
    private java.lang.String EsrTest_address = "http://localhost:8080/axis/services/EsrTest";

    public java.lang.String getEsrTestAddress() {
        return EsrTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EsrTestWSDDServiceName = "EsrTest";

    public java.lang.String getEsrTestWSDDServiceName() {
        return EsrTestWSDDServiceName;
    }

    public void setEsrTestWSDDServiceName(java.lang.String name) {
        EsrTestWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.esr.EsrTest_PortType getEsrTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EsrTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEsrTest(endpoint);
    }

    public test.wsdl.dataobjects.esr.EsrTest_PortType getEsrTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.esr.EsrTestBindingStub _stub = new test.wsdl.dataobjects.esr.EsrTestBindingStub(portAddress, this);
            _stub.setPortName(getEsrTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEsrTestEndpointAddress(java.lang.String address) {
        EsrTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.esr.EsrTest_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.esr.EsrTestBindingStub _stub = new test.wsdl.dataobjects.esr.EsrTestBindingStub(new java.net.URL(EsrTest_address), this);
                _stub.setPortName(getEsrTestWSDDServiceName());
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
        if ("EsrTest".equals(inputPortName)) {
            return getEsrTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:esr.wsdl.test", "EsrTestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:esr.wsdl.test", "EsrTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EsrTest".equals(portName)) {
            setEsrTestEndpointAddress(address);
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
