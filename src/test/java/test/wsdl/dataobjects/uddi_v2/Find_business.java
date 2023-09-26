/**
 * Find_business.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Find_business  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers;

    private test.wsdl.dataobjects.uddi_v2.Name[] name;

    private test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag;

    private test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag;

    private test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag;

    private test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs;

    private java.lang.String generic;  // attribute

    private java.lang.Integer maxRows;  // attribute

    public Find_business() {
    }

    public Find_business(
           test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers,
           test.wsdl.dataobjects.uddi_v2.Name[] name,
           test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag,
           test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag,
           test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag,
           test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs,
           java.lang.String generic,
           java.lang.Integer maxRows) {
           this.findQualifiers = findQualifiers;
           this.name = name;
           this.identifierBag = identifierBag;
           this.categoryBag = categoryBag;
           this.tModelBag = tModelBag;
           this.discoveryURLs = discoveryURLs;
           this.generic = generic;
           this.maxRows = maxRows;
    }


    /**
     * Gets the findQualifiers value for this Find_business.
     * 
     * @return findQualifiers
     */
    public test.wsdl.dataobjects.uddi_v2.FindQualifiers getFindQualifiers() {
        return findQualifiers;
    }


    /**
     * Sets the findQualifiers value for this Find_business.
     * 
     * @param findQualifiers
     */
    public void setFindQualifiers(test.wsdl.dataobjects.uddi_v2.FindQualifiers findQualifiers) {
        this.findQualifiers = findQualifiers;
    }


    /**
     * Gets the name value for this Find_business.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name[] getName() {
        return name;
    }


    /**
     * Sets the name value for this Find_business.
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
     * Gets the identifierBag value for this Find_business.
     * 
     * @return identifierBag
     */
    public test.wsdl.dataobjects.uddi_v2.IdentifierBag getIdentifierBag() {
        return identifierBag;
    }


    /**
     * Sets the identifierBag value for this Find_business.
     * 
     * @param identifierBag
     */
    public void setIdentifierBag(test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag) {
        this.identifierBag = identifierBag;
    }


    /**
     * Gets the categoryBag value for this Find_business.
     * 
     * @return categoryBag
     */
    public test.wsdl.dataobjects.uddi_v2.CategoryBag getCategoryBag() {
        return categoryBag;
    }


    /**
     * Sets the categoryBag value for this Find_business.
     * 
     * @param categoryBag
     */
    public void setCategoryBag(test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag) {
        this.categoryBag = categoryBag;
    }


    /**
     * Gets the tModelBag value for this Find_business.
     * 
     * @return tModelBag
     */
    public test.wsdl.dataobjects.uddi_v2.TModelBag getTModelBag() {
        return tModelBag;
    }


    /**
     * Sets the tModelBag value for this Find_business.
     * 
     * @param tModelBag
     */
    public void setTModelBag(test.wsdl.dataobjects.uddi_v2.TModelBag tModelBag) {
        this.tModelBag = tModelBag;
    }


    /**
     * Gets the discoveryURLs value for this Find_business.
     * 
     * @return discoveryURLs
     */
    public test.wsdl.dataobjects.uddi_v2.DiscoveryURLs getDiscoveryURLs() {
        return discoveryURLs;
    }


    /**
     * Sets the discoveryURLs value for this Find_business.
     * 
     * @param discoveryURLs
     */
    public void setDiscoveryURLs(test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs) {
        this.discoveryURLs = discoveryURLs;
    }


    /**
     * Gets the generic value for this Find_business.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Find_business.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the maxRows value for this Find_business.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this Find_business.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Find_business)) return false;
        Find_business other = (Find_business) obj;
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
            ((this.identifierBag==null && other.getIdentifierBag()==null) || 
             (this.identifierBag!=null &&
              this.identifierBag.equals(other.getIdentifierBag()))) &&
            ((this.categoryBag==null && other.getCategoryBag()==null) || 
             (this.categoryBag!=null &&
              this.categoryBag.equals(other.getCategoryBag()))) &&
            ((this.tModelBag==null && other.getTModelBag()==null) || 
             (this.tModelBag!=null &&
              this.tModelBag.equals(other.getTModelBag()))) &&
            ((this.discoveryURLs==null && other.getDiscoveryURLs()==null) || 
             (this.discoveryURLs!=null &&
              this.discoveryURLs.equals(other.getDiscoveryURLs()))) &&
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
        if (getIdentifierBag() != null) {
            _hashCode += getIdentifierBag().hashCode();
        }
        if (getCategoryBag() != null) {
            _hashCode += getCategoryBag().hashCode();
        }
        if (getTModelBag() != null) {
            _hashCode += getTModelBag().hashCode();
        }
        if (getDiscoveryURLs() != null) {
            _hashCode += getDiscoveryURLs().hashCode();
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
        new org.apache.axis.description.TypeDesc(Find_business.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "find_business"));
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
        elemField.setMaxOccursUnbounded(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelBag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelBag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discoveryURLs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "discoveryURLs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "discoveryURLs"));
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
