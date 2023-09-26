/**
 * CalendarArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class CalendarArrayTestResponse  implements java.io.Serializable {
    private java.util.Calendar[] calendarArray;

    public CalendarArrayTestResponse() {
    }

    public CalendarArrayTestResponse(
           java.util.Calendar[] calendarArray) {
           this.calendarArray = calendarArray;
    }


    /**
     * Gets the calendarArray value for this CalendarArrayTestResponse.
     * 
     * @return calendarArray
     */
    public java.util.Calendar[] getCalendarArray() {
        return calendarArray;
    }


    /**
     * Sets the calendarArray value for this CalendarArrayTestResponse.
     * 
     * @param calendarArray
     */
    public void setCalendarArray(java.util.Calendar[] calendarArray) {
        this.calendarArray = calendarArray;
    }

    public java.util.Calendar getCalendarArray(int i) {
        return this.calendarArray[i];
    }

    public void setCalendarArray(int i, java.util.Calendar _value) {
        this.calendarArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarArrayTestResponse)) return false;
        CalendarArrayTestResponse other = (CalendarArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calendarArray==null && other.getCalendarArray()==null) || 
             (this.calendarArray!=null &&
              java.util.Arrays.equals(this.calendarArray, other.getCalendarArray())));
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
        if (getCalendarArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalendarArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalendarArray(), i);
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
        new org.apache.axis.description.TypeDesc(CalendarArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendarArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
