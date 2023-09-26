/**
 * CSUniversalTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSUniversalTime  implements java.io.Serializable {
    private java.lang.String CSUniversalTime;

    public CSUniversalTime() {
    }

    public CSUniversalTime(
           java.lang.String CSUniversalTime) {
           this.CSUniversalTime = CSUniversalTime;
    }


    /**
     * Gets the CSUniversalTime value for this CSUniversalTime.
     * 
     * @return CSUniversalTime
     */
    public java.lang.String getCSUniversalTime() {
        return CSUniversalTime;
    }


    /**
     * Sets the CSUniversalTime value for this CSUniversalTime.
     * 
     * @param CSUniversalTime
     */
    public void setCSUniversalTime(java.lang.String CSUniversalTime) {
        this.CSUniversalTime = CSUniversalTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSUniversalTime)) return false;
        CSUniversalTime other = (CSUniversalTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSUniversalTime==null && other.getCSUniversalTime()==null) || 
             (this.CSUniversalTime!=null &&
              this.CSUniversalTime.equals(other.getCSUniversalTime())));
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
        if (getCSUniversalTime() != null) {
            _hashCode += getCSUniversalTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSUniversalTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSUniversalTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSUniversalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSUniversalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
