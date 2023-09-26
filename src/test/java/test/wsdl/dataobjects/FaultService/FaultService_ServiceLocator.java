/**
 * FaultService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.FaultService;

public class FaultService_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.FaultService.FaultService_Service {

    public FaultService_ServiceLocator() {
    }


    public FaultService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FaultService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FaultService
    private java.lang.String FaultService_address = "http://localhost:8080/axis/services/FaultService";

    public java.lang.String getFaultServiceAddress() {
        return FaultService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FaultServiceWSDDServiceName = "FaultService";

    public java.lang.String getFaultServiceWSDDServiceName() {
        return FaultServiceWSDDServiceName;
    }

    public void setFaultServiceWSDDServiceName(java.lang.String name) {
        FaultServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.FaultService.FaultServicePortType getFaultService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FaultService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFaultService(endpoint);
    }

    public test.wsdl.dataobjects.FaultService.FaultServicePortType getFaultService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.FaultService.FaultServiceSoapBindingStub _stub = new test.wsdl.dataobjects.FaultService.FaultServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFaultServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFaultServiceEndpointAddress(java.lang.String address) {
        FaultService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.FaultService.FaultServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.FaultService.FaultServiceSoapBindingStub _stub = new test.wsdl.dataobjects.FaultService.FaultServiceSoapBindingStub(new java.net.URL(FaultService_address), this);
                _stub.setPortName(getFaultServiceWSDDServiceName());
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
        if ("FaultService".equals(inputPortName)) {
            return getFaultService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://test.com/wsdl/faults", "FaultService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://test.com/wsdl/faults", "FaultService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FaultService".equals(portName)) {
            setFaultServiceEndpointAddress(address);
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
