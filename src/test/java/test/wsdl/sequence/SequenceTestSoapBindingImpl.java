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
        
        // The real test: validate that the SequenceInfo bean maintains the correct
        // sequence order as defined in the WSDL schema through Axis TypeDesc metadata
        
        try {
            // Check field presence first
            Field[] fields = info.getClass().getDeclaredFields();
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
            
            // Now verify the sequence order through Axis TypeDesc metadata
            // This is how Axis maintains XML element ordering during serialization
            org.apache.axis.description.TypeDesc typeDesc = 
                test.wsdl.sequence.SequenceInfo.getTypeDesc();
            
            if (typeDesc == null) {
                return false;
            }
            
            // Get the field descriptors which maintain the WSDL sequence order
            org.apache.axis.description.FieldDesc[] fieldDescs = typeDesc.getFields();
            
            if (fieldDescs == null || fieldDescs.length != expectedFields.length) {
                return false;
            }
            
            // Verify that the TypeDesc maintains fields in the expected sequence order
            for (int i = 0; i < expectedFields.length; i++) {
                String expectedFieldName = expectedFields[i];
                String actualFieldName = fieldDescs[i].getFieldName();
                
                if (!expectedFieldName.equals(actualFieldName)) {
                    return false; // Field order doesn't match WSDL sequence
                }
            }
            
            // If we got here, both field presence and sequence order are correct
            // This verifies that Axis properly maintains the WSDL-defined sequence
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
}