/**
 * DescribeLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.duplicate-element;

public class DescribeLayout  implements java.io.Serializable {
    private java.lang.String[] detailLayoutSections;

    public DescribeLayout() {
    }

    public DescribeLayout(
           java.lang.String[] detailLayoutSections) {
           this.detailLayoutSections = detailLayoutSections;
    }


    /**
     * Gets the detailLayoutSections value for this DescribeLayout.
     * 
     * @return detailLayoutSections
     */
    public java.lang.String[] getDetailLayoutSections() {
        return detailLayoutSections;
    }


    /**
     * Sets the detailLayoutSections value for this DescribeLayout.
     * 
     * @param detailLayoutSections
     */
    public void setDetailLayoutSections(java.lang.String[] detailLayoutSections) {
        this.detailLayoutSections = detailLayoutSections;
    }

    public java.lang.String getDetailLayoutSections(int i) {
        return this.detailLayoutSections[i];
    }

    public void setDetailLayoutSections(int i, java.lang.String _value) {
        this.detailLayoutSections[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeLayout)) return false;
        DescribeLayout other = (DescribeLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailLayoutSections==null && other.getDetailLayoutSections()==null) || 
             (this.detailLayoutSections!=null &&
              java.util.Arrays.equals(this.detailLayoutSections, other.getDetailLayoutSections())));
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
        if (getDetailLayoutSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailLayoutSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailLayoutSections(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:clash.wsdl.test", "DescribeLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailLayoutSections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:clash.wsdl.test", "detailLayoutSections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
