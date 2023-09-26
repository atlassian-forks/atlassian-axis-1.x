/**
 * TModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class TModel  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.Name name;

    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private test.wsdl.dataobjects.uddi_v2.OverviewDoc overviewDoc;

    private test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag;

    private test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag;

    private java.lang.String tModelKey;  // attribute

    private java.lang.String operator;  // attribute

    private java.lang.String authorizedName;  // attribute

    public TModel() {
    }

    public TModel(
           test.wsdl.dataobjects.uddi_v2.Name name,
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           test.wsdl.dataobjects.uddi_v2.OverviewDoc overviewDoc,
           test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag,
           test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag,
           java.lang.String tModelKey,
           java.lang.String operator,
           java.lang.String authorizedName) {
           this.name = name;
           this.description = description;
           this.overviewDoc = overviewDoc;
           this.identifierBag = identifierBag;
           this.categoryBag = categoryBag;
           this.tModelKey = tModelKey;
           this.operator = operator;
           this.authorizedName = authorizedName;
    }


    /**
     * Gets the name value for this TModel.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name getName() {
        return name;
    }


    /**
     * Sets the name value for this TModel.
     * 
     * @param name
     */
    public void setName(test.wsdl.dataobjects.uddi_v2.Name name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TModel.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TModel.
     * 
     * @param description
     */
    public void setDescription(test.wsdl.dataobjects.uddi_v2.Description[] description) {
        this.description = description;
    }

    public test.wsdl.dataobjects.uddi_v2.Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, test.wsdl.dataobjects.uddi_v2.Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the overviewDoc value for this TModel.
     * 
     * @return overviewDoc
     */
    public test.wsdl.dataobjects.uddi_v2.OverviewDoc getOverviewDoc() {
        return overviewDoc;
    }


    /**
     * Sets the overviewDoc value for this TModel.
     * 
     * @param overviewDoc
     */
    public void setOverviewDoc(test.wsdl.dataobjects.uddi_v2.OverviewDoc overviewDoc) {
        this.overviewDoc = overviewDoc;
    }


    /**
     * Gets the identifierBag value for this TModel.
     * 
     * @return identifierBag
     */
    public test.wsdl.dataobjects.uddi_v2.IdentifierBag getIdentifierBag() {
        return identifierBag;
    }


    /**
     * Sets the identifierBag value for this TModel.
     * 
     * @param identifierBag
     */
    public void setIdentifierBag(test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag) {
        this.identifierBag = identifierBag;
    }


    /**
     * Gets the categoryBag value for this TModel.
     * 
     * @return categoryBag
     */
    public test.wsdl.dataobjects.uddi_v2.CategoryBag getCategoryBag() {
        return categoryBag;
    }


    /**
     * Sets the categoryBag value for this TModel.
     * 
     * @param categoryBag
     */
    public void setCategoryBag(test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag) {
        this.categoryBag = categoryBag;
    }


    /**
     * Gets the tModelKey value for this TModel.
     * 
     * @return tModelKey
     */
    public java.lang.String getTModelKey() {
        return tModelKey;
    }


    /**
     * Sets the tModelKey value for this TModel.
     * 
     * @param tModelKey
     */
    public void setTModelKey(java.lang.String tModelKey) {
        this.tModelKey = tModelKey;
    }


    /**
     * Gets the operator value for this TModel.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this TModel.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the authorizedName value for this TModel.
     * 
     * @return authorizedName
     */
    public java.lang.String getAuthorizedName() {
        return authorizedName;
    }


    /**
     * Sets the authorizedName value for this TModel.
     * 
     * @param authorizedName
     */
    public void setAuthorizedName(java.lang.String authorizedName) {
        this.authorizedName = authorizedName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TModel)) return false;
        TModel other = (TModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.overviewDoc==null && other.getOverviewDoc()==null) || 
             (this.overviewDoc!=null &&
              this.overviewDoc.equals(other.getOverviewDoc()))) &&
            ((this.identifierBag==null && other.getIdentifierBag()==null) || 
             (this.identifierBag!=null &&
              this.identifierBag.equals(other.getIdentifierBag()))) &&
            ((this.categoryBag==null && other.getCategoryBag()==null) || 
             (this.categoryBag!=null &&
              this.categoryBag.equals(other.getCategoryBag()))) &&
            ((this.tModelKey==null && other.getTModelKey()==null) || 
             (this.tModelKey!=null &&
              this.tModelKey.equals(other.getTModelKey()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverviewDoc() != null) {
            _hashCode += getOverviewDoc().hashCode();
        }
        if (getIdentifierBag() != null) {
            _hashCode += getIdentifierBag().hashCode();
        }
        if (getCategoryBag() != null) {
            _hashCode += getCategoryBag().hashCode();
        }
        if (getTModelKey() != null) {
            _hashCode += getTModelKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(TModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModel"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("TModelKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tModelKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelKey"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overviewDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "overviewDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "overviewDoc"));
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
