/**
 * CSCommonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSCommonRequest  extends test.wsdl.dataobjects.good.CSRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters;

    public CSCommonRequest() {
    }

    public CSCommonRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters) {
        super(
            transactionId);
        this.additionalParameters = additionalParameters;
    }


    /**
     * Gets the additionalParameters value for this CSCommonRequest.
     * 
     * @return additionalParameters
     */
    public test.wsdl.dataobjects.good.CSAdditionalParameters getAdditionalParameters() {
        return additionalParameters;
    }


    /**
     * Sets the additionalParameters value for this CSCommonRequest.
     * 
     * @param additionalParameters
     */
    public void setAdditionalParameters(test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCommonRequest)) return false;
        CSCommonRequest other = (CSCommonRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalParameters==null && other.getAdditionalParameters()==null) || 
             (this.additionalParameters!=null &&
              this.additionalParameters.equals(other.getAdditionalParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdditionalParameters() != null) {
            _hashCode += getAdditionalParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSCommonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSCommonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameters"));
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
