/**
 * EchoArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class EchoArray  implements java.io.Serializable {
    private java.lang.Object[] argArray;

    public EchoArray() {
    }

    public EchoArray(
           java.lang.Object[] argArray) {
           this.argArray = argArray;
    }


    /**
     * Gets the argArray value for this EchoArray.
     * 
     * @return argArray
     */
    public java.lang.Object[] getArgArray() {
        return argArray;
    }


    /**
     * Sets the argArray value for this EchoArray.
     * 
     * @param argArray
     */
    public void setArgArray(java.lang.Object[] argArray) {
        this.argArray = argArray;
    }

    public java.lang.Object getArgArray(int i) {
        return this.argArray[i];
    }

    public void setArgArray(int i, java.lang.Object _value) {
        this.argArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoArray)) return false;
        EchoArray other = (EchoArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.argArray==null && other.getArgArray()==null) || 
             (this.argArray!=null &&
              java.util.Arrays.equals(this.argArray, other.getArgArray())));
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
        if (getArgArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArgArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArgArray(), i);
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
        new org.apache.axis.description.TypeDesc(EchoArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", ">echoArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:QueryTest", "argArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
