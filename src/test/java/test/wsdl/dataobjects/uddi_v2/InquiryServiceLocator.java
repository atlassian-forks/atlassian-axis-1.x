/**
 * InquiryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class InquiryServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.uddi_v2.InquiryService {

    public InquiryServiceLocator() {
    }


    public InquiryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InquiryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InquiryService1
    private java.lang.String InquiryService1_address = "http://uddi.microsoft.com/inquire";

    public java.lang.String getInquiryService1Address() {
        return InquiryService1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InquiryService1WSDDServiceName = "InquiryService1";

    public java.lang.String getInquiryService1WSDDServiceName() {
        return InquiryService1WSDDServiceName;
    }

    public void setInquiryService1WSDDServiceName(java.lang.String name) {
        InquiryService1WSDDServiceName = name;
    }

    public test.wsdl.dataobjects.uddi_v2.Inquire getInquiryService1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InquiryService1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInquiryService1(endpoint);
    }

    public test.wsdl.dataobjects.uddi_v2.Inquire getInquiryService1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.uddi_v2.InquireSoapStub _stub = new test.wsdl.dataobjects.uddi_v2.InquireSoapStub(portAddress, this);
            _stub.setPortName(getInquiryService1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInquiryService1EndpointAddress(java.lang.String address) {
        InquiryService1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.uddi_v2.Inquire.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.uddi_v2.InquireSoapStub _stub = new test.wsdl.dataobjects.uddi_v2.InquireSoapStub(new java.net.URL(InquiryService1_address), this);
                _stub.setPortName(getInquiryService1WSDDServiceName());
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
        if ("InquiryService1".equals(inputPortName)) {
            return getInquiryService1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:uddi-org", "InquiryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:uddi-org", "InquiryService1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InquiryService1".equals(portName)) {
            setInquiryService1EndpointAddress(address);
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
