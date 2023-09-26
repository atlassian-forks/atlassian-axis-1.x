/**
 * BigIntegerArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class BigIntegerArrayTestResponse  implements java.io.Serializable {
    private java.math.BigInteger[] bigIntegerArray;

    public BigIntegerArrayTestResponse() {
    }

    public BigIntegerArrayTestResponse(
           java.math.BigInteger[] bigIntegerArray) {
           this.bigIntegerArray = bigIntegerArray;
    }


    /**
     * Gets the bigIntegerArray value for this BigIntegerArrayTestResponse.
     * 
     * @return bigIntegerArray
     */
    public java.math.BigInteger[] getBigIntegerArray() {
        return bigIntegerArray;
    }


    /**
     * Sets the bigIntegerArray value for this BigIntegerArrayTestResponse.
     * 
     * @param bigIntegerArray
     */
    public void setBigIntegerArray(java.math.BigInteger[] bigIntegerArray) {
        this.bigIntegerArray = bigIntegerArray;
    }

    public java.math.BigInteger getBigIntegerArray(int i) {
        return this.bigIntegerArray[i];
    }

    public void setBigIntegerArray(int i, java.math.BigInteger _value) {
        this.bigIntegerArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BigIntegerArrayTestResponse)) return false;
        BigIntegerArrayTestResponse other = (BigIntegerArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bigIntegerArray==null && other.getBigIntegerArray()==null) || 
             (this.bigIntegerArray!=null &&
              java.util.Arrays.equals(this.bigIntegerArray, other.getBigIntegerArray())));
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
        if (getBigIntegerArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBigIntegerArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBigIntegerArray(), i);
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
        new org.apache.axis.description.TypeDesc(BigIntegerArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigIntegerArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
