/**
 * ExtendedStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-rpc-encoded;

public class ExtendedStruct  extends test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct  implements java.io.Serializable {
    private java.lang.String stringMessage;

    private int intMessage;

    private int anotherIntMessage;

    public ExtendedStruct() {
    }

    public ExtendedStruct(
           float floatMessage,
           short shortMessage,
           java.lang.String stringMessage,
           int intMessage,
           int anotherIntMessage) {
        super(
            floatMessage,
            shortMessage);
        this.stringMessage = stringMessage;
        this.intMessage = intMessage;
        this.anotherIntMessage = anotherIntMessage;
    }


    /**
     * Gets the stringMessage value for this ExtendedStruct.
     * 
     * @return stringMessage
     */
    public java.lang.String getStringMessage() {
        return stringMessage;
    }


    /**
     * Sets the stringMessage value for this ExtendedStruct.
     * 
     * @param stringMessage
     */
    public void setStringMessage(java.lang.String stringMessage) {
        this.stringMessage = stringMessage;
    }


    /**
     * Gets the intMessage value for this ExtendedStruct.
     * 
     * @return intMessage
     */
    public int getIntMessage() {
        return intMessage;
    }


    /**
     * Sets the intMessage value for this ExtendedStruct.
     * 
     * @param intMessage
     */
    public void setIntMessage(int intMessage) {
        this.intMessage = intMessage;
    }


    /**
     * Gets the anotherIntMessage value for this ExtendedStruct.
     * 
     * @return anotherIntMessage
     */
    public int getAnotherIntMessage() {
        return anotherIntMessage;
    }


    /**
     * Sets the anotherIntMessage value for this ExtendedStruct.
     * 
     * @param anotherIntMessage
     */
    public void setAnotherIntMessage(int anotherIntMessage) {
        this.anotherIntMessage = anotherIntMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedStruct)) return false;
        ExtendedStruct other = (ExtendedStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stringMessage==null && other.getStringMessage()==null) || 
             (this.stringMessage!=null &&
              this.stringMessage.equals(other.getStringMessage()))) &&
            this.intMessage == other.getIntMessage() &&
            this.anotherIntMessage == other.getAnotherIntMessage();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStringMessage() != null) {
            _hashCode += getStringMessage().hashCode();
        }
        _hashCode += getIntMessage();
        _hashCode += getAnotherIntMessage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendedStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotherIntMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anotherIntMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
