/**
 * QueryTestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public interface QueryTestService extends javax.xml.rpc.Service {
    public java.lang.String getQueryTestAddress();

    public test.wsdl.dataobjects.QueryTest.QueryTest_PortType getQueryTest() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.QueryTest.QueryTest_PortType getQueryTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
