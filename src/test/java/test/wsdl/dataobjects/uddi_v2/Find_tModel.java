/**
 * Find_tModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Find_tModel  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers;

    private test.wsdl.dataobjects.uddi_v2.Name name;

    private test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag;

    private test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag;

    private java.lang.String generic;  // attribute

    private java.lang.Integer maxRows;  // attribute

    public Find_tModel() {
    }

    public Find_tModel(
           test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers,
           test.wsdl.dataobjects.uddi_v2.Name name,
           test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag,
           test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag,
           java.lang.String generic,
           java.lang.Integer maxRows) {
           this.findQualifiers = findQualifiers;
           this.name = name;
           this.identifierBag = identifierBag;
           this.categoryBag = categoryBag;
           this.generic = generic;
           this.maxRows = maxRows;
    }


    /**
     * Gets the findQualifiers value for this Find_tModel.
     * 
     * @return findQualifiers
     */
    public test.wsdl.dataobjects.uddi_v2.FindQualifiers getFindQualifiers() {
        return findQualifiers;
    }


    /**
     * Sets the findQualifiers value for this Find_tModel.
     * 
     * @param findQualifiers
     */
    public void setFindQualifiers(test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers) {
        this.findQualifiers = findQualifiers;
    }


    /**
     * Gets the name value for this Find_tModel.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this Find_tModel.
     * 
     * @param name
     */
    public void setName(test.wsdl.dataobjects.uddi_v2.Name name) {
        this.name = name;
    }


    /**
     * Gets the identifierBag value for this Find_tModel.
     * 
     * @return identifierBag
     */
    public test.wsdl.dataobjects.uddi_v2.IdentifierBag getIdentifierBag() {
        return identifierBag;
    }


    /**
     * Sets the identifierBag value for this Find_tModel.
     * 
     * @param identifierBag
     */
    public void setIdentifierBag(test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag) {
        this.identifierBag = identifierBag;
    }


    /**
     * Gets the categoryBag value for this Find_tModel.
     * 
     * @return categoryBag
     */
    public test.wsdl.dataobjects.uddi_v2.CategoryBag getCategoryBag() {
        return categoryBag;
    }


    /**
     * Sets the categoryBag value for this Find_tModel.
     * 
     * @param categoryBag
     */
    public void setCategoryBag(test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag) {
        this.categoryBag = categoryBag;
    }


    /**
     * Gets the generic value for this Find_tModel.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Find_tModel.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the maxRows value for this Find_tModel.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this Find_tModel.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Find_tModel)) return false;
        Find_tModel other = (Find_tModel) obj;
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
              this.name.equals(other.getName()))) &&
            ((this.identifierBag==null && other.getIdentifierBag()==null) || 
             (this.identifierBag!=null &&
              this.identifierBag.equals(other.getIdentifierBag()))) &&
            ((this.categoryBag==null && other.getCategoryBag()==null) || 
             (this.categoryBag!=null &&
              this.categoryBag.equals(other.getCategoryBag()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIdentifierBag() != null) {
            _hashCode += getIdentifierBag().hashCode();
        }
        if (getCategoryBag() != null) {
            _hashCode += getCategoryBag().hashCode();
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
        new org.apache.axis.description.TypeDesc(Find_tModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "find_tModel"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "identifierBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "identifierBag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "categoryBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "categoryBag"));
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
