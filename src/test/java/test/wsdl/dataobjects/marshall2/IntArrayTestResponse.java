/**
 * IntArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class IntArrayTestResponse  implements java.io.Serializable {
    private int[] intArray;

    public IntArrayTestResponse() {
    }

    public IntArrayTestResponse(
           int[] intArray) {
           this.intArray = intArray;
    }


    /**
     * Gets the intArray value for this IntArrayTestResponse.
     * 
     * @return intArray
     */
    public int[] getIntArray() {
        return intArray;
    }


    /**
     * Sets the intArray value for this IntArrayTestResponse.
     * 
     * @param intArray
     */
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int getIntArray(int i) {
        return this.intArray[i];
    }

    public void setIntArray(int i, int _value) {
        this.intArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntArrayTestResponse)) return false;
        IntArrayTestResponse other = (IntArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intArray==null && other.getIntArray()==null) || 
             (this.intArray!=null &&
              java.util.Arrays.equals(this.intArray, other.getIntArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIntArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "intArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
