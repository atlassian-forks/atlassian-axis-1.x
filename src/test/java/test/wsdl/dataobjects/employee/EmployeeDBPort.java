/**
 * EmployeeDBPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.employee;

public interface EmployeeDBPort extends java.rmi.Remote {
    public int getEmployeeCount(int intVal) throws java.rmi.RemoteException;
    public boolean addGroups(java.lang.String[] group) throws java.rmi.RemoteException;
    public boolean isManager(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;
    public boolean promoteEmployee(test.wsdl.dataobjects.employee.NameType empName, int empID) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.employee.EmployeeType[] getEmployees(test.wsdl.dataobjects.employee.NameType[] name) throws java.rmi.RemoteException;
    public boolean scheduleMtg(test.wsdl.dataobjects.employee.EmployeeType[] employee) throws java.rmi.RemoteException;
}
