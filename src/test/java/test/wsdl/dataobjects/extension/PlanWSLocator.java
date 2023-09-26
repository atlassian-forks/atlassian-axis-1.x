/**
 * PlanWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.extension;

public class PlanWSLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.extension.PlanWS {

    public PlanWSLocator() {
    }


    public PlanWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlanWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlanWSSoap
    private java.lang.String PlanWSSoap_address = "http://localhost:8080/axis/services/PlanWSSoap";

    public java.lang.String getPlanWSSoapAddress() {
        return PlanWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlanWSSoapWSDDServiceName = "PlanWSSoap";

    public java.lang.String getPlanWSSoapWSDDServiceName() {
        return PlanWSSoapWSDDServiceName;
    }

    public void setPlanWSSoapWSDDServiceName(java.lang.String name) {
        PlanWSSoapWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.extension.PlanWSSoap_PortType getPlanWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlanWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlanWSSoap(endpoint);
    }

    public test.wsdl.dataobjects.extension.PlanWSSoap_PortType getPlanWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.extension.PlanWSSoap_BindingStub _stub = new test.wsdl.dataobjects.extension.PlanWSSoap_BindingStub(portAddress, this);
            _stub.setPortName(getPlanWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlanWSSoapEndpointAddress(java.lang.String address) {
        PlanWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.extension.PlanWSSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.extension.PlanWSSoap_BindingStub _stub = new test.wsdl.dataobjects.extension.PlanWSSoap_BindingStub(new java.net.URL(PlanWSSoap_address), this);
                _stub.setPortName(getPlanWSSoapWSDDServiceName());
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
        if ("PlanWSSoap".equals(inputPortName)) {
            return getPlanWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "PlanWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "PlanWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlanWSSoap".equals(portName)) {
            setPlanWSSoapEndpointAddress(address);
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
