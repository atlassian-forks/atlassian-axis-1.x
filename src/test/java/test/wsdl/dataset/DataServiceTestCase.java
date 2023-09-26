/**
 * DataServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.dataset;

import org.apache.axis.AxisFault;
import test.wsdl.dataobjects.DataService.DataServiceLocator;
import test.wsdl.dataobjects.DataService.DataServiceSoap_PortType;
import test.wsdl.dataobjects.DataService.GetTitleAuthorsResponseGetTitleAuthorsResult;

import java.net.ConnectException;
import java.io.IOException;

public class DataServiceTestCase extends junit.framework.TestCase {
    public DataServiceTestCase(java.lang.String name) {
        super(name);
    }
    public void test1DataServiceSoapGetTitleAuthors() throws Exception {
        DataServiceSoap_PortType binding;
        try {
            binding = (DataServiceSoap_PortType)
                    new DataServiceLocator().getDataServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertTrue("binding is null", binding != null);

        try {
            // Test operation
            GetTitleAuthorsResponseGetTitleAuthorsResult value = null;
            value = binding.getTitleAuthors();
            assertTrue(value != null);
            // TBD - validate results
        } catch (java.rmi.RemoteException re) {
            if (re instanceof AxisFault) {
                AxisFault fault = (AxisFault) re;
                if (fault.detail instanceof ConnectException ||
                    fault.getFaultCode().getLocalPart().equals("HTTP")) {
                    System.err.println("DataService HTTP error: " + fault);
                    return;
                }
                if (fault.detail instanceof IOException) {
                    System.err.println("DataService IO error: " + fault);
                    return;
                }
            }
            throw new junit.framework.AssertionFailedError("Remote Exception caught: " + re);
        }
    }
}
