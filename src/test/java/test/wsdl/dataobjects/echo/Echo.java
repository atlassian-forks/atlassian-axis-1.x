/**
 * Echo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public interface Echo extends java.rmi.Remote {
    public void echo(test.wsdl.dataobjects.echo.holders.MyComplexTypeHolder myElement) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.echo.MyElement2Response echo2(test.wsdl.dataobjects.echo.MyComplexType2 options) throws java.rmi.RemoteException;
}
