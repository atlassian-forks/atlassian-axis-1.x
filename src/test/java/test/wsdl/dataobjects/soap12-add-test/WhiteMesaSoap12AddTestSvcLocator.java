/**
 * WhiteMesaSoap12AddTestSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-add-test;

public class WhiteMesaSoap12AddTestSvcLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.soap12-add-test.WhiteMesaSoap12AddTestSvc {

    public WhiteMesaSoap12AddTestSvcLocator() {
    }


    public WhiteMesaSoap12AddTestSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WhiteMesaSoap12AddTestSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Soap12AddTestRpcPort
    private java.lang.String Soap12AddTestRpcPort_address = "http://www.whitemesa.net/soap12/add-test-rpc";

    public java.lang.String getSoap12AddTestRpcPortAddress() {
        return Soap12AddTestRpcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12AddTestRpcPortWSDDServiceName = "Soap12AddTestRpcPort";

    public java.lang.String getSoap12AddTestRpcPortWSDDServiceName() {
        return Soap12AddTestRpcPortWSDDServiceName;
    }

    public void setSoap12AddTestRpcPortWSDDServiceName(java.lang.String name) {
        Soap12AddTestRpcPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeRpc getSoap12AddTestRpcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12AddTestRpcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12AddTestRpcPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeRpc getSoap12AddTestRpcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-add-test.Soap12AddTestRpcBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestRpcBindingStub(portAddress, this);
            _stub.setPortName(getSoap12AddTestRpcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12AddTestRpcPortEndpointAddress(java.lang.String address) {
        Soap12AddTestRpcPort_address = address;
    }


    // Use to get a proxy class for Soap12AddTestDocUpperPort
    private java.lang.String Soap12AddTestDocUpperPort_address = "http://www.whitemesa.net/soap12/add-test-doc-int-uc";

    public java.lang.String getSoap12AddTestDocUpperPortAddress() {
        return Soap12AddTestDocUpperPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12AddTestDocUpperPortWSDDServiceName = "Soap12AddTestDocUpperPort";

    public java.lang.String getSoap12AddTestDocUpperPortWSDDServiceName() {
        return Soap12AddTestDocUpperPortWSDDServiceName;
    }

    public void setSoap12AddTestDocUpperPortWSDDServiceName(java.lang.String name) {
        Soap12AddTestDocUpperPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocUpperPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12AddTestDocUpperPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12AddTestDocUpperPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocUpperPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(portAddress, this);
            _stub.setPortName(getSoap12AddTestDocUpperPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12AddTestDocUpperPortEndpointAddress(java.lang.String address) {
        Soap12AddTestDocUpperPort_address = address;
    }


    // Use to get a proxy class for Soap12AddTestDocIntermediaryPort
    private java.lang.String Soap12AddTestDocIntermediaryPort_address = "http://www.whitemesa.net/soap12/add-test-doc-int";

    public java.lang.String getSoap12AddTestDocIntermediaryPortAddress() {
        return Soap12AddTestDocIntermediaryPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12AddTestDocIntermediaryPortWSDDServiceName = "Soap12AddTestDocIntermediaryPort";

    public java.lang.String getSoap12AddTestDocIntermediaryPortWSDDServiceName() {
        return Soap12AddTestDocIntermediaryPortWSDDServiceName;
    }

    public void setSoap12AddTestDocIntermediaryPortWSDDServiceName(java.lang.String name) {
        Soap12AddTestDocIntermediaryPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocIntermediaryPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12AddTestDocIntermediaryPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12AddTestDocIntermediaryPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocIntermediaryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(portAddress, this);
            _stub.setPortName(getSoap12AddTestDocIntermediaryPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12AddTestDocIntermediaryPortEndpointAddress(java.lang.String address) {
        Soap12AddTestDocIntermediaryPort_address = address;
    }


    // Use to get a proxy class for Soap12AddTestDocPort
    private java.lang.String Soap12AddTestDocPort_address = "http://www.whitemesa.net/soap12/add-test-doc";

    public java.lang.String getSoap12AddTestDocPortAddress() {
        return Soap12AddTestDocPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Soap12AddTestDocPortWSDDServiceName = "Soap12AddTestDocPort";

    public java.lang.String getSoap12AddTestDocPortWSDDServiceName() {
        return Soap12AddTestDocPortWSDDServiceName;
    }

    public void setSoap12AddTestDocPortWSDDServiceName(java.lang.String name) {
        Soap12AddTestDocPortWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap12AddTestDocPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap12AddTestDocPort(endpoint);
    }

    public test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc getSoap12AddTestDocPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(portAddress, this);
            _stub.setPortName(getSoap12AddTestDocPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoap12AddTestDocPortEndpointAddress(java.lang.String address) {
        Soap12AddTestDocPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeRpc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-add-test.Soap12AddTestRpcBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestRpcBindingStub(new java.net.URL(Soap12AddTestRpcPort_address), this);
                _stub.setPortName(getSoap12AddTestRpcPortWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(new java.net.URL(Soap12AddTestDocUpperPort_address), this);
                _stub.setPortName(getSoap12AddTestDocUpperPortWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(new java.net.URL(Soap12AddTestDocIntermediaryPort_address), this);
                _stub.setPortName(getSoap12AddTestDocIntermediaryPortWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.soap12-add-test.Soap12AddTestPortTypeDoc.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub _stub = new test.wsdl.dataobjects.soap12-add-test.Soap12AddTestDocBindingStub(new java.net.URL(Soap12AddTestDocPort_address), this);
                _stub.setPortName(getSoap12AddTestDocPortWSDDServiceName());
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
        if ("Soap12AddTestRpcPort".equals(inputPortName)) {
            return getSoap12AddTestRpcPort();
        }
        else if ("Soap12AddTestDocUpperPort".equals(inputPortName)) {
            return getSoap12AddTestDocUpperPort();
        }
        else if ("Soap12AddTestDocIntermediaryPort".equals(inputPortName)) {
            return getSoap12AddTestDocIntermediaryPort();
        }
        else if ("Soap12AddTestDocPort".equals(inputPortName)) {
            return getSoap12AddTestDocPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "WhiteMesaSoap12AddTestSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12AddTestRpcPort"));
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12AddTestDocUpperPort"));
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12AddTestDocIntermediaryPort"));
            ports.add(new javax.xml.namespace.QName("http://whitemesa.net/wsdl/soap12-test", "Soap12AddTestDocPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Soap12AddTestRpcPort".equals(portName)) {
            setSoap12AddTestRpcPortEndpointAddress(address);
        }
        else 
if ("Soap12AddTestDocUpperPort".equals(portName)) {
            setSoap12AddTestDocUpperPortEndpointAddress(address);
        }
        else 
if ("Soap12AddTestDocIntermediaryPort".equals(portName)) {
            setSoap12AddTestDocIntermediaryPortEndpointAddress(address);
        }
        else 
if ("Soap12AddTestDocPort".equals(portName)) {
            setSoap12AddTestDocPortEndpointAddress(address);
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
