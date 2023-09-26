/**
 * FindQualifiers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class FindQualifiers  implements java.io.Serializable {
    private java.lang.String[] findQualifier;

    public FindQualifiers() {
    }

    public FindQualifiers(
           java.lang.String[] findQualifier) {
           this.findQualifier = findQualifier;
    }


    /**
     * Gets the findQualifier value for this FindQualifiers.
     * 
     * @return findQualifier
     */
    public java.lang.String[] getFindQualifier() {
        return findQualifier;
    }


    /**
     * Sets the findQualifier value for this FindQualifiers.
     * 
     * @param findQualifier
     */
    public void setFindQualifier(java.lang.String[] findQualifier) {
        this.findQualifier = findQualifier;
    }

    public java.lang.String getFindQualifier(int i) {
        return this.findQualifier[i];
    }

    public void setFindQualifier(int i, java.lang.String _value) {
        this.findQualifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindQualifiers)) return false;
        FindQualifiers other = (FindQualifiers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findQualifier==null && other.getFindQualifier()==null) || 
             (this.findQualifier!=null &&
              java.util.Arrays.equals(this.findQualifier, other.getFindQualifier())));
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
        if (getFindQualifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFindQualifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFindQualifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindQualifiers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifiers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "findQualifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
