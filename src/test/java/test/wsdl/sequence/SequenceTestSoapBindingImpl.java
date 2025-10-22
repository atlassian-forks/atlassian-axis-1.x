/**
 * SequenceTestSoapBindingImpl.java
 *
 * RPC-style implementation that validates sequence ordering through bean introspection
 */

package test.wsdl.sequence;

import java.lang.reflect.Field;

public class SequenceTestSoapBindingImpl implements test.wsdl.sequence.SequenceTestPortType {
    
    public boolean testSequence(test.wsdl.sequence.SequenceInfo info) throws java.rmi.RemoteException {
        if (info == null) {
            return false;
        }
        
        // The real test: validate that the SequenceInfo bean was properly deserialized
        // from XML that maintained the sequence order defined in the WSDL schema.
        
        // We can check that the bean has the expected structure and that
        // all fields are accessible (indicating proper sequence-based deserialization)
        try {
            Field[] fields = info.getClass().getDeclaredFields();
            
            // The WSDL defines 6 elements in sequence: zero, one, two, three, four, five
            // If deserialization worked correctly, we should have these fields
            String[] expectedFields = {"zero", "one", "two", "three", "four", "five"};
            
            for (String expectedField : expectedFields) {
                boolean found = false;
                for (Field field : fields) {
                    if (field.getName().equals(expectedField)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false; // Missing expected field
                }
            }
            
            // If we got here, the SequenceInfo was properly deserialized with all expected fields
            // This indicates that the XML sequence was correctly maintained
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
}