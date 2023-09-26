/**
 * BooleanArrayTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class BooleanArrayTest  implements java.io.Serializable {
    private boolean[] booleanArray;

    public BooleanArrayTest() {
    }

    public BooleanArrayTest(
           boolean[] booleanArray) {
           this.booleanArray = booleanArray;
    }


    /**
     * Gets the booleanArray value for this BooleanArrayTest.
     * 
     * @return booleanArray
     */
    public boolean[] getBooleanArray() {
        return booleanArray;
    }


    /**
     * Sets the booleanArray value for this BooleanArrayTest.
     * 
     * @param booleanArray
     */
    public void setBooleanArray(boolean[] booleanArray) {
        this.booleanArray = booleanArray;
    }

    public boolean getBooleanArray(int i) {
        return this.booleanArray[i];
    }

    public void setBooleanArray(int i, boolean _value) {
        this.booleanArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BooleanArrayTest)) return false;
        BooleanArrayTest other = (BooleanArrayTest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.booleanArray==null && other.getBooleanArray()==null) || 
             (this.booleanArray!=null &&
              java.util.Arrays.equals(this.booleanArray, other.getBooleanArray())));
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
        if (getBooleanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBooleanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBooleanArray(), i);
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
        new org.apache.axis.description.TypeDesc(BooleanArrayTest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanArrayTest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "booleanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
