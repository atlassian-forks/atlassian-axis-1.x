/**
 * SalesRanks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public class SalesRanks  implements java.io.Serializable {
    private java.lang.String amazonSalesRank;

    private java.lang.String BNSalesRank;

    public SalesRanks() {
    }

    public SalesRanks(
           java.lang.String amazonSalesRank,
           java.lang.String BNSalesRank) {
           this.amazonSalesRank = amazonSalesRank;
           this.BNSalesRank = BNSalesRank;
    }


    /**
     * Gets the amazonSalesRank value for this SalesRanks.
     * 
     * @return amazonSalesRank
     */
    public java.lang.String getAmazonSalesRank() {
        return amazonSalesRank;
    }


    /**
     * Sets the amazonSalesRank value for this SalesRanks.
     * 
     * @param amazonSalesRank
     */
    public void setAmazonSalesRank(java.lang.String amazonSalesRank) {
        this.amazonSalesRank = amazonSalesRank;
    }


    /**
     * Gets the BNSalesRank value for this SalesRanks.
     * 
     * @return BNSalesRank
     */
    public java.lang.String getBNSalesRank() {
        return BNSalesRank;
    }


    /**
     * Sets the BNSalesRank value for this SalesRanks.
     * 
     * @param BNSalesRank
     */
    public void setBNSalesRank(java.lang.String BNSalesRank) {
        this.BNSalesRank = BNSalesRank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesRanks)) return false;
        SalesRanks other = (SalesRanks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amazonSalesRank==null && other.getAmazonSalesRank()==null) || 
             (this.amazonSalesRank!=null &&
              this.amazonSalesRank.equals(other.getAmazonSalesRank()))) &&
            ((this.BNSalesRank==null && other.getBNSalesRank()==null) || 
             (this.BNSalesRank!=null &&
              this.BNSalesRank.equals(other.getBNSalesRank())));
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
        if (getAmazonSalesRank() != null) {
            _hashCode += getAmazonSalesRank().hashCode();
        }
        if (getBNSalesRank() != null) {
            _hashCode += getBNSalesRank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesRanks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "SalesRanks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amazonSalesRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "AmazonSalesRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNSalesRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.PerfectXML.com/NETWebSvcs/BookService", "BNSalesRank"));
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
