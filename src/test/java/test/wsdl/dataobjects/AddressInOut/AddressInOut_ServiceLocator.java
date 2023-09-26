/**
 * AddressInOut_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.AddressInOut;

public class AddressInOut_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.AddressInOut.AddressInOut_Service {

    public AddressInOut_ServiceLocator() {
    }


    public AddressInOut_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressInOut_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddressInOut
    private java.lang.String AddressInOut_address = "http://localhost:8080/axis/services/AddressInOut";

    public java.lang.String getAddressInOutAddress() {
        return AddressInOut_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddressInOutWSDDServiceName = "AddressInOut";

    public java.lang.String getAddressInOutWSDDServiceName() {
        return AddressInOutWSDDServiceName;
    }

    public void setAddressInOutWSDDServiceName(java.lang.String name) {
        AddressInOutWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.AddressInOut.AddressService getAddressInOut() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddressInOut_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddressInOut(endpoint);
    }

    public test.wsdl.dataobjects.AddressInOut.AddressService getAddressInOut(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.AddressInOut.AddressSoapBindingStub _stub = new test.wsdl.dataobjects.AddressInOut.AddressSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddressInOutWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddressInOutEndpointAddress(java.lang.String address) {
        AddressInOut_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.AddressInOut.AddressService.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.AddressInOut.AddressSoapBindingStub _stub = new test.wsdl.dataobjects.AddressInOut.AddressSoapBindingStub(new java.net.URL(AddressInOut_address), this);
                _stub.setPortName(getAddressInOutWSDDServiceName());
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
        if ("AddressInOut".equals(inputPortName)) {
            return getAddressInOut();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxrpcdynproxy.wsdl.test", "AddressInOut");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxrpcdynproxy.wsdl.test", "AddressInOut"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddressInOut".equals(portName)) {
            setAddressInOutEndpointAddress(address);
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
