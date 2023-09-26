/**
 * FindBooksQueryExpressionElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTypes;

public class FindBooksQueryExpressionElement  implements java.io.Serializable {
    private test.wsdl.dataobjects.QueryTypes.BookType bookQuery;

    public FindBooksQueryExpressionElement() {
    }

    public FindBooksQueryExpressionElement(
           test.wsdl.dataobjects.QueryTypes.BookType bookQuery) {
           this.bookQuery = bookQuery;
    }


    /**
     * Gets the bookQuery value for this FindBooksQueryExpressionElement.
     * 
     * @return bookQuery
     */
    public test.wsdl.dataobjects.QueryTypes.BookType getBookQuery() {
        return bookQuery;
    }


    /**
     * Sets the bookQuery value for this FindBooksQueryExpressionElement.
     * 
     * @param bookQuery
     */
    public void setBookQuery(test.wsdl.dataobjects.QueryTypes.BookType bookQuery) {
        this.bookQuery = bookQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindBooksQueryExpressionElement)) return false;
        FindBooksQueryExpressionElement other = (FindBooksQueryExpressionElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookQuery==null && other.getBookQuery()==null) || 
             (this.bookQuery!=null &&
              this.bookQuery.equals(other.getBookQuery())));
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
        if (getBookQuery() != null) {
            _hashCode += getBookQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindBooksQueryExpressionElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:QueryTypes", ">FindBooksQueryExpressionElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:QueryTypes", "bookQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:QueryTypes", "BookType"));
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
