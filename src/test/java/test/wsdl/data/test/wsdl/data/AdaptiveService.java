/**
 * AdaptiveService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.data;

public interface AdaptiveService extends javax.xml.rpc.Service {
    public java.lang.String getAdaptiveAddress();

    public test.wsdl.data.AdaptiveInterface getAdaptive() throws javax.xml.rpc.ServiceException;

    public test.wsdl.data.AdaptiveInterface getAdaptive(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}