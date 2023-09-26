/**
 * QNameArrayTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class QNameArrayTest  implements java.io.Serializable {
    private javax.xml.namespace.QName[] qnameArray_1;

    public QNameArrayTest() {
    }

    public QNameArrayTest(
           javax.xml.namespace.QName[] qnameArray_1) {
           this.qnameArray_1 = qnameArray_1;
    }


    /**
     * Gets the qnameArray_1 value for this QNameArrayTest.
     * 
     * @return qnameArray_1
     */
    public javax.xml.namespace.QName[] getQnameArray_1() {
        return qnameArray_1;
    }


    /**
     * Sets the qnameArray_1 value for this QNameArrayTest.
     * 
     * @param qnameArray_1
     */
    public void setQnameArray_1(javax.xml.namespace.QName[] qnameArray_1) {
        this.qnameArray_1 = qnameArray_1;
    }

    public javax.xml.namespace.QName getQnameArray_1(int i) {
        return this.qnameArray_1[i];
    }

    public void setQnameArray_1(int i, javax.xml.namespace.QName _value) {
        this.qnameArray_1[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QNameArrayTest)) return false;
        QNameArrayTest other = (QNameArrayTest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qnameArray_1==null && other.getQnameArray_1()==null) || 
             (this.qnameArray_1!=null &&
              java.util.Arrays.equals(this.qnameArray_1, other.getQnameArray_1())));
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
        if (getQnameArray_1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQnameArray_1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQnameArray_1(), i);
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
        new org.apache.axis.description.TypeDesc(QNameArrayTest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameArrayTest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnameArray_1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "qnameArray_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
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
