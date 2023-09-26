/**
 * ReferenceService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.FileGen;

public class ReferenceService_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.FileGen.ReferenceService_Service {

    public ReferenceService_ServiceLocator() {
    }


    public ReferenceService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReferenceService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReferenceService
    private java.lang.String ReferenceService_address = "http://localhost:8080/axis/services/ReferenceService";

    public java.lang.String getReferenceServiceAddress() {
        return ReferenceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReferenceServiceWSDDServiceName = "ReferenceService";

    public java.lang.String getReferenceServiceWSDDServiceName() {
        return ReferenceServiceWSDDServiceName;
    }

    public void setReferenceServiceWSDDServiceName(java.lang.String name) {
        ReferenceServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.FileGen.PortTypeSoap getReferenceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReferenceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReferenceService(endpoint);
    }

    public test.wsdl.dataobjects.FileGen.PortTypeSoap getReferenceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.FileGen.ReferenceSoapBindingStub _stub = new test.wsdl.dataobjects.FileGen.ReferenceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReferenceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReferenceServiceEndpointAddress(java.lang.String address) {
        ReferenceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.FileGen.PortTypeSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.FileGen.ReferenceSoapBindingStub _stub = new test.wsdl.dataobjects.FileGen.ReferenceSoapBindingStub(new java.net.URL(ReferenceService_address), this);
                _stub.setPortName(getReferenceServiceWSDDServiceName());
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
        if ("ReferenceService".equals(inputPortName)) {
            return getReferenceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://test.com/reference", "ReferenceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://test.com/reference", "ReferenceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReferenceService".equals(portName)) {
            setReferenceServiceEndpointAddress(address);
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
