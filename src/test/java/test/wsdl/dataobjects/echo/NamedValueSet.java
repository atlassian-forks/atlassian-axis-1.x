/**
 * NamedValueSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class NamedValueSet  implements java.io.Serializable {
    private test.wsdl.dataobjects.echo.ArrayOfNamedValue namedValues;

    public NamedValueSet() {
    }

    public NamedValueSet(
           test.wsdl.dataobjects.echo.ArrayOfNamedValue namedValues) {
           this.namedValues = namedValues;
    }


    /**
     * Gets the namedValues value for this NamedValueSet.
     * 
     * @return namedValues
     */
    public test.wsdl.dataobjects.echo.ArrayOfNamedValue getNamedValues() {
        return namedValues;
    }


    /**
     * Sets the namedValues value for this NamedValueSet.
     * 
     * @param namedValues
     */
    public void setNamedValues(test.wsdl.dataobjects.echo.ArrayOfNamedValue namedValues) {
        this.namedValues = namedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NamedValueSet)) return false;
        NamedValueSet other = (NamedValueSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namedValues==null && other.getNamedValues()==null) || 
             (this.namedValues!=null &&
              this.namedValues.equals(other.getNamedValues())));
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
        if (getNamedValues() != null) {
            _hashCode += getNamedValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NamedValueSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "NamedValueSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "namedValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "ArrayOfNamedValue"));
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
