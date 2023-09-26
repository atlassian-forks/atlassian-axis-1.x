/**
 * Get_businessDetailExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Get_businessDetailExt  implements java.io.Serializable {
    private java.lang.String[] businessKey;

    private java.lang.String generic;  // attribute

    public Get_businessDetailExt() {
    }

    public Get_businessDetailExt(
           java.lang.String[] businessKey,
           java.lang.String generic) {
           this.businessKey = businessKey;
           this.generic = generic;
    }


    /**
     * Gets the businessKey value for this Get_businessDetailExt.
     * 
     * @return businessKey
     */
    public java.lang.String[] getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this Get_businessDetailExt.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String[] businessKey) {
        this.businessKey = businessKey;
    }

    public java.lang.String getBusinessKey(int i) {
        return this.businessKey[i];
    }

    public void setBusinessKey(int i, java.lang.String _value) {
        this.businessKey[i] = _value;
    }


    /**
     * Gets the generic value for this Get_businessDetailExt.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Get_businessDetailExt.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_businessDetailExt)) return false;
        Get_businessDetailExt other = (Get_businessDetailExt) obj;
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
              java.util.Arrays.equals(this.businessKey, other.getBusinessKey()))) &&
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
        if (getBusinessKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessKey(), i);
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
        new org.apache.axis.description.TypeDesc(Get_businessDetailExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "get_businessDetailExt"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
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
