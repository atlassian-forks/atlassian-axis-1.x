/**
 * EsrTestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.esr;

public interface EsrTestService extends javax.xml.rpc.Service {
    public java.lang.String getEsrTestAddress();

    public test.wsdl.dataobjects.esr.EsrTest_PortType getEsrTest() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.esr.EsrTest_PortType getEsrTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
