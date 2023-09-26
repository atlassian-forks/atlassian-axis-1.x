/**
 * AttachmentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.mime;

public class AttachmentLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.mime.Attachment {

    public AttachmentLocator() {
    }


    public AttachmentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AttachmentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AttachmentPortRPC
    private java.lang.String AttachmentPortRPC_address = "http://localhost:8080/axis/services/AttachmentPortRPC";

    public java.lang.String getAttachmentPortRPCAddress() {
        return AttachmentPortRPC_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AttachmentPortRPCWSDDServiceName = "AttachmentPortRPC";

    public java.lang.String getAttachmentPortRPCWSDDServiceName() {
        return AttachmentPortRPCWSDDServiceName;
    }

    public void setAttachmentPortRPCWSDDServiceName(java.lang.String name) {
        AttachmentPortRPCWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.mime.Pt1 getAttachmentPortRPC() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AttachmentPortRPC_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAttachmentPortRPC(endpoint);
    }

    public test.wsdl.dataobjects.mime.Pt1 getAttachmentPortRPC(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.mime.B1Stub _stub = new test.wsdl.dataobjects.mime.B1Stub(portAddress, this);
            _stub.setPortName(getAttachmentPortRPCWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAttachmentPortRPCEndpointAddress(java.lang.String address) {
        AttachmentPortRPC_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.mime.Pt1.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.mime.B1Stub _stub = new test.wsdl.dataobjects.mime.B1Stub(new java.net.URL(AttachmentPortRPC_address), this);
                _stub.setPortName(getAttachmentPortRPCWSDDServiceName());
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
        if ("AttachmentPortRPC".equals(inputPortName)) {
            return getAttachmentPortRPC();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:attachments.wsdl.test", "Attachment");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:attachments.wsdl.test", "AttachmentPortRPC"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AttachmentPortRPC".equals(portName)) {
            setAttachmentPortRPCEndpointAddress(address);
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
