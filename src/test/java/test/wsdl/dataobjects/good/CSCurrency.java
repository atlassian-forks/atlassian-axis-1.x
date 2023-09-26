/**
 * CSCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSCurrency  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText currencySubCode;

    private test.wsdl.dataobjects.good.CSText currencyCode;

    public CSCurrency() {
    }

    public CSCurrency(
           test.wsdl.dataobjects.good.CSText currencySubCode,
           test.wsdl.dataobjects.good.CSText currencyCode) {
           this.currencySubCode = currencySubCode;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the currencySubCode value for this CSCurrency.
     * 
     * @return currencySubCode
     */
    public test.wsdl.dataobjects.good.CSText getCurrencySubCode() {
        return currencySubCode;
    }


    /**
     * Sets the currencySubCode value for this CSCurrency.
     * 
     * @param currencySubCode
     */
    public void setCurrencySubCode(test.wsdl.dataobjects.good.CSText currencySubCode) {
        this.currencySubCode = currencySubCode;
    }


    /**
     * Gets the currencyCode value for this CSCurrency.
     * 
     * @return currencyCode
     */
    public test.wsdl.dataobjects.good.CSText getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CSCurrency.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(test.wsdl.dataobjects.good.CSText currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCurrency)) return false;
        CSCurrency other = (CSCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencySubCode==null && other.getCurrencySubCode()==null) || 
             (this.currencySubCode!=null &&
              this.currencySubCode.equals(other.getCurrencySubCode()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getCurrencySubCode() != null) {
            _hashCode += getCurrencySubCode().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencySubCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencySubCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
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
