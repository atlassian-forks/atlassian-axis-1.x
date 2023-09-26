/**
 * CSQualifiedAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSQualifiedAmount  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSCurrency currency;

    private test.wsdl.dataobjects.good.CSTimeStamp timeStamp;

    private test.wsdl.dataobjects.good.CSAmount amount;

    public CSQualifiedAmount() {
    }

    public CSQualifiedAmount(
           test.wsdl.dataobjects.good.CSCurrency currency,
           test.wsdl.dataobjects.good.CSTimeStamp timeStamp,
           test.wsdl.dataobjects.good.CSAmount amount) {
           this.currency = currency;
           this.timeStamp = timeStamp;
           this.amount = amount;
    }


    /**
     * Gets the currency value for this CSQualifiedAmount.
     * 
     * @return currency
     */
    public test.wsdl.dataobjects.good.CSCurrency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CSQualifiedAmount.
     * 
     * @param currency
     */
    public void setCurrency(test.wsdl.dataobjects.good.CSCurrency currency) {
        this.currency = currency;
    }


    /**
     * Gets the timeStamp value for this CSQualifiedAmount.
     * 
     * @return timeStamp
     */
    public test.wsdl.dataobjects.good.CSTimeStamp getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this CSQualifiedAmount.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(test.wsdl.dataobjects.good.CSTimeStamp timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the amount value for this CSQualifiedAmount.
     * 
     * @return amount
     */
    public test.wsdl.dataobjects.good.CSAmount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CSQualifiedAmount.
     * 
     * @param amount
     */
    public void setAmount(test.wsdl.dataobjects.good.CSAmount amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSQualifiedAmount)) return false;
        CSQualifiedAmount other = (CSQualifiedAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSQualifiedAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCurrency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeStamp"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAmount"));
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
