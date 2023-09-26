/**
 * EchoMultipleFaults2Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public class EchoMultipleFaults2Request  implements java.io.Serializable {
    private int whichFault;

    private java.lang.String param1;

    private float param2;

    private test.wsdl.dataobjects.simple-doc-literal.ArrayOfString param3;

    public EchoMultipleFaults2Request() {
    }

    public EchoMultipleFaults2Request(
           int whichFault,
           java.lang.String param1,
           float param2,
           test.wsdl.dataobjects.simple-doc-literal.ArrayOfString param3) {
           this.whichFault = whichFault;
           this.param1 = param1;
           this.param2 = param2;
           this.param3 = param3;
    }


    /**
     * Gets the whichFault value for this EchoMultipleFaults2Request.
     * 
     * @return whichFault
     */
    public int getWhichFault() {
        return whichFault;
    }


    /**
     * Sets the whichFault value for this EchoMultipleFaults2Request.
     * 
     * @param whichFault
     */
    public void setWhichFault(int whichFault) {
        this.whichFault = whichFault;
    }


    /**
     * Gets the param1 value for this EchoMultipleFaults2Request.
     * 
     * @return param1
     */
    public java.lang.String getParam1() {
        return param1;
    }


    /**
     * Sets the param1 value for this EchoMultipleFaults2Request.
     * 
     * @param param1
     */
    public void setParam1(java.lang.String param1) {
        this.param1 = param1;
    }


    /**
     * Gets the param2 value for this EchoMultipleFaults2Request.
     * 
     * @return param2
     */
    public float getParam2() {
        return param2;
    }


    /**
     * Sets the param2 value for this EchoMultipleFaults2Request.
     * 
     * @param param2
     */
    public void setParam2(float param2) {
        this.param2 = param2;
    }


    /**
     * Gets the param3 value for this EchoMultipleFaults2Request.
     * 
     * @return param3
     */
    public test.wsdl.dataobjects.simple-doc-literal.ArrayOfString getParam3() {
        return param3;
    }


    /**
     * Sets the param3 value for this EchoMultipleFaults2Request.
     * 
     * @param param3
     */
    public void setParam3(test.wsdl.dataobjects.simple-doc-literal.ArrayOfString param3) {
        this.param3 = param3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoMultipleFaults2Request)) return false;
        EchoMultipleFaults2Request other = (EchoMultipleFaults2Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.whichFault == other.getWhichFault() &&
            ((this.param1==null && other.getParam1()==null) || 
             (this.param1!=null &&
              this.param1.equals(other.getParam1()))) &&
            this.param2 == other.getParam2() &&
            ((this.param3==null && other.getParam3()==null) || 
             (this.param3!=null &&
              this.param3.equals(other.getParam3())));
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
        _hashCode += getWhichFault();
        if (getParam1() != null) {
            _hashCode += getParam1().hashCode();
        }
        _hashCode += new Float(getParam2()).hashCode();
        if (getParam3() != null) {
            _hashCode += getParam3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoMultipleFaults2Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whichFault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whichFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString"));
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
