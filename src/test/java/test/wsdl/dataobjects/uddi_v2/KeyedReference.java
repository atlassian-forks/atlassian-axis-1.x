/**
 * KeyedReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class KeyedReference  implements java.io.Serializable {
    private java.lang.String tModelKey;  // attribute

    private java.lang.String keyName;  // attribute

    private java.lang.String keyValue;  // attribute

    public KeyedReference() {
    }

    public KeyedReference(
           java.lang.String tModelKey,
           java.lang.String keyName,
           java.lang.String keyValue) {
           this.tModelKey = tModelKey;
           this.keyName = keyName;
           this.keyValue = keyValue;
    }


    /**
     * Gets the tModelKey value for this KeyedReference.
     * 
     * @return tModelKey
     */
    public java.lang.String getTModelKey() {
        return tModelKey;
    }


    /**
     * Sets the tModelKey value for this KeyedReference.
     * 
     * @param tModelKey
     */
    public void setTModelKey(java.lang.String tModelKey) {
        this.tModelKey = tModelKey;
    }


    /**
     * Gets the keyName value for this KeyedReference.
     * 
     * @return keyName
     */
    public java.lang.String getKeyName() {
        return keyName;
    }


    /**
     * Sets the keyName value for this KeyedReference.
     * 
     * @param keyName
     */
    public void setKeyName(java.lang.String keyName) {
        this.keyName = keyName;
    }


    /**
     * Gets the keyValue value for this KeyedReference.
     * 
     * @return keyValue
     */
    public java.lang.String getKeyValue() {
        return keyValue;
    }


    /**
     * Sets the keyValue value for this KeyedReference.
     * 
     * @param keyValue
     */
    public void setKeyValue(java.lang.String keyValue) {
        this.keyValue = keyValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyedReference)) return false;
        KeyedReference other = (KeyedReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tModelKey==null && other.getTModelKey()==null) || 
             (this.tModelKey!=null &&
              this.tModelKey.equals(other.getTModelKey()))) &&
            ((this.keyName==null && other.getKeyName()==null) || 
             (this.keyName!=null &&
              this.keyName.equals(other.getKeyName()))) &&
            ((this.keyValue==null && other.getKeyValue()==null) || 
             (this.keyValue!=null &&
              this.keyValue.equals(other.getKeyValue())));
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
        if (getTModelKey() != null) {
            _hashCode += getTModelKey().hashCode();
        }
        if (getKeyName() != null) {
            _hashCode += getKeyName().hashCode();
        }
        if (getKeyValue() != null) {
            _hashCode += getKeyValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyedReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("TModelKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tModelKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelKey"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("keyName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "keyName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("keyValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "keyValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
