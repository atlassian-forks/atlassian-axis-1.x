/**
 * ArrayOfExtensionParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfExtensionParameter  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ExtensionParameter[] extensionParameter;

    public ArrayOfExtensionParameter() {
    }

    public ArrayOfExtensionParameter(
           test.wsdl.dataobjects.reportservice.ExtensionParameter[] extensionParameter) {
           this.extensionParameter = extensionParameter;
    }


    /**
     * Gets the extensionParameter value for this ArrayOfExtensionParameter.
     * 
     * @return extensionParameter
     */
    public test.wsdl.dataobjects.reportservice.ExtensionParameter[] getExtensionParameter() {
        return extensionParameter;
    }


    /**
     * Sets the extensionParameter value for this ArrayOfExtensionParameter.
     * 
     * @param extensionParameter
     */
    public void setExtensionParameter(test.wsdl.dataobjects.reportservice.ExtensionParameter[] extensionParameter) {
        this.extensionParameter = extensionParameter;
    }

    public test.wsdl.dataobjects.reportservice.ExtensionParameter getExtensionParameter(int i) {
        return this.extensionParameter[i];
    }

    public void setExtensionParameter(int i, test.wsdl.dataobjects.reportservice.ExtensionParameter _value) {
        this.extensionParameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtensionParameter)) return false;
        ArrayOfExtensionParameter other = (ArrayOfExtensionParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionParameter==null && other.getExtensionParameter()==null) || 
             (this.extensionParameter!=null &&
              java.util.Arrays.equals(this.extensionParameter, other.getExtensionParameter())));
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
        if (getExtensionParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtensionParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfExtensionParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ExtensionParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ExtensionParameter"));
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
