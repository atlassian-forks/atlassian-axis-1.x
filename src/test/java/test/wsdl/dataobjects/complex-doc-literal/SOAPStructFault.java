/**
 * SOAPStructFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-doc-literal;

public class SOAPStructFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private test.wsdl.dataobjects.complex-doc-literal.SOAPStruct soapStruct;

    public SOAPStructFault() {
    }

    public SOAPStructFault(
           test.wsdl.dataobjects.complex-doc-literal.SOAPStruct soapStruct) {
        this.soapStruct = soapStruct;
    }


    /**
     * Gets the soapStruct value for this SOAPStructFault.
     * 
     * @return soapStruct
     */
    public test.wsdl.dataobjects.complex-doc-literal.SOAPStruct getSoapStruct() {
        return soapStruct;
    }


    /**
     * Sets the soapStruct value for this SOAPStructFault.
     * 
     * @param soapStruct
     */
    public void setSoapStruct(test.wsdl.dataobjects.complex-doc-literal.SOAPStruct soapStruct) {
        this.soapStruct = soapStruct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPStructFault)) return false;
        SOAPStructFault other = (SOAPStructFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soapStruct==null && other.getSoapStruct()==null) || 
             (this.soapStruct!=null &&
              this.soapStruct.equals(other.getSoapStruct())));
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
        if (getSoapStruct() != null) {
            _hashCode += getSoapStruct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOAPStructFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soapStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStruct"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
