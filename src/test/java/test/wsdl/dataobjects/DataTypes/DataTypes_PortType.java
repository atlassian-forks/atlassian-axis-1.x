/**
 * DataTypes_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataTypes;

public interface DataTypes_PortType extends java.rmi.Remote {
    public java.lang.String sayHello() throws java.rmi.RemoteException;
    public java.lang.String sayHelloName(java.lang.String name) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.DataTypes.ArrayOfInt getIntArray() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.DataTypes.Mode getMode() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.DataTypes.UsageType getUsageType() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.DataTypes.Order getOrder() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.DataTypes.ArrayOfOrder getOrders() throws java.rmi.RemoteException;
    public java.lang.String[] getSimpleList(java.lang.String[] stringList) throws java.rmi.RemoteException;
}
