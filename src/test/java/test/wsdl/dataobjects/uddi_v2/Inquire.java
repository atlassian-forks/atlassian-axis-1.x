/**
 * Inquire.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public interface Inquire extends java.rmi.Remote {
    public test.wsdl.dataobjects.uddi_v2.BindingDetail find_binding(test.wsdl.dataobjects.uddi_v2.Find_binding body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.BusinessList find_business(test.wsdl.dataobjects.uddi_v2.Find_business body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.RelatedBusinessesList find_relatedBusinesses(test.wsdl.dataobjects.uddi_v2.Find_relatedBusinesses body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.ServiceList find_service(test.wsdl.dataobjects.uddi_v2.Find_service body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.TModelList find_tModel(test.wsdl.dataobjects.uddi_v2.Find_tModel body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.BindingDetail get_bindingDetail(test.wsdl.dataobjects.uddi_v2.Get_bindingDetail body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.BusinessDetail get_businessDetail(test.wsdl.dataobjects.uddi_v2.Get_businessDetail body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.BusinessDetailExt get_businessDetailExt(test.wsdl.dataobjects.uddi_v2.Get_businessDetailExt body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.ServiceDetail get_serviceDetail(test.wsdl.dataobjects.uddi_v2.Get_serviceDetail body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
    public test.wsdl.dataobjects.uddi_v2.TModelDetail get_tModelDetail(test.wsdl.dataobjects.uddi_v2.Get_tModelDetail body) throws java.rmi.RemoteException, test.wsdl.dataobjects.uddi_v2.DispositionReport;
}
