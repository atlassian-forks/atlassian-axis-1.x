/**
 * UserAccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.useraccount;

public class UserAccountServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.useraccount.UserAccountService {

    public UserAccountServiceLocator() {
    }


    public UserAccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserAccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserAccount
    private java.lang.String UserAccount_address = "http://localhost:8080/axis/services/UserAccount";

    public java.lang.String getUserAccountAddress() {
        return UserAccount_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserAccountWSDDServiceName = "UserAccount";

    public java.lang.String getUserAccountWSDDServiceName() {
        return UserAccountWSDDServiceName;
    }

    public void setUserAccountWSDDServiceName(java.lang.String name) {
        UserAccountWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.useraccount.UserAccount_PortType getUserAccount() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserAccount_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserAccount(endpoint);
    }

    public test.wsdl.dataobjects.useraccount.UserAccount_PortType getUserAccount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.useraccount.UserAccountSoapBindingStub _stub = new test.wsdl.dataobjects.useraccount.UserAccountSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserAccountWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserAccountEndpointAddress(java.lang.String address) {
        UserAccount_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.useraccount.UserAccount_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.useraccount.UserAccountSoapBindingStub _stub = new test.wsdl.dataobjects.useraccount.UserAccountSoapBindingStub(new java.net.URL(UserAccount_address), this);
                _stub.setPortName(getUserAccountWSDDServiceName());
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
        if ("UserAccount".equals(inputPortName)) {
            return getUserAccount();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://customerinfo", "UserAccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://customerinfo", "UserAccount"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserAccount".equals(portName)) {
            setUserAccountEndpointAddress(address);
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
