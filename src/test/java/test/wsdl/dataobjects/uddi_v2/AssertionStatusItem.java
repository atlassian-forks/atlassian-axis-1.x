/**
 * AssertionStatusItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class AssertionStatusItem  implements java.io.Serializable {
    private java.lang.String fromKey;

    private java.lang.String toKey;

    private test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference;

    private test.wsdl.dataobjects.uddi_v2.KeysOwned keysOwned;

    private java.lang.String completionStatus;  // attribute

    public AssertionStatusItem() {
    }

    public AssertionStatusItem(
           java.lang.String fromKey,
           java.lang.String toKey,
           test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference,
           test.wsdl.dataobjects.uddi_v2.KeysOwned keysOwned,
           java.lang.String completionStatus) {
           this.fromKey = fromKey;
           this.toKey = toKey;
           this.keyedReference = keyedReference;
           this.keysOwned = keysOwned;
           this.completionStatus = completionStatus;
    }


    /**
     * Gets the fromKey value for this AssertionStatusItem.
     * 
     * @return fromKey
     */
    public java.lang.String getFromKey() {
        return fromKey;
    }


    /**
     * Sets the fromKey value for this AssertionStatusItem.
     * 
     * @param fromKey
     */
    public void setFromKey(java.lang.String fromKey) {
        this.fromKey = fromKey;
    }


    /**
     * Gets the toKey value for this AssertionStatusItem.
     * 
     * @return toKey
     */
    public java.lang.String getToKey() {
        return toKey;
    }


    /**
     * Sets the toKey value for this AssertionStatusItem.
     * 
     * @param toKey
     */
    public void setToKey(java.lang.String toKey) {
        this.toKey = toKey;
    }


    /**
     * Gets the keyedReference value for this AssertionStatusItem.
     * 
     * @return keyedReference
     */
    public test.wsdl.dataobjects.uddi_v2.KeyedReference getKeyedReference() {
        return keyedReference;
    }


    /**
     * Sets the keyedReference value for this AssertionStatusItem.
     * 
     * @param keyedReference
     */
    public void setKeyedReference(test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference) {
        this.keyedReference = keyedReference;
    }


    /**
     * Gets the keysOwned value for this AssertionStatusItem.
     * 
     * @return keysOwned
     */
    public test.wsdl.dataobjects.uddi_v2.KeysOwned getKeysOwned() {
        return keysOwned;
    }


    /**
     * Sets the keysOwned value for this AssertionStatusItem.
     * 
     * @param keysOwned
     */
    public void setKeysOwned(test.wsdl.dataobjects.uddi_v2.KeysOwned keysOwned) {
        this.keysOwned = keysOwned;
    }


    /**
     * Gets the completionStatus value for this AssertionStatusItem.
     * 
     * @return completionStatus
     */
    public java.lang.String getCompletionStatus() {
        return completionStatus;
    }


    /**
     * Sets the completionStatus value for this AssertionStatusItem.
     * 
     * @param completionStatus
     */
    public void setCompletionStatus(java.lang.String completionStatus) {
        this.completionStatus = completionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertionStatusItem)) return false;
        AssertionStatusItem other = (AssertionStatusItem) obj;
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
              this.toKey.equals(other.getToKey()))) &&
            ((this.keyedReference==null && other.getKeyedReference()==null) || 
             (this.keyedReference!=null &&
              this.keyedReference.equals(other.getKeyedReference()))) &&
            ((this.keysOwned==null && other.getKeysOwned()==null) || 
             (this.keysOwned!=null &&
              this.keysOwned.equals(other.getKeysOwned()))) &&
            ((this.completionStatus==null && other.getCompletionStatus()==null) || 
             (this.completionStatus!=null &&
              this.completionStatus.equals(other.getCompletionStatus())));
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
        if (getKeyedReference() != null) {
            _hashCode += getKeyedReference().hashCode();
        }
        if (getKeysOwned() != null) {
            _hashCode += getKeysOwned().hashCode();
        }
        if (getCompletionStatus() != null) {
            _hashCode += getCompletionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssertionStatusItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "assertionStatusItem"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("completionStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "completionStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "fromKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "toKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyedReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keysOwned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keysOwned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keysOwned"));
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
