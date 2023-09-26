/**
 * RamService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ram;

public interface RamService extends javax.xml.rpc.Service {
    public java.lang.String getRamAddress();

    public test.wsdl.dataobjects.ram.Ram_PortType getRam() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.ram.Ram_PortType getRam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
