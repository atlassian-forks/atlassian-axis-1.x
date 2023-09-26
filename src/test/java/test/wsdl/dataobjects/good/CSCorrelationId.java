/**
 * CSCorrelationId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSCorrelationId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSInteger type;

    private test.wsdl.dataobjects.good.CSText correlationExternalId;

    public CSCorrelationId() {
    }

    public CSCorrelationId(
           test.wsdl.dataobjects.good.CSInteger type,
           test.wsdl.dataobjects.good.CSText correlationExternalId) {
           this.type = type;
           this.correlationExternalId = correlationExternalId;
    }


    /**
     * Gets the type value for this CSCorrelationId.
     * 
     * @return type
     */
    public test.wsdl.dataobjects.good.CSInteger getType() {
        return type;
    }


    /**
     * Sets the type value for this CSCorrelationId.
     * 
     * @param type
     */
    public void setType(test.wsdl.dataobjects.good.CSInteger type) {
        this.type = type;
    }


    /**
     * Gets the correlationExternalId value for this CSCorrelationId.
     * 
     * @return correlationExternalId
     */
    public test.wsdl.dataobjects.good.CSText getCorrelationExternalId() {
        return correlationExternalId;
    }


    /**
     * Sets the correlationExternalId value for this CSCorrelationId.
     * 
     * @param correlationExternalId
     */
    public void setCorrelationExternalId(test.wsdl.dataobjects.good.CSText correlationExternalId) {
        this.correlationExternalId = correlationExternalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCorrelationId)) return false;
        CSCorrelationId other = (CSCorrelationId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.correlationExternalId==null && other.getCorrelationExternalId()==null) || 
             (this.correlationExternalId!=null &&
              this.correlationExternalId.equals(other.getCorrelationExternalId())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCorrelationExternalId() != null) {
            _hashCode += getCorrelationExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSCorrelationId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCorrelationId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correlationExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
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
