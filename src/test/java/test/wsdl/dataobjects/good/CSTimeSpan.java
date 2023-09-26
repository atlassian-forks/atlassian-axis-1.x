/**
 * CSTimeSpan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSTimeSpan  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSInteger CSTimeSpan;

    public CSTimeSpan() {
    }

    public CSTimeSpan(
           test.wsdl.dataobjects.good.CSInteger CSTimeSpan) {
           this.CSTimeSpan = CSTimeSpan;
    }


    /**
     * Gets the CSTimeSpan value for this CSTimeSpan.
     * 
     * @return CSTimeSpan
     */
    public test.wsdl.dataobjects.good.CSInteger getCSTimeSpan() {
        return CSTimeSpan;
    }


    /**
     * Sets the CSTimeSpan value for this CSTimeSpan.
     * 
     * @param CSTimeSpan
     */
    public void setCSTimeSpan(test.wsdl.dataobjects.good.CSInteger CSTimeSpan) {
        this.CSTimeSpan = CSTimeSpan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSTimeSpan)) return false;
        CSTimeSpan other = (CSTimeSpan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSTimeSpan==null && other.getCSTimeSpan()==null) || 
             (this.CSTimeSpan!=null &&
              this.CSTimeSpan.equals(other.getCSTimeSpan())));
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
        if (getCSTimeSpan() != null) {
            _hashCode += getCSTimeSpan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSTimeSpan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeSpan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSTimeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSTimeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger"));
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
