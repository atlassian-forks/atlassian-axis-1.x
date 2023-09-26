/**
 * BaseStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-rpc-encoded;

public class BaseStruct  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private float floatMessage;

    private short shortMessage;

    public BaseStruct() {
    }

    public BaseStruct(
           float floatMessage,
           short shortMessage) {
        this.floatMessage = floatMessage;
        this.shortMessage = shortMessage;
    }


    /**
     * Gets the floatMessage value for this BaseStruct.
     * 
     * @return floatMessage
     */
    public float getFloatMessage() {
        return floatMessage;
    }


    /**
     * Sets the floatMessage value for this BaseStruct.
     * 
     * @param floatMessage
     */
    public void setFloatMessage(float floatMessage) {
        this.floatMessage = floatMessage;
    }


    /**
     * Gets the shortMessage value for this BaseStruct.
     * 
     * @return shortMessage
     */
    public short getShortMessage() {
        return shortMessage;
    }


    /**
     * Sets the shortMessage value for this BaseStruct.
     * 
     * @param shortMessage
     */
    public void setShortMessage(short shortMessage) {
        this.shortMessage = shortMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseStruct)) return false;
        BaseStruct other = (BaseStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.floatMessage == other.getFloatMessage() &&
            this.shortMessage == other.getShortMessage();
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
        _hashCode += new Float(getFloatMessage()).hashCode();
        _hashCode += getShortMessage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floatMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
