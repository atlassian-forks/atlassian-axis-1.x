/**
 * ParameterOrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.parameterOrder;

public class ParameterOrderServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.parameterOrder.ParameterOrderService {

    public ParameterOrderServiceLocator() {
    }


    public ParameterOrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ParameterOrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ParameterOrder
    private java.lang.String ParameterOrder_address = "http://localhost:8080/axis/services/ParameterOrder";

    public java.lang.String getParameterOrderAddress() {
        return ParameterOrder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ParameterOrderWSDDServiceName = "ParameterOrder";

    public java.lang.String getParameterOrderWSDDServiceName() {
        return ParameterOrderWSDDServiceName;
    }

    public void setParameterOrderWSDDServiceName(java.lang.String name) {
        ParameterOrderWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.parameterOrder.ParameterOrderTest getParameterOrder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ParameterOrder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getParameterOrder(endpoint);
    }

    public test.wsdl.dataobjects.parameterOrder.ParameterOrderTest getParameterOrder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.parameterOrder.ParameterOrderBindingStub _stub = new test.wsdl.dataobjects.parameterOrder.ParameterOrderBindingStub(portAddress, this);
            _stub.setPortName(getParameterOrderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setParameterOrderEndpointAddress(java.lang.String address) {
        ParameterOrder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.parameterOrder.ParameterOrderTest.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.parameterOrder.ParameterOrderBindingStub _stub = new test.wsdl.dataobjects.parameterOrder.ParameterOrderBindingStub(new java.net.URL(ParameterOrder_address), this);
                _stub.setPortName(getParameterOrderWSDDServiceName());
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
        if ("ParameterOrder".equals(inputPortName)) {
            return getParameterOrder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:parameterOrder.wsdl.test", "parameterOrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:parameterOrder.wsdl.test", "ParameterOrder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ParameterOrder".equals(portName)) {
            setParameterOrderEndpointAddress(address);
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
