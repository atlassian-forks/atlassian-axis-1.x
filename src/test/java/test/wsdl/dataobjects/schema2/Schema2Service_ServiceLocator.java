/**
 * Schema2Service_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.schema2;

public class Schema2Service_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.schema2.Schema2Service_Service {

    public Schema2Service_ServiceLocator() {
    }


    public Schema2Service_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Schema2Service_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Schema2Service
    private java.lang.String Schema2Service_address = "http://localhost:8080/axis/services/Schema2Service";

    public java.lang.String getSchema2ServiceAddress() {
        return Schema2Service_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Schema2ServiceWSDDServiceName = "Schema2Service";

    public java.lang.String getSchema2ServiceWSDDServiceName() {
        return Schema2ServiceWSDDServiceName;
    }

    public void setSchema2ServiceWSDDServiceName(java.lang.String name) {
        Schema2ServiceWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.schema2.Schema2Test getSchema2Service() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Schema2Service_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSchema2Service(endpoint);
    }

    public test.wsdl.dataobjects.schema2.Schema2Test getSchema2Service(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.schema2.Schema2ServiceSoapBindingStub _stub = new test.wsdl.dataobjects.schema2.Schema2ServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSchema2ServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSchema2ServiceEndpointAddress(java.lang.String address) {
        Schema2Service_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.schema2.Schema2Test.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.schema2.Schema2ServiceSoapBindingStub _stub = new test.wsdl.dataobjects.schema2.Schema2ServiceSoapBindingStub(new java.net.URL(Schema2Service_address), this);
                _stub.setPortName(getSchema2ServiceWSDDServiceName());
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
        if ("Schema2Service".equals(inputPortName)) {
            return getSchema2Service();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:schema2.wsdl.test", "Schema2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:schema2.wsdl.test", "Schema2Service"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Schema2Service".equals(portName)) {
            setSchema2ServiceEndpointAddress(address);
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
