/**
 * Phone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.attribute-qualify;

public class Phone  implements java.io.Serializable {
    private int areaCode;

    private java.lang.String exchange;

    private java.lang.String number;

    private java.lang.String color;  // attribute

    private java.lang.String hair;  // attribute

    private int age;  // attribute

    public Phone() {
    }

    public Phone(
           int areaCode,
           java.lang.String exchange,
           java.lang.String number,
           java.lang.String color,
           java.lang.String hair,
           int age) {
           this.areaCode = areaCode;
           this.exchange = exchange;
           this.number = number;
           this.color = color;
           this.hair = hair;
           this.age = age;
    }


    /**
     * Gets the areaCode value for this Phone.
     * 
     * @return areaCode
     */
    public int getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this Phone.
     * 
     * @param areaCode
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the exchange value for this Phone.
     * 
     * @return exchange
     */
    public java.lang.String getExchange() {
        return exchange;
    }


    /**
     * Sets the exchange value for this Phone.
     * 
     * @param exchange
     */
    public void setExchange(java.lang.String exchange) {
        this.exchange = exchange;
    }


    /**
     * Gets the number value for this Phone.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Phone.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the color value for this Phone.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this Phone.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the hair value for this Phone.
     * 
     * @return hair
     */
    public java.lang.String getHair() {
        return hair;
    }


    /**
     * Sets the hair value for this Phone.
     * 
     * @param hair
     */
    public void setHair(java.lang.String hair) {
        this.hair = hair;
    }


    /**
     * Gets the age value for this Phone.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this Phone.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Phone)) return false;
        Phone other = (Phone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.areaCode == other.getAreaCode() &&
            ((this.exchange==null && other.getExchange()==null) || 
             (this.exchange!=null &&
              this.exchange.equals(other.getExchange()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.hair==null && other.getHair()==null) || 
             (this.hair!=null &&
              this.hair.equals(other.getHair()))) &&
            this.age == other.getAge();
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
        _hashCode += getAreaCode();
        if (getExchange() != null) {
            _hashCode += getExchange().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getHair() != null) {
            _hashCode += getHair().hashCode();
        }
        _hashCode += getAge();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Phone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:attributeQualify", "phone"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("color");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:attributeQualify", "color"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hair");
        attrField.setXmlName(new javax.xml.namespace.QName("urn:attributeQualify", "hair"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("age");
        attrField.setXmlName(new javax.xml.namespace.QName("", "age"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
