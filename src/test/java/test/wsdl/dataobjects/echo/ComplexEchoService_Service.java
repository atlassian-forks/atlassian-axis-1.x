/**
 * ComplexEchoService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public interface ComplexEchoService_Service extends javax.xml.rpc.Service {
    public java.lang.String getComplexEchoServiceAddress();

    public test.wsdl.dataobjects.echo.Echo getComplexEchoService() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.echo.Echo getComplexEchoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
