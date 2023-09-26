/**
 * RegisteredInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class RegisteredInfo  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BusinessInfos businessInfos;

    private test.wsdl.dataobjects.uddi_v2.TModelInfos tModelInfos;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    private test.wsdl.dataobjects.uddi_v2.Truncated truncated;  // attribute

    public RegisteredInfo() {
    }

    public RegisteredInfo(
           test.wsdl.dataobjects.uddi_v2.BusinessInfos businessInfos,
           test.wsdl.dataobjects.uddi_v2.TModelInfos tModelInfos,
           java.lang.String generic,
           java.lang.String operator,
           test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
           this.businessInfos = businessInfos;
           this.tModelInfos = tModelInfos;
           this.generic = generic;
           this.operator = operator;
           this.truncated = truncated;
    }


    /**
     * Gets the businessInfos value for this RegisteredInfo.
     * 
     * @return businessInfos
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessInfos getBusinessInfos() {
        return businessInfos;
    }


    /**
     * Sets the businessInfos value for this RegisteredInfo.
     * 
     * @param businessInfos
     */
    public void setBusinessInfos(test.wsdl.dataobjects.uddi_v2.BusinessInfos businessInfos) {
        this.businessInfos = businessInfos;
    }


    /**
     * Gets the tModelInfos value for this RegisteredInfo.
     * 
     * @return tModelInfos
     */
    public test.wsdl.dataobjects.uddi_v2.TModelInfos getTModelInfos() {
        return tModelInfos;
    }


    /**
     * Sets the tModelInfos value for this RegisteredInfo.
     * 
     * @param tModelInfos
     */
    public void setTModelInfos(test.wsdl.dataobjects.uddi_v2.TModelInfos tModelInfos) {
        this.tModelInfos = tModelInfos;
    }


    /**
     * Gets the generic value for this RegisteredInfo.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this RegisteredInfo.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this RegisteredInfo.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this RegisteredInfo.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the truncated value for this RegisteredInfo.
     * 
     * @return truncated
     */
    public test.wsdl.dataobjects.uddi_v2.Truncated getTruncated() {
        return truncated;
    }


    /**
     * Sets the truncated value for this RegisteredInfo.
     * 
     * @param truncated
     */
    public void setTruncated(test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
        this.truncated = truncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisteredInfo)) return false;
        RegisteredInfo other = (RegisteredInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessInfos==null && other.getBusinessInfos()==null) || 
             (this.businessInfos!=null &&
              this.businessInfos.equals(other.getBusinessInfos()))) &&
            ((this.tModelInfos==null && other.getTModelInfos()==null) || 
             (this.tModelInfos!=null &&
              this.tModelInfos.equals(other.getTModelInfos()))) &&
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
        if (getBusinessInfos() != null) {
            _hashCode += getBusinessInfos().hashCode();
        }
        if (getTModelInfos() != null) {
            _hashCode += getTModelInfos().hashCode();
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
        new org.apache.axis.description.TypeDesc(RegisteredInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "registeredInfo"));
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
        elemField.setFieldName("businessInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessInfos"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInfos"));
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
