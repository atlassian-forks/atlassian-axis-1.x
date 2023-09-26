/**
 * ScheduleReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ScheduleReference  extends test.wsdl.dataobjects.reportservice.ScheduleDefinitionOrReference  implements java.io.Serializable {
    private java.lang.String scheduleID;

    private test.wsdl.dataobjects.reportservice.ScheduleDefinition definition;

    public ScheduleReference() {
    }

    public ScheduleReference(
           java.lang.String scheduleID,
           test.wsdl.dataobjects.reportservice.ScheduleDefinition definition) {
        this.scheduleID = scheduleID;
        this.definition = definition;
    }


    /**
     * Gets the scheduleID value for this ScheduleReference.
     * 
     * @return scheduleID
     */
    public java.lang.String getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this ScheduleReference.
     * 
     * @param scheduleID
     */
    public void setScheduleID(java.lang.String scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the definition value for this ScheduleReference.
     * 
     * @return definition
     */
    public test.wsdl.dataobjects.reportservice.ScheduleDefinition getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this ScheduleReference.
     * 
     * @param definition
     */
    public void setDefinition(test.wsdl.dataobjects.reportservice.ScheduleDefinition definition) {
        this.definition = definition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleReference)) return false;
        ScheduleReference other = (ScheduleReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              this.definition.equals(other.getDefinition())));
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
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getDefinition() != null) {
            _hashCode += getDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Definition"));
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
