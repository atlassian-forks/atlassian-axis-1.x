/**
 * SalesRankNPriceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public class SalesRankNPriceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPrice {

/**
 * <b>This Web Service can be used to get the Sales Rank and/or price
 * for any book available on Amazon and/or B&N Web sites.</b> This Web
 * Service is created by <a href=http://www.PerfectXML.com target=_blank>PerfectXML
 * Team</a>.<br><br>Please email your questions/comments/suggestions
 * to <a href=mailto:darshan@PerfectXML.com><b>darshan@PerfectXML.com</b></a>.<br>Web
 * Service built using ASP.NET (<b>1.0.3705</b>) and Visual Studio .NET
 * (<b>7.0.9466</b>)<br><br>The C# client application that accesses SalesRankNPrice
 * Web Service is available (with source code)to download at <A href=http://www.perfectxml.com/Downloads/SalesRankNPriceWinClient.zip
 * >http://www.PerfectXML.com/Downloads/SalesRankNPriceWinClient.zip</A>.<br><br><A
 * href=http://www.perfectxml.com/images/SalesRankNPrice.jpg target=_blank>Click
 * here</A> to view the screenshot image of this client application.<br><br>You
 * can configure which books to monitor, the settings are saved in XML
 * configuration files locally.<br><br>For <b>more information on Web
 * Services</b>, visit <a href=http://www.PerfectXML.com/WebSvc1.asp
 * target=_blank>PerfectXML Web Services focus section</a>.<br><br>Note
 * that this Web Service posts data directly to Amazon and BarnesAndNoble
 * Web sites. This Web Service is intended only for non-commercial, personal
 * use.<br><br><u>Few sample ISBN Numbers</u>:<blockquote>186100589X:
 * <b>XML Application Development with MSXML 4.0</b> (Wrox Press)<br>1861005628
 * : <b>Early Adopter VoiceXML</b> (Wrox Press)<br>073571052X : <b>C++
 * XML</b> (New Riders)<br>1861005466 : <b>Professional SQL Server 2000
 * XML</b> (Wrox Press)<br>1861005318 : <b>Professional XML for .NET
 * Developers</b> (Wrox Press)<br>1893115976 : <b>Moving to VB.NET: Strategies,
 * Concepts, and Code (Beta 2)</b> (APress)</blockquote>
 */

    public SalesRankNPriceLocator() {
    }


    public SalesRankNPriceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SalesRankNPriceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SalesRankNPriceSoap
    private java.lang.String SalesRankNPriceSoap_address = "http://www.perfectxml.net/WebServices/SalesRankNPrice/BookService.asmx";

    public java.lang.String getSalesRankNPriceSoapAddress() {
        return SalesRankNPriceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SalesRankNPriceSoapWSDDServiceName = "SalesRankNPriceSoap";

    public java.lang.String getSalesRankNPriceSoapWSDDServiceName() {
        return SalesRankNPriceSoapWSDDServiceName;
    }

    public void setSalesRankNPriceSoapWSDDServiceName(java.lang.String name) {
        SalesRankNPriceSoapWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_PortType getSalesRankNPriceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SalesRankNPriceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSalesRankNPriceSoap(endpoint);
    }

    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_PortType getSalesRankNPriceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_BindingStub _stub = new test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getSalesRankNPriceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSalesRankNPriceSoapEndpointAddress(java.lang.String address) {
        SalesRankNPriceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_BindingStub _stub = new test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_BindingStub(new java.net.URL(SalesRankNPriceSoap_address), this);
                _stub.setPortName(getSalesRankNPriceSoapWSDDServiceName());
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
        if ("SalesRankNPriceSoap".equals(inputPortName)) {
            return getSalesRankNPriceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "SalesRankNPrice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "SalesRankNPriceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SalesRankNPriceSoap".equals(portName)) {
            setSalesRankNPriceSoapEndpointAddress(address);
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
