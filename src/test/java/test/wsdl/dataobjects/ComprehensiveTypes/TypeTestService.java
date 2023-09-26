/**
 * TypeTestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public interface TypeTestService extends javax.xml.rpc.Service {
    public java.lang.String getTypeTestAddress();

    public test.wsdl.dataobjects.ComprehensiveTypes.TypeTest_PortType getTypeTest() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.ComprehensiveTypes.TypeTest_PortType getTypeTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
