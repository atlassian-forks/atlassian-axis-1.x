/**
 * ScheduleDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ScheduleDefinition  extends test.wsdl.dataobjects.reportservice.ScheduleDefinitionOrReference  implements java.io.Serializable {
    private java.util.Calendar startDateTime;

    private java.util.Calendar endDate;

    private test.wsdl.dataobjects.reportservice.MonthlyDOWRecurrence monthlyDOWRecurrence;

    private test.wsdl.dataobjects.reportservice.MonthlyRecurrence monthlyRecurrence;

    private test.wsdl.dataobjects.reportservice.WeeklyRecurrence weeklyRecurrence;

    private test.wsdl.dataobjects.reportservice.MinuteRecurrence minuteRecurrence;

    private test.wsdl.dataobjects.reportservice.DailyRecurrence dailyRecurrence;

    public ScheduleDefinition() {
    }

    public ScheduleDefinition(
           java.util.Calendar startDateTime,
           java.util.Calendar endDate,
           test.wsdl.dataobjects.reportservice.MonthlyDOWRecurrence monthlyDOWRecurrence,
           test.wsdl.dataobjects.reportservice.MonthlyRecurrence monthlyRecurrence,
           test.wsdl.dataobjects.reportservice.WeeklyRecurrence weeklyRecurrence,
           test.wsdl.dataobjects.reportservice.MinuteRecurrence minuteRecurrence,
           test.wsdl.dataobjects.reportservice.DailyRecurrence dailyRecurrence) {
        this.startDateTime = startDateTime;
        this.endDate = endDate;
        this.monthlyDOWRecurrence = monthlyDOWRecurrence;
        this.monthlyRecurrence = monthlyRecurrence;
        this.weeklyRecurrence = weeklyRecurrence;
        this.minuteRecurrence = minuteRecurrence;
        this.dailyRecurrence = dailyRecurrence;
    }


    /**
     * Gets the startDateTime value for this ScheduleDefinition.
     * 
     * @return startDateTime
     */
    public java.util.Calendar getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ScheduleDefinition.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.util.Calendar startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDate value for this ScheduleDefinition.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ScheduleDefinition.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the monthlyDOWRecurrence value for this ScheduleDefinition.
     * 
     * @return monthlyDOWRecurrence
     */
    public test.wsdl.dataobjects.reportservice.MonthlyDOWRecurrence getMonthlyDOWRecurrence() {
        return monthlyDOWRecurrence;
    }


    /**
     * Sets the monthlyDOWRecurrence value for this ScheduleDefinition.
     * 
     * @param monthlyDOWRecurrence
     */
    public void setMonthlyDOWRecurrence(test.wsdl.dataobjects.reportservice.MonthlyDOWRecurrence monthlyDOWRecurrence) {
        this.monthlyDOWRecurrence = monthlyDOWRecurrence;
    }


    /**
     * Gets the monthlyRecurrence value for this ScheduleDefinition.
     * 
     * @return monthlyRecurrence
     */
    public test.wsdl.dataobjects.reportservice.MonthlyRecurrence getMonthlyRecurrence() {
        return monthlyRecurrence;
    }


    /**
     * Sets the monthlyRecurrence value for this ScheduleDefinition.
     * 
     * @param monthlyRecurrence
     */
    public void setMonthlyRecurrence(test.wsdl.dataobjects.reportservice.MonthlyRecurrence monthlyRecurrence) {
        this.monthlyRecurrence = monthlyRecurrence;
    }


    /**
     * Gets the weeklyRecurrence value for this ScheduleDefinition.
     * 
     * @return weeklyRecurrence
     */
    public test.wsdl.dataobjects.reportservice.WeeklyRecurrence getWeeklyRecurrence() {
        return weeklyRecurrence;
    }


    /**
     * Sets the weeklyRecurrence value for this ScheduleDefinition.
     * 
     * @param weeklyRecurrence
     */
    public void setWeeklyRecurrence(test.wsdl.dataobjects.reportservice.WeeklyRecurrence weeklyRecurrence) {
        this.weeklyRecurrence = weeklyRecurrence;
    }


    /**
     * Gets the minuteRecurrence value for this ScheduleDefinition.
     * 
     * @return minuteRecurrence
     */
    public test.wsdl.dataobjects.reportservice.MinuteRecurrence getMinuteRecurrence() {
        return minuteRecurrence;
    }


    /**
     * Sets the minuteRecurrence value for this ScheduleDefinition.
     * 
     * @param minuteRecurrence
     */
    public void setMinuteRecurrence(test.wsdl.dataobjects.reportservice.MinuteRecurrence minuteRecurrence) {
        this.minuteRecurrence = minuteRecurrence;
    }


    /**
     * Gets the dailyRecurrence value for this ScheduleDefinition.
     * 
     * @return dailyRecurrence
     */
    public test.wsdl.dataobjects.reportservice.DailyRecurrence getDailyRecurrence() {
        return dailyRecurrence;
    }


    /**
     * Sets the dailyRecurrence value for this ScheduleDefinition.
     * 
     * @param dailyRecurrence
     */
    public void setDailyRecurrence(test.wsdl.dataobjects.reportservice.DailyRecurrence dailyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleDefinition)) return false;
        ScheduleDefinition other = (ScheduleDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.monthlyDOWRecurrence==null && other.getMonthlyDOWRecurrence()==null) || 
             (this.monthlyDOWRecurrence!=null &&
              this.monthlyDOWRecurrence.equals(other.getMonthlyDOWRecurrence()))) &&
            ((this.monthlyRecurrence==null && other.getMonthlyRecurrence()==null) || 
             (this.monthlyRecurrence!=null &&
              this.monthlyRecurrence.equals(other.getMonthlyRecurrence()))) &&
            ((this.weeklyRecurrence==null && other.getWeeklyRecurrence()==null) || 
             (this.weeklyRecurrence!=null &&
              this.weeklyRecurrence.equals(other.getWeeklyRecurrence()))) &&
            ((this.minuteRecurrence==null && other.getMinuteRecurrence()==null) || 
             (this.minuteRecurrence!=null &&
              this.minuteRecurrence.equals(other.getMinuteRecurrence()))) &&
            ((this.dailyRecurrence==null && other.getDailyRecurrence()==null) || 
             (this.dailyRecurrence!=null &&
              this.dailyRecurrence.equals(other.getDailyRecurrence())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMonthlyDOWRecurrence() != null) {
            _hashCode += getMonthlyDOWRecurrence().hashCode();
        }
        if (getMonthlyRecurrence() != null) {
            _hashCode += getMonthlyRecurrence().hashCode();
        }
        if (getWeeklyRecurrence() != null) {
            _hashCode += getWeeklyRecurrence().hashCode();
        }
        if (getMinuteRecurrence() != null) {
            _hashCode += getMinuteRecurrence().hashCode();
        }
        if (getDailyRecurrence() != null) {
            _hashCode += getDailyRecurrence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyDOWRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyDOWRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyDOWRecurrence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyRecurrence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeeklyRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeeklyRecurrence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minuteRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MinuteRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MinuteRecurrence"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DailyRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DailyRecurrence"));
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
