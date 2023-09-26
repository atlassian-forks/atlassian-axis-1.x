/**
 * ChoiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ChoiceService;

public class ChoiceServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.ChoiceService.ChoiceService {

    public ChoiceServiceLocator() {
    }


    public ChoiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChoiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChoiceServiceSoap
    private java.lang.String ChoiceServiceSoap_address = "http://localhost:8080/axis/services/ChoiceServiceSoap";

    public java.lang.String getChoiceServiceSoapAddress() {
        return ChoiceServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChoiceServiceSoapWSDDServiceName = "ChoiceServiceSoap";

    public java.lang.String getChoiceServiceSoapWSDDServiceName() {
        return ChoiceServiceSoapWSDDServiceName;
    }

    public void setChoiceServiceSoapWSDDServiceName(java.lang.String name) {
        ChoiceServiceSoapWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_PortType getChoiceServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChoiceServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChoiceServiceSoap(endpoint);
    }

    public test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_PortType getChoiceServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getChoiceServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChoiceServiceSoapEndpointAddress(java.lang.String address) {
        ChoiceServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.ChoiceService.ChoiceServiceSoap_BindingStub(new java.net.URL(ChoiceServiceSoap_address), this);
                _stub.setPortName(getChoiceServiceSoapWSDDServiceName());
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
        if ("ChoiceServiceSoap".equals(inputPortName)) {
            return getChoiceServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ChoiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "ChoiceServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChoiceServiceSoap".equals(portName)) {
            setChoiceServiceSoapEndpointAddress(address);
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
