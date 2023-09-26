/**
 * PublisherAssertions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class PublisherAssertions  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.PublisherAssertion[] publisherAssertion;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    private java.lang.String authorizedName;  // attribute

    public PublisherAssertions() {
    }

    public PublisherAssertions(
           test.wsdl.dataobjects.uddi_v2.PublisherAssertion[] publisherAssertion,
           java.lang.String generic,
           java.lang.String operator,
           java.lang.String authorizedName) {
           this.publisherAssertion = publisherAssertion;
           this.generic = generic;
           this.operator = operator;
           this.authorizedName = authorizedName;
    }


    /**
     * Gets the publisherAssertion value for this PublisherAssertions.
     * 
     * @return publisherAssertion
     */
    public test.wsdl.dataobjects.uddi_v2.PublisherAssertion[] getPublisherAssertion() {
        return publisherAssertion;
    }


    /**
     * Sets the publisherAssertion value for this PublisherAssertions.
     * 
     * @param publisherAssertion
     */
    public void setPublisherAssertion(test.wsdl.dataobjects.uddi_v2.PublisherAssertion[] publisherAssertion) {
        this.publisherAssertion = publisherAssertion;
    }

    public test.wsdl.dataobjects.uddi_v2.PublisherAssertion getPublisherAssertion(int i) {
        return this.publisherAssertion[i];
    }

    public void setPublisherAssertion(int i, test.wsdl.dataobjects.uddi_v2.PublisherAssertion _value) {
        this.publisherAssertion[i] = _value;
    }


    /**
     * Gets the generic value for this PublisherAssertions.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this PublisherAssertions.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this PublisherAssertions.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this PublisherAssertions.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the authorizedName value for this PublisherAssertions.
     * 
     * @return authorizedName
     */
    public java.lang.String getAuthorizedName() {
        return authorizedName;
    }


    /**
     * Sets the authorizedName value for this PublisherAssertions.
     * 
     * @param authorizedName
     */
    public void setAuthorizedName(java.lang.String authorizedName) {
        this.authorizedName = authorizedName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublisherAssertions)) return false;
        PublisherAssertions other = (PublisherAssertions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publisherAssertion==null && other.getPublisherAssertion()==null) || 
             (this.publisherAssertion!=null &&
              java.util.Arrays.equals(this.publisherAssertion, other.getPublisherAssertion()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.authorizedName==null && other.getAuthorizedName()==null) || 
             (this.authorizedName!=null &&
              this.authorizedName.equals(other.getAuthorizedName())));
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
        if (getPublisherAssertion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublisherAssertion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublisherAssertion(), i);
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
        if (getAuthorizedName() != null) {
            _hashCode += getAuthorizedName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublisherAssertions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "publisherAssertions"));
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
        attrField.setFieldName("authorizedName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "authorizedName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "publisherAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "publisherAssertion"));
        elemField.setMinOccurs(0);
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
