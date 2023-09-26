/**
 * OpStyleDocServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.opStylesDoc;

public class OpStyleDocServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.opStylesDoc.OpStyleDocService {

    public OpStyleDocServiceLocator() {
    }


    public OpStyleDocServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpStyleDocServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpStylesDoc
    private java.lang.String OpStylesDoc_address = "http://localhost:8080/axis/services/OpStylesDoc";

    public java.lang.String getOpStylesDocAddress() {
        return OpStylesDoc_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OpStylesDocWSDDServiceName = "OpStylesDoc";

    public java.lang.String getOpStylesDocWSDDServiceName() {
        return OpStylesDocWSDDServiceName;
    }

    public void setOpStylesDocWSDDServiceName(java.lang.String name) {
        OpStylesDocWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.opStylesDoc.OpStyles getOpStylesDoc() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpStylesDoc_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpStylesDoc(endpoint);
    }

    public test.wsdl.dataobjects.opStylesDoc.OpStyles getOpStylesDoc(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.opStylesDoc.OpStyleBindingStub _stub = new test.wsdl.dataobjects.opStylesDoc.OpStyleBindingStub(portAddress, this);
            _stub.setPortName(getOpStylesDocWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpStylesDocEndpointAddress(java.lang.String address) {
        OpStylesDoc_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.opStylesDoc.OpStyles.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.opStylesDoc.OpStyleBindingStub _stub = new test.wsdl.dataobjects.opStylesDoc.OpStyleBindingStub(new java.net.URL(OpStylesDoc_address), this);
                _stub.setPortName(getOpStylesDocWSDDServiceName());
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
        if ("OpStylesDoc".equals(inputPortName)) {
            return getOpStylesDoc();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:opStylesDoc.wsdl.test", "opStyleDocService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:opStylesDoc.wsdl.test", "OpStylesDoc"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OpStylesDoc".equals(portName)) {
            setOpStylesDocEndpointAddress(address);
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
