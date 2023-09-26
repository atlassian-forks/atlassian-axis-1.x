/**
 * CSPricingOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSPricingOptions  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPricingOption[] pricingOption;

    public CSPricingOptions() {
    }

    public CSPricingOptions(
           test.wsdl.dataobjects.good.CSPricingOption[] pricingOption) {
           this.pricingOption = pricingOption;
    }


    /**
     * Gets the pricingOption value for this CSPricingOptions.
     * 
     * @return pricingOption
     */
    public test.wsdl.dataobjects.good.CSPricingOption[] getPricingOption() {
        return pricingOption;
    }


    /**
     * Sets the pricingOption value for this CSPricingOptions.
     * 
     * @param pricingOption
     */
    public void setPricingOption(test.wsdl.dataobjects.good.CSPricingOption[] pricingOption) {
        this.pricingOption = pricingOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSPricingOptions)) return false;
        CSPricingOptions other = (CSPricingOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricingOption==null && other.getPricingOption()==null) || 
             (this.pricingOption!=null &&
              java.util.Arrays.equals(this.pricingOption, other.getPricingOption())));
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
        if (getPricingOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingOption(), i);
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
        new org.apache.axis.description.TypeDesc(CSPricingOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOption"));
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
