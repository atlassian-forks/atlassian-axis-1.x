/**
 * JavaBeanArrayTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class JavaBeanArrayTestResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.marshall2.JavaBean[] javaBeanArray;

    public JavaBeanArrayTestResponse() {
    }

    public JavaBeanArrayTestResponse(
           test.wsdl.dataobjects.marshall2.JavaBean[] javaBeanArray) {
           this.javaBeanArray = javaBeanArray;
    }


    /**
     * Gets the javaBeanArray value for this JavaBeanArrayTestResponse.
     * 
     * @return javaBeanArray
     */
    public test.wsdl.dataobjects.marshall2.JavaBean[] getJavaBeanArray() {
        return javaBeanArray;
    }


    /**
     * Sets the javaBeanArray value for this JavaBeanArrayTestResponse.
     * 
     * @param javaBeanArray
     */
    public void setJavaBeanArray(test.wsdl.dataobjects.marshall2.JavaBean[] javaBeanArray) {
        this.javaBeanArray = javaBeanArray;
    }

    public test.wsdl.dataobjects.marshall2.JavaBean getJavaBeanArray(int i) {
        return this.javaBeanArray[i];
    }

    public void setJavaBeanArray(int i, test.wsdl.dataobjects.marshall2.JavaBean _value) {
        this.javaBeanArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JavaBeanArrayTestResponse)) return false;
        JavaBeanArrayTestResponse other = (JavaBeanArrayTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.javaBeanArray==null && other.getJavaBeanArray()==null) || 
             (this.javaBeanArray!=null &&
              java.util.Arrays.equals(this.javaBeanArray, other.getJavaBeanArray())));
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
        if (getJavaBeanArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJavaBeanArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJavaBeanArray(), i);
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
        new org.apache.axis.description.TypeDesc(JavaBeanArrayTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArrayTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaBeanArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean"));
        elemField.setMinOccurs(0);
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
