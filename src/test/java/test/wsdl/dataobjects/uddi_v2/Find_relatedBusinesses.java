/**
 * Find_relatedBusinesses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Find_relatedBusinesses  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers;

    private java.lang.String businessKey;

    private test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference;

    private java.lang.String generic;  // attribute

    private java.lang.Integer maxRows;  // attribute

    public Find_relatedBusinesses() {
    }

    public Find_relatedBusinesses(
           test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers,
           java.lang.String businessKey,
           test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference,
           java.lang.String generic,
           java.lang.Integer maxRows) {
           this.findQualifiers = findQualifiers;
           this.businessKey = businessKey;
           this.keyedReference = keyedReference;
           this.generic = generic;
           this.maxRows = maxRows;
    }


    /**
     * Gets the findQualifiers value for this Find_relatedBusinesses.
     * 
     * @return findQualifiers
     */
    public test.wsdl.dataobjects.uddi_v2.FindQualifiers getFindQualifiers() {
        return findQualifiers;
    }


    /**
     * Sets the findQualifiers value for this Find_relatedBusinesses.
     * 
     * @param findQualifiers
     */
    public void setFindQualifiers(test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers) {
        this.findQualifiers = findQualifiers;
    }


    /**
     * Gets the businessKey value for this Find_relatedBusinesses.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this Find_relatedBusinesses.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }


    /**
     * Gets the keyedReference value for this Find_relatedBusinesses.
     * 
     * @return keyedReference
     */
    public test.wsdl.dataobjects.uddi_v2.KeyedReference getKeyedReference() {
        return keyedReference;
    }


    /**
     * Sets the keyedReference value for this Find_relatedBusinesses.
     * 
     * @param keyedReference
     */
    public void setKeyedReference(test.wsdl.dataobjects.uddi_v2.KeyedReference keyedReference) {
        this.keyedReference = keyedReference;
    }


    /**
     * Gets the generic value for this Find_relatedBusinesses.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Find_relatedBusinesses.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the maxRows value for this Find_relatedBusinesses.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this Find_relatedBusinesses.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Find_relatedBusinesses)) return false;
        Find_relatedBusinesses other = (Find_relatedBusinesses) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findQualifiers==null && other.getFindQualifiers()==null) || 
             (this.findQualifiers!=null &&
              this.findQualifiers.equals(other.getFindQualifiers()))) &&
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey()))) &&
            ((this.keyedReference==null && other.getKeyedReference()==null) || 
             (this.keyedReference!=null &&
              this.keyedReference.equals(other.getKeyedReference()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.maxRows==null && other.getMaxRows()==null) || 
             (this.maxRows!=null &&
              this.maxRows.equals(other.getMaxRows())));
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
        if (getFindQualifiers() != null) {
            _hashCode += getFindQualifiers().hashCode();
        }
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
        }
        if (getKeyedReference() != null) {
            _hashCode += getKeyedReference().hashCode();
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        if (getMaxRows() != null) {
            _hashCode += getMaxRows().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Find_relatedBusinesses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "find_relatedBusinesses"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxRows");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maxRows"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findQualifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyedReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
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
