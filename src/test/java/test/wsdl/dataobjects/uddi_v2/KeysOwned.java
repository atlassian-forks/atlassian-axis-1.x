/**
 * KeysOwned.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class KeysOwned  implements java.io.Serializable {
    private java.lang.String fromKey;

    private java.lang.String toKey;

    public KeysOwned() {
    }

    public KeysOwned(
           java.lang.String fromKey,
           java.lang.String toKey) {
           this.fromKey = fromKey;
           this.toKey = toKey;
    }


    /**
     * Gets the fromKey value for this KeysOwned.
     * 
     * @return fromKey
     */
    public java.lang.String getFromKey() {
        return fromKey;
    }


    /**
     * Sets the fromKey value for this KeysOwned.
     * 
     * @param fromKey
     */
    public void setFromKey(java.lang.String fromKey) {
        this.fromKey = fromKey;
    }


    /**
     * Gets the toKey value for this KeysOwned.
     * 
     * @return toKey
     */
    public java.lang.String getToKey() {
        return toKey;
    }


    /**
     * Sets the toKey value for this KeysOwned.
     * 
     * @param toKey
     */
    public void setToKey(java.lang.String toKey) {
        this.toKey = toKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeysOwned)) return false;
        KeysOwned other = (KeysOwned) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromKey==null && other.getFromKey()==null) || 
             (this.fromKey!=null &&
              this.fromKey.equals(other.getFromKey()))) &&
            ((this.toKey==null && other.getToKey()==null) || 
             (this.toKey!=null &&
              this.toKey.equals(other.getToKey())));
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
        if (getFromKey() != null) {
            _hashCode += getFromKey().hashCode();
        }
        if (getToKey() != null) {
            _hashCode += getToKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeysOwned.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keysOwned"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "fromKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "toKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
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
