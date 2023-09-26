/**
 * CSPricingParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSPricingParameters  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPricingParameter[] pricingParameter;

    public CSPricingParameters() {
    }

    public CSPricingParameters(
           test.wsdl.dataobjects.good.CSPricingParameter[] pricingParameter) {
           this.pricingParameter = pricingParameter;
    }


    /**
     * Gets the pricingParameter value for this CSPricingParameters.
     * 
     * @return pricingParameter
     */
    public test.wsdl.dataobjects.good.CSPricingParameter[] getPricingParameter() {
        return pricingParameter;
    }


    /**
     * Sets the pricingParameter value for this CSPricingParameters.
     * 
     * @param pricingParameter
     */
    public void setPricingParameter(test.wsdl.dataobjects.good.CSPricingParameter[] pricingParameter) {
        this.pricingParameter = pricingParameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSPricingParameters)) return false;
        CSPricingParameters other = (CSPricingParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricingParameter==null && other.getPricingParameter()==null) || 
             (this.pricingParameter!=null &&
              java.util.Arrays.equals(this.pricingParameter, other.getPricingParameter())));
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
        if (getPricingParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingParameter(), i);
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
        new org.apache.axis.description.TypeDesc(CSPricingParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameter"));
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
