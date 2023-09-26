/**
 * StringParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class StringParameter  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.Integer numBytes;  // attribute

    private java.lang.String storageEncoding;  // attribute

    private test.wsdl.dataobjects.ComprehensiveTypes.FlowDirectionType direction;  // attribute

    private test.wsdl.dataobjects.ComprehensiveTypes.PassModeType passMode;  // attribute

    private java.lang.String description;  // attribute

    public StringParameter() {
    }

    // Simple Types must have a String constructor
    public StringParameter(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this StringParameter.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this StringParameter.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the numBytes value for this StringParameter.
     * 
     * @return numBytes
     */
    public java.lang.Integer getNumBytes() {
        return numBytes;
    }


    /**
     * Sets the numBytes value for this StringParameter.
     * 
     * @param numBytes
     */
    public void setNumBytes(java.lang.Integer numBytes) {
        this.numBytes = numBytes;
    }


    /**
     * Gets the storageEncoding value for this StringParameter.
     * 
     * @return storageEncoding
     */
    public java.lang.String getStorageEncoding() {
        return storageEncoding;
    }


    /**
     * Sets the storageEncoding value for this StringParameter.
     * 
     * @param storageEncoding
     */
    public void setStorageEncoding(java.lang.String storageEncoding) {
        this.storageEncoding = storageEncoding;
    }


    /**
     * Gets the direction value for this StringParameter.
     * 
     * @return direction
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.FlowDirectionType getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this StringParameter.
     * 
     * @param direction
     */
    public void setDirection(test.wsdl.dataobjects.ComprehensiveTypes.FlowDirectionType direction) {
        this.direction = direction;
    }


    /**
     * Gets the passMode value for this StringParameter.
     * 
     * @return passMode
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.PassModeType getPassMode() {
        return passMode;
    }


    /**
     * Sets the passMode value for this StringParameter.
     * 
     * @param passMode
     */
    public void setPassMode(test.wsdl.dataobjects.ComprehensiveTypes.PassModeType passMode) {
        this.passMode = passMode;
    }


    /**
     * Gets the description value for this StringParameter.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StringParameter.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringParameter)) return false;
        StringParameter other = (StringParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.numBytes==null && other.getNumBytes()==null) || 
             (this.numBytes!=null &&
              this.numBytes.equals(other.getNumBytes()))) &&
            ((this.storageEncoding==null && other.getStorageEncoding()==null) || 
             (this.storageEncoding!=null &&
              this.storageEncoding.equals(other.getStorageEncoding()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.passMode==null && other.getPassMode()==null) || 
             (this.passMode!=null &&
              this.passMode.equals(other.getPassMode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getNumBytes() != null) {
            _hashCode += getNumBytes().hashCode();
        }
        if (getStorageEncoding() != null) {
            _hashCode += getStorageEncoding().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getPassMode() != null) {
            _hashCode += getPassMode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "StringParameter"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numBytes");
        attrField.setXmlName(new javax.xml.namespace.QName("", "numBytes"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("storageEncoding");
        attrField.setXmlName(new javax.xml.namespace.QName("", "storageEncoding"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("direction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "flowDirectionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("passMode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "passMode"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "passModeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
