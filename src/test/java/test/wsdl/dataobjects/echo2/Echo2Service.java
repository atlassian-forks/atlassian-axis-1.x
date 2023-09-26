/**
 * Echo2Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo2;

public interface Echo2Service extends javax.xml.rpc.Service {
    public java.lang.String getEcho2Address();

    public test.wsdl.dataobjects.echo2.Echo2PT getEcho2() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.echo2.Echo2PT getEcho2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
