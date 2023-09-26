/**
 * MarshallTestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall3;

public class MarshallTestServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.marshall3.MarshallTestService {

    public MarshallTestServiceLocator() {
    }


    public MarshallTestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MarshallTestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Marshall3TestPort1
    private java.lang.String Marshall3TestPort1_address = "http://localhost:8080/axis/services/Marshall3TestPort1";

    public java.lang.String getMarshall3TestPort1Address() {
        return Marshall3TestPort1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Marshall3TestPort1WSDDServiceName = "Marshall3TestPort1";

    public java.lang.String getMarshall3TestPort1WSDDServiceName() {
        return Marshall3TestPort1WSDDServiceName;
    }

    public void setMarshall3TestPort1WSDDServiceName(java.lang.String name) {
        Marshall3TestPort1WSDDServiceName = name;
    }

    public test.wsdl.dataobjects.marshall3.MarshallTest getMarshall3TestPort1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Marshall3TestPort1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMarshall3TestPort1(endpoint);
    }

    public test.wsdl.dataobjects.marshall3.MarshallTest getMarshall3TestPort1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.marshall3.Marshall3TestPort1SoapBindingStub _stub = new test.wsdl.dataobjects.marshall3.Marshall3TestPort1SoapBindingStub(portAddress, this);
            _stub.setPortName(getMarshall3TestPort1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMarshall3TestPort1EndpointAddress(java.lang.String address) {
        Marshall3TestPort1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.marshall3.MarshallTest.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.marshall3.Marshall3TestPort1SoapBindingStub _stub = new test.wsdl.dataobjects.marshall3.Marshall3TestPort1SoapBindingStub(new java.net.URL(Marshall3TestPort1_address), this);
                _stub.setPortName(getMarshall3TestPort1WSDDServiceName());
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
        if ("Marshall3TestPort1".equals(inputPortName)) {
            return getMarshall3TestPort1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://marshalltestservice.org/", "MarshallTestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://marshalltestservice.org/", "Marshall3TestPort1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Marshall3TestPort1".equals(portName)) {
            setMarshall3TestPort1EndpointAddress(address);
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
