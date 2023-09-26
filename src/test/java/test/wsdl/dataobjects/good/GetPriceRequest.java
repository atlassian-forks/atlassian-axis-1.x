/**
 * GetPriceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class GetPriceRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSApplicationId applicationId;

    private test.wsdl.dataobjects.good.CSApplicationId aggregatorId;

    private test.wsdl.dataobjects.good.CSText credentials;

    private test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId;

    private test.wsdl.dataobjects.good.CSText subscriberExternalIdType;

    private test.wsdl.dataobjects.good.CSChargingParameters chargingParameters;

    public GetPriceRequest() {
    }

    public GetPriceRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSApplicationId applicationId,
           test.wsdl.dataobjects.good.CSApplicationId aggregatorId,
           test.wsdl.dataobjects.good.CSText credentials,
           test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId,
           test.wsdl.dataobjects.good.CSText subscriberExternalIdType,
           test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        super(
            transactionId,
            additionalParameters);
        this.applicationId = applicationId;
        this.aggregatorId = aggregatorId;
        this.credentials = credentials;
        this.subscriberExternalId = subscriberExternalId;
        this.subscriberExternalIdType = subscriberExternalIdType;
        this.chargingParameters = chargingParameters;
    }


    /**
     * Gets the applicationId value for this GetPriceRequest.
     * 
     * @return applicationId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this GetPriceRequest.
     * 
     * @param applicationId
     */
    public void setApplicationId(test.wsdl.dataobjects.good.CSApplicationId applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the aggregatorId value for this GetPriceRequest.
     * 
     * @return aggregatorId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getAggregatorId() {
        return aggregatorId;
    }


    /**
     * Sets the aggregatorId value for this GetPriceRequest.
     * 
     * @param aggregatorId
     */
    public void setAggregatorId(test.wsdl.dataobjects.good.CSApplicationId aggregatorId) {
        this.aggregatorId = aggregatorId;
    }


    /**
     * Gets the credentials value for this GetPriceRequest.
     * 
     * @return credentials
     */
    public test.wsdl.dataobjects.good.CSText getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetPriceRequest.
     * 
     * @param credentials
     */
    public void setCredentials(test.wsdl.dataobjects.good.CSText credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the subscriberExternalId value for this GetPriceRequest.
     * 
     * @return subscriberExternalId
     */
    public test.wsdl.dataobjects.good.CSSubscriberExternalId getSubscriberExternalId() {
        return subscriberExternalId;
    }


    /**
     * Sets the subscriberExternalId value for this GetPriceRequest.
     * 
     * @param subscriberExternalId
     */
    public void setSubscriberExternalId(test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId) {
        this.subscriberExternalId = subscriberExternalId;
    }


    /**
     * Gets the subscriberExternalIdType value for this GetPriceRequest.
     * 
     * @return subscriberExternalIdType
     */
    public test.wsdl.dataobjects.good.CSText getSubscriberExternalIdType() {
        return subscriberExternalIdType;
    }


    /**
     * Sets the subscriberExternalIdType value for this GetPriceRequest.
     * 
     * @param subscriberExternalIdType
     */
    public void setSubscriberExternalIdType(test.wsdl.dataobjects.good.CSText subscriberExternalIdType) {
        this.subscriberExternalIdType = subscriberExternalIdType;
    }


    /**
     * Gets the chargingParameters value for this GetPriceRequest.
     * 
     * @return chargingParameters
     */
    public test.wsdl.dataobjects.good.CSChargingParameters getChargingParameters() {
        return chargingParameters;
    }


    /**
     * Sets the chargingParameters value for this GetPriceRequest.
     * 
     * @param chargingParameters
     */
    public void setChargingParameters(test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        this.chargingParameters = chargingParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPriceRequest)) return false;
        GetPriceRequest other = (GetPriceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.aggregatorId==null && other.getAggregatorId()==null) || 
             (this.aggregatorId!=null &&
              this.aggregatorId.equals(other.getAggregatorId()))) &&
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.subscriberExternalId==null && other.getSubscriberExternalId()==null) || 
             (this.subscriberExternalId!=null &&
              this.subscriberExternalId.equals(other.getSubscriberExternalId()))) &&
            ((this.subscriberExternalIdType==null && other.getSubscriberExternalIdType()==null) || 
             (this.subscriberExternalIdType!=null &&
              this.subscriberExternalIdType.equals(other.getSubscriberExternalIdType()))) &&
            ((this.chargingParameters==null && other.getChargingParameters()==null) || 
             (this.chargingParameters!=null &&
              this.chargingParameters.equals(other.getChargingParameters())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getAggregatorId() != null) {
            _hashCode += getAggregatorId().hashCode();
        }
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getSubscriberExternalId() != null) {
            _hashCode += getSubscriberExternalId().hashCode();
        }
        if (getSubscriberExternalIdType() != null) {
            _hashCode += getSubscriberExternalIdType().hashCode();
        }
        if (getChargingParameters() != null) {
            _hashCode += getChargingParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPriceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aggregatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberExternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSubscriberExternalId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberExternalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberExternalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameters"));
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
