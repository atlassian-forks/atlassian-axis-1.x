/**
 * BusinessDetailExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BusinessDetailExt  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BusinessEntityExt[] businessEntityExt;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    private test.wsdl.dataobjects.uddi_v2.Truncated truncated;  // attribute

    public BusinessDetailExt() {
    }

    public BusinessDetailExt(
           test.wsdl.dataobjects.uddi_v2.BusinessEntityExt[] businessEntityExt,
           java.lang.String generic,
           java.lang.String operator,
           test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
           this.businessEntityExt = businessEntityExt;
           this.generic = generic;
           this.operator = operator;
           this.truncated = truncated;
    }


    /**
     * Gets the businessEntityExt value for this BusinessDetailExt.
     * 
     * @return businessEntityExt
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessEntityExt[] getBusinessEntityExt() {
        return businessEntityExt;
    }


    /**
     * Sets the businessEntityExt value for this BusinessDetailExt.
     * 
     * @param businessEntityExt
     */
    public void setBusinessEntityExt(test.wsdl.dataobjects.uddi_v2.BusinessEntityExt[] businessEntityExt) {
        this.businessEntityExt = businessEntityExt;
    }

    public test.wsdl.dataobjects.uddi_v2.BusinessEntityExt getBusinessEntityExt(int i) {
        return this.businessEntityExt[i];
    }

    public void setBusinessEntityExt(int i, test.wsdl.dataobjects.uddi_v2.BusinessEntityExt _value) {
        this.businessEntityExt[i] = _value;
    }


    /**
     * Gets the generic value for this BusinessDetailExt.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this BusinessDetailExt.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this BusinessDetailExt.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this BusinessDetailExt.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the truncated value for this BusinessDetailExt.
     * 
     * @return truncated
     */
    public test.wsdl.dataobjects.uddi_v2.Truncated getTruncated() {
        return truncated;
    }


    /**
     * Sets the truncated value for this BusinessDetailExt.
     * 
     * @param truncated
     */
    public void setTruncated(test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
        this.truncated = truncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDetailExt)) return false;
        BusinessDetailExt other = (BusinessDetailExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessEntityExt==null && other.getBusinessEntityExt()==null) || 
             (this.businessEntityExt!=null &&
              java.util.Arrays.equals(this.businessEntityExt, other.getBusinessEntityExt()))) &&
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
        if (getBusinessEntityExt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessEntityExt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessEntityExt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(BusinessDetailExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessDetailExt"));
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
        elemField.setFieldName("businessEntityExt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntityExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntityExt"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
