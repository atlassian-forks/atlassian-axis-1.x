/**
 * RpcParamsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.rpcParams;

public interface RpcParamsService extends javax.xml.rpc.Service {
    public java.lang.String getRpcParamsAddress();

    public test.wsdl.dataobjects.rpcParams.RpcParamsTest getRpcParams() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.rpcParams.RpcParamsTest getRpcParams(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
