/**
 * GetPriceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class GetPriceResponse  extends test.wsdl.dataobjects.good.CSCommonResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPricingOptions pricingOptions;

    public GetPriceResponse() {
    }

    public GetPriceResponse(
           test.wsdl.dataobjects.good.CSResult result,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSText transactionId,
           test.wsdl.dataobjects.good.CSPricingOptions pricingOptions) {
        super(
            result,
            additionalParameters,
            transactionId);
        this.pricingOptions = pricingOptions;
    }


    /**
     * Gets the pricingOptions value for this GetPriceResponse.
     * 
     * @return pricingOptions
     */
    public test.wsdl.dataobjects.good.CSPricingOptions getPricingOptions() {
        return pricingOptions;
    }


    /**
     * Sets the pricingOptions value for this GetPriceResponse.
     * 
     * @param pricingOptions
     */
    public void setPricingOptions(test.wsdl.dataobjects.good.CSPricingOptions pricingOptions) {
        this.pricingOptions = pricingOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPriceResponse)) return false;
        GetPriceResponse other = (GetPriceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pricingOptions==null && other.getPricingOptions()==null) || 
             (this.pricingOptions!=null &&
              this.pricingOptions.equals(other.getPricingOptions())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPricingOptions() != null) {
            _hashCode += getPricingOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPriceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOptions"));
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
