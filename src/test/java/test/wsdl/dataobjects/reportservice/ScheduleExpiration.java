/**
 * ScheduleExpiration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ScheduleExpiration  extends test.wsdl.dataobjects.reportservice.ExpirationDefinition  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ScheduleReference scheduleReference;

    private test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition;

    public ScheduleExpiration() {
    }

    public ScheduleExpiration(
           test.wsdl.dataobjects.reportservice.ScheduleReference scheduleReference,
           test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition) {
        this.scheduleReference = scheduleReference;
        this.scheduleDefinition = scheduleDefinition;
    }


    /**
     * Gets the scheduleReference value for this ScheduleExpiration.
     * 
     * @return scheduleReference
     */
    public test.wsdl.dataobjects.reportservice.ScheduleReference getScheduleReference() {
        return scheduleReference;
    }


    /**
     * Sets the scheduleReference value for this ScheduleExpiration.
     * 
     * @param scheduleReference
     */
    public void setScheduleReference(test.wsdl.dataobjects.reportservice.ScheduleReference scheduleReference) {
        this.scheduleReference = scheduleReference;
    }


    /**
     * Gets the scheduleDefinition value for this ScheduleExpiration.
     * 
     * @return scheduleDefinition
     */
    public test.wsdl.dataobjects.reportservice.ScheduleDefinition getScheduleDefinition() {
        return scheduleDefinition;
    }


    /**
     * Sets the scheduleDefinition value for this ScheduleExpiration.
     * 
     * @param scheduleDefinition
     */
    public void setScheduleDefinition(test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition) {
        this.scheduleDefinition = scheduleDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleExpiration)) return false;
        ScheduleExpiration other = (ScheduleExpiration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheduleReference==null && other.getScheduleReference()==null) || 
             (this.scheduleReference!=null &&
              this.scheduleReference.equals(other.getScheduleReference()))) &&
            ((this.scheduleDefinition==null && other.getScheduleDefinition()==null) || 
             (this.scheduleDefinition!=null &&
              this.scheduleDefinition.equals(other.getScheduleDefinition())));
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
        if (getScheduleReference() != null) {
            _hashCode += getScheduleReference().hashCode();
        }
        if (getScheduleDefinition() != null) {
            _hashCode += getScheduleDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleExpiration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleExpiration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleDefinition"));
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
