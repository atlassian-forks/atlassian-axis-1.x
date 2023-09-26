/**
 * JavaNamesServiceTestLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.JavaNames;

public class JavaNamesServiceTestLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.JavaNames.JavaNamesServiceTest {

    public JavaNamesServiceTestLocator() {
    }


    public JavaNamesServiceTestLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JavaNamesServiceTestLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JavaNames
    private java.lang.String JavaNames_address = "http://localhost:8080/axis/services/JavaNames";

    public java.lang.String getJavaNamesAddress() {
        return JavaNames_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JavaNamesWSDDServiceName = "JavaNames";

    public java.lang.String getJavaNamesWSDDServiceName() {
        return JavaNamesWSDDServiceName;
    }

    public void setJavaNamesWSDDServiceName(java.lang.String name) {
        JavaNamesWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.JavaNames.JavaNames getJavaNames() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JavaNames_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJavaNames(endpoint);
    }

    public test.wsdl.dataobjects.JavaNames.JavaNames getJavaNames(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.JavaNames.JavaNames_SOAPBindingStub _stub = new test.wsdl.dataobjects.JavaNames.JavaNames_SOAPBindingStub(portAddress, this);
            _stub.setPortName(getJavaNamesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJavaNamesEndpointAddress(java.lang.String address) {
        JavaNames_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.JavaNames.JavaNames.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.JavaNames.JavaNames_SOAPBindingStub _stub = new test.wsdl.dataobjects.JavaNames.JavaNames_SOAPBindingStub(new java.net.URL(JavaNames_address), this);
                _stub.setPortName(getJavaNamesWSDDServiceName());
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
        if ("JavaNames".equals(inputPortName)) {
            return getJavaNames();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://names.wsdl.test/javanames", "JavaNames-Service;test");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://names.wsdl.test/javanames", "JavaNames"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JavaNames".equals(portName)) {
            setJavaNamesEndpointAddress(address);
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
