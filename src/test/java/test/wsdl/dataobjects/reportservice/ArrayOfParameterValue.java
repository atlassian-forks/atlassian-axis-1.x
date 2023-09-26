/**
 * ArrayOfParameterValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfParameterValue  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ParameterValue[] parameterValue;

    public ArrayOfParameterValue() {
    }

    public ArrayOfParameterValue(
           test.wsdl.dataobjects.reportservice.ParameterValue[] parameterValue) {
           this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterValue value for this ArrayOfParameterValue.
     * 
     * @return parameterValue
     */
    public test.wsdl.dataobjects.reportservice.ParameterValue[] getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ArrayOfParameterValue.
     * 
     * @param parameterValue
     */
    public void setParameterValue(test.wsdl.dataobjects.reportservice.ParameterValue[] parameterValue) {
        this.parameterValue = parameterValue;
    }

    public test.wsdl.dataobjects.reportservice.ParameterValue getParameterValue(int i) {
        return this.parameterValue[i];
    }

    public void setParameterValue(int i, test.wsdl.dataobjects.reportservice.ParameterValue _value) {
        this.parameterValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfParameterValue)) return false;
        ArrayOfParameterValue other = (ArrayOfParameterValue) obj;
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
              java.util.Arrays.equals(this.parameterValue, other.getParameterValue())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterValue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfParameterValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfParameterValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValue"));
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
