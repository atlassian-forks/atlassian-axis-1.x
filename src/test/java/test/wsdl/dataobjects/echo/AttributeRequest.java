/**
 * AttributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class AttributeRequest  implements java.io.Serializable {
    private java.lang.String attributeName;

    private test.wsdl.dataobjects.echo.ArrayOfAttributeRequest requestedAttributes;

    public AttributeRequest() {
    }

    public AttributeRequest(
           java.lang.String attributeName,
           test.wsdl.dataobjects.echo.ArrayOfAttributeRequest requestedAttributes) {
           this.attributeName = attributeName;
           this.requestedAttributes = requestedAttributes;
    }


    /**
     * Gets the attributeName value for this AttributeRequest.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this AttributeRequest.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the requestedAttributes value for this AttributeRequest.
     * 
     * @return requestedAttributes
     */
    public test.wsdl.dataobjects.echo.ArrayOfAttributeRequest getRequestedAttributes() {
        return requestedAttributes;
    }


    /**
     * Sets the requestedAttributes value for this AttributeRequest.
     * 
     * @param requestedAttributes
     */
    public void setRequestedAttributes(test.wsdl.dataobjects.echo.ArrayOfAttributeRequest requestedAttributes) {
        this.requestedAttributes = requestedAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeRequest)) return false;
        AttributeRequest other = (AttributeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.requestedAttributes==null && other.getRequestedAttributes()==null) || 
             (this.requestedAttributes!=null &&
              this.requestedAttributes.equals(other.getRequestedAttributes())));
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
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getRequestedAttributes() != null) {
            _hashCode += getRequestedAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "AttributeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "requestedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "ArrayOfAttributeRequest"));
        elemField.setNillable(true);
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
