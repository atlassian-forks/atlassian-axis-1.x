/**
 * Find_binding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Find_binding  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers;

    private test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag;

    private java.lang.String generic;  // attribute

    private java.lang.Integer maxRows;  // attribute

    private java.lang.String serviceKey;  // attribute

    public Find_binding() {
    }

    public Find_binding(
           test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers,
           test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag,
           java.lang.String generic,
           java.lang.Integer maxRows,
           java.lang.String serviceKey) {
           this.findQualifiers = findQualifiers;
           this.tModelBag = tModelBag;
           this.generic = generic;
           this.maxRows = maxRows;
           this.serviceKey = serviceKey;
    }


    /**
     * Gets the findQualifiers value for this Find_binding.
     * 
     * @return findQualifiers
     */
    public test.wsdl.dataobjects.uddi_v2.FindQualifiers getFindQualifiers() {
        return findQualifiers;
    }


    /**
     * Sets the findQualifiers value for this Find_binding.
     * 
     * @param findQualifiers
     */
    public void setFindQualifiers(test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers) {
        this.findQualifiers = findQualifiers;
    }


    /**
     * Gets the tModelBag value for this Find_binding.
     * 
     * @return tModelBag
     */
    public test.wsdl.dataobjects.uddi_v2.TModelBag getTModelBag() {
        return tModelBag;
    }


    /**
     * Sets the tModelBag value for this Find_binding.
     * 
     * @param tModelBag
     */
    public void setTModelBag(test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag) {
        this.tModelBag = tModelBag;
    }


    /**
     * Gets the generic value for this Find_binding.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Find_binding.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the maxRows value for this Find_binding.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this Find_binding.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }


    /**
     * Gets the serviceKey value for this Find_binding.
     * 
     * @return serviceKey
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this Find_binding.
     * 
     * @param serviceKey
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Find_binding)) return false;
        Find_binding other = (Find_binding) obj;
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
            ((this.tModelBag==null && other.getTModelBag()==null) || 
             (this.tModelBag!=null &&
              this.tModelBag.equals(other.getTModelBag()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.maxRows==null && other.getMaxRows()==null) || 
             (this.maxRows!=null &&
              this.maxRows.equals(other.getMaxRows()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey())));
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
        if (getTModelBag() != null) {
            _hashCode += getTModelBag().hashCode();
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        if (getMaxRows() != null) {
            _hashCode += getMaxRows().hashCode();
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Find_binding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "find_binding"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "serviceKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceKey"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findQualifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
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
