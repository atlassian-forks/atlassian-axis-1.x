/**
 * FooAnyURIType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class FooAnyURIType  implements java.io.Serializable {
    private org.apache.axis.types.URI fooAnyURIType;

    public FooAnyURIType() {
    }

    public FooAnyURIType(
           org.apache.axis.types.URI fooAnyURIType) {
           this.fooAnyURIType = fooAnyURIType;
    }


    /**
     * Gets the fooAnyURIType value for this FooAnyURIType.
     * 
     * @return fooAnyURIType
     */
    public org.apache.axis.types.URI getFooAnyURIType() {
        return fooAnyURIType;
    }


    /**
     * Sets the fooAnyURIType value for this FooAnyURIType.
     * 
     * @param fooAnyURIType
     */
    public void setFooAnyURIType(org.apache.axis.types.URI fooAnyURIType) {
        this.fooAnyURIType = fooAnyURIType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FooAnyURIType)) return false;
        FooAnyURIType other = (FooAnyURIType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fooAnyURIType==null && other.getFooAnyURIType()==null) || 
             (this.fooAnyURIType!=null &&
              this.fooAnyURIType.equals(other.getFooAnyURIType())));
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
        if (getFooAnyURIType() != null) {
            _hashCode += getFooAnyURIType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FooAnyURIType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURIType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fooAnyURIType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURIType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
