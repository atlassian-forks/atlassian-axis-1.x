/**
 * DoExample_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.bug1191;

public interface DoExample_Service extends javax.xml.rpc.Service {
    public java.lang.String getWrapperHolderAddress();

    public test.wsdl.dataobjects.bug1191.ExampleSoap getWrapperHolder() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.bug1191.ExampleSoap getWrapperHolder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
