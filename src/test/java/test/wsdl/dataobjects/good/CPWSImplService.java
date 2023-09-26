/**
 * CPWSImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public interface CPWSImplService extends javax.xml.rpc.Service {
    public java.lang.String getCPWebServicesAddress();

    public test.wsdl.dataobjects.good.CPWSImpl getCPWebServices() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.good.CPWSImpl getCPWebServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
