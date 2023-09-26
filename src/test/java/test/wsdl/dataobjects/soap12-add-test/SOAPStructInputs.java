/**
 * SOAPStructInputs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-add-test;

public class SOAPStructInputs  implements java.io.Serializable {
    private java.lang.Object input1;

    private java.lang.Object input2;

    private java.lang.Object input3;

    private java.lang.Object input4;

    public SOAPStructInputs() {
    }

    public SOAPStructInputs(
           java.lang.Object input1,
           java.lang.Object input2,
           java.lang.Object input3,
           java.lang.Object input4) {
           this.input1 = input1;
           this.input2 = input2;
           this.input3 = input3;
           this.input4 = input4;
    }


    /**
     * Gets the input1 value for this SOAPStructInputs.
     * 
     * @return input1
     */
    public java.lang.Object getInput1() {
        return input1;
    }


    /**
     * Sets the input1 value for this SOAPStructInputs.
     * 
     * @param input1
     */
    public void setInput1(java.lang.Object input1) {
        this.input1 = input1;
    }


    /**
     * Gets the input2 value for this SOAPStructInputs.
     * 
     * @return input2
     */
    public java.lang.Object getInput2() {
        return input2;
    }


    /**
     * Sets the input2 value for this SOAPStructInputs.
     * 
     * @param input2
     */
    public void setInput2(java.lang.Object input2) {
        this.input2 = input2;
    }


    /**
     * Gets the input3 value for this SOAPStructInputs.
     * 
     * @return input3
     */
    public java.lang.Object getInput3() {
        return input3;
    }


    /**
     * Sets the input3 value for this SOAPStructInputs.
     * 
     * @param input3
     */
    public void setInput3(java.lang.Object input3) {
        this.input3 = input3;
    }


    /**
     * Gets the input4 value for this SOAPStructInputs.
     * 
     * @return input4
     */
    public java.lang.Object getInput4() {
        return input4;
    }


    /**
     * Sets the input4 value for this SOAPStructInputs.
     * 
     * @param input4
     */
    public void setInput4(java.lang.Object input4) {
        this.input4 = input4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPStructInputs)) return false;
        SOAPStructInputs other = (SOAPStructInputs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.input1==null && other.getInput1()==null) || 
             (this.input1!=null &&
              this.input1.equals(other.getInput1()))) &&
            ((this.input2==null && other.getInput2()==null) || 
             (this.input2!=null &&
              this.input2.equals(other.getInput2()))) &&
            ((this.input3==null && other.getInput3()==null) || 
             (this.input3!=null &&
              this.input3.equals(other.getInput3()))) &&
            ((this.input4==null && other.getInput4()==null) || 
             (this.input4!=null &&
              this.input4.equals(other.getInput4())));
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
        if (getInput1() != null) {
            _hashCode += getInput1().hashCode();
        }
        if (getInput2() != null) {
            _hashCode += getInput2().hashCode();
        }
        if (getInput3() != null) {
            _hashCode += getInput3().hashCode();
        }
        if (getInput4() != null) {
            _hashCode += getInput4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOAPStructInputs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example.org/ts-tests/xsd", "SOAPStructInputs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
