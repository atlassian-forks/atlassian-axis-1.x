/**
 * Echo2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo2;

public class Echo2ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.echo2.Echo2Service {

    public Echo2ServiceLocator() {
    }


    public Echo2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Echo2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Echo2
    private java.lang.String Echo2_address = "http://localhost:8080/axis/services/Echo2";

    public java.lang.String getEcho2Address() {
        return Echo2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Echo2WSDDServiceName = "Echo2";

    public java.lang.String getEcho2WSDDServiceName() {
        return Echo2WSDDServiceName;
    }

    public void setEcho2WSDDServiceName(java.lang.String name) {
        Echo2WSDDServiceName = name;
    }

    public test.wsdl.dataobjects.echo2.Echo2PT getEcho2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Echo2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEcho2(endpoint);
    }

    public test.wsdl.dataobjects.echo2.Echo2PT getEcho2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.echo2.Echo2SoapBindingStub _stub = new test.wsdl.dataobjects.echo2.Echo2SoapBindingStub(portAddress, this);
            _stub.setPortName(getEcho2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEcho2EndpointAddress(java.lang.String address) {
        Echo2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.echo2.Echo2PT.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.echo2.Echo2SoapBindingStub _stub = new test.wsdl.dataobjects.echo2.Echo2SoapBindingStub(new java.net.URL(Echo2_address), this);
                _stub.setPortName(getEcho2WSDDServiceName());
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
        if ("Echo2".equals(inputPortName)) {
            return getEcho2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:echo2.wsdl.test", "Echo2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:echo2.wsdl.test", "Echo2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Echo2".equals(portName)) {
            setEcho2EndpointAddress(address);
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
