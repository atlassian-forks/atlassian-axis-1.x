/**
 * CSCommonResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSCommonResponse  extends test.wsdl.dataobjects.good.CSResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSResult result;

    private test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters;

    private test.wsdl.dataobjects.good.CSText transactionId;

    public CSCommonResponse() {
    }

    public CSCommonResponse(
           test.wsdl.dataobjects.good.CSResult result,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSText transactionId) {
        this.result = result;
        this.additionalParameters = additionalParameters;
        this.transactionId = transactionId;
    }


    /**
     * Gets the result value for this CSCommonResponse.
     * 
     * @return result
     */
    public test.wsdl.dataobjects.good.CSResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this CSCommonResponse.
     * 
     * @param result
     */
    public void setResult(test.wsdl.dataobjects.good.CSResult result) {
        this.result = result;
    }


    /**
     * Gets the additionalParameters value for this CSCommonResponse.
     * 
     * @return additionalParameters
     */
    public test.wsdl.dataobjects.good.CSAdditionalParameters getAdditionalParameters() {
        return additionalParameters;
    }


    /**
     * Sets the additionalParameters value for this CSCommonResponse.
     * 
     * @param additionalParameters
     */
    public void setAdditionalParameters(test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters) {
        this.additionalParameters = additionalParameters;
    }


    /**
     * Gets the transactionId value for this CSCommonResponse.
     * 
     * @return transactionId
     */
    public test.wsdl.dataobjects.good.CSText getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CSCommonResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(test.wsdl.dataobjects.good.CSText transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCommonResponse)) return false;
        CSCommonResponse other = (CSCommonResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.additionalParameters==null && other.getAdditionalParameters()==null) || 
             (this.additionalParameters!=null &&
              this.additionalParameters.equals(other.getAdditionalParameters()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getAdditionalParameters() != null) {
            _hashCode += getAdditionalParameters().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSCommonResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSCommonResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResult"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameters"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
