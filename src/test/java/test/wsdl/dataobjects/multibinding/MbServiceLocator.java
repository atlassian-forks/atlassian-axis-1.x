/**
 * MbServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.multibinding;

public class MbServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.multibinding.MbService {

    public MbServiceLocator() {
    }


    public MbServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MbServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for allLiteral
    private java.lang.String allLiteral_address = "http://localhost:8080/axis/services/allLiteral";

    public java.lang.String getallLiteralAddress() {
        return allLiteral_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String allLiteralWSDDServiceName = "allLiteral";

    public java.lang.String getallLiteralWSDDServiceName() {
        return allLiteralWSDDServiceName;
    }

    public void setallLiteralWSDDServiceName(java.lang.String name) {
        allLiteralWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.multibinding.MbPT getallLiteral() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(allLiteral_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getallLiteral(endpoint);
    }

    public test.wsdl.dataobjects.multibinding.MbPT getallLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.multibinding.BindingAllLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingAllLitStub(portAddress, this);
            _stub.setPortName(getallLiteralWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setallLiteralEndpointAddress(java.lang.String address) {
        allLiteral_address = address;
    }


    // Use to get a proxy class for noLiteral
    private java.lang.String noLiteral_address = "http://localhost:8080/axis/services/noLiteral";

    public java.lang.String getnoLiteralAddress() {
        return noLiteral_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String noLiteralWSDDServiceName = "noLiteral";

    public java.lang.String getnoLiteralWSDDServiceName() {
        return noLiteralWSDDServiceName;
    }

    public void setnoLiteralWSDDServiceName(java.lang.String name) {
        noLiteralWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.multibinding.MbPT getnoLiteral() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(noLiteral_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getnoLiteral(endpoint);
    }

    public test.wsdl.dataobjects.multibinding.MbPT getnoLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.multibinding.BindingNoLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingNoLitStub(portAddress, this);
            _stub.setPortName(getnoLiteralWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setnoLiteralEndpointAddress(java.lang.String address) {
        noLiteral_address = address;
    }


    // Use to get a proxy class for someLiteral
    private java.lang.String someLiteral_address = "http://localhost:8080/axis/services/someLiteral";

    public java.lang.String getsomeLiteralAddress() {
        return someLiteral_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String someLiteralWSDDServiceName = "someLiteral";

    public java.lang.String getsomeLiteralWSDDServiceName() {
        return someLiteralWSDDServiceName;
    }

    public void setsomeLiteralWSDDServiceName(java.lang.String name) {
        someLiteralWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.multibinding.MbPT getsomeLiteral() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(someLiteral_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsomeLiteral(endpoint);
    }

    public test.wsdl.dataobjects.multibinding.MbPT getsomeLiteral(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.multibinding.BindingSomeLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingSomeLitStub(portAddress, this);
            _stub.setPortName(getsomeLiteralWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsomeLiteralEndpointAddress(java.lang.String address) {
        someLiteral_address = address;
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
            if (test.wsdl.dataobjects.multibinding.MbPT.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.multibinding.BindingAllLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingAllLitStub(new java.net.URL(allLiteral_address), this);
                _stub.setPortName(getallLiteralWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.multibinding.MbPT.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.multibinding.BindingNoLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingNoLitStub(new java.net.URL(noLiteral_address), this);
                _stub.setPortName(getnoLiteralWSDDServiceName());
                return _stub;
            }
            if (test.wsdl.dataobjects.multibinding.MbPT.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.multibinding.BindingSomeLitStub _stub = new test.wsdl.dataobjects.multibinding.BindingSomeLitStub(new java.net.URL(someLiteral_address), this);
                _stub.setPortName(getsomeLiteralWSDDServiceName());
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
        if ("allLiteral".equals(inputPortName)) {
            return getallLiteral();
        }
        else if ("noLiteral".equals(inputPortName)) {
            return getnoLiteral();
        }
        else if ("someLiteral".equals(inputPortName)) {
            return getsomeLiteral();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:multibinding.wsdl.test", "mbService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:multibinding.wsdl.test", "allLiteral"));
            ports.add(new javax.xml.namespace.QName("urn:multibinding.wsdl.test", "noLiteral"));
            ports.add(new javax.xml.namespace.QName("urn:multibinding.wsdl.test", "someLiteral"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("allLiteral".equals(portName)) {
            setallLiteralEndpointAddress(address);
        }
        else 
if ("noLiteral".equals(portName)) {
            setnoLiteralEndpointAddress(address);
        }
        else 
if ("someLiteral".equals(portName)) {
            setsomeLiteralEndpointAddress(address);
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
