/**
 * ComplexWComplex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class ComplexWComplex  implements java.io.Serializable {
    private test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplexStock_quote stock_quote;

    private int outside;

    public ComplexWComplex() {
    }

    public ComplexWComplex(
           test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplexStock_quote stock_quote,
           int outside) {
           this.stock_quote = stock_quote;
           this.outside = outside;
    }


    /**
     * Gets the stock_quote value for this ComplexWComplex.
     * 
     * @return stock_quote
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplexStock_quote getStock_quote() {
        return stock_quote;
    }


    /**
     * Sets the stock_quote value for this ComplexWComplex.
     * 
     * @param stock_quote
     */
    public void setStock_quote(test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplexStock_quote stock_quote) {
        this.stock_quote = stock_quote;
    }


    /**
     * Gets the outside value for this ComplexWComplex.
     * 
     * @return outside
     */
    public int getOutside() {
        return outside;
    }


    /**
     * Sets the outside value for this ComplexWComplex.
     * 
     * @param outside
     */
    public void setOutside(int outside) {
        this.outside = outside;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexWComplex)) return false;
        ComplexWComplex other = (ComplexWComplex) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stock_quote==null && other.getStock_quote()==null) || 
             (this.stock_quote!=null &&
              this.stock_quote.equals(other.getStock_quote()))) &&
            this.outside == other.getOutside();
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
        if (getStock_quote() != null) {
            _hashCode += getStock_quote().hashCode();
        }
        _hashCode += getOutside();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexWComplex.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock_quote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stock_quote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", ">complexWComplex>stock_quote"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outside");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
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
