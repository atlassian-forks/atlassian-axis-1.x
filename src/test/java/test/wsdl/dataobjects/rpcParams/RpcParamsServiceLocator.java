/**
 * RpcParamsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.rpcParams;

public class RpcParamsServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.rpcParams.RpcParamsService {

    public RpcParamsServiceLocator() {
    }


    public RpcParamsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RpcParamsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RpcParams
    private java.lang.String RpcParams_address = "http://localhost:8080/axis/services/RpcParams";

    public java.lang.String getRpcParamsAddress() {
        return RpcParams_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RpcParamsWSDDServiceName = "RpcParams";

    public java.lang.String getRpcParamsWSDDServiceName() {
        return RpcParamsWSDDServiceName;
    }

    public void setRpcParamsWSDDServiceName(java.lang.String name) {
        RpcParamsWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.rpcParams.RpcParamsTest getRpcParams() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RpcParams_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRpcParams(endpoint);
    }

    public test.wsdl.dataobjects.rpcParams.RpcParamsTest getRpcParams(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.rpcParams.RpcParamsBindingStub _stub = new test.wsdl.dataobjects.rpcParams.RpcParamsBindingStub(portAddress, this);
            _stub.setPortName(getRpcParamsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRpcParamsEndpointAddress(java.lang.String address) {
        RpcParams_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.rpcParams.RpcParamsTest.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.rpcParams.RpcParamsBindingStub _stub = new test.wsdl.dataobjects.rpcParams.RpcParamsBindingStub(new java.net.URL(RpcParams_address), this);
                _stub.setPortName(getRpcParamsWSDDServiceName());
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
        if ("RpcParams".equals(inputPortName)) {
            return getRpcParams();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:rpcParams.wsdl.test", "rpcParamsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:rpcParams.wsdl.test", "RpcParams"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RpcParams".equals(portName)) {
            setRpcParamsEndpointAddress(address);
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
