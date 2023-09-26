/**
 * MyServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.testdate;

public interface MyServiceService extends javax.xml.rpc.Service {
    public java.lang.String gettestdateAddress();

    public test.wsdl.dataobjects.testdate.MyService gettestdate() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.testdate.MyService gettestdate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
