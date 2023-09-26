/**
 * EsrTest_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.esr;

public interface EsrTest_PortType extends java.rmi.Remote {
    public void esrInOut(short value, javax.xml.rpc.holders.ShortHolder echoVal, javax.xml.rpc.holders.DoubleHolder sqrtVal) throws java.rmi.RemoteException;
    public void esrInOut2(java.lang.String bstrSAH, java.lang.String bstrSUH, short value, javax.xml.rpc.holders.ShortHolder echoVal, javax.xml.rpc.holders.DoubleHolder sqrtVal) throws java.rmi.RemoteException;
}
