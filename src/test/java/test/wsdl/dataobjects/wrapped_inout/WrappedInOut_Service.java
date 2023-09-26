/**
 * WrappedInOut_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.wrapped_inout;

public interface WrappedInOut_Service extends javax.xml.rpc.Service {
    public java.lang.String getWrappedInOutAddress();

    public test.wsdl.dataobjects.wrapped_inout.WrappedInOutInterface getWrappedInOut() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.wrapped_inout.WrappedInOutInterface getWrappedInOut(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
