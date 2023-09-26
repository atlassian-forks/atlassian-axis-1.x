/**
 * WrappedInOutInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.wrapped_inout;

public interface WrappedInOutInterface extends java.rmi.Remote {
    public java.lang.String echoString(java.lang.String inarg) throws java.rmi.RemoteException;
    public java.lang.String echoStringIO(java.lang.String ioarg) throws java.rmi.RemoteException;
    public java.lang.String echoStringIOret(javax.xml.rpc.holders.StringHolder ioarg) throws java.rmi.RemoteException;
    public void echoStringInIO(java.lang.String inarg, javax.xml.rpc.holders.StringHolder ioarg) throws java.rmi.RemoteException;
    public java.lang.String echoStringBig(java.lang.String inarg, javax.xml.rpc.holders.StringHolder ioarg1, javax.xml.rpc.holders.StringHolder ioarg2) throws java.rmi.RemoteException;
    public void helloInOut(javax.xml.rpc.holders.StringHolder inout1, javax.xml.rpc.holders.StringHolder inout2, javax.xml.rpc.holders.StringHolder inout3, javax.xml.rpc.holders.StringHolder inout4, java.lang.String inonly) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.wrapped_inout.Phone echoPhone(test.wsdl.dataobjects.wrapped_inout.Phone input) throws java.rmi.RemoteException;
}
