/**
 * MArrayTests_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MArrayTest;

public interface MArrayTests_PortType extends java.rmi.Remote {
    public int[][][] testIntArray(int[][][] in) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.MArrayTest.Foo[][][] testFooArray(test.wsdl.dataobjects.MArrayTest.Foo[][][] in) throws java.rmi.RemoteException;
    public java.util.HashMap testMapFooArray(java.util.HashMap in) throws java.rmi.RemoteException;
}
