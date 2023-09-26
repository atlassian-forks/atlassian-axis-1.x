/**
 * CSAdditionalParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSAdditionalParameters  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSAdditionalParameter[] additionalParameter;

    public CSAdditionalParameters() {
    }

    public CSAdditionalParameters(
           test.wsdl.dataobjects.good.CSAdditionalParameter[] additionalParameter) {
           this.additionalParameter = additionalParameter;
    }


    /**
     * Gets the additionalParameter value for this CSAdditionalParameters.
     * 
     * @return additionalParameter
     */
    public test.wsdl.dataobjects.good.CSAdditionalParameter[] getAdditionalParameter() {
        return additionalParameter;
    }


    /**
     * Sets the additionalParameter value for this CSAdditionalParameters.
     * 
     * @param additionalParameter
     */
    public void setAdditionalParameter(test.wsdl.dataobjects.good.CSAdditionalParameter[] additionalParameter) {
        this.additionalParameter = additionalParameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSAdditionalParameters)) return false;
        CSAdditionalParameters other = (CSAdditionalParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalParameter==null && other.getAdditionalParameter()==null) || 
             (this.additionalParameter!=null &&
              java.util.Arrays.equals(this.additionalParameter, other.getAdditionalParameter())));
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
        if (getAdditionalParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalParameter(), i);
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
        new org.apache.axis.description.TypeDesc(CSAdditionalParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameter"));
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
