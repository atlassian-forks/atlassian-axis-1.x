/**
 * CSPartnerAccountExternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSPartnerAccountExternalId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText CSPartnerAccountExternalId;

    public CSPartnerAccountExternalId() {
    }

    public CSPartnerAccountExternalId(
           test.wsdl.dataobjects.good.CSText CSPartnerAccountExternalId) {
           this.CSPartnerAccountExternalId = CSPartnerAccountExternalId;
    }


    /**
     * Gets the CSPartnerAccountExternalId value for this CSPartnerAccountExternalId.
     * 
     * @return CSPartnerAccountExternalId
     */
    public test.wsdl.dataobjects.good.CSText getCSPartnerAccountExternalId() {
        return CSPartnerAccountExternalId;
    }


    /**
     * Sets the CSPartnerAccountExternalId value for this CSPartnerAccountExternalId.
     * 
     * @param CSPartnerAccountExternalId
     */
    public void setCSPartnerAccountExternalId(test.wsdl.dataobjects.good.CSText CSPartnerAccountExternalId) {
        this.CSPartnerAccountExternalId = CSPartnerAccountExternalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSPartnerAccountExternalId)) return false;
        CSPartnerAccountExternalId other = (CSPartnerAccountExternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSPartnerAccountExternalId==null && other.getCSPartnerAccountExternalId()==null) || 
             (this.CSPartnerAccountExternalId!=null &&
              this.CSPartnerAccountExternalId.equals(other.getCSPartnerAccountExternalId())));
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
        if (getCSPartnerAccountExternalId() != null) {
            _hashCode += getCSPartnerAccountExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSPartnerAccountExternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerAccountExternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSPartnerAccountExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSPartnerAccountExternalId"));
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
