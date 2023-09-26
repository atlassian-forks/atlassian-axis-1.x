/**
 * Schema2Service_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.schema2;

public interface Schema2Service_Service extends javax.xml.rpc.Service {
    public java.lang.String getSchema2ServiceAddress();

    public test.wsdl.dataobjects.schema2.Schema2Test getSchema2Service() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.schema2.Schema2Test getSchema2Service(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
