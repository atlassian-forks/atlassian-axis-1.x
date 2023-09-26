/**
 * ReportingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public interface ReportingService extends javax.xml.rpc.Service {

/**
 * The Reporting Services Web Service enables you to manage a report
 * server and its contents including server settings, security, reports,
 * subscriptions, and data sources.
 */
    public java.lang.String getReportingServiceSoapAddress();

    public test.wsdl.dataobjects.reportservice.ReportingServiceSoap_PortType getReportingServiceSoap() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.reportservice.ReportingServiceSoap_PortType getReportingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
