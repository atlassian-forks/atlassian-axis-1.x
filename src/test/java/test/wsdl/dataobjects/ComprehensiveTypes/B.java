/**
 * B.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class B  implements java.io.Serializable {
    private test.wsdl.dataobjects.ComprehensiveTypes.A d;

    public B() {
    }

    public B(
           test.wsdl.dataobjects.ComprehensiveTypes.A d) {
           this.d = d;
    }


    /**
     * Gets the d value for this B.
     * 
     * @return d
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.A getD() {
        return d;
    }


    /**
     * Sets the d value for this B.
     * 
     * @param d
     */
    public void setD(test.wsdl.dataobjects.ComprehensiveTypes.A d) {
        this.d = d;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof B)) return false;
        B other = (B) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.d==null && other.getD()==null) || 
             (this.d!=null &&
              this.d.equals(other.getD())));
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
        if (getD() != null) {
            _hashCode += getD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(B.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "b"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("d");
        elemField.setXmlName(new javax.xml.namespace.QName("", "d"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "a"));
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
