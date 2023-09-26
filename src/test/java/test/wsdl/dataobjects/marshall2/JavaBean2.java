/**
 * JavaBean2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class JavaBean2  implements java.io.Serializable {
    private java.math.BigDecimal myBigDecimal;

    private double myDouble;

    private long myLong;

    private short myShort;

    private int myInt;

    private java.util.Calendar myCalendar;

    private byte myByte;

    private boolean myBoolean;

    private java.lang.String myString;

    private java.math.BigInteger myBigInteger;

    private float myFloat;

    public JavaBean2() {
    }

    public JavaBean2(
           java.math.BigDecimal myBigDecimal,
           double myDouble,
           long myLong,
           short myShort,
           int myInt,
           java.util.Calendar myCalendar,
           byte myByte,
           boolean myBoolean,
           java.lang.String myString,
           java.math.BigInteger myBigInteger,
           float myFloat) {
           this.myBigDecimal = myBigDecimal;
           this.myDouble = myDouble;
           this.myLong = myLong;
           this.myShort = myShort;
           this.myInt = myInt;
           this.myCalendar = myCalendar;
           this.myByte = myByte;
           this.myBoolean = myBoolean;
           this.myString = myString;
           this.myBigInteger = myBigInteger;
           this.myFloat = myFloat;
    }


    /**
     * Gets the myBigDecimal value for this JavaBean2.
     * 
     * @return myBigDecimal
     */
    public java.math.BigDecimal getMyBigDecimal() {
        return myBigDecimal;
    }


    /**
     * Sets the myBigDecimal value for this JavaBean2.
     * 
     * @param myBigDecimal
     */
    public void setMyBigDecimal(java.math.BigDecimal myBigDecimal) {
        this.myBigDecimal = myBigDecimal;
    }


    /**
     * Gets the myDouble value for this JavaBean2.
     * 
     * @return myDouble
     */
    public double getMyDouble() {
        return myDouble;
    }


    /**
     * Sets the myDouble value for this JavaBean2.
     * 
     * @param myDouble
     */
    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }


    /**
     * Gets the myLong value for this JavaBean2.
     * 
     * @return myLong
     */
    public long getMyLong() {
        return myLong;
    }


    /**
     * Sets the myLong value for this JavaBean2.
     * 
     * @param myLong
     */
    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }


    /**
     * Gets the myShort value for this JavaBean2.
     * 
     * @return myShort
     */
    public short getMyShort() {
        return myShort;
    }


    /**
     * Sets the myShort value for this JavaBean2.
     * 
     * @param myShort
     */
    public void setMyShort(short myShort) {
        this.myShort = myShort;
    }


    /**
     * Gets the myInt value for this JavaBean2.
     * 
     * @return myInt
     */
    public int getMyInt() {
        return myInt;
    }


    /**
     * Sets the myInt value for this JavaBean2.
     * 
     * @param myInt
     */
    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }


    /**
     * Gets the myCalendar value for this JavaBean2.
     * 
     * @return myCalendar
     */
    public java.util.Calendar getMyCalendar() {
        return myCalendar;
    }


    /**
     * Sets the myCalendar value for this JavaBean2.
     * 
     * @param myCalendar
     */
    public void setMyCalendar(java.util.Calendar myCalendar) {
        this.myCalendar = myCalendar;
    }


    /**
     * Gets the myByte value for this JavaBean2.
     * 
     * @return myByte
     */
    public byte getMyByte() {
        return myByte;
    }


    /**
     * Sets the myByte value for this JavaBean2.
     * 
     * @param myByte
     */
    public void setMyByte(byte myByte) {
        this.myByte = myByte;
    }


    /**
     * Gets the myBoolean value for this JavaBean2.
     * 
     * @return myBoolean
     */
    public boolean isMyBoolean() {
        return myBoolean;
    }


    /**
     * Sets the myBoolean value for this JavaBean2.
     * 
     * @param myBoolean
     */
    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }


    /**
     * Gets the myString value for this JavaBean2.
     * 
     * @return myString
     */
    public java.lang.String getMyString() {
        return myString;
    }


    /**
     * Sets the myString value for this JavaBean2.
     * 
     * @param myString
     */
    public void setMyString(java.lang.String myString) {
        this.myString = myString;
    }


    /**
     * Gets the myBigInteger value for this JavaBean2.
     * 
     * @return myBigInteger
     */
    public java.math.BigInteger getMyBigInteger() {
        return myBigInteger;
    }


    /**
     * Sets the myBigInteger value for this JavaBean2.
     * 
     * @param myBigInteger
     */
    public void setMyBigInteger(java.math.BigInteger myBigInteger) {
        this.myBigInteger = myBigInteger;
    }


    /**
     * Gets the myFloat value for this JavaBean2.
     * 
     * @return myFloat
     */
    public float getMyFloat() {
        return myFloat;
    }


    /**
     * Sets the myFloat value for this JavaBean2.
     * 
     * @param myFloat
     */
    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JavaBean2)) return false;
        JavaBean2 other = (JavaBean2) obj;
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
            this.myDouble == other.getMyDouble() &&
            this.myLong == other.getMyLong() &&
            this.myShort == other.getMyShort() &&
            this.myInt == other.getMyInt() &&
            ((this.myCalendar==null && other.getMyCalendar()==null) || 
             (this.myCalendar!=null &&
              this.myCalendar.equals(other.getMyCalendar()))) &&
            this.myByte == other.getMyByte() &&
            this.myBoolean == other.isMyBoolean() &&
            ((this.myString==null && other.getMyString()==null) || 
             (this.myString!=null &&
              this.myString.equals(other.getMyString()))) &&
            ((this.myBigInteger==null && other.getMyBigInteger()==null) || 
             (this.myBigInteger!=null &&
              this.myBigInteger.equals(other.getMyBigInteger()))) &&
            this.myFloat == other.getMyFloat();
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
        _hashCode += new Double(getMyDouble()).hashCode();
        _hashCode += new Long(getMyLong()).hashCode();
        _hashCode += getMyShort();
        _hashCode += getMyInt();
        if (getMyCalendar() != null) {
            _hashCode += getMyCalendar().hashCode();
        }
        _hashCode += getMyByte();
        _hashCode += (isMyBoolean() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMyString() != null) {
            _hashCode += getMyString().hashCode();
        }
        if (getMyBigInteger() != null) {
            _hashCode += getMyBigInteger().hashCode();
        }
        _hashCode += new Float(getMyFloat()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JavaBean2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myBigDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myDouble");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myDouble"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myLong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myShort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myShort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myInt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myByte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myByte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBoolean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myBoolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myBigInteger");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myBigInteger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myFloat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "myFloat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
