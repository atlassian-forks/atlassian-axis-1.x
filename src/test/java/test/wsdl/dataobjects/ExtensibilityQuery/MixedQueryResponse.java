/**
 * MixedQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ExtensibilityQuery;

public class MixedQueryResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityType queryResult;

    public MixedQueryResponse() {
    }

    public MixedQueryResponse(
           test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityType queryResult) {
           this.queryResult = queryResult;
    }


    /**
     * Gets the queryResult value for this MixedQueryResponse.
     * 
     * @return queryResult
     */
    public test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityType getQueryResult() {
        return queryResult;
    }


    /**
     * Sets the queryResult value for this MixedQueryResponse.
     * 
     * @param queryResult
     */
    public void setQueryResult(test.wsdl.dataobjects.ExtensibilityQuery.ExtensibilityType queryResult) {
        this.queryResult = queryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MixedQueryResponse)) return false;
        MixedQueryResponse other = (MixedQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryResult==null && other.getQueryResult()==null) || 
             (this.queryResult!=null &&
              this.queryResult.equals(other.getQueryResult())));
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
        if (getQueryResult() != null) {
            _hashCode += getQueryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MixedQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ExtensibilityQuery", ">mixedQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ExtensibilityQuery", "queryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ExtensibilityQuery", "ExtensibilityType"));
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