/**
 * ArrayOfString_MaxOccursUnbounded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo2;

public class ArrayOfString_MaxOccursUnbounded  implements java.io.Serializable {
    private java.lang.String[] varStringArray;

    public ArrayOfString_MaxOccursUnbounded() {
    }

    public ArrayOfString_MaxOccursUnbounded(
           java.lang.String[] varStringArray) {
           this.varStringArray = varStringArray;
    }


    /**
     * Gets the varStringArray value for this ArrayOfString_MaxOccursUnbounded.
     * 
     * @return varStringArray
     */
    public java.lang.String[] getVarStringArray() {
        return varStringArray;
    }


    /**
     * Sets the varStringArray value for this ArrayOfString_MaxOccursUnbounded.
     * 
     * @param varStringArray
     */
    public void setVarStringArray(java.lang.String[] varStringArray) {
        this.varStringArray = varStringArray;
    }

    public java.lang.String getVarStringArray(int i) {
        return this.varStringArray[i];
    }

    public void setVarStringArray(int i, java.lang.String _value) {
        this.varStringArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfString_MaxOccursUnbounded)) return false;
        ArrayOfString_MaxOccursUnbounded other = (ArrayOfString_MaxOccursUnbounded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.varStringArray==null && other.getVarStringArray()==null) || 
             (this.varStringArray!=null &&
              java.util.Arrays.equals(this.varStringArray, other.getVarStringArray())));
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
        if (getVarStringArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVarStringArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVarStringArray(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfString_MaxOccursUnbounded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:echo2.wsdl.test", "ArrayOfString_MaxOccursUnbounded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varStringArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varStringArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
