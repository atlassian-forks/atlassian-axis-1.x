/**
 * EchoMultipleFaults4Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public class EchoMultipleFaults4Request  implements java.io.Serializable {
    private int whichFault;

    private int param1;

    private test.wsdl.dataobjects.simple-doc-literal.Enum param2;

    public EchoMultipleFaults4Request() {
    }

    public EchoMultipleFaults4Request(
           int whichFault,
           int param1,
           test.wsdl.dataobjects.simple-doc-literal.Enum param2) {
           this.whichFault = whichFault;
           this.param1 = param1;
           this.param2 = param2;
    }


    /**
     * Gets the whichFault value for this EchoMultipleFaults4Request.
     * 
     * @return whichFault
     */
    public int getWhichFault() {
        return whichFault;
    }


    /**
     * Sets the whichFault value for this EchoMultipleFaults4Request.
     * 
     * @param whichFault
     */
    public void setWhichFault(int whichFault) {
        this.whichFault = whichFault;
    }


    /**
     * Gets the param1 value for this EchoMultipleFaults4Request.
     * 
     * @return param1
     */
    public int getParam1() {
        return param1;
    }


    /**
     * Sets the param1 value for this EchoMultipleFaults4Request.
     * 
     * @param param1
     */
    public void setParam1(int param1) {
        this.param1 = param1;
    }


    /**
     * Gets the param2 value for this EchoMultipleFaults4Request.
     * 
     * @return param2
     */
    public test.wsdl.dataobjects.simple-doc-literal.Enum getParam2() {
        return param2;
    }


    /**
     * Sets the param2 value for this EchoMultipleFaults4Request.
     * 
     * @param param2
     */
    public void setParam2(test.wsdl.dataobjects.simple-doc-literal.Enum param2) {
        this.param2 = param2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoMultipleFaults4Request)) return false;
        EchoMultipleFaults4Request other = (EchoMultipleFaults4Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.whichFault == other.getWhichFault() &&
            this.param1 == other.getParam1() &&
            ((this.param2==null && other.getParam2()==null) || 
             (this.param2!=null &&
              this.param2.equals(other.getParam2())));
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
        _hashCode += getParam1();
        if (getParam2() != null) {
            _hashCode += getParam2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoMultipleFaults4Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults4Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whichFault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whichFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum"));
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
