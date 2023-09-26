/**
 * MultiRefTestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MultiRefTest;

public interface MultiRefTestService extends javax.xml.rpc.Service {
    public java.lang.String getMultiRefTestAddress();

    public test.wsdl.dataobjects.MultiRefTest.MultiRefTest_PortType getMultiRefTest() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.MultiRefTest.MultiRefTest_PortType getMultiRefTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
