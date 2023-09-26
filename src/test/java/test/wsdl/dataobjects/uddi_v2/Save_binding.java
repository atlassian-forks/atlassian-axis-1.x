/**
 * Save_binding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Save_binding  implements java.io.Serializable {
    private java.lang.String authInfo;

    private test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate;

    private java.lang.String generic;  // attribute

    public Save_binding() {
    }

    public Save_binding(
           java.lang.String authInfo,
           test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate,
           java.lang.String generic) {
           this.authInfo = authInfo;
           this.bindingTemplate = bindingTemplate;
           this.generic = generic;
    }


    /**
     * Gets the authInfo value for this Save_binding.
     * 
     * @return authInfo
     */
    public java.lang.String getAuthInfo() {
        return authInfo;
    }


    /**
     * Sets the authInfo value for this Save_binding.
     * 
     * @param authInfo
     */
    public void setAuthInfo(java.lang.String authInfo) {
        this.authInfo = authInfo;
    }


    /**
     * Gets the bindingTemplate value for this Save_binding.
     * 
     * @return bindingTemplate
     */
    public test.wsdl.dataobjects.uddi_v2.BindingTemplate[] getBindingTemplate() {
        return bindingTemplate;
    }


    /**
     * Sets the bindingTemplate value for this Save_binding.
     * 
     * @param bindingTemplate
     */
    public void setBindingTemplate(test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate) {
        this.bindingTemplate = bindingTemplate;
    }

    public test.wsdl.dataobjects.uddi_v2.BindingTemplate getBindingTemplate(int i) {
        return this.bindingTemplate[i];
    }

    public void setBindingTemplate(int i, test.wsdl.dataobjects.uddi_v2.BindingTemplate _value) {
        this.bindingTemplate[i] = _value;
    }


    /**
     * Gets the generic value for this Save_binding.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Save_binding.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Save_binding)) return false;
        Save_binding other = (Save_binding) obj;
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
            ((this.bindingTemplate==null && other.getBindingTemplate()==null) || 
             (this.bindingTemplate!=null &&
              java.util.Arrays.equals(this.bindingTemplate, other.getBindingTemplate()))) &&
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
        if (getBindingTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindingTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindingTemplate(), i);
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
        new org.apache.axis.description.TypeDesc(Save_binding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "save_binding"));
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
        elemField.setFieldName("bindingTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplate"));
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
