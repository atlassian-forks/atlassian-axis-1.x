/**
 * CSSubscriberExternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSSubscriberExternalId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText CSSubscriberExternalId;

    public CSSubscriberExternalId() {
    }

    public CSSubscriberExternalId(
           test.wsdl.dataobjects.good.CSText CSSubscriberExternalId) {
           this.CSSubscriberExternalId = CSSubscriberExternalId;
    }


    /**
     * Gets the CSSubscriberExternalId value for this CSSubscriberExternalId.
     * 
     * @return CSSubscriberExternalId
     */
    public test.wsdl.dataobjects.good.CSText getCSSubscriberExternalId() {
        return CSSubscriberExternalId;
    }


    /**
     * Sets the CSSubscriberExternalId value for this CSSubscriberExternalId.
     * 
     * @param CSSubscriberExternalId
     */
    public void setCSSubscriberExternalId(test.wsdl.dataobjects.good.CSText CSSubscriberExternalId) {
        this.CSSubscriberExternalId = CSSubscriberExternalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSubscriberExternalId)) return false;
        CSSubscriberExternalId other = (CSSubscriberExternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSSubscriberExternalId==null && other.getCSSubscriberExternalId()==null) || 
             (this.CSSubscriberExternalId!=null &&
              this.CSSubscriberExternalId.equals(other.getCSSubscriberExternalId())));
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
        if (getCSSubscriberExternalId() != null) {
            _hashCode += getCSSubscriberExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSubscriberExternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSubscriberExternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSSubscriberExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSSubscriberExternalId"));
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