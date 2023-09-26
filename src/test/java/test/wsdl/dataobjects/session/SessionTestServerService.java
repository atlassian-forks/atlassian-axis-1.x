/**
 * SessionTestServerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.session;

public interface SessionTestServerService extends javax.xml.rpc.Service {
    public java.lang.String getSessionTestAddress();

    public test.wsdl.dataobjects.session.SessionTestServer getSessionTest() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.session.SessionTestServer getSessionTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
