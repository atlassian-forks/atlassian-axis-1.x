/**
 * EchoQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class EchoQuery  implements java.io.Serializable {
    private test.wsdl.dataobjects.QueryTest.QueryBean argQuery;

    public EchoQuery() {
    }

    public EchoQuery(
           test.wsdl.dataobjects.QueryTest.QueryBean argQuery) {
           this.argQuery = argQuery;
    }


    /**
     * Gets the argQuery value for this EchoQuery.
     * 
     * @return argQuery
     */
    public test.wsdl.dataobjects.QueryTest.QueryBean getArgQuery() {
        return argQuery;
    }


    /**
     * Sets the argQuery value for this EchoQuery.
     * 
     * @param argQuery
     */
    public void setArgQuery(test.wsdl.dataobjects.QueryTest.QueryBean argQuery) {
        this.argQuery = argQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoQuery)) return false;
        EchoQuery other = (EchoQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.argQuery==null && other.getArgQuery()==null) || 
             (this.argQuery!=null &&
              this.argQuery.equals(other.getArgQuery())));
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
        if (getArgQuery() != null) {
            _hashCode += getArgQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", ">echoQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:QueryTest", "argQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rpc.xml.coldfusion", "QueryBean"));
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
