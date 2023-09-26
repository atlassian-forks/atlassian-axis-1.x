/**
 * Qualify_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.qualifytest;

public interface Qualify_PortType extends java.rmi.Remote {
    public java.lang.String simple(java.lang.String name) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.qualifytest.FormOverrideResponseResponse formOverride(test.wsdl.dataobjects.qualifytest.FormOverrideComplex complex) throws java.rmi.RemoteException;
}
