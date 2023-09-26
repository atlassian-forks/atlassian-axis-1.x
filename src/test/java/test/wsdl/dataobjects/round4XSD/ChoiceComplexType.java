/**
 * ChoiceComplexType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.round4XSD;

public class ChoiceComplexType  implements java.io.Serializable {
    private java.lang.String name0;

    private java.lang.String name1;

    public ChoiceComplexType() {
    }

    public ChoiceComplexType(
           java.lang.String name0,
           java.lang.String name1) {
           this.name0 = name0;
           this.name1 = name1;
    }


    /**
     * Gets the name0 value for this ChoiceComplexType.
     * 
     * @return name0
     */
    public java.lang.String getName0() {
        return name0;
    }


    /**
     * Sets the name0 value for this ChoiceComplexType.
     * 
     * @param name0
     */
    public void setName0(java.lang.String name0) {
        this.name0 = name0;
    }


    /**
     * Gets the name1 value for this ChoiceComplexType.
     * 
     * @return name1
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this ChoiceComplexType.
     * 
     * @param name1
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChoiceComplexType)) return false;
        ChoiceComplexType other = (ChoiceComplexType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name0==null && other.getName0()==null) || 
             (this.name0!=null &&
              this.name0.equals(other.getName0()))) &&
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1())));
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
        if (getName0() != null) {
            _hashCode += getName0().hashCode();
        }
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChoiceComplexType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "ChoiceComplexType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name0");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "name0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
