/**
 * ArrayOfParameterValueOrFieldReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfParameterValueOrFieldReference  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference[] parameterValueOrFieldReference;

    public ArrayOfParameterValueOrFieldReference() {
    }

    public ArrayOfParameterValueOrFieldReference(
           test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference[] parameterValueOrFieldReference) {
           this.parameterValueOrFieldReference = parameterValueOrFieldReference;
    }


    /**
     * Gets the parameterValueOrFieldReference value for this ArrayOfParameterValueOrFieldReference.
     * 
     * @return parameterValueOrFieldReference
     */
    public test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference[] getParameterValueOrFieldReference() {
        return parameterValueOrFieldReference;
    }


    /**
     * Sets the parameterValueOrFieldReference value for this ArrayOfParameterValueOrFieldReference.
     * 
     * @param parameterValueOrFieldReference
     */
    public void setParameterValueOrFieldReference(test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference[] parameterValueOrFieldReference) {
        this.parameterValueOrFieldReference = parameterValueOrFieldReference;
    }

    public test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference getParameterValueOrFieldReference(int i) {
        return this.parameterValueOrFieldReference[i];
    }

    public void setParameterValueOrFieldReference(int i, test.wsdl.dataobjects.reportservice.ParameterValueOrFieldReference _value) {
        this.parameterValueOrFieldReference[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfParameterValueOrFieldReference)) return false;
        ArrayOfParameterValueOrFieldReference other = (ArrayOfParameterValueOrFieldReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterValueOrFieldReference==null && other.getParameterValueOrFieldReference()==null) || 
             (this.parameterValueOrFieldReference!=null &&
              java.util.Arrays.equals(this.parameterValueOrFieldReference, other.getParameterValueOrFieldReference())));
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
        if (getParameterValueOrFieldReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterValueOrFieldReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterValueOrFieldReference(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfParameterValueOrFieldReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfParameterValueOrFieldReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValueOrFieldReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValueOrFieldReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ParameterValueOrFieldReference"));
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
