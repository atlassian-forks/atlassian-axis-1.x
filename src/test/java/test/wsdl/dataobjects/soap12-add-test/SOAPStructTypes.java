/**
 * SOAPStructTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.soap12-add-test;

public class SOAPStructTypes  implements java.io.Serializable {
    private javax.xml.namespace.QName type1;

    private javax.xml.namespace.QName type2;

    private javax.xml.namespace.QName type3;

    private javax.xml.namespace.QName type4;

    public SOAPStructTypes() {
    }

    public SOAPStructTypes(
           javax.xml.namespace.QName type1,
           javax.xml.namespace.QName type2,
           javax.xml.namespace.QName type3,
           javax.xml.namespace.QName type4) {
           this.type1 = type1;
           this.type2 = type2;
           this.type3 = type3;
           this.type4 = type4;
    }


    /**
     * Gets the type1 value for this SOAPStructTypes.
     * 
     * @return type1
     */
    public javax.xml.namespace.QName getType1() {
        return type1;
    }


    /**
     * Sets the type1 value for this SOAPStructTypes.
     * 
     * @param type1
     */
    public void setType1(javax.xml.namespace.QName type1) {
        this.type1 = type1;
    }


    /**
     * Gets the type2 value for this SOAPStructTypes.
     * 
     * @return type2
     */
    public javax.xml.namespace.QName getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this SOAPStructTypes.
     * 
     * @param type2
     */
    public void setType2(javax.xml.namespace.QName type2) {
        this.type2 = type2;
    }


    /**
     * Gets the type3 value for this SOAPStructTypes.
     * 
     * @return type3
     */
    public javax.xml.namespace.QName getType3() {
        return type3;
    }


    /**
     * Sets the type3 value for this SOAPStructTypes.
     * 
     * @param type3
     */
    public void setType3(javax.xml.namespace.QName type3) {
        this.type3 = type3;
    }


    /**
     * Gets the type4 value for this SOAPStructTypes.
     * 
     * @return type4
     */
    public javax.xml.namespace.QName getType4() {
        return type4;
    }


    /**
     * Sets the type4 value for this SOAPStructTypes.
     * 
     * @param type4
     */
    public void setType4(javax.xml.namespace.QName type4) {
        this.type4 = type4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPStructTypes)) return false;
        SOAPStructTypes other = (SOAPStructTypes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type1==null && other.getType1()==null) || 
             (this.type1!=null &&
              this.type1.equals(other.getType1()))) &&
            ((this.type2==null && other.getType2()==null) || 
             (this.type2!=null &&
              this.type2.equals(other.getType2()))) &&
            ((this.type3==null && other.getType3()==null) || 
             (this.type3!=null &&
              this.type3.equals(other.getType3()))) &&
            ((this.type4==null && other.getType4()==null) || 
             (this.type4!=null &&
              this.type4.equals(other.getType4())));
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
        if (getType1() != null) {
            _hashCode += getType1().hashCode();
        }
        if (getType2() != null) {
            _hashCode += getType2().hashCode();
        }
        if (getType3() != null) {
            _hashCode += getType3().hashCode();
        }
        if (getType4() != null) {
            _hashCode += getType4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOAPStructTypes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://example.org/ts-tests/xsd", "SOAPStructTypes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
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
