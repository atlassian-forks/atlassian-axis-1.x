/**
 * ArrayOfChoice1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfChoice1  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ParameterValue parameterValue;

    private test.wsdl.dataobjects.reportservice.ParameterFieldReference parameterFieldReference;

    public ArrayOfChoice1() {
    }

    public ArrayOfChoice1(
           test.wsdl.dataobjects.reportservice.ParameterValue parameterValue,
           test.wsdl.dataobjects.reportservice.ParameterFieldReference parameterFieldReference) {
           this.parameterValue = parameterValue;
           this.parameterFieldReference = parameterFieldReference;
    }


    /**
     * Gets the parameterValue value for this ArrayOfChoice1.
     * 
     * @return parameterValue
     */
    public test.wsdl.dataobjects.reportservice.ParameterValue getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ArrayOfChoice1.
     * 
     * @param parameterValue
     */
    public void setParameterValue(test.wsdl.dataobjects.reportservice.ParameterValue parameterValue) {
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterFieldReference value for this ArrayOfChoice1.
     * 
     * @return parameterFieldReference
     */
    public test.wsdl.dataobjects.reportservice.ParameterFieldReference getParameterFieldReference() {
        return parameterFieldReference;
    }


    /**
     * Sets the parameterFieldReference value for this ArrayOfChoice1.
     * 
     * @param parameterFieldReference
     */
    public void setParameterFieldReference(test.wsdl.dataobjects.reportservice.ParameterFieldReference parameterFieldReference) {
        this.parameterFieldReference = parameterFieldReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfChoice1)) return false;
        ArrayOfChoice1 other = (ArrayOfChoice1) obj;
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
            ((this.parameterFieldReference==null && other.getParameterFieldReference()==null) || 
             (this.parameterFieldReference!=null &&
              this.parameterFieldReference.equals(other.getParameterFieldReference())));
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
        if (getParameterFieldReference() != null) {
            _hashCode += getParameterFieldReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfChoice1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfChoice1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterFieldReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterFieldReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterFieldReference"));
        elemField.setMinOccurs(0);
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
