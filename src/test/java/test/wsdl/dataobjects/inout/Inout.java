/**
 * Inout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.inout;

public interface Inout extends java.rmi.Remote {
    public void out0Inout0In0() throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0Inout0In1(java.lang.String name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0Inout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0Inout1In0(test.wsdl.dataobjects.inout.holders.PhoneHolder phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0Inout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0Inout1InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.holders.PhoneHolder phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0InoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0InoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void out0InoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int number) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public int out1Inout0In0() throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public int out1Inout0In1(java.lang.String name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public int out1Inout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public test.wsdl.dataobjects.inout.Address out1Inout1In0(javax.xml.rpc.holders.StringHolder name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public java.lang.String out1Inout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public java.lang.String out1Inout1InMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public java.lang.String out1InoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public java.lang.String out1InoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public java.lang.String out1InoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int number) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout0In0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout0In1(java.lang.String name, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout1In0(javax.xml.rpc.holders.StringHolder name, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInout1InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.holders.PhoneHolder phone, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void outManyInoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int otherNumber, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
    public void dateInout(org.apache.axis.holders.DateHolder date) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed;
}
