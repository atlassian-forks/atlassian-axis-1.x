/**
 * SayHello.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.clash;

public class SayHello  implements java.io.Serializable {
    private java.lang.String string_1;

    private java.lang.String string_2;

    private java.lang.String string_12;  // attribute

    public SayHello() {
    }

    public SayHello(
           java.lang.String string_1,
           java.lang.String string_2,
           java.lang.String string_12) {
           this.string_1 = string_1;
           this.string_2 = string_2;
           this.string_12 = string_12;
    }


    /**
     * Gets the string_1 value for this SayHello.
     * 
     * @return string_1
     */
    public java.lang.String getString_1() {
        return string_1;
    }


    /**
     * Sets the string_1 value for this SayHello.
     * 
     * @param string_1
     */
    public void setString_1(java.lang.String string_1) {
        this.string_1 = string_1;
    }


    /**
     * Gets the string_2 value for this SayHello.
     * 
     * @return string_2
     */
    public java.lang.String getString_2() {
        return string_2;
    }


    /**
     * Sets the string_2 value for this SayHello.
     * 
     * @param string_2
     */
    public void setString_2(java.lang.String string_2) {
        this.string_2 = string_2;
    }


    /**
     * Gets the string_12 value for this SayHello.
     * 
     * @return string_12
     */
    public java.lang.String getString_12() {
        return string_12;
    }


    /**
     * Sets the string_12 value for this SayHello.
     * 
     * @param string_12
     */
    public void setString_12(java.lang.String string_12) {
        this.string_12 = string_12;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SayHello)) return false;
        SayHello other = (SayHello) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.string_1==null && other.getString_1()==null) || 
             (this.string_1!=null &&
              this.string_1.equals(other.getString_1()))) &&
            ((this.string_2==null && other.getString_2()==null) || 
             (this.string_2!=null &&
              this.string_2.equals(other.getString_2()))) &&
            ((this.string_12==null && other.getString_12()==null) || 
             (this.string_12!=null &&
              this.string_12.equals(other.getString_12())));
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
        if (getString_1() != null) {
            _hashCode += getString_1().hashCode();
        }
        if (getString_2() != null) {
            _hashCode += getString_2().hashCode();
        }
        if (getString_12() != null) {
            _hashCode += getString_12().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SayHello.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:clash.wsdl.test", "sayHello"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("string_1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "string_1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "string_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "string_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
