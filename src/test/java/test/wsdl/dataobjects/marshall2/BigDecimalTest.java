/**
 * BigDecimalTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class BigDecimalTest  implements java.io.Serializable {
    private java.math.BigDecimal bigDecimal;

    public BigDecimalTest() {
    }

    public BigDecimalTest(
           java.math.BigDecimal bigDecimal) {
           this.bigDecimal = bigDecimal;
    }


    /**
     * Gets the bigDecimal value for this BigDecimalTest.
     * 
     * @return bigDecimal
     */
    public java.math.BigDecimal getBigDecimal() {
        return bigDecimal;
    }


    /**
     * Sets the bigDecimal value for this BigDecimalTest.
     * 
     * @param bigDecimal
     */
    public void setBigDecimal(java.math.BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BigDecimalTest)) return false;
        BigDecimalTest other = (BigDecimalTest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bigDecimal==null && other.getBigDecimal()==null) || 
             (this.bigDecimal!=null &&
              this.bigDecimal.equals(other.getBigDecimal())));
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
        if (getBigDecimal() != null) {
            _hashCode += getBigDecimal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BigDecimalTest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalTest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
