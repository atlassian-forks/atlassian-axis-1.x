/**
 * RelatedBusinessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class RelatedBusinessInfo  implements java.io.Serializable {
    private java.lang.String businessKey;

    private test.wsdl.dataobjects.uddi_v2.Name[] name;

    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private test.wsdl.dataobjects.uddi_v2.SharedRelationships[] sharedRelationships;

    public RelatedBusinessInfo() {
    }

    public RelatedBusinessInfo(
           java.lang.String businessKey,
           test.wsdl.dataobjects.uddi_v2.Name[] name,
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           test.wsdl.dataobjects.uddi_v2.SharedRelationships[] sharedRelationships) {
           this.businessKey = businessKey;
           this.name = name;
           this.description = description;
           this.sharedRelationships = sharedRelationships;
    }


    /**
     * Gets the businessKey value for this RelatedBusinessInfo.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this RelatedBusinessInfo.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }


    /**
     * Gets the name value for this RelatedBusinessInfo.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name[] getName() {
        return name;
    }


    /**
     * Sets the name value for this RelatedBusinessInfo.
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
     * Gets the description value for this RelatedBusinessInfo.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RelatedBusinessInfo.
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
     * Gets the sharedRelationships value for this RelatedBusinessInfo.
     * 
     * @return sharedRelationships
     */
    public test.wsdl.dataobjects.uddi_v2.SharedRelationships[] getSharedRelationships() {
        return sharedRelationships;
    }


    /**
     * Sets the sharedRelationships value for this RelatedBusinessInfo.
     * 
     * @param sharedRelationships
     */
    public void setSharedRelationships(test.wsdl.dataobjects.uddi_v2.SharedRelationships[] sharedRelationships) {
        this.sharedRelationships = sharedRelationships;
    }

    public test.wsdl.dataobjects.uddi_v2.SharedRelationships getSharedRelationships(int i) {
        return this.sharedRelationships[i];
    }

    public void setSharedRelationships(int i, test.wsdl.dataobjects.uddi_v2.SharedRelationships _value) {
        this.sharedRelationships[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedBusinessInfo)) return false;
        RelatedBusinessInfo other = (RelatedBusinessInfo) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.sharedRelationships==null && other.getSharedRelationships()==null) || 
             (this.sharedRelationships!=null &&
              java.util.Arrays.equals(this.sharedRelationships, other.getSharedRelationships())));
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
        if (getSharedRelationships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedRelationships());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedRelationships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedBusinessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
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
        elemField.setFieldName("sharedRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "sharedRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "sharedRelationships"));
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
