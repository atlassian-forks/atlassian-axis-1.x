/**
 * Find_service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Find_service  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers;

    private test.wsdl.dataobjects.uddi_v2.Name[] name;

    private test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag;

    private test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag;

    private java.lang.String generic;  // attribute

    private java.lang.Integer maxRows;  // attribute

    private java.lang.String businessKey;  // attribute

    public Find_service() {
    }

    public Find_service(
           test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers,
           test.wsdl.dataobjects.uddi_v2.Name[] name,
           test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag,
           test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag,
           java.lang.String generic,
           java.lang.Integer maxRows,
           java.lang.String businessKey) {
           this.findQualifiers = findQualifiers;
           this.name = name;
           this.categoryBag = categoryBag;
           this.tModelBag = tModelBag;
           this.generic = generic;
           this.maxRows = maxRows;
           this.businessKey = businessKey;
    }


    /**
     * Gets the findQualifiers value for this Find_service.
     * 
     * @return findQualifiers
     */
    public test.wsdl.dataobjects.uddi_v2.FindQualifiers getFindQualifiers() {
        return findQualifiers;
    }


    /**
     * Sets the findQualifiers value for this Find_service.
     * 
     * @param findQualifiers
     */
    public void setFindQualifiers(test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers) {
        this.findQualifiers = findQualifiers;
    }


    /**
     * Gets the name value for this Find_service.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name[] getName() {
        return name;
    }


    /**
     * Sets the name value for this Find_service.
     * 
     * @param name
     */
    public void setName(test.wsdl.dataobjects.uddi_v2.Name[] name) {
        this.name = name;
    }

    public test.wsdl.dataobjects.uddi_v2.Name getName(int i) {
        return this.name[i];
    }

    public void setName(int i, test.wsdl.dataobjects.uddi_v2.Name _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the categoryBag value for this Find_service.
     * 
     * @return categoryBag
     */
    public test.wsdl.dataobjects.uddi_v2.CategoryBag getCategoryBag() {
        return categoryBag;
    }


    /**
     * Sets the categoryBag value for this Find_service.
     * 
     * @param categoryBag
     */
    public void setCategoryBag(test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag) {
        this.categoryBag = categoryBag;
    }


    /**
     * Gets the tModelBag value for this Find_service.
     * 
     * @return tModelBag
     */
    public test.wsdl.dataobjects.uddi_v2.TModelBag getTModelBag() {
        return tModelBag;
    }


    /**
     * Sets the tModelBag value for this Find_service.
     * 
     * @param tModelBag
     */
    public void setTModelBag(test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag) {
        this.tModelBag = tModelBag;
    }


    /**
     * Gets the generic value for this Find_service.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Find_service.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the maxRows value for this Find_service.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this Find_service.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }


    /**
     * Gets the businessKey value for this Find_service.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this Find_service.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Find_service)) return false;
        Find_service other = (Find_service) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.categoryBag==null && other.getCategoryBag()==null) || 
             (this.categoryBag!=null &&
              this.categoryBag.equals(other.getCategoryBag()))) &&
            ((this.tModelBag==null && other.getTModelBag()==null) || 
             (this.tModelBag!=null &&
              this.tModelBag.equals(other.getTModelBag()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.maxRows==null && other.getMaxRows()==null) || 
             (this.maxRows!=null &&
              this.maxRows.equals(other.getMaxRows()))) &&
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey())));
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoryBag() != null) {
            _hashCode += getCategoryBag().hashCode();
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
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Find_service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "find_service"));
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
        attrField.setFieldName("businessKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "businessKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findQualifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "categoryBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "categoryBag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
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
