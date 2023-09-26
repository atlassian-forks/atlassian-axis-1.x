/**
 * ByteArrayTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class ByteArrayTest  implements java.io.Serializable {
    private byte[] byteArray;

    public ByteArrayTest() {
    }

    public ByteArrayTest(
           byte[] byteArray) {
           this.byteArray = byteArray;
    }


    /**
     * Gets the byteArray value for this ByteArrayTest.
     * 
     * @return byteArray
     */
    public byte[] getByteArray() {
        return byteArray;
    }


    /**
     * Sets the byteArray value for this ByteArrayTest.
     * 
     * @param byteArray
     */
    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ByteArrayTest)) return false;
        ByteArrayTest other = (ByteArrayTest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byteArray==null && other.getByteArray()==null) || 
             (this.byteArray!=null &&
              java.util.Arrays.equals(this.byteArray, other.getByteArray())));
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
        if (getByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByteArray(), i);
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
        new org.apache.axis.description.TypeDesc(ByteArrayTest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteArrayTest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "byteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
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
