/**
 * SequenceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SequenceTest;

public class SequenceInfo  implements java.io.Serializable {
    private int zero;

    private int one;

    private int two;

    private int three;

    private int four;

    private int five;

    public SequenceInfo() {
    }

    public SequenceInfo(
           int zero,
           int one,
           int two,
           int three,
           int four,
           int five) {
           this.zero = zero;
           this.one = one;
           this.two = two;
           this.three = three;
           this.four = four;
           this.five = five;
    }


    /**
     * Gets the zero value for this SequenceInfo.
     * 
     * @return zero
     */
    public int getZero() {
        return zero;
    }


    /**
     * Sets the zero value for this SequenceInfo.
     * 
     * @param zero
     */
    public void setZero(int zero) {
        this.zero = zero;
    }


    /**
     * Gets the one value for this SequenceInfo.
     * 
     * @return one
     */
    public int getOne() {
        return one;
    }


    /**
     * Sets the one value for this SequenceInfo.
     * 
     * @param one
     */
    public void setOne(int one) {
        this.one = one;
    }


    /**
     * Gets the two value for this SequenceInfo.
     * 
     * @return two
     */
    public int getTwo() {
        return two;
    }


    /**
     * Sets the two value for this SequenceInfo.
     * 
     * @param two
     */
    public void setTwo(int two) {
        this.two = two;
    }


    /**
     * Gets the three value for this SequenceInfo.
     * 
     * @return three
     */
    public int getThree() {
        return three;
    }


    /**
     * Sets the three value for this SequenceInfo.
     * 
     * @param three
     */
    public void setThree(int three) {
        this.three = three;
    }


    /**
     * Gets the four value for this SequenceInfo.
     * 
     * @return four
     */
    public int getFour() {
        return four;
    }


    /**
     * Sets the four value for this SequenceInfo.
     * 
     * @param four
     */
    public void setFour(int four) {
        this.four = four;
    }


    /**
     * Gets the five value for this SequenceInfo.
     * 
     * @return five
     */
    public int getFive() {
        return five;
    }


    /**
     * Sets the five value for this SequenceInfo.
     * 
     * @param five
     */
    public void setFive(int five) {
        this.five = five;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SequenceInfo)) return false;
        SequenceInfo other = (SequenceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.zero == other.getZero() &&
            this.one == other.getOne() &&
            this.two == other.getTwo() &&
            this.three == other.getThree() &&
            this.four == other.getFour() &&
            this.five == other.getFive();
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
        _hashCode += getZero();
        _hashCode += getOne();
        _hashCode += getTwo();
        _hashCode += getThree();
        _hashCode += getFour();
        _hashCode += getFive();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SequenceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SequenceTest2", "sequenceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("one");
        elemField.setXmlName(new javax.xml.namespace.QName("", "one"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("two");
        elemField.setXmlName(new javax.xml.namespace.QName("", "two"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("three");
        elemField.setXmlName(new javax.xml.namespace.QName("", "three"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("four");
        elemField.setXmlName(new javax.xml.namespace.QName("", "four"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("five");
        elemField.setXmlName(new javax.xml.namespace.QName("", "five"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
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
