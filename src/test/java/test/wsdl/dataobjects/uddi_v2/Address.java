/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Address  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.AddressLine[] addressLine;

    private java.lang.String useType;  // attribute

    private java.lang.String sortCode;  // attribute

    private java.lang.String tModelKey;  // attribute

    public Address() {
    }

    public Address(
           test.wsdl.dataobjects.uddi_v2.AddressLine[] addressLine,
           java.lang.String useType,
           java.lang.String sortCode,
           java.lang.String tModelKey) {
           this.addressLine = addressLine;
           this.useType = useType;
           this.sortCode = sortCode;
           this.tModelKey = tModelKey;
    }


    /**
     * Gets the addressLine value for this Address.
     * 
     * @return addressLine
     */
    public test.wsdl.dataobjects.uddi_v2.AddressLine[] getAddressLine() {
        return addressLine;
    }


    /**
     * Sets the addressLine value for this Address.
     * 
     * @param addressLine
     */
    public void setAddressLine(test.wsdl.dataobjects.uddi_v2.AddressLine[] addressLine) {
        this.addressLine = addressLine;
    }

    public test.wsdl.dataobjects.uddi_v2.AddressLine getAddressLine(int i) {
        return this.addressLine[i];
    }

    public void setAddressLine(int i, test.wsdl.dataobjects.uddi_v2.AddressLine _value) {
        this.addressLine[i] = _value;
    }


    /**
     * Gets the useType value for this Address.
     * 
     * @return useType
     */
    public java.lang.String getUseType() {
        return useType;
    }


    /**
     * Sets the useType value for this Address.
     * 
     * @param useType
     */
    public void setUseType(java.lang.String useType) {
        this.useType = useType;
    }


    /**
     * Gets the sortCode value for this Address.
     * 
     * @return sortCode
     */
    public java.lang.String getSortCode() {
        return sortCode;
    }


    /**
     * Sets the sortCode value for this Address.
     * 
     * @param sortCode
     */
    public void setSortCode(java.lang.String sortCode) {
        this.sortCode = sortCode;
    }


    /**
     * Gets the tModelKey value for this Address.
     * 
     * @return tModelKey
     */
    public java.lang.String getTModelKey() {
        return tModelKey;
    }


    /**
     * Sets the tModelKey value for this Address.
     * 
     * @param tModelKey
     */
    public void setTModelKey(java.lang.String tModelKey) {
        this.tModelKey = tModelKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressLine==null && other.getAddressLine()==null) || 
             (this.addressLine!=null &&
              java.util.Arrays.equals(this.addressLine, other.getAddressLine()))) &&
            ((this.useType==null && other.getUseType()==null) || 
             (this.useType!=null &&
              this.useType.equals(other.getUseType()))) &&
            ((this.sortCode==null && other.getSortCode()==null) || 
             (this.sortCode!=null &&
              this.sortCode.equals(other.getSortCode()))) &&
            ((this.tModelKey==null && other.getTModelKey()==null) || 
             (this.tModelKey!=null &&
              this.tModelKey.equals(other.getTModelKey())));
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
        if (getAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseType() != null) {
            _hashCode += getUseType().hashCode();
        }
        if (getSortCode() != null) {
            _hashCode += getSortCode().hashCode();
        }
        if (getTModelKey() != null) {
            _hashCode += getTModelKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "address"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "useType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sortCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sortCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("TModelKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tModelKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelKey"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "addressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "addressLine"));
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
