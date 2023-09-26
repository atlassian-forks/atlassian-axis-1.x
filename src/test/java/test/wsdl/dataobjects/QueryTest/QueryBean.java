/**
 * QueryBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.QueryTest;

public class QueryBean  implements java.io.Serializable {
    private test.wsdl.dataobjects.QueryTest.ArrayOf_xsd_string columnList;

    private test.wsdl.dataobjects.QueryTest.ArrayOfArrayOf_xsd_anyType data;

    public QueryBean() {
    }

    public QueryBean(
           test.wsdl.dataobjects.QueryTest.ArrayOf_xsd_string columnList,
           test.wsdl.dataobjects.QueryTest.ArrayOfArrayOf_xsd_anyType data) {
           this.columnList = columnList;
           this.data = data;
    }


    /**
     * Gets the columnList value for this QueryBean.
     * 
     * @return columnList
     */
    public test.wsdl.dataobjects.QueryTest.ArrayOf_xsd_string getColumnList() {
        return columnList;
    }


    /**
     * Sets the columnList value for this QueryBean.
     * 
     * @param columnList
     */
    public void setColumnList(test.wsdl.dataobjects.QueryTest.ArrayOf_xsd_string columnList) {
        this.columnList = columnList;
    }


    /**
     * Gets the data value for this QueryBean.
     * 
     * @return data
     */
    public test.wsdl.dataobjects.QueryTest.ArrayOfArrayOf_xsd_anyType getData() {
        return data;
    }


    /**
     * Sets the data value for this QueryBean.
     * 
     * @param data
     */
    public void setData(test.wsdl.dataobjects.QueryTest.ArrayOfArrayOf_xsd_anyType data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBean)) return false;
        QueryBean other = (QueryBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnList==null && other.getColumnList()==null) || 
             (this.columnList!=null &&
              this.columnList.equals(other.getColumnList()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getColumnList() != null) {
            _hashCode += getColumnList().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rpc.xml.coldfusion", "QueryBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rpc.xml.coldfusion", "columnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", "ArrayOf_xsd_string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rpc.xml.coldfusion", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:QueryTest", "ArrayOfArrayOf_xsd_anyType"));
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
