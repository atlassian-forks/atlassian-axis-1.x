/**
 * ArrayOfWarning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfWarning  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.Warning[] warning;

    public ArrayOfWarning() {
    }

    public ArrayOfWarning(
           test.wsdl.dataobjects.reportservice.Warning[] warning) {
           this.warning = warning;
    }


    /**
     * Gets the warning value for this ArrayOfWarning.
     * 
     * @return warning
     */
    public test.wsdl.dataobjects.reportservice.Warning[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this ArrayOfWarning.
     * 
     * @param warning
     */
    public void setWarning(test.wsdl.dataobjects.reportservice.Warning[] warning) {
        this.warning = warning;
    }

    public test.wsdl.dataobjects.reportservice.Warning getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, test.wsdl.dataobjects.reportservice.Warning _value) {
        this.warning[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWarning)) return false;
        ArrayOfWarning other = (ArrayOfWarning) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning())));
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
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfWarning.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfWarning"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Warning"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
