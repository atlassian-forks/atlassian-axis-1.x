/**
 * JavaBeanTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class JavaBeanTest  implements java.io.Serializable {
    private test.wsdl.dataobjects.marshall2.JavaBean javaBean;

    public JavaBeanTest() {
    }

    public JavaBeanTest(
           test.wsdl.dataobjects.marshall2.JavaBean javaBean) {
           this.javaBean = javaBean;
    }


    /**
     * Gets the javaBean value for this JavaBeanTest.
     * 
     * @return javaBean
     */
    public test.wsdl.dataobjects.marshall2.JavaBean getJavaBean() {
        return javaBean;
    }


    /**
     * Sets the javaBean value for this JavaBeanTest.
     * 
     * @param javaBean
     */
    public void setJavaBean(test.wsdl.dataobjects.marshall2.JavaBean javaBean) {
        this.javaBean = javaBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JavaBeanTest)) return false;
        JavaBeanTest other = (JavaBeanTest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.javaBean==null && other.getJavaBean()==null) || 
             (this.javaBean!=null &&
              this.javaBean.equals(other.getJavaBean())));
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
        if (getJavaBean() != null) {
            _hashCode += getJavaBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JavaBeanTest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanTest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean"));
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
