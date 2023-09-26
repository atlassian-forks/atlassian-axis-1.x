/**
 * MonthlyRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class MonthlyRecurrence  extends test.wsdl.dataobjects.reportservice.RecurrencePattern  implements java.io.Serializable {
    private java.lang.String days;

    private test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear;

    public MonthlyRecurrence() {
    }

    public MonthlyRecurrence(
           java.lang.String days,
           test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear) {
        this.days = days;
        this.monthsOfYear = monthsOfYear;
    }


    /**
     * Gets the days value for this MonthlyRecurrence.
     * 
     * @return days
     */
    public java.lang.String getDays() {
        return days;
    }


    /**
     * Sets the days value for this MonthlyRecurrence.
     * 
     * @param days
     */
    public void setDays(java.lang.String days) {
        this.days = days;
    }


    /**
     * Gets the monthsOfYear value for this MonthlyRecurrence.
     * 
     * @return monthsOfYear
     */
    public test.wsdl.dataobjects.reportservice.MonthsOfYearSelector getMonthsOfYear() {
        return monthsOfYear;
    }


    /**
     * Sets the monthsOfYear value for this MonthlyRecurrence.
     * 
     * @param monthsOfYear
     */
    public void setMonthsOfYear(test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear) {
        this.monthsOfYear = monthsOfYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthlyRecurrence)) return false;
        MonthlyRecurrence other = (MonthlyRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.monthsOfYear==null && other.getMonthsOfYear()==null) || 
             (this.monthsOfYear!=null &&
              this.monthsOfYear.equals(other.getMonthsOfYear())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getMonthsOfYear() != null) {
            _hashCode += getMonthsOfYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonthlyRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthsOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthsOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthsOfYearSelector"));
        elemField.setMinOccurs(0);
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
