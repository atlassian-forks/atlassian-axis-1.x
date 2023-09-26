/**
 * Wrapped_holders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.thing;

public interface Wrapped_holders extends javax.xml.rpc.Service {
    public java.lang.String getThingAddress();

    public test.wsdl.dataobjects.thing.Thing_PortType getThing() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.thing.Thing_PortType getThing(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
