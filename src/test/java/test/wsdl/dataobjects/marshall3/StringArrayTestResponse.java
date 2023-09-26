/**
 * StringArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall3;

public class StringArrayTestResponse  implements java.io.Serializable {
    private java.lang.String[] stringArray;

    public StringArrayTestResponse() {
    }

    public StringArrayTestResponse(
           java.lang.String[] stringArray) {
           this.stringArray = stringArray;
    }


    /**
     * Gets the stringArray value for this StringArrayTestResponse.
     * 
     * @return stringArray
     */
    public java.lang.String[] getStringArray() {
        return stringArray;
    }


    /**
     * Sets the stringArray value for this StringArrayTestResponse.
     * 
     * @param stringArray
     */
    public void setStringArray(java.lang.String[] stringArray) {
        this.stringArray = stringArray;
    }

    public java.lang.String getStringArray(int i) {
        return this.stringArray[i];
    }

    public void setStringArray(int i, java.lang.String _value) {
        this.stringArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StringArrayTestResponse)) return false;
        StringArrayTestResponse other = (StringArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stringArray==null && other.getStringArray()==null) || 
             (this.stringArray!=null &&
              java.util.Arrays.equals(this.stringArray, other.getStringArray())));
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
        if (getStringArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStringArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStringArray(), i);
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
        new org.apache.axis.description.TypeDesc(StringArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StringArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
