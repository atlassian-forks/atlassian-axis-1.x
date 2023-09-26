/**
 * MyBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall;

public class MyBean  implements java.io.Serializable {
    private java.math.BigDecimal myBigDecimal;

    private java.math.BigDecimal myBigDecimalArray;

    private java.math.BigInteger myBigInteger;

    private java.math.BigInteger myBigIntegerArray;

    public MyBean() {
    }

    public MyBean(
           java.math.BigDecimal myBigDecimal,
           java.math.BigDecimal myBigDecimalArray,
           java.math.BigInteger myBigInteger,
           java.math.BigInteger myBigIntegerArray) {
           this.myBigDecimal = myBigDecimal;
           this.myBigDecimalArray = myBigDecimalArray;
           this.myBigInteger = myBigInteger;
           this.myBigIntegerArray = myBigIntegerArray;
    }


    /**
     * Gets the myBigDecimal value for this MyBean.
     * 
     * @return myBigDecimal
     */
    public java.math.BigDecimal getMyBigDecimal() {
        return myBigDecimal;
    }


    /**
     * Sets the myBigDecimal value for this MyBean.
     * 
     * @param myBigDecimal
     */
    public void setMyBigDecimal(java.math.BigDecimal myBigDecimal) {
        this.myBigDecimal = myBigDecimal;
    }


    /**
     * Gets the myBigDecimalArray value for this MyBean.
     * 
     * @return myBigDecimalArray
     */
    public java.math.BigDecimal getMyBigDecimalArray() {
        return myBigDecimalArray;
    }


    /**
     * Sets the myBigDecimalArray value for this MyBean.
     * 
     * @param myBigDecimalArray
     */
    public void setMyBigDecimalArray(java.math.BigDecimal myBigDecimalArray) {
        this.myBigDecimalArray = myBigDecimalArray;
    }


    /**
     * Gets the myBigInteger value for this MyBean.
     * 
     * @return myBigInteger
     */
    public java.math.BigInteger getMyBigInteger() {
        return myBigInteger;
    }


    /**
     * Sets the myBigInteger value for this MyBean.
     * 
     * @param myBigInteger
     */
    public void setMyBigInteger(java.math.BigInteger myBigInteger) {
        this.myBigInteger = myBigInteger;
    }


    /**
     * Gets the myBigIntegerArray value for this MyBean.
     * 
     * @return myBigIntegerArray
     */
    public java.math.BigInteger getMyBigIntegerArray() {
        return myBigIntegerArray;
    }


    /**
     * Sets the myBigIntegerArray value for this MyBean.
     * 
     * @param myBigIntegerArray
     */
    public void setMyBigIntegerArray(java.math.BigInteger myBigIntegerArray) {
        this.myBigIntegerArray = myBigIntegerArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyBean)) return false;
        MyBean other = (MyBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myBigDecimal==null && other.getMyBigDecimal()==null) || 
             (this.myBigDecimal!=null &&
              this.myBigDecimal.equals(other.getMyBigDecimal()))) &&
            ((this.myBigDecimalArray==null && other.getMyBigDecimalArray()==null) || 
             (this.myBigDecimalArray!=null &&
              this.myBigDecimalArray.equals(other.getMyBigDecimalArray()))) &&
            ((this.myBigInteger==null && other.getMyBigInteger()==null) || 
             (this.myBigInteger!=null &&
              this.myBigInteger.equals(other.getMyBigInteger()))) &&
            ((this.myBigIntegerArray==null && other.getMyBigIntegerArray()==null) || 
             (this.myBigIntegerArray!=null &&
              this.myBigIntegerArray.equals(other.getMyBigIntegerArray())));
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
        if (getMyBigDecimal() != null) {
            _hashCode += getMyBigDecimal().hashCode();
        }
        if (getMyBigDecimalArray() != null) {
            _hashCode += getMyBigDecimalArray().hashCode();
        }
        if (getMyBigInteger() != null) {
            _hashCode += getMyBigInteger().hashCode();
        }
        if (getMyBigIntegerArray() != null) {
            _hashCode += getMyBigIntegerArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall.wsdl.test/types", "MyBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myBigDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigDecimalArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myBigDecimalArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigInteger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myBigInteger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigIntegerArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myBigIntegerArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
