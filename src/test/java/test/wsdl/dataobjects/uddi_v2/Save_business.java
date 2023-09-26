/**
 * Save_business.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Save_business  implements java.io.Serializable {
    private java.lang.String authInfo;

    private test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity;

    private java.lang.String[] uploadRegister;

    private java.lang.String generic;  // attribute

    public Save_business() {
    }

    public Save_business(
           java.lang.String authInfo,
           test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity,
           java.lang.String[] uploadRegister,
           java.lang.String generic) {
           this.authInfo = authInfo;
           this.businessEntity = businessEntity;
           this.uploadRegister = uploadRegister;
           this.generic = generic;
    }


    /**
     * Gets the authInfo value for this Save_business.
     * 
     * @return authInfo
     */
    public java.lang.String getAuthInfo() {
        return authInfo;
    }


    /**
     * Sets the authInfo value for this Save_business.
     * 
     * @param authInfo
     */
    public void setAuthInfo(java.lang.String authInfo) {
        this.authInfo = authInfo;
    }


    /**
     * Gets the businessEntity value for this Save_business.
     * 
     * @return businessEntity
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessEntity[] getBusinessEntity() {
        return businessEntity;
    }


    /**
     * Sets the businessEntity value for this Save_business.
     * 
     * @param businessEntity
     */
    public void setBusinessEntity(test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity) {
        this.businessEntity = businessEntity;
    }

    public test.wsdl.dataobjects.uddi_v2.BusinessEntity getBusinessEntity(int i) {
        return this.businessEntity[i];
    }

    public void setBusinessEntity(int i, test.wsdl.dataobjects.uddi_v2.BusinessEntity _value) {
        this.businessEntity[i] = _value;
    }


    /**
     * Gets the uploadRegister value for this Save_business.
     * 
     * @return uploadRegister
     */
    public java.lang.String[] getUploadRegister() {
        return uploadRegister;
    }


    /**
     * Sets the uploadRegister value for this Save_business.
     * 
     * @param uploadRegister
     */
    public void setUploadRegister(java.lang.String[] uploadRegister) {
        this.uploadRegister = uploadRegister;
    }

    public java.lang.String getUploadRegister(int i) {
        return this.uploadRegister[i];
    }

    public void setUploadRegister(int i, java.lang.String _value) {
        this.uploadRegister[i] = _value;
    }


    /**
     * Gets the generic value for this Save_business.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Save_business.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Save_business)) return false;
        Save_business other = (Save_business) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authInfo==null && other.getAuthInfo()==null) || 
             (this.authInfo!=null &&
              this.authInfo.equals(other.getAuthInfo()))) &&
            ((this.businessEntity==null && other.getBusinessEntity()==null) || 
             (this.businessEntity!=null &&
              java.util.Arrays.equals(this.businessEntity, other.getBusinessEntity()))) &&
            ((this.uploadRegister==null && other.getUploadRegister()==null) || 
             (this.uploadRegister!=null &&
              java.util.Arrays.equals(this.uploadRegister, other.getUploadRegister()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric())));
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
        if (getAuthInfo() != null) {
            _hashCode += getAuthInfo().hashCode();
        }
        if (getBusinessEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUploadRegister() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUploadRegister());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUploadRegister(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Save_business.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "save_business"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "authInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "uploadRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "uploadRegister"));
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
