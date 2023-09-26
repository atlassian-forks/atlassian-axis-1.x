/**
 * EmployeeDatabase_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.employee;

public interface EmployeeDatabase_Service extends javax.xml.rpc.Service {
    public java.lang.String getEmployeeDatabaseAddress();

    public test.wsdl.dataobjects.employee.EmployeeDBPort getEmployeeDatabase() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.employee.EmployeeDBPort getEmployeeDatabase(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
