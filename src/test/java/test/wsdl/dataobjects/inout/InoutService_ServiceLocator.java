/**
 * InoutService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.inout;

public class InoutService_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.inout.InoutService_Service {

    public InoutService_ServiceLocator() {
    }


    public InoutService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InoutService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InoutService
    private java.lang.String InoutService_address = "http://localhost:8080/axis/services/InoutService";

    public java.lang.String getInoutServiceAddress() {
        return InoutService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InoutServiceWSDDServiceName = "InoutService";

    public java.lang.String getInoutServiceWSDDServiceName() {
        return InoutServiceWSDDServiceName;
    }

    public void setInoutServiceWSDDServiceName(java.lang.String name) {
        InoutServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.inout.Inout getInoutService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InoutService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInoutService(endpoint);
    }

    public test.wsdl.dataobjects.inout.Inout getInoutService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.inout.InoutSOAPBindingStub _stub = new test.wsdl.dataobjects.inout.InoutSOAPBindingStub(portAddress, this);
            _stub.setPortName(getInoutServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInoutServiceEndpointAddress(java.lang.String address) {
        InoutService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.inout.Inout.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.inout.InoutSOAPBindingStub _stub = new test.wsdl.dataobjects.inout.InoutSOAPBindingStub(new java.net.URL(InoutService_address), this);
                _stub.setPortName(getInoutServiceWSDDServiceName());
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
        if ("InoutService".equals(inputPortName)) {
            return getInoutService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.apache.org/inout", "InoutService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.apache.org/inout", "InoutService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InoutService".equals(portName)) {
            setInoutServiceEndpointAddress(address);
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
