/**
 * EchoAnyElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.round4XSD;

public class EchoAnyElement  implements java.io.Serializable {
    private test.wsdl.dataobjects.round4XSD.EchoAnyElementInputAny inputAny;

    public EchoAnyElement() {
    }

    public EchoAnyElement(
           test.wsdl.dataobjects.round4XSD.EchoAnyElementInputAny inputAny) {
           this.inputAny = inputAny;
    }


    /**
     * Gets the inputAny value for this EchoAnyElement.
     * 
     * @return inputAny
     */
    public test.wsdl.dataobjects.round4XSD.EchoAnyElementInputAny getInputAny() {
        return inputAny;
    }


    /**
     * Sets the inputAny value for this EchoAnyElement.
     * 
     * @param inputAny
     */
    public void setInputAny(test.wsdl.dataobjects.round4XSD.EchoAnyElementInputAny inputAny) {
        this.inputAny = inputAny;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoAnyElement)) return false;
        EchoAnyElement other = (EchoAnyElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputAny==null && other.getInputAny()==null) || 
             (this.inputAny!=null &&
              this.inputAny.equals(other.getInputAny())));
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
        if (getInputAny() != null) {
            _hashCode += getInputAny().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoAnyElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/", ">echoAnyElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputAny");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/", "inputAny"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/", ">>echoAnyElement>inputAny"));
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
