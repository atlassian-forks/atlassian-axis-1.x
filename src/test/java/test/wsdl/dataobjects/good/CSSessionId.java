/**
 * CSSessionId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSSessionId  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText CSSessionId;

    public CSSessionId() {
    }

    public CSSessionId(
           test.wsdl.dataobjects.good.CSText CSSessionId) {
           this.CSSessionId = CSSessionId;
    }


    /**
     * Gets the CSSessionId value for this CSSessionId.
     * 
     * @return CSSessionId
     */
    public test.wsdl.dataobjects.good.CSText getCSSessionId() {
        return CSSessionId;
    }


    /**
     * Sets the CSSessionId value for this CSSessionId.
     * 
     * @param CSSessionId
     */
    public void setCSSessionId(test.wsdl.dataobjects.good.CSText CSSessionId) {
        this.CSSessionId = CSSessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSSessionId)) return false;
        CSSessionId other = (CSSessionId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSSessionId==null && other.getCSSessionId()==null) || 
             (this.CSSessionId!=null &&
              this.CSSessionId.equals(other.getCSSessionId())));
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
        if (getCSSessionId() != null) {
            _hashCode += getCSSessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSSessionId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSSessionId"));
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
