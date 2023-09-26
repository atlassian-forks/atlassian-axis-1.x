/**
 * BigDecimalArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class BigDecimalArrayTestResponse  implements java.io.Serializable {
    private java.math.BigDecimal[] bigDecimalArray;

    public BigDecimalArrayTestResponse() {
    }

    public BigDecimalArrayTestResponse(
           java.math.BigDecimal[] bigDecimalArray) {
           this.bigDecimalArray = bigDecimalArray;
    }


    /**
     * Gets the bigDecimalArray value for this BigDecimalArrayTestResponse.
     * 
     * @return bigDecimalArray
     */
    public java.math.BigDecimal[] getBigDecimalArray() {
        return bigDecimalArray;
    }


    /**
     * Sets the bigDecimalArray value for this BigDecimalArrayTestResponse.
     * 
     * @param bigDecimalArray
     */
    public void setBigDecimalArray(java.math.BigDecimal[] bigDecimalArray) {
        this.bigDecimalArray = bigDecimalArray;
    }

    public java.math.BigDecimal getBigDecimalArray(int i) {
        return this.bigDecimalArray[i];
    }

    public void setBigDecimalArray(int i, java.math.BigDecimal _value) {
        this.bigDecimalArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BigDecimalArrayTestResponse)) return false;
        BigDecimalArrayTestResponse other = (BigDecimalArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bigDecimalArray==null && other.getBigDecimalArray()==null) || 
             (this.bigDecimalArray!=null &&
              java.util.Arrays.equals(this.bigDecimalArray, other.getBigDecimalArray())));
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
        if (getBigDecimalArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBigDecimalArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBigDecimalArray(), i);
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
        new org.apache.axis.description.TypeDesc(BigDecimalArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigDecimalArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
