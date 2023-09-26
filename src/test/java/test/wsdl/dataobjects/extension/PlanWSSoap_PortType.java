/**
 * PlanWSSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.extension;

public interface PlanWSSoap_PortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.extension.GetPlanResponse getPlan(javax.xml.namespace.QName parameters) throws java.rmi.RemoteException;
    public void getMPlan(javax.xml.namespace.QName[] list) throws java.rmi.RemoteException;
}
