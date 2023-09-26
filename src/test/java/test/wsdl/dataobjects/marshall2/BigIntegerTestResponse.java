/**
 * BigIntegerTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class BigIntegerTestResponse  implements java.io.Serializable {
    private java.math.BigInteger bigInteger;

    public BigIntegerTestResponse() {
    }

    public BigIntegerTestResponse(
           java.math.BigInteger bigInteger) {
           this.bigInteger = bigInteger;
    }


    /**
     * Gets the bigInteger value for this BigIntegerTestResponse.
     * 
     * @return bigInteger
     */
    public java.math.BigInteger getBigInteger() {
        return bigInteger;
    }


    /**
     * Sets the bigInteger value for this BigIntegerTestResponse.
     * 
     * @param bigInteger
     */
    public void setBigInteger(java.math.BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BigIntegerTestResponse)) return false;
        BigIntegerTestResponse other = (BigIntegerTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bigInteger==null && other.getBigInteger()==null) || 
             (this.bigInteger!=null &&
              this.bigInteger.equals(other.getBigInteger())));
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
        if (getBigInteger() != null) {
            _hashCode += getBigInteger().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BigIntegerTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigInteger");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigInteger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
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