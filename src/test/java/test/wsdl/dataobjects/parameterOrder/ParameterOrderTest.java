/**
 * ParameterOrderTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.parameterOrder;

public interface ParameterOrderTest extends java.rmi.Remote {
    public void oneIn(int one) throws java.rmi.RemoteException;
    public void oneInout(javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
    public void oneOut(javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
    public void fiveInNoOrder(int one, int two, int three, int four, int five) throws java.rmi.RemoteException;
    public void fiveInoutNoOrder(javax.xml.rpc.holders.IntHolder one, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder five) throws java.rmi.RemoteException;
    public void fiveOutNoOrder(javax.xml.rpc.holders.IntHolder one, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder five) throws java.rmi.RemoteException;
    public void fiveIn(int five, int four, int three, int two, int one) throws java.rmi.RemoteException;
    public void fiveInout(javax.xml.rpc.holders.IntHolder five, javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
    public void fiveOut(javax.xml.rpc.holders.IntHolder five, javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
    public int someInoutPartialOrder1(javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
    public void someInoutPartialOrder2(javax.xml.rpc.holders.IntHolder four, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder one, javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder five) throws java.rmi.RemoteException;
    public void fourOutPartialOrder(javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder one, javax.xml.rpc.holders.IntHolder two, javax.xml.rpc.holders.IntHolder four) throws java.rmi.RemoteException;
    public int oneReturn(javax.xml.rpc.holders.IntHolder three, javax.xml.rpc.holders.IntHolder one) throws java.rmi.RemoteException;
}
