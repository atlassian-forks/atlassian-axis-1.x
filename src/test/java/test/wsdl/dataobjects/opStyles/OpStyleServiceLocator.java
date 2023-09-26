/**
 * OpStyleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.opStyles;

public class OpStyleServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.opStyles.OpStyleService {

    public OpStyleServiceLocator() {
    }


    public OpStyleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpStyleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpStyles
    private java.lang.String OpStyles_address = "http://localhost:8080/axis/services/OpStyles";

    public java.lang.String getOpStylesAddress() {
        return OpStyles_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpStylesWSDDServiceName = "OpStyles";

    public java.lang.String getOpStylesWSDDServiceName() {
        return OpStylesWSDDServiceName;
    }

    public void setOpStylesWSDDServiceName(java.lang.String name) {
        OpStylesWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.opStyles.OpStyles getOpStyles() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpStyles_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpStyles(endpoint);
    }

    public test.wsdl.dataobjects.opStyles.OpStyles getOpStyles(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.opStyles.OpStyleBindingStub _stub = new test.wsdl.dataobjects.opStyles.OpStyleBindingStub(portAddress, this);
            _stub.setPortName(getOpStylesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpStylesEndpointAddress(java.lang.String address) {
        OpStyles_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.opStyles.OpStyles.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.opStyles.OpStyleBindingStub _stub = new test.wsdl.dataobjects.opStyles.OpStyleBindingStub(new java.net.URL(OpStyles_address), this);
                _stub.setPortName(getOpStylesWSDDServiceName());
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
        if ("OpStyles".equals(inputPortName)) {
            return getOpStyles();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:opStyles.wsdl.test", "opStyleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:opStyles.wsdl.test", "OpStyles"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpStyles".equals(portName)) {
            setOpStylesEndpointAddress(address);
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
