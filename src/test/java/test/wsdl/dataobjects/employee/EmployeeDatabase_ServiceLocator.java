/**
 * EmployeeDatabase_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.employee;

public class EmployeeDatabase_ServiceLocator extends org.apache.axis.client.Service implements test.wsdl.dataobjects.employee.EmployeeDatabase_Service {

    public EmployeeDatabase_ServiceLocator() {
    }


    public EmployeeDatabase_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeDatabase_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeDatabase
    private java.lang.String EmployeeDatabase_address = "http://localhost:8080/axis/services/EmployeeDatabase";

    public java.lang.String getEmployeeDatabaseAddress() {
        return EmployeeDatabase_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeDatabaseWSDDServiceName = "EmployeeDatabase";

    public java.lang.String getEmployeeDatabaseWSDDServiceName() {
        return EmployeeDatabaseWSDDServiceName;
    }

    public void setEmployeeDatabaseWSDDServiceName(java.lang.String name) {
        EmployeeDatabaseWSDDServiceName = name;
    }

    public test.wsdl.dataobjects.employee.EmployeeDBPort getEmployeeDatabase() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeDatabase_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeDatabase(endpoint);
    }

    public test.wsdl.dataobjects.employee.EmployeeDBPort getEmployeeDatabase(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            test.wsdl.dataobjects.employee.EmployeeDBBindingStub _stub = new test.wsdl.dataobjects.employee.EmployeeDBBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeDatabaseWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeDatabaseEndpointAddress(java.lang.String address) {
        EmployeeDatabase_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (test.wsdl.dataobjects.employee.EmployeeDBPort.class.isAssignableFrom(serviceEndpointInterface)) {
                test.wsdl.dataobjects.employee.EmployeeDBBindingStub _stub = new test.wsdl.dataobjects.employee.EmployeeDBBindingStub(new java.net.URL(EmployeeDatabase_address), this);
                _stub.setPortName(getEmployeeDatabaseWSDDServiceName());
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
        if ("EmployeeDatabase".equals(inputPortName)) {
            return getEmployeeDatabase();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sun.com/JSR172UseCases", "EmployeeDatabase");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sun.com/JSR172UseCases", "EmployeeDatabase"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeDatabase".equals(portName)) {
            setEmployeeDatabaseEndpointAddress(address);
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
