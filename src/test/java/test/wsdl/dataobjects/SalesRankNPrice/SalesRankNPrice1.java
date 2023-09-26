/**
 * SalesRankNPrice1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public class SalesRankNPrice1  implements java.io.Serializable {
    private java.lang.String salesRank;

    private java.lang.String price;

    public SalesRankNPrice1() {
    }

    public SalesRankNPrice1(
           java.lang.String salesRank,
           java.lang.String price) {
           this.salesRank = salesRank;
           this.price = price;
    }


    /**
     * Gets the salesRank value for this SalesRankNPrice1.
     * 
     * @return salesRank
     */
    public java.lang.String getSalesRank() {
        return salesRank;
    }


    /**
     * Sets the salesRank value for this SalesRankNPrice1.
     * 
     * @param salesRank
     */
    public void setSalesRank(java.lang.String salesRank) {
        this.salesRank = salesRank;
    }


    /**
     * Gets the price value for this SalesRankNPrice1.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this SalesRankNPrice1.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesRankNPrice1)) return false;
        SalesRankNPrice1 other = (SalesRankNPrice1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salesRank==null && other.getSalesRank()==null) || 
             (this.salesRank!=null &&
              this.salesRank.equals(other.getSalesRank()))) &&
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
        if (getSalesRank() != null) {
            _hashCode += getSalesRank().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesRankNPrice1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "SalesRankNPrice1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "SalesRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "Price"));
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
