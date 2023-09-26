/**
 * MonthlyDOWRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class MonthlyDOWRecurrence  extends test.wsdl.dataobjects.reportservice.RecurrencePattern  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.WeekNumberEnum whichWeek;

    private test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek;

    private test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear;

    public MonthlyDOWRecurrence() {
    }

    public MonthlyDOWRecurrence(
           test.wsdl.dataobjects.reportservice.WeekNumberEnum whichWeek,
           test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek,
           test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear) {
        this.whichWeek = whichWeek;
        this.daysOfWeek = daysOfWeek;
        this.monthsOfYear = monthsOfYear;
    }


    /**
     * Gets the whichWeek value for this MonthlyDOWRecurrence.
     * 
     * @return whichWeek
     */
    public test.wsdl.dataobjects.reportservice.WeekNumberEnum getWhichWeek() {
        return whichWeek;
    }


    /**
     * Sets the whichWeek value for this MonthlyDOWRecurrence.
     * 
     * @param whichWeek
     */
    public void setWhichWeek(test.wsdl.dataobjects.reportservice.WeekNumberEnum whichWeek) {
        this.whichWeek = whichWeek;
    }


    /**
     * Gets the daysOfWeek value for this MonthlyDOWRecurrence.
     * 
     * @return daysOfWeek
     */
    public test.wsdl.dataobjects.reportservice.DaysOfWeekSelector getDaysOfWeek() {
        return daysOfWeek;
    }


    /**
     * Sets the daysOfWeek value for this MonthlyDOWRecurrence.
     * 
     * @param daysOfWeek
     */
    public void setDaysOfWeek(test.wsdl.dataobjects.reportservice.DaysOfWeekSelector daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }


    /**
     * Gets the monthsOfYear value for this MonthlyDOWRecurrence.
     * 
     * @return monthsOfYear
     */
    public test.wsdl.dataobjects.reportservice.MonthsOfYearSelector getMonthsOfYear() {
        return monthsOfYear;
    }


    /**
     * Sets the monthsOfYear value for this MonthlyDOWRecurrence.
     * 
     * @param monthsOfYear
     */
    public void setMonthsOfYear(test.wsdl.dataobjects.reportservice.MonthsOfYearSelector monthsOfYear) {
        this.monthsOfYear = monthsOfYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthlyDOWRecurrence)) return false;
        MonthlyDOWRecurrence other = (MonthlyDOWRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.whichWeek==null && other.getWhichWeek()==null) || 
             (this.whichWeek!=null &&
              this.whichWeek.equals(other.getWhichWeek()))) &&
            ((this.daysOfWeek==null && other.getDaysOfWeek()==null) || 
             (this.daysOfWeek!=null &&
              this.daysOfWeek.equals(other.getDaysOfWeek()))) &&
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
        if (getWhichWeek() != null) {
            _hashCode += getWhichWeek().hashCode();
        }
        if (getDaysOfWeek() != null) {
            _hashCode += getDaysOfWeek().hashCode();
        }
        if (getMonthsOfYear() != null) {
            _hashCode += getMonthsOfYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonthlyDOWRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthlyDOWRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whichWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WhichWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeekNumberEnum"));
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
