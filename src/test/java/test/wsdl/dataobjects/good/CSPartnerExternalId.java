/**
 * CSPartnerExternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSPartnerExternalId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText CSPartnerExternalId;

    public CSPartnerExternalId() {
    }

    public CSPartnerExternalId(
           test.wsdl.dataobjects.good.CSText CSPartnerExternalId) {
           this.CSPartnerExternalId = CSPartnerExternalId;
    }


    /**
     * Gets the CSPartnerExternalId value for this CSPartnerExternalId.
     * 
     * @return CSPartnerExternalId
     */
    public test.wsdl.dataobjects.good.CSText getCSPartnerExternalId() {
        return CSPartnerExternalId;
    }


    /**
     * Sets the CSPartnerExternalId value for this CSPartnerExternalId.
     * 
     * @param CSPartnerExternalId
     */
    public void setCSPartnerExternalId(test.wsdl.dataobjects.good.CSText CSPartnerExternalId) {
        this.CSPartnerExternalId = CSPartnerExternalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSPartnerExternalId)) return false;
        CSPartnerExternalId other = (CSPartnerExternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSPartnerExternalId==null && other.getCSPartnerExternalId()==null) || 
             (this.CSPartnerExternalId!=null &&
              this.CSPartnerExternalId.equals(other.getCSPartnerExternalId())));
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
        if (getCSPartnerExternalId() != null) {
            _hashCode += getCSPartnerExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSPartnerExternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerExternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSPartnerExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSPartnerExternalId"));
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
