/**
 * DateOrDateTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.UnionService;

public class DateOrDateTimeType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public DateOrDateTimeType() {
    }

    // Simple Types must have a String constructor
    public DateOrDateTimeType(java.lang.String _value) {
        this._value = _value;
    }
    public DateOrDateTimeType(boolean _value) {
        setBooleanValue(_value);
    }

    public DateOrDateTimeType(int _value) {
        setIntValue(_value);
    }

    public DateOrDateTimeType(java.util.Date _value) {
        setDateValue(_value);
    }

    public DateOrDateTimeType(java.util.Calendar _value) {
        setDateTimeValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the booleanValue value for this DateOrDateTimeType.
     * 
     * @return booleanValue
     */
    public boolean isBooleanValue() {
        return new Boolean(_value).booleanValue();
    }


    /**
     * Sets the _value value for this DateOrDateTimeType.
     * 
     * @param _value
     */
    public void setBooleanValue(boolean _value) {
        this._value = new Boolean(_value).toString();
    }


    /**
     * Gets the intValue value for this DateOrDateTimeType.
     * 
     * @return intValue
     */
    public int getIntValue() {
        return new Integer(_value).intValue();
    }


    /**
     * Sets the _value value for this DateOrDateTimeType.
     * 
     * @param _value
     */
    public void setIntValue(int _value) {
        this._value = new Integer(_value).toString();
    }


    /**
     * Gets the dateValue value for this DateOrDateTimeType.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        try {
            return (java.text.DateFormat.getDateTimeInstance()).parse(_value);
        }
        catch (java.text.ParseException e){
            throw new java.lang.RuntimeException(e.toString());
        }
    }


    /**
     * Sets the _value value for this DateOrDateTimeType.
     * 
     * @param _value
     */
    public void setDateValue(java.util.Date _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the dateTimeValue value for this DateOrDateTimeType.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        java.util.Calendar cal =
            (java.util.Calendar) new org.apache.axis.encoding.ser.CalendarDeserializer(
                java.lang.String.class, org.apache.axis.Constants.XSD_STRING).makeValue(_value);
        return cal;
    }


    /**
     * Sets the _value value for this DateOrDateTimeType.
     * 
     * @param _value
     */
    public void setDateTimeValue(java.util.Calendar _value) {
        this._value = _value == null ? null : new org.apache.axis.encoding.ser.CalendarSerializer().getValueAsString(_value, null);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateOrDateTimeType)) return false;
        DateOrDateTimeType other = (DateOrDateTimeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateOrDateTimeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DateOrDateTimeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
