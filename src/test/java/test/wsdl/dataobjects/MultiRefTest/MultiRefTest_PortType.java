/**
 * MultiRefTest_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MultiRefTest;

public interface MultiRefTest_PortType extends java.rmi.Remote {
    public int testSimpleTree(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException;
    public int testDiamond(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException;
    public int testLoop(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException;
    public int testSelfRef(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException;
    public int testSameArgs(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException;
    public int testArgsRefSameNode(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException;
    public int testArgsRefEachOther(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException;
}
