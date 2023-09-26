/**
 * QueryTestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class QueryTestServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.QueryTest.QueryTestService {

    public QueryTestServiceLocator() {
    }


    public QueryTestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryTestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryTest
    private java.lang.String QueryTest_address = "http://localhost:8080/axis/services/QueryTest";

    public java.lang.String getQueryTestAddress() {
        return QueryTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryTestWSDDServiceName = "QueryTest";

    public java.lang.String getQueryTestWSDDServiceName() {
        return QueryTestWSDDServiceName;
    }

    public void setQueryTestWSDDServiceName(java.lang.String name) {
        QueryTestWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.QueryTest.QueryTest_PortType getQueryTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryTest(endpoint);
    }

    public test.wsdl.dataobjects.QueryTest.QueryTest_PortType getQueryTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.QueryTest.QueryTestBindingStub _stub = new test.wsdl.dataobjects.QueryTest.QueryTestBindingStub(portAddress, this);
            _stub.setPortName(getQueryTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryTestEndpointAddress(java.lang.String address) {
        QueryTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.QueryTest.QueryTest_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.QueryTest.QueryTestBindingStub _stub = new test.wsdl.dataobjects.QueryTest.QueryTestBindingStub(new java.net.URL(QueryTest_address), this);
                _stub.setPortName(getQueryTestWSDDServiceName());
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
        if ("QueryTest".equals(inputPortName)) {
            return getQueryTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:QueryTest", "QueryTestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:QueryTest", "QueryTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryTest".equals(portName)) {
            setQueryTestEndpointAddress(address);
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
