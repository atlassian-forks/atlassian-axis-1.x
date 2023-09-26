/**
 * Delete_tModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Delete_tModel  implements java.io.Serializable {
    private java.lang.String authInfo;

    private java.lang.String[] tModelKey;

    private java.lang.String generic;  // attribute

    public Delete_tModel() {
    }

    public Delete_tModel(
           java.lang.String authInfo,
           java.lang.String[] tModelKey,
           java.lang.String generic) {
           this.authInfo = authInfo;
           this.tModelKey = tModelKey;
           this.generic = generic;
    }


    /**
     * Gets the authInfo value for this Delete_tModel.
     * 
     * @return authInfo
     */
    public java.lang.String getAuthInfo() {
        return authInfo;
    }


    /**
     * Sets the authInfo value for this Delete_tModel.
     * 
     * @param authInfo
     */
    public void setAuthInfo(java.lang.String authInfo) {
        this.authInfo = authInfo;
    }


    /**
     * Gets the tModelKey value for this Delete_tModel.
     * 
     * @return tModelKey
     */
    public java.lang.String[] getTModelKey() {
        return tModelKey;
    }


    /**
     * Sets the tModelKey value for this Delete_tModel.
     * 
     * @param tModelKey
     */
    public void setTModelKey(java.lang.String[] tModelKey) {
        this.tModelKey = tModelKey;
    }

    public java.lang.String getTModelKey(int i) {
        return this.tModelKey[i];
    }

    public void setTModelKey(int i, java.lang.String _value) {
        this.tModelKey[i] = _value;
    }


    /**
     * Gets the generic value for this Delete_tModel.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Delete_tModel.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Delete_tModel)) return false;
        Delete_tModel other = (Delete_tModel) obj;
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
            ((this.tModelKey==null && other.getTModelKey()==null) || 
             (this.tModelKey!=null &&
              java.util.Arrays.equals(this.tModelKey, other.getTModelKey()))) &&
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
        if (getTModelKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTModelKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTModelKey(), i);
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
        new org.apache.axis.description.TypeDesc(Delete_tModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "delete_tModel"));
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
        elemField.setFieldName("TModelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelKey"));
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
