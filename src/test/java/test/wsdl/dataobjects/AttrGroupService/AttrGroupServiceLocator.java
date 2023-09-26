/**
 * AttrGroupServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.AttrGroupService;

public class AttrGroupServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.AttrGroupService.AttrGroupService {

    public AttrGroupServiceLocator() {
    }


    public AttrGroupServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AttrGroupServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AttrGroupServiceSoap
    private java.lang.String AttrGroupServiceSoap_address = "http://www.irrelevant.com/services/AttrGroupService/AttrGroupService.asmx";

    public java.lang.String getAttrGroupServiceSoapAddress() {
        return AttrGroupServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AttrGroupServiceSoapWSDDServiceName = "AttrGroupServiceSoap";

    public java.lang.String getAttrGroupServiceSoapWSDDServiceName() {
        return AttrGroupServiceSoapWSDDServiceName;
    }

    public void setAttrGroupServiceSoapWSDDServiceName(java.lang.String name) {
        AttrGroupServiceSoapWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_PortType getAttrGroupServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AttrGroupServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAttrGroupServiceSoap(endpoint);
    }

    public test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_PortType getAttrGroupServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getAttrGroupServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAttrGroupServiceSoapEndpointAddress(java.lang.String address) {
        AttrGroupServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.AttrGroupService.AttrGroupServiceSoap_BindingStub(new java.net.URL(AttrGroupServiceSoap_address), this);
                _stub.setPortName(getAttrGroupServiceSoapWSDDServiceName());
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
        if ("AttrGroupServiceSoap".equals(inputPortName)) {
            return getAttrGroupServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "AttrGroupService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "AttrGroupServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AttrGroupServiceSoap".equals(portName)) {
            setAttrGroupServiceSoapEndpointAddress(address);
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
