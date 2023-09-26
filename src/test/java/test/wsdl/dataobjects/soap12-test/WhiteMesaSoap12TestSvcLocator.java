/**
 * WhiteMesaSoap12TestSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-test;

public class WhiteMesaSoap12TestSvcLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.soap12-test.WhiteMesaSoap12TestSvc {

    public WhiteMesaSoap12TestSvcLocator() {
    }


    public WhiteMesaSoap12TestSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WhiteMesaSoap12TestSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Soap12TestDocPort
    private java.lang.String Soap12TestDocPort_address = "http://localhost:8080/axis/services/Soap12TestDocPort";

    public java.lang.String getSoap12TestDocPortAddress() {
        return Soap12TestDocPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12TestDocPortWSDDServiceName = "Soap12TestDocPort";

    public java.lang.String getSoap12TestDocPortWSDDServiceName() {
        return Soap12TestDocPortWSDDServiceName;
    }

    public void setSoap12TestDocPortWSDDServiceName(java.lang.String name) {
        Soap12TestDocPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeDoc getSoap12TestDocPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12TestDocPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12TestDocPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeDoc getSoap12TestDocPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-test.Soap12TestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-test.Soap12TestDocBindingStub(portAddress, this);
            _stub.setPortName(getSoap12TestDocPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12TestDocPortEndpointAddress(java.lang.String address) {
        Soap12TestDocPort_address = address;
    }


    // Use to get a proxy class for Soap12TestRpcPort
    private java.lang.String Soap12TestRpcPort_address = "http://localhost:8080/axis/services/Soap12TestRpcPort";

    public java.lang.String getSoap12TestRpcPortAddress() {
        return Soap12TestRpcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12TestRpcPortWSDDServiceName = "Soap12TestRpcPort";

    public java.lang.String getSoap12TestRpcPortWSDDServiceName() {
        return Soap12TestRpcPortWSDDServiceName;
    }

    public void setSoap12TestRpcPortWSDDServiceName(java.lang.String name) {
        Soap12TestRpcPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeRpc getSoap12TestRpcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12TestRpcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12TestRpcPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeRpc getSoap12TestRpcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-test.Soap12TestRpcBindingStub _stub = new test.wsdl.dataobjects.soap12-test.Soap12TestRpcBindingStub(portAddress, this);
            _stub.setPortName(getSoap12TestRpcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12TestRpcPortEndpointAddress(java.lang.String address) {
        Soap12TestRpcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeDoc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-test.Soap12TestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-test.Soap12TestDocBindingStub(new java.net.URL(Soap12TestDocPort_address), this);
                _stub.setPortName(getSoap12TestDocPortWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.soap12-test.Soap12TestPortTypeRpc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-test.Soap12TestRpcBindingStub _stub = new test.wsdl.dataobjects.soap12-test.Soap12TestRpcBindingStub(new java.net.URL(Soap12TestRpcPort_address), this);
                _stub.setPortName(getSoap12TestRpcPortWSDDServiceName());
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
        if ("Soap12TestDocPort".equals(inputPortName)) {
            return getSoap12TestDocPort();
        }
        else if ("Soap12TestRpcPort".equals(inputPortName)) {
            return getSoap12TestRpcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "WhiteMesaSoap12TestSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12TestDocPort"));
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12TestRpcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Soap12TestDocPort".equals(portName)) {
            setSoap12TestDocPortEndpointAddress(address);
        }
        else 
if ("Soap12TestRpcPort".equals(portName)) {
            setSoap12TestRpcPortEndpointAddress(address);
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
