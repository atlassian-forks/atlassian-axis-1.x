/**
 * CSApplicationDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSApplicationDescription  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSText CSApplicationDescription;

    public CSApplicationDescription() {
    }

    public CSApplicationDescription(
           test.wsdl.dataobjects.good.CSText CSApplicationDescription) {
           this.CSApplicationDescription = CSApplicationDescription;
    }


    /**
     * Gets the CSApplicationDescription value for this CSApplicationDescription.
     * 
     * @return CSApplicationDescription
     */
    public test.wsdl.dataobjects.good.CSText getCSApplicationDescription() {
        return CSApplicationDescription;
    }


    /**
     * Sets the CSApplicationDescription value for this CSApplicationDescription.
     * 
     * @param CSApplicationDescription
     */
    public void setCSApplicationDescription(test.wsdl.dataobjects.good.CSText CSApplicationDescription) {
        this.CSApplicationDescription = CSApplicationDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSApplicationDescription)) return false;
        CSApplicationDescription other = (CSApplicationDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSApplicationDescription==null && other.getCSApplicationDescription()==null) || 
             (this.CSApplicationDescription!=null &&
              this.CSApplicationDescription.equals(other.getCSApplicationDescription())));
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
        if (getCSApplicationDescription() != null) {
            _hashCode += getCSApplicationDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSApplicationDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSApplicationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSApplicationDescription"));
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
