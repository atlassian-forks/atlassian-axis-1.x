/**
 * CSApplicationId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSApplicationId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPartnerExternalId partnerExternalId;

    private test.wsdl.dataobjects.good.CSApplicationExternalId applicationExternalId;

    public CSApplicationId() {
    }

    public CSApplicationId(
           test.wsdl.dataobjects.good.CSPartnerExternalId partnerExternalId,
           test.wsdl.dataobjects.good.CSApplicationExternalId applicationExternalId) {
           this.partnerExternalId = partnerExternalId;
           this.applicationExternalId = applicationExternalId;
    }


    /**
     * Gets the partnerExternalId value for this CSApplicationId.
     * 
     * @return partnerExternalId
     */
    public test.wsdl.dataobjects.good.CSPartnerExternalId getPartnerExternalId() {
        return partnerExternalId;
    }


    /**
     * Sets the partnerExternalId value for this CSApplicationId.
     * 
     * @param partnerExternalId
     */
    public void setPartnerExternalId(test.wsdl.dataobjects.good.CSPartnerExternalId partnerExternalId) {
        this.partnerExternalId = partnerExternalId;
    }


    /**
     * Gets the applicationExternalId value for this CSApplicationId.
     * 
     * @return applicationExternalId
     */
    public test.wsdl.dataobjects.good.CSApplicationExternalId getApplicationExternalId() {
        return applicationExternalId;
    }


    /**
     * Sets the applicationExternalId value for this CSApplicationId.
     * 
     * @param applicationExternalId
     */
    public void setApplicationExternalId(test.wsdl.dataobjects.good.CSApplicationExternalId applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSApplicationId)) return false;
        CSApplicationId other = (CSApplicationId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerExternalId==null && other.getPartnerExternalId()==null) || 
             (this.partnerExternalId!=null &&
              this.partnerExternalId.equals(other.getPartnerExternalId()))) &&
            ((this.applicationExternalId==null && other.getApplicationExternalId()==null) || 
             (this.applicationExternalId!=null &&
              this.applicationExternalId.equals(other.getApplicationExternalId())));
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
        if (getPartnerExternalId() != null) {
            _hashCode += getPartnerExternalId().hashCode();
        }
        if (getApplicationExternalId() != null) {
            _hashCode += getApplicationExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSApplicationId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerExternalId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationExternalId"));
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
