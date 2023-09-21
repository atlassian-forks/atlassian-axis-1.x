/**
 * AddressBookNoImplSEIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.addrNoImplSEI;

public class AddressBookNoImplSEIServiceLocator extends org.apache.axis.client.Service implements test.wsdl.addrNoImplSEI.AddressBookNoImplSEIService {

    public AddressBookNoImplSEIServiceLocator() {
    }


    public AddressBookNoImplSEIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressBookNoImplSEIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddressBookNoImplSEI
    private java.lang.String AddressBookNoImplSEI_address = "http://localhost:8080/axis/services/AddressBookNoImplSEI";

    public java.lang.String getAddressBookNoImplSEIAddress() {
        return AddressBookNoImplSEI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddressBookNoImplSEIWSDDServiceName = "AddressBookNoImplSEI";

    public java.lang.String getAddressBookNoImplSEIWSDDServiceName() {
        return AddressBookNoImplSEIWSDDServiceName;
    }

    public void setAddressBookNoImplSEIWSDDServiceName(java.lang.String name) {
        AddressBookNoImplSEIWSDDServiceName = name;
    }

    public test.wsdl.addrNoImplSEI.AddressBookNoImplSEI_PortType getAddressBookNoImplSEI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddressBookNoImplSEI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddressBookNoImplSEI(endpoint);
    }

    public test.wsdl.addrNoImplSEI.AddressBookNoImplSEI_PortType getAddressBookNoImplSEI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.addrNoImplSEI.AddressBookNoImplSEISoapBindingStub _stub = new test.wsdl.addrNoImplSEI.AddressBookNoImplSEISoapBindingStub(portAddress, this);
            _stub.setPortName(getAddressBookNoImplSEIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddressBookNoImplSEIEndpointAddress(java.lang.String address) {
        AddressBookNoImplSEI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.addrNoImplSEI.AddressBookNoImplSEI_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.addrNoImplSEI.AddressBookNoImplSEISoapBindingStub _stub = new test.wsdl.addrNoImplSEI.AddressBookNoImplSEISoapBindingStub(new java.net.URL(AddressBookNoImplSEI_address), this);
                _stub.setPortName(getAddressBookNoImplSEIWSDDServiceName());
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
        if ("AddressBookNoImplSEI".equals(inputPortName)) {
            return getAddressBookNoImplSEI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:AddrNoImplSEI", "AddressBookNoImplSEIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:AddrNoImplSEI", "AddressBookNoImplSEI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddressBookNoImplSEI".equals(portName)) {
            setAddressBookNoImplSEIEndpointAddress(address);
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
