/**
 * SetResourceProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ChoiceService;

public class SetResourceProperties  implements java.io.Serializable {
    private java.lang.String a;

    private java.lang.Integer b;

    private java.util.Calendar c;

    public SetResourceProperties() {
    }

    public SetResourceProperties(
           java.lang.String a,
           java.lang.Integer b,
           java.util.Calendar c) {
           this.a = a;
           this.b = b;
           this.c = c;
    }


    /**
     * Gets the a value for this SetResourceProperties.
     * 
     * @return a
     */
    public java.lang.String getA() {
        return a;
    }


    /**
     * Sets the a value for this SetResourceProperties.
     * 
     * @param a
     */
    public void setA(java.lang.String a) {
        this.a = a;
    }


    /**
     * Gets the b value for this SetResourceProperties.
     * 
     * @return b
     */
    public java.lang.Integer getB() {
        return b;
    }


    /**
     * Sets the b value for this SetResourceProperties.
     * 
     * @param b
     */
    public void setB(java.lang.Integer b) {
        this.b = b;
    }


    /**
     * Gets the c value for this SetResourceProperties.
     * 
     * @return c
     */
    public java.util.Calendar getC() {
        return c;
    }


    /**
     * Sets the c value for this SetResourceProperties.
     * 
     * @param c
     */
    public void setC(java.util.Calendar c) {
        this.c = c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetResourceProperties)) return false;
        SetResourceProperties other = (SetResourceProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.a==null && other.getA()==null) || 
             (this.a!=null &&
              this.a.equals(other.getA()))) &&
            ((this.b==null && other.getB()==null) || 
             (this.b!=null &&
              this.b.equals(other.getB()))) &&
            ((this.c==null && other.getC()==null) || 
             (this.c!=null &&
              this.c.equals(other.getC())));
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
        if (getA() != null) {
            _hashCode += getA().hashCode();
        }
        if (getB() != null) {
            _hashCode += getB().hashCode();
        }
        if (getC() != null) {
            _hashCode += getC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetResourceProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetResourceProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "a"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
