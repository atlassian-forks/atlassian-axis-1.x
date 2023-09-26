/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Result  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.ErrInfo errInfo;

    private test.wsdl.dataobjects.uddi_v2.KeyType keyType;  // attribute

    private int errno;  // attribute

    public Result() {
    }

    public Result(
           test.wsdl.dataobjects.uddi_v2.ErrInfo errInfo,
           test.wsdl.dataobjects.uddi_v2.KeyType keyType,
           int errno) {
           this.errInfo = errInfo;
           this.keyType = keyType;
           this.errno = errno;
    }


    /**
     * Gets the errInfo value for this Result.
     * 
     * @return errInfo
     */
    public test.wsdl.dataobjects.uddi_v2.ErrInfo getErrInfo() {
        return errInfo;
    }


    /**
     * Sets the errInfo value for this Result.
     * 
     * @param errInfo
     */
    public void setErrInfo(test.wsdl.dataobjects.uddi_v2.ErrInfo errInfo) {
        this.errInfo = errInfo;
    }


    /**
     * Gets the keyType value for this Result.
     * 
     * @return keyType
     */
    public test.wsdl.dataobjects.uddi_v2.KeyType getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this Result.
     * 
     * @param keyType
     */
    public void setKeyType(test.wsdl.dataobjects.uddi_v2.KeyType keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the errno value for this Result.
     * 
     * @return errno
     */
    public int getErrno() {
        return errno;
    }


    /**
     * Sets the errno value for this Result.
     * 
     * @param errno
     */
    public void setErrno(int errno) {
        this.errno = errno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errInfo==null && other.getErrInfo()==null) || 
             (this.errInfo!=null &&
              this.errInfo.equals(other.getErrInfo()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType()))) &&
            this.errno == other.getErrno();
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
        if (getErrInfo() != null) {
            _hashCode += getErrInfo().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        _hashCode += getErrno();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "result"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("keyType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "keyType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("errno");
        attrField.setXmlName(new javax.xml.namespace.QName("", "errno"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "errInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "errInfo"));
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
