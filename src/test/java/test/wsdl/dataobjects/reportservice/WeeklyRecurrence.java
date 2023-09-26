/**
 * WeeklyRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class WeeklyRecurrence  extends test.wsdl.dataobjects.reportservice.RecurrencePattern  implements java.io.Serializable {
    private java.lang.Integer weeksInterval;

    private test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek;

    public WeeklyRecurrence() {
    }

    public WeeklyRecurrence(
           java.lang.Integer weeksInterval,
           test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek) {
        this.weeksInterval = weeksInterval;
        this.daysOfWeek = daysOfWeek;
    }


    /**
     * Gets the weeksInterval value for this WeeklyRecurrence.
     * 
     * @return weeksInterval
     */
    public java.lang.Integer getWeeksInterval() {
        return weeksInterval;
    }


    /**
     * Sets the weeksInterval value for this WeeklyRecurrence.
     * 
     * @param weeksInterval
     */
    public void setWeeksInterval(java.lang.Integer weeksInterval) {
        this.weeksInterval = weeksInterval;
    }


    /**
     * Gets the daysOfWeek value for this WeeklyRecurrence.
     * 
     * @return daysOfWeek
     */
    public test.wsdl.dataobjects.reportservice.DaysOfWeekSelector getDaysOfWeek() {
        return daysOfWeek;
    }


    /**
     * Sets the daysOfWeek value for this WeeklyRecurrence.
     * 
     * @param daysOfWeek
     */
    public void setDaysOfWeek(test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeeklyRecurrence)) return false;
        WeeklyRecurrence other = (WeeklyRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.weeksInterval==null && other.getWeeksInterval()==null) || 
             (this.weeksInterval!=null &&
              this.weeksInterval.equals(other.getWeeksInterval()))) &&
            ((this.daysOfWeek==null && other.getDaysOfWeek()==null) || 
             (this.daysOfWeek!=null &&
              this.daysOfWeek.equals(other.getDaysOfWeek())));
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
        if (getWeeksInterval() != null) {
            _hashCode += getWeeksInterval().hashCode();
        }
        if (getDaysOfWeek() != null) {
            _hashCode += getDaysOfWeek().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeeklyRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeeklyRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeksInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeeksInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DaysOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DaysOfWeekSelector"));
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
