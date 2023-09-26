/**
 * UserAccountService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.useraccount;

public interface UserAccountService extends javax.xml.rpc.Service {
    public java.lang.String getUserAccountAddress();

    public test.wsdl.dataobjects.useraccount.UserAccount_PortType getUserAccount() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.useraccount.UserAccount_PortType getUserAccount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
