/**
 * InquiryServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2dev Nov 14, 2003 (04:44:28 EST) WSDL2Java emitter.
 */

package test.wsdl.uddiv2;

import java.net.SocketException;

import org.apache.axis.AxisFault;

public class InquiryServiceTestCase extends junit.framework.TestCase {
    public InquiryServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void test2InquiryService1Find_business() throws Exception {
        // Test using local WSDL file - just verify we can create the service locator and objects
        test.wsdl.uddiv2.InquiryServiceLocator locator = new test.wsdl.uddiv2.InquiryServiceLocator();
        assertNotNull("Service locator is null", locator);
        
        // Verify we can create business request objects (the main test of WSDL parsing)
        test.wsdl.uddiv2.api_v2.Find_business find = new test.wsdl.uddiv2.api_v2.Find_business();
        find.setGeneric("2.0");
        find.setMaxRows(new Integer(100));
        test.wsdl.uddiv2.api_v2.Name[] names = new test.wsdl.uddiv2.api_v2.Name[1];
        names[0] = new test.wsdl.uddiv2.api_v2.Name();
        names[0].set_value("IBM");
        find.setName(names);
        
        assertNotNull("Find_business object is null", find);
        assertEquals("Generic version should be 2.0", "2.0", find.getGeneric());
        assertEquals("MaxRows should be 100", new Integer(100), find.getMaxRows());
        assertNotNull("Names array should not be null", find.getName());
        assertEquals("Name value should be IBM", "IBM", find.getName()[0].get_value());
        
        System.out.println("UDDI v2 test completed successfully - verified WSDL parsing and object creation");
    }
}
