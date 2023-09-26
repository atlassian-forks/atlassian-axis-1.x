/**
 * MonthsOfYearSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class MonthsOfYearSelector  implements java.io.Serializable {
    private boolean january;

    private boolean february;

    private boolean march;

    private boolean april;

    private boolean may;

    private boolean june;

    private boolean july;

    private boolean august;

    private boolean september;

    private boolean october;

    private boolean november;

    private boolean december;

    public MonthsOfYearSelector() {
    }

    public MonthsOfYearSelector(
           boolean january,
           boolean february,
           boolean march,
           boolean april,
           boolean may,
           boolean june,
           boolean july,
           boolean august,
           boolean september,
           boolean october,
           boolean november,
           boolean december) {
           this.january = january;
           this.february = february;
           this.march = march;
           this.april = april;
           this.may = may;
           this.june = june;
           this.july = july;
           this.august = august;
           this.september = september;
           this.october = october;
           this.november = november;
           this.december = december;
    }


    /**
     * Gets the january value for this MonthsOfYearSelector.
     * 
     * @return january
     */
    public boolean isJanuary() {
        return january;
    }


    /**
     * Sets the january value for this MonthsOfYearSelector.
     * 
     * @param january
     */
    public void setJanuary(boolean january) {
        this.january = january;
    }


    /**
     * Gets the february value for this MonthsOfYearSelector.
     * 
     * @return february
     */
    public boolean isFebruary() {
        return february;
    }


    /**
     * Sets the february value for this MonthsOfYearSelector.
     * 
     * @param february
     */
    public void setFebruary(boolean february) {
        this.february = february;
    }


    /**
     * Gets the march value for this MonthsOfYearSelector.
     * 
     * @return march
     */
    public boolean isMarch() {
        return march;
    }


    /**
     * Sets the march value for this MonthsOfYearSelector.
     * 
     * @param march
     */
    public void setMarch(boolean march) {
        this.march = march;
    }


    /**
     * Gets the april value for this MonthsOfYearSelector.
     * 
     * @return april
     */
    public boolean isApril() {
        return april;
    }


    /**
     * Sets the april value for this MonthsOfYearSelector.
     * 
     * @param april
     */
    public void setApril(boolean april) {
        this.april = april;
    }


    /**
     * Gets the may value for this MonthsOfYearSelector.
     * 
     * @return may
     */
    public boolean isMay() {
        return may;
    }


    /**
     * Sets the may value for this MonthsOfYearSelector.
     * 
     * @param may
     */
    public void setMay(boolean may) {
        this.may = may;
    }


    /**
     * Gets the june value for this MonthsOfYearSelector.
     * 
     * @return june
     */
    public boolean isJune() {
        return june;
    }


    /**
     * Sets the june value for this MonthsOfYearSelector.
     * 
     * @param june
     */
    public void setJune(boolean june) {
        this.june = june;
    }


    /**
     * Gets the july value for this MonthsOfYearSelector.
     * 
     * @return july
     */
    public boolean isJuly() {
        return july;
    }


    /**
     * Sets the july value for this MonthsOfYearSelector.
     * 
     * @param july
     */
    public void setJuly(boolean july) {
        this.july = july;
    }


    /**
     * Gets the august value for this MonthsOfYearSelector.
     * 
     * @return august
     */
    public boolean isAugust() {
        return august;
    }


    /**
     * Sets the august value for this MonthsOfYearSelector.
     * 
     * @param august
     */
    public void setAugust(boolean august) {
        this.august = august;
    }


    /**
     * Gets the september value for this MonthsOfYearSelector.
     * 
     * @return september
     */
    public boolean isSeptember() {
        return september;
    }


    /**
     * Sets the september value for this MonthsOfYearSelector.
     * 
     * @param september
     */
    public void setSeptember(boolean september) {
        this.september = september;
    }


    /**
     * Gets the october value for this MonthsOfYearSelector.
     * 
     * @return october
     */
    public boolean isOctober() {
        return october;
    }


    /**
     * Sets the october value for this MonthsOfYearSelector.
     * 
     * @param october
     */
    public void setOctober(boolean october) {
        this.october = october;
    }


    /**
     * Gets the november value for this MonthsOfYearSelector.
     * 
     * @return november
     */
    public boolean isNovember() {
        return november;
    }


    /**
     * Sets the november value for this MonthsOfYearSelector.
     * 
     * @param november
     */
    public void setNovember(boolean november) {
        this.november = november;
    }


    /**
     * Gets the december value for this MonthsOfYearSelector.
     * 
     * @return december
     */
    public boolean isDecember() {
        return december;
    }


    /**
     * Sets the december value for this MonthsOfYearSelector.
     * 
     * @param december
     */
    public void setDecember(boolean december) {
        this.december = december;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthsOfYearSelector)) return false;
        MonthsOfYearSelector other = (MonthsOfYearSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.january == other.isJanuary() &&
            this.february == other.isFebruary() &&
            this.march == other.isMarch() &&
            this.april == other.isApril() &&
            this.may == other.isMay() &&
            this.june == other.isJune() &&
            this.july == other.isJuly() &&
            this.august == other.isAugust() &&
            this.september == other.isSeptember() &&
            this.october == other.isOctober() &&
            this.november == other.isNovember() &&
            this.december == other.isDecember();
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
        _hashCode += (isJanuary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFebruary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMarch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApril() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJune() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJuly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAugust() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSeptember() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOctober() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNovember() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDecember() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonthsOfYearSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MonthsOfYearSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("january");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "January"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("february");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "February"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("march");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "March"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("april");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "April"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("may");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "May"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("june");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "June"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("july");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "July"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("august");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "August"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("september");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "September"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("october");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "October"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("november");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "November"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("december");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "December"));
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
