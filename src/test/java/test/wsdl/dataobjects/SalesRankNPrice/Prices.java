/**
 * Prices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public class Prices  implements java.io.Serializable {
    private java.lang.String amazonPrice;

    private java.lang.String BNPrice;

    public Prices() {
    }

    public Prices(
           java.lang.String amazonPrice,
           java.lang.String BNPrice) {
           this.amazonPrice = amazonPrice;
           this.BNPrice = BNPrice;
    }


    /**
     * Gets the amazonPrice value for this Prices.
     * 
     * @return amazonPrice
     */
    public java.lang.String getAmazonPrice() {
        return amazonPrice;
    }


    /**
     * Sets the amazonPrice value for this Prices.
     * 
     * @param amazonPrice
     */
    public void setAmazonPrice(java.lang.String amazonPrice) {
        this.amazonPrice = amazonPrice;
    }


    /**
     * Gets the BNPrice value for this Prices.
     * 
     * @return BNPrice
     */
    public java.lang.String getBNPrice() {
        return BNPrice;
    }


    /**
     * Sets the BNPrice value for this Prices.
     * 
     * @param BNPrice
     */
    public void setBNPrice(java.lang.String BNPrice) {
        this.BNPrice = BNPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Prices)) return false;
        Prices other = (Prices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amazonPrice==null && other.getAmazonPrice()==null) || 
             (this.amazonPrice!=null &&
              this.amazonPrice.equals(other.getAmazonPrice()))) &&
            ((this.BNPrice==null && other.getBNPrice()==null) || 
             (this.BNPrice!=null &&
              this.BNPrice.equals(other.getBNPrice())));
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
        if (getAmazonPrice() != null) {
            _hashCode += getAmazonPrice().hashCode();
        }
        if (getBNPrice() != null) {
            _hashCode += getBNPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Prices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "Prices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amazonPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "AmazonPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "BNPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
