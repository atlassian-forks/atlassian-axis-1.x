/**
 * Echo2PT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo2;

public interface Echo2PT extends java.rmi.Remote {
    public test.wsdl.dataobjects.echo2.MyBase64Bean echoMyBase64Bean(test.wsdl.dataobjects.echo2.MyBase64Bean input) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.echo2.ArrayOfMyBase64Bean echoArrayOfMyBase64Bean(test.wsdl.dataobjects.echo2.ArrayOfMyBase64Bean input) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.echo2.ArrayOfString_MaxOccursUnbounded echoArrayOfString_MaxOccursUnbounded(test.wsdl.dataobjects.echo2.ArrayOfString_MaxOccursUnbounded input) throws java.rmi.RemoteException;
    public java.lang.String[] echoArrayOfString_SoapEncArray(java.lang.String[] input) throws java.rmi.RemoteException;
}
