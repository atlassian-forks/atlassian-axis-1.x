/**
 * EchoBinaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class EchoBinaryResponse  implements java.io.Serializable {
    private byte[] echoBinaryReturn;

    public EchoBinaryResponse() {
    }

    public EchoBinaryResponse(
           byte[] echoBinaryReturn) {
           this.echoBinaryReturn = echoBinaryReturn;
    }


    /**
     * Gets the echoBinaryReturn value for this EchoBinaryResponse.
     * 
     * @return echoBinaryReturn
     */
    public byte[] getEchoBinaryReturn() {
        return echoBinaryReturn;
    }


    /**
     * Sets the echoBinaryReturn value for this EchoBinaryResponse.
     * 
     * @param echoBinaryReturn
     */
    public void setEchoBinaryReturn(byte[] echoBinaryReturn) {
        this.echoBinaryReturn = echoBinaryReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoBinaryResponse)) return false;
        EchoBinaryResponse other = (EchoBinaryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.echoBinaryReturn==null && other.getEchoBinaryReturn()==null) || 
             (this.echoBinaryReturn!=null &&
              java.util.Arrays.equals(this.echoBinaryReturn, other.getEchoBinaryReturn())));
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
        if (getEchoBinaryReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEchoBinaryReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEchoBinaryReturn(), i);
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
        new org.apache.axis.description.TypeDesc(EchoBinaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", ">echoBinaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("echoBinaryReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:QueryTest", "echoBinaryReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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