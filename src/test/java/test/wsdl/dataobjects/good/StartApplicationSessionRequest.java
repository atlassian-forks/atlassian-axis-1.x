/**
 * StartApplicationSessionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class StartApplicationSessionRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPassword password;

    private test.wsdl.dataobjects.good.CSApplicationId applicationId;

    public StartApplicationSessionRequest() {
    }

    public StartApplicationSessionRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSPassword password,
           test.wsdl.dataobjects.good.CSApplicationId applicationId) {
        super(
            transactionId,
            additionalParameters);
        this.password = password;
        this.applicationId = applicationId;
    }


    /**
     * Gets the password value for this StartApplicationSessionRequest.
     * 
     * @return password
     */
    public test.wsdl.dataobjects.good.CSPassword getPassword() {
        return password;
    }


    /**
     * Sets the password value for this StartApplicationSessionRequest.
     * 
     * @param password
     */
    public void setPassword(test.wsdl.dataobjects.good.CSPassword password) {
        this.password = password;
    }


    /**
     * Gets the applicationId value for this StartApplicationSessionRequest.
     * 
     * @return applicationId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this StartApplicationSessionRequest.
     * 
     * @param applicationId
     */
    public void setApplicationId(test.wsdl.dataobjects.good.CSApplicationId applicationId) {
        this.applicationId = applicationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StartApplicationSessionRequest)) return false;
        StartApplicationSessionRequest other = (StartApplicationSessionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StartApplicationSessionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "startApplicationSessionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPassword"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationId"));
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
