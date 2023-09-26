/**
 * CSPricingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSPricingOption  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSAmount discountAmount;

    private test.wsdl.dataobjects.good.CSPricingParameters pricingParameters;

    private test.wsdl.dataobjects.good.CSPricingModel pricingModel;

    private test.wsdl.dataobjects.good.CSBoolean loginNeeded;

    private test.wsdl.dataobjects.good.CSQualifiedAmount price;

    public CSPricingOption() {
    }

    public CSPricingOption(
           test.wsdl.dataobjects.good.CSAmount discountAmount,
           test.wsdl.dataobjects.good.CSPricingParameters pricingParameters,
           test.wsdl.dataobjects.good.CSPricingModel pricingModel,
           test.wsdl.dataobjects.good.CSBoolean loginNeeded,
           test.wsdl.dataobjects.good.CSQualifiedAmount price) {
           this.discountAmount = discountAmount;
           this.pricingParameters = pricingParameters;
           this.pricingModel = pricingModel;
           this.loginNeeded = loginNeeded;
           this.price = price;
    }


    /**
     * Gets the discountAmount value for this CSPricingOption.
     * 
     * @return discountAmount
     */
    public test.wsdl.dataobjects.good.CSAmount getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this CSPricingOption.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(test.wsdl.dataobjects.good.CSAmount discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the pricingParameters value for this CSPricingOption.
     * 
     * @return pricingParameters
     */
    public test.wsdl.dataobjects.good.CSPricingParameters getPricingParameters() {
        return pricingParameters;
    }


    /**
     * Sets the pricingParameters value for this CSPricingOption.
     * 
     * @param pricingParameters
     */
    public void setPricingParameters(test.wsdl.dataobjects.good.CSPricingParameters pricingParameters) {
        this.pricingParameters = pricingParameters;
    }


    /**
     * Gets the pricingModel value for this CSPricingOption.
     * 
     * @return pricingModel
     */
    public test.wsdl.dataobjects.good.CSPricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this CSPricingOption.
     * 
     * @param pricingModel
     */
    public void setPricingModel(test.wsdl.dataobjects.good.CSPricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the loginNeeded value for this CSPricingOption.
     * 
     * @return loginNeeded
     */
    public test.wsdl.dataobjects.good.CSBoolean getLoginNeeded() {
        return loginNeeded;
    }


    /**
     * Sets the loginNeeded value for this CSPricingOption.
     * 
     * @param loginNeeded
     */
    public void setLoginNeeded(test.wsdl.dataobjects.good.CSBoolean loginNeeded) {
        this.loginNeeded = loginNeeded;
    }


    /**
     * Gets the price value for this CSPricingOption.
     * 
     * @return price
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CSPricingOption.
     * 
     * @param price
     */
    public void setPrice(test.wsdl.dataobjects.good.CSQualifiedAmount price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSPricingOption)) return false;
        CSPricingOption other = (CSPricingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.pricingParameters==null && other.getPricingParameters()==null) || 
             (this.pricingParameters!=null &&
              this.pricingParameters.equals(other.getPricingParameters()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.loginNeeded==null && other.getLoginNeeded()==null) || 
             (this.loginNeeded!=null &&
              this.loginNeeded.equals(other.getLoginNeeded()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getPricingParameters() != null) {
            _hashCode += getPricingParameters().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getLoginNeeded() != null) {
            _hashCode += getLoginNeeded().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSPricingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAmount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameters"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingModel"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
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
