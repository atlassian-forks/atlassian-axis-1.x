/**
 * ArrayOfValidValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfValidValue  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ValidValue[] validValue;

    public ArrayOfValidValue() {
    }

    public ArrayOfValidValue(
           test.wsdl.dataobjects.reportservice.ValidValue[] validValue) {
           this.validValue = validValue;
    }


    /**
     * Gets the validValue value for this ArrayOfValidValue.
     * 
     * @return validValue
     */
    public test.wsdl.dataobjects.reportservice.ValidValue[] getValidValue() {
        return validValue;
    }


    /**
     * Sets the validValue value for this ArrayOfValidValue.
     * 
     * @param validValue
     */
    public void setValidValue(test.wsdl.dataobjects.reportservice.ValidValue[] validValue) {
        this.validValue = validValue;
    }

    public test.wsdl.dataobjects.reportservice.ValidValue getValidValue(int i) {
        return this.validValue[i];
    }

    public void setValidValue(int i, test.wsdl.dataobjects.reportservice.ValidValue _value) {
        this.validValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfValidValue)) return false;
        ArrayOfValidValue other = (ArrayOfValidValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validValue==null && other.getValidValue()==null) || 
             (this.validValue!=null &&
              java.util.Arrays.equals(this.validValue, other.getValidValue())));
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
        if (getValidValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidValue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfValidValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfValidValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ValidValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ValidValue"));
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
