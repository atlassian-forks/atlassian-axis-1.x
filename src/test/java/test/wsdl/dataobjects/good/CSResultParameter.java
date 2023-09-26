/**
 * CSResultParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSResultParameter  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText parameterValue;

    private java.lang.Integer parameterType;

    public CSResultParameter() {
    }

    public CSResultParameter(
           test.wsdl.dataobjects.good.CSText parameterValue,
           java.lang.Integer parameterType) {
           this.parameterValue = parameterValue;
           this.parameterType = parameterType;
    }


    /**
     * Gets the parameterValue value for this CSResultParameter.
     * 
     * @return parameterValue
     */
    public test.wsdl.dataobjects.good.CSText getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this CSResultParameter.
     * 
     * @param parameterValue
     */
    public void setParameterValue(test.wsdl.dataobjects.good.CSText parameterValue) {
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterType value for this CSResultParameter.
     * 
     * @return parameterType
     */
    public java.lang.Integer getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this CSResultParameter.
     * 
     * @param parameterType
     */
    public void setParameterType(java.lang.Integer parameterType) {
        this.parameterType = parameterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSResultParameter)) return false;
        CSResultParameter other = (CSResultParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType())));
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
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSResultParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResultParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType"));
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
