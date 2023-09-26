/**
 * CSRequestId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSRequestId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSNonNegativeInteger CSRequestId;

    public CSRequestId() {
    }

    public CSRequestId(
           test.wsdl.dataobjects.good.CSNonNegativeInteger CSRequestId) {
           this.CSRequestId = CSRequestId;
    }


    /**
     * Gets the CSRequestId value for this CSRequestId.
     * 
     * @return CSRequestId
     */
    public test.wsdl.dataobjects.good.CSNonNegativeInteger getCSRequestId() {
        return CSRequestId;
    }


    /**
     * Sets the CSRequestId value for this CSRequestId.
     * 
     * @param CSRequestId
     */
    public void setCSRequestId(test.wsdl.dataobjects.good.CSNonNegativeInteger CSRequestId) {
        this.CSRequestId = CSRequestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSRequestId)) return false;
        CSRequestId other = (CSRequestId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSRequestId==null && other.getCSRequestId()==null) || 
             (this.CSRequestId!=null &&
              this.CSRequestId.equals(other.getCSRequestId())));
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
        if (getCSRequestId() != null) {
            _hashCode += getCSRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSRequestId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSNonNegativeInteger"));
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
