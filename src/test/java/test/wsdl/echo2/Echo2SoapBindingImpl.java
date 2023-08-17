/**
 * Echo2SoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Mar 22, 2005 (05:08:41 CET) WSDL2Java emitter.
 */

package test.wsdl.echo2;

public class Echo2SoapBindingImpl implements Echo2PT {
    public MyBase64Bean echoMyBase64Bean(MyBase64Bean input) throws java.rmi.RemoteException {
        return input;
    }
    public MyBase64Bean[] echoArrayOfMyBase64Bean(MyBase64Bean[] input) throws java.rmi.RemoteException {
        return input;
    }

    public String[] echoArrayOfString_MaxOccursUnbounded(String[] input) throws java.rmi.RemoteException {
        return input;
    }

    public java.lang.String[] echoArrayOfString_SoapEncArray(java.lang.String[] input) throws java.rmi.RemoteException {
        return input;
    }

}
