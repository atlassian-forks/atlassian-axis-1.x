/**
 * DaysOfWeekSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class DaysOfWeekSelector  implements java.io.Serializable {
    private boolean sunday;

    private boolean monday;

    private boolean tuesday;

    private boolean wednesday;

    private boolean thursday;

    private boolean friday;

    private boolean saturday;

    public DaysOfWeekSelector() {
    }

    public DaysOfWeekSelector(
           boolean sunday,
           boolean monday,
           boolean tuesday,
           boolean wednesday,
           boolean thursday,
           boolean friday,
           boolean saturday) {
           this.sunday = sunday;
           this.monday = monday;
           this.tuesday = tuesday;
           this.wednesday = wednesday;
           this.thursday = thursday;
           this.friday = friday;
           this.saturday = saturday;
    }


    /**
     * Gets the sunday value for this DaysOfWeekSelector.
     * 
     * @return sunday
     */
    public boolean isSunday() {
        return sunday;
    }


    /**
     * Sets the sunday value for this DaysOfWeekSelector.
     * 
     * @param sunday
     */
    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }


    /**
     * Gets the monday value for this DaysOfWeekSelector.
     * 
     * @return monday
     */
    public boolean isMonday() {
        return monday;
    }


    /**
     * Sets the monday value for this DaysOfWeekSelector.
     * 
     * @param monday
     */
    public void setMonday(boolean monday) {
        this.monday = monday;
    }


    /**
     * Gets the tuesday value for this DaysOfWeekSelector.
     * 
     * @return tuesday
     */
    public boolean isTuesday() {
        return tuesday;
    }


    /**
     * Sets the tuesday value for this DaysOfWeekSelector.
     * 
     * @param tuesday
     */
    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }


    /**
     * Gets the wednesday value for this DaysOfWeekSelector.
     * 
     * @return wednesday
     */
    public boolean isWednesday() {
        return wednesday;
    }


    /**
     * Sets the wednesday value for this DaysOfWeekSelector.
     * 
     * @param wednesday
     */
    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }


    /**
     * Gets the thursday value for this DaysOfWeekSelector.
     * 
     * @return thursday
     */
    public boolean isThursday() {
        return thursday;
    }


    /**
     * Sets the thursday value for this DaysOfWeekSelector.
     * 
     * @param thursday
     */
    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }


    /**
     * Gets the friday value for this DaysOfWeekSelector.
     * 
     * @return friday
     */
    public boolean isFriday() {
        return friday;
    }


    /**
     * Sets the friday value for this DaysOfWeekSelector.
     * 
     * @param friday
     */
    public void setFriday(boolean friday) {
        this.friday = friday;
    }


    /**
     * Gets the saturday value for this DaysOfWeekSelector.
     * 
     * @return saturday
     */
    public boolean isSaturday() {
        return saturday;
    }


    /**
     * Sets the saturday value for this DaysOfWeekSelector.
     * 
     * @param saturday
     */
    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DaysOfWeekSelector)) return false;
        DaysOfWeekSelector other = (DaysOfWeekSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sunday == other.isSunday() &&
            this.monday == other.isMonday() &&
            this.tuesday == other.isTuesday() &&
            this.wednesday == other.isWednesday() &&
            this.thursday == other.isThursday() &&
            this.friday == other.isFriday() &&
            this.saturday == other.isSaturday();
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
        _hashCode += (isSunday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMonday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTuesday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWednesday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isThursday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFriday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSaturday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DaysOfWeekSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DaysOfWeekSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Sunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Monday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Tuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Wednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Thursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Friday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Saturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
