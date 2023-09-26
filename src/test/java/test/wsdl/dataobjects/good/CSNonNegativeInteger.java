/**
 * CSNonNegativeInteger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSNonNegativeInteger  implements java.io.Serializable {
    private java.lang.Integer CSNonNegativeInteger;

    public CSNonNegativeInteger() {
    }

    public CSNonNegativeInteger(
           java.lang.Integer CSNonNegativeInteger) {
           this.CSNonNegativeInteger = CSNonNegativeInteger;
    }


    /**
     * Gets the CSNonNegativeInteger value for this CSNonNegativeInteger.
     * 
     * @return CSNonNegativeInteger
     */
    public java.lang.Integer getCSNonNegativeInteger() {
        return CSNonNegativeInteger;
    }


    /**
     * Sets the CSNonNegativeInteger value for this CSNonNegativeInteger.
     * 
     * @param CSNonNegativeInteger
     */
    public void setCSNonNegativeInteger(java.lang.Integer CSNonNegativeInteger) {
        this.CSNonNegativeInteger = CSNonNegativeInteger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSNonNegativeInteger)) return false;
        CSNonNegativeInteger other = (CSNonNegativeInteger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSNonNegativeInteger==null && other.getCSNonNegativeInteger()==null) || 
             (this.CSNonNegativeInteger!=null &&
              this.CSNonNegativeInteger.equals(other.getCSNonNegativeInteger())));
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
        if (getCSNonNegativeInteger() != null) {
            _hashCode += getCSNonNegativeInteger().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSNonNegativeInteger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSNonNegativeInteger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSNonNegativeInteger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSNonNegativeInteger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
