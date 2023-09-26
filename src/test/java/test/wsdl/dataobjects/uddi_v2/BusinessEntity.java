/**
 * BusinessEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BusinessEntity  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs;

    private test.wsdl.dataobjects.uddi_v2.Name[] name;

    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private test.wsdl.dataobjects.uddi_v2.Contacts contacts;

    private test.wsdl.dataobjects.uddi_v2.BusinessServices businessServices;

    private test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag;

    private test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag;

    private java.lang.String businessKey;  // attribute

    private java.lang.String operator;  // attribute

    private java.lang.String authorizedName;  // attribute

    public BusinessEntity() {
    }

    public BusinessEntity(
           test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs,
           test.wsdl.dataobjects.uddi_v2.Name[] name,
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           test.wsdl.dataobjects.uddi_v2.Contacts contacts,
           test.wsdl.dataobjects.uddi_v2.BusinessServices businessServices,
           test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag,
           test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag,
           java.lang.String businessKey,
           java.lang.String operator,
           java.lang.String authorizedName) {
           this.discoveryURLs = discoveryURLs;
           this.name = name;
           this.description = description;
           this.contacts = contacts;
           this.businessServices = businessServices;
           this.identifierBag = identifierBag;
           this.categoryBag = categoryBag;
           this.businessKey = businessKey;
           this.operator = operator;
           this.authorizedName = authorizedName;
    }


    /**
     * Gets the discoveryURLs value for this BusinessEntity.
     * 
     * @return discoveryURLs
     */
    public test.wsdl.dataobjects.uddi_v2.DiscoveryURLs getDiscoveryURLs() {
        return discoveryURLs;
    }


    /**
     * Sets the discoveryURLs value for this BusinessEntity.
     * 
     * @param discoveryURLs
     */
    public void setDiscoveryURLs(test.wsdl.dataobjects.uddi_v2.DiscoveryURLs discoveryURLs) {
        this.discoveryURLs = discoveryURLs;
    }


    /**
     * Gets the name value for this BusinessEntity.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name[] getName() {
        return name;
    }


    /**
     * Sets the name value for this BusinessEntity.
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
     * Gets the description value for this BusinessEntity.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BusinessEntity.
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
     * Gets the contacts value for this BusinessEntity.
     * 
     * @return contacts
     */
    public test.wsdl.dataobjects.uddi_v2.Contacts getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this BusinessEntity.
     * 
     * @param contacts
     */
    public void setContacts(test.wsdl.dataobjects.uddi_v2.Contacts contacts) {
        this.contacts = contacts;
    }


    /**
     * Gets the businessServices value for this BusinessEntity.
     * 
     * @return businessServices
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessServices getBusinessServices() {
        return businessServices;
    }


    /**
     * Sets the businessServices value for this BusinessEntity.
     * 
     * @param businessServices
     */
    public void setBusinessServices(test.wsdl.dataobjects.uddi_v2.BusinessServices businessServices) {
        this.businessServices = businessServices;
    }


    /**
     * Gets the identifierBag value for this BusinessEntity.
     * 
     * @return identifierBag
     */
    public test.wsdl.dataobjects.uddi_v2.IdentifierBag getIdentifierBag() {
        return identifierBag;
    }


    /**
     * Sets the identifierBag value for this BusinessEntity.
     * 
     * @param identifierBag
     */
    public void setIdentifierBag(test.wsdl.dataobjects.uddi_v2.IdentifierBag identifierBag) {
        this.identifierBag = identifierBag;
    }


    /**
     * Gets the categoryBag value for this BusinessEntity.
     * 
     * @return categoryBag
     */
    public test.wsdl.dataobjects.uddi_v2.CategoryBag getCategoryBag() {
        return categoryBag;
    }


    /**
     * Sets the categoryBag value for this BusinessEntity.
     * 
     * @param categoryBag
     */
    public void setCategoryBag(test.wsdl.dataobjects.uddi_v2.CategoryBag categoryBag) {
        this.categoryBag = categoryBag;
    }


    /**
     * Gets the businessKey value for this BusinessEntity.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this BusinessEntity.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }


    /**
     * Gets the operator value for this BusinessEntity.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this BusinessEntity.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the authorizedName value for this BusinessEntity.
     * 
     * @return authorizedName
     */
    public java.lang.String getAuthorizedName() {
        return authorizedName;
    }


    /**
     * Sets the authorizedName value for this BusinessEntity.
     * 
     * @param authorizedName
     */
    public void setAuthorizedName(java.lang.String authorizedName) {
        this.authorizedName = authorizedName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessEntity)) return false;
        BusinessEntity other = (BusinessEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discoveryURLs==null && other.getDiscoveryURLs()==null) || 
             (this.discoveryURLs!=null &&
              this.discoveryURLs.equals(other.getDiscoveryURLs()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.contacts==null && other.getContacts()==null) || 
             (this.contacts!=null &&
              this.contacts.equals(other.getContacts()))) &&
            ((this.businessServices==null && other.getBusinessServices()==null) || 
             (this.businessServices!=null &&
              this.businessServices.equals(other.getBusinessServices()))) &&
            ((this.identifierBag==null && other.getIdentifierBag()==null) || 
             (this.identifierBag!=null &&
              this.identifierBag.equals(other.getIdentifierBag()))) &&
            ((this.categoryBag==null && other.getCategoryBag()==null) || 
             (this.categoryBag!=null &&
              this.categoryBag.equals(other.getCategoryBag()))) &&
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey()))) &&
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
        if (getDiscoveryURLs() != null) {
            _hashCode += getDiscoveryURLs().hashCode();
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
        if (getContacts() != null) {
            _hashCode += getContacts().hashCode();
        }
        if (getBusinessServices() != null) {
            _hashCode += getBusinessServices().hashCode();
        }
        if (getIdentifierBag() != null) {
            _hashCode += getIdentifierBag().hashCode();
        }
        if (getCategoryBag() != null) {
            _hashCode += getCategoryBag().hashCode();
        }
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
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
        new org.apache.axis.description.TypeDesc(BusinessEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntity"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("businessKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "businessKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
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
        elemField.setFieldName("discoveryURLs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "discoveryURLs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "discoveryURLs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "contacts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessServices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessServices"));
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
