/**
 * RelatedBusinessesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class RelatedBusinessesList  implements java.io.Serializable {
    private java.lang.String businessKey;

    private test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfos relatedBusinessInfos;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    private test.wsdl.dataobjects.uddi_v2.Truncated truncated;  // attribute

    public RelatedBusinessesList() {
    }

    public RelatedBusinessesList(
           java.lang.String businessKey,
           test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfos relatedBusinessInfos,
           java.lang.String generic,
           java.lang.String operator,
           test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
           this.businessKey = businessKey;
           this.relatedBusinessInfos = relatedBusinessInfos;
           this.generic = generic;
           this.operator = operator;
           this.truncated = truncated;
    }


    /**
     * Gets the businessKey value for this RelatedBusinessesList.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this RelatedBusinessesList.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }


    /**
     * Gets the relatedBusinessInfos value for this RelatedBusinessesList.
     * 
     * @return relatedBusinessInfos
     */
    public test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfos getRelatedBusinessInfos() {
        return relatedBusinessInfos;
    }


    /**
     * Sets the relatedBusinessInfos value for this RelatedBusinessesList.
     * 
     * @param relatedBusinessInfos
     */
    public void setRelatedBusinessInfos(test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfos relatedBusinessInfos) {
        this.relatedBusinessInfos = relatedBusinessInfos;
    }


    /**
     * Gets the generic value for this RelatedBusinessesList.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this RelatedBusinessesList.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this RelatedBusinessesList.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this RelatedBusinessesList.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the truncated value for this RelatedBusinessesList.
     * 
     * @return truncated
     */
    public test.wsdl.dataobjects.uddi_v2.Truncated getTruncated() {
        return truncated;
    }


    /**
     * Sets the truncated value for this RelatedBusinessesList.
     * 
     * @param truncated
     */
    public void setTruncated(test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
        this.truncated = truncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedBusinessesList)) return false;
        RelatedBusinessesList other = (RelatedBusinessesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey()))) &&
            ((this.relatedBusinessInfos==null && other.getRelatedBusinessInfos()==null) || 
             (this.relatedBusinessInfos!=null &&
              this.relatedBusinessInfos.equals(other.getRelatedBusinessInfos()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.truncated==null && other.getTruncated()==null) || 
             (this.truncated!=null &&
              this.truncated.equals(other.getTruncated())));
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
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
        }
        if (getRelatedBusinessInfos() != null) {
            _hashCode += getRelatedBusinessInfos().hashCode();
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getTruncated() != null) {
            _hashCode += getTruncated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedBusinessesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("truncated");
        attrField.setXmlName(new javax.xml.namespace.QName("", "truncated"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "truncated"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedBusinessInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfos"));
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
