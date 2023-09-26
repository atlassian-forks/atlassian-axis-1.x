/**
 * EchoBinary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class EchoBinary  implements java.io.Serializable {
    private byte[] argBinary;

    public EchoBinary() {
    }

    public EchoBinary(
           byte[] argBinary) {
           this.argBinary = argBinary;
    }


    /**
     * Gets the argBinary value for this EchoBinary.
     * 
     * @return argBinary
     */
    public byte[] getArgBinary() {
        return argBinary;
    }


    /**
     * Sets the argBinary value for this EchoBinary.
     * 
     * @param argBinary
     */
    public void setArgBinary(byte[] argBinary) {
        this.argBinary = argBinary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoBinary)) return false;
        EchoBinary other = (EchoBinary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.argBinary==null && other.getArgBinary()==null) || 
             (this.argBinary!=null &&
              java.util.Arrays.equals(this.argBinary, other.getArgBinary())));
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
        if (getArgBinary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArgBinary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArgBinary(), i);
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
        new org.apache.axis.description.TypeDesc(EchoBinary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", ">echoBinary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argBinary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:QueryTest", "argBinary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
