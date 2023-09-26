/**
 * CSChargingParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSChargingParameters  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSChargingParameter[] chargingParameter;

    public CSChargingParameters() {
    }

    public CSChargingParameters(
           test.wsdl.dataobjects.good.CSChargingParameter[] chargingParameter) {
           this.chargingParameter = chargingParameter;
    }


    /**
     * Gets the chargingParameter value for this CSChargingParameters.
     * 
     * @return chargingParameter
     */
    public test.wsdl.dataobjects.good.CSChargingParameter[] getChargingParameter() {
        return chargingParameter;
    }


    /**
     * Sets the chargingParameter value for this CSChargingParameters.
     * 
     * @param chargingParameter
     */
    public void setChargingParameter(test.wsdl.dataobjects.good.CSChargingParameter[] chargingParameter) {
        this.chargingParameter = chargingParameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSChargingParameters)) return false;
        CSChargingParameters other = (CSChargingParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargingParameter==null && other.getChargingParameter()==null) || 
             (this.chargingParameter!=null &&
              java.util.Arrays.equals(this.chargingParameter, other.getChargingParameter())));
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
        if (getChargingParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargingParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargingParameter(), i);
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
        new org.apache.axis.description.TypeDesc(CSChargingParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameter"));
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
