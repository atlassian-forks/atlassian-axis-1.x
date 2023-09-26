/**
 * ArrayOfMyBase64Bean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo2;

public class ArrayOfMyBase64Bean  implements java.io.Serializable {
    private test.wsdl.dataobjects.echo2.MyBase64Bean[] varMyBase64Bean;

    public ArrayOfMyBase64Bean() {
    }

    public ArrayOfMyBase64Bean(
           test.wsdl.dataobjects.echo2.MyBase64Bean[] varMyBase64Bean) {
           this.varMyBase64Bean = varMyBase64Bean;
    }


    /**
     * Gets the varMyBase64Bean value for this ArrayOfMyBase64Bean.
     * 
     * @return varMyBase64Bean
     */
    public test.wsdl.dataobjects.echo2.MyBase64Bean[] getVarMyBase64Bean() {
        return varMyBase64Bean;
    }


    /**
     * Sets the varMyBase64Bean value for this ArrayOfMyBase64Bean.
     * 
     * @param varMyBase64Bean
     */
    public void setVarMyBase64Bean(test.wsdl.dataobjects.echo2.MyBase64Bean[] varMyBase64Bean) {
        this.varMyBase64Bean = varMyBase64Bean;
    }

    public test.wsdl.dataobjects.echo2.MyBase64Bean getVarMyBase64Bean(int i) {
        return this.varMyBase64Bean[i];
    }

    public void setVarMyBase64Bean(int i, test.wsdl.dataobjects.echo2.MyBase64Bean _value) {
        this.varMyBase64Bean[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfMyBase64Bean)) return false;
        ArrayOfMyBase64Bean other = (ArrayOfMyBase64Bean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.varMyBase64Bean==null && other.getVarMyBase64Bean()==null) || 
             (this.varMyBase64Bean!=null &&
              java.util.Arrays.equals(this.varMyBase64Bean, other.getVarMyBase64Bean())));
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
        if (getVarMyBase64Bean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVarMyBase64Bean());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVarMyBase64Bean(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfMyBase64Bean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:echo2.wsdl.test", "ArrayOfMyBase64Bean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varMyBase64Bean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varMyBase64Bean"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:echo2.wsdl.test", "MyBase64Bean"));
        elemField.setNillable(true);
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
