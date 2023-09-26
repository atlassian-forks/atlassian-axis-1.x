/**
 * ReportingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ReportingServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.reportservice.ReportingService {

/**
 * The Reporting Services Web Service enables you to manage a report
 * server and its contents including server settings, security, reports,
 * subscriptions, and data sources.
 */

    public ReportingServiceLocator() {
    }


    public ReportingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReportingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReportingServiceSoap
    private java.lang.String ReportingServiceSoap_address = "http://localhost:8080/axis/services/ReportingServiceSoap";

    public java.lang.String getReportingServiceSoapAddress() {
        return ReportingServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReportingServiceSoapWSDDServiceName = "ReportingServiceSoap";

    public java.lang.String getReportingServiceSoapWSDDServiceName() {
        return ReportingServiceSoapWSDDServiceName;
    }

    public void setReportingServiceSoapWSDDServiceName(java.lang.String name) {
        ReportingServiceSoapWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.reportservice.ReportingServiceSoap_PortType getReportingServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReportingServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReportingServiceSoap(endpoint);
    }

    public test.wsdl.dataobjects.reportservice.ReportingServiceSoap_PortType getReportingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.reportservice.ReportingServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.reportservice.ReportingServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getReportingServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReportingServiceSoapEndpointAddress(java.lang.String address) {
        ReportingServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.reportservice.ReportingServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.reportservice.ReportingServiceSoap_BindingStub _stub = new test.wsdl.dataobjects.reportservice.ReportingServiceSoap_BindingStub(new java.net.URL(ReportingServiceSoap_address), this);
                _stub.setPortName(getReportingServiceSoapWSDDServiceName());
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
        if ("ReportingServiceSoap".equals(inputPortName)) {
            return getReportingServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportingServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReportingServiceSoap".equals(portName)) {
            setReportingServiceSoapEndpointAddress(address);
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
