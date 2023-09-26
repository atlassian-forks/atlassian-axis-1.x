/**
 * SessionTestServerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.session;

public class SessionTestServerServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.session.SessionTestServerService {

    public SessionTestServerServiceLocator() {
    }


    public SessionTestServerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SessionTestServerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SessionTest
    private java.lang.String SessionTest_address = "http://localhost:8080/axis/services/SessionTest";

    public java.lang.String getSessionTestAddress() {
        return SessionTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SessionTestWSDDServiceName = "SessionTest";

    public java.lang.String getSessionTestWSDDServiceName() {
        return SessionTestWSDDServiceName;
    }

    public void setSessionTestWSDDServiceName(java.lang.String name) {
        SessionTestWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.session.SessionTestServer getSessionTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SessionTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSessionTest(endpoint);
    }

    public test.wsdl.dataobjects.session.SessionTestServer getSessionTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.session.SessionTestSoapBindingStub _stub = new test.wsdl.dataobjects.session.SessionTestSoapBindingStub(portAddress, this);
            _stub.setPortName(getSessionTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSessionTestEndpointAddress(java.lang.String address) {
        SessionTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.session.SessionTestServer.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.session.SessionTestSoapBindingStub _stub = new test.wsdl.dataobjects.session.SessionTestSoapBindingStub(new java.net.URL(SessionTest_address), this);
                _stub.setPortName(getSessionTestWSDDServiceName());
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
        if ("SessionTest".equals(inputPortName)) {
            return getSessionTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://session.wsdl.test:8080/", "SessionTestServerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://session.wsdl.test:8080/", "SessionTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SessionTest".equals(portName)) {
            setSessionTestEndpointAddress(address);
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
