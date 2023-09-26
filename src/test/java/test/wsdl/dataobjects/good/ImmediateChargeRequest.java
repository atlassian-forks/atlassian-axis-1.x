/**
 * ImmediateChargeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ImmediateChargeRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSApplicationId applicationId;

    private test.wsdl.dataobjects.good.CSApplicationId aggregatorId;

    private test.wsdl.dataobjects.good.CSText credentials;

    private test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId;

    private test.wsdl.dataobjects.good.CSQualifiedAmount chargeAmount;

    private test.wsdl.dataobjects.good.CSText subscriberExternalIdType;

    private test.wsdl.dataobjects.good.CSChargingParameters chargingParameters;

    private test.wsdl.dataobjects.good.CSText reportSubscription;

    private test.wsdl.dataobjects.good.CSPricingModel pricingModel;

    public ImmediateChargeRequest() {
    }

    public ImmediateChargeRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSApplicationId applicationId,
           test.wsdl.dataobjects.good.CSApplicationId aggregatorId,
           test.wsdl.dataobjects.good.CSText credentials,
           test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId,
           test.wsdl.dataobjects.good.CSQualifiedAmount chargeAmount,
           test.wsdl.dataobjects.good.CSText subscriberExternalIdType,
           test.wsdl.dataobjects.good.CSChargingParameters chargingParameters,
           test.wsdl.dataobjects.good.CSText reportSubscription,
           test.wsdl.dataobjects.good.CSPricingModel pricingModel) {
        super(
            transactionId,
            additionalParameters);
        this.applicationId = applicationId;
        this.aggregatorId = aggregatorId;
        this.credentials = credentials;
        this.subscriberExternalId = subscriberExternalId;
        this.chargeAmount = chargeAmount;
        this.subscriberExternalIdType = subscriberExternalIdType;
        this.chargingParameters = chargingParameters;
        this.reportSubscription = reportSubscription;
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the applicationId value for this ImmediateChargeRequest.
     * 
     * @return applicationId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this ImmediateChargeRequest.
     * 
     * @param applicationId
     */
    public void setApplicationId(test.wsdl.dataobjects.good.CSApplicationId applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the aggregatorId value for this ImmediateChargeRequest.
     * 
     * @return aggregatorId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getAggregatorId() {
        return aggregatorId;
    }


    /**
     * Sets the aggregatorId value for this ImmediateChargeRequest.
     * 
     * @param aggregatorId
     */
    public void setAggregatorId(test.wsdl.dataobjects.good.CSApplicationId aggregatorId) {
        this.aggregatorId = aggregatorId;
    }


    /**
     * Gets the credentials value for this ImmediateChargeRequest.
     * 
     * @return credentials
     */
    public test.wsdl.dataobjects.good.CSText getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this ImmediateChargeRequest.
     * 
     * @param credentials
     */
    public void setCredentials(test.wsdl.dataobjects.good.CSText credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the subscriberExternalId value for this ImmediateChargeRequest.
     * 
     * @return subscriberExternalId
     */
    public test.wsdl.dataobjects.good.CSSubscriberExternalId getSubscriberExternalId() {
        return subscriberExternalId;
    }


    /**
     * Sets the subscriberExternalId value for this ImmediateChargeRequest.
     * 
     * @param subscriberExternalId
     */
    public void setSubscriberExternalId(test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberExternalId) {
        this.subscriberExternalId = subscriberExternalId;
    }


    /**
     * Gets the chargeAmount value for this ImmediateChargeRequest.
     * 
     * @return chargeAmount
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getChargeAmount() {
        return chargeAmount;
    }


    /**
     * Sets the chargeAmount value for this ImmediateChargeRequest.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(test.wsdl.dataobjects.good.CSQualifiedAmount chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Gets the subscriberExternalIdType value for this ImmediateChargeRequest.
     * 
     * @return subscriberExternalIdType
     */
    public test.wsdl.dataobjects.good.CSText getSubscriberExternalIdType() {
        return subscriberExternalIdType;
    }


    /**
     * Sets the subscriberExternalIdType value for this ImmediateChargeRequest.
     * 
     * @param subscriberExternalIdType
     */
    public void setSubscriberExternalIdType(test.wsdl.dataobjects.good.CSText subscriberExternalIdType) {
        this.subscriberExternalIdType = subscriberExternalIdType;
    }


    /**
     * Gets the chargingParameters value for this ImmediateChargeRequest.
     * 
     * @return chargingParameters
     */
    public test.wsdl.dataobjects.good.CSChargingParameters getChargingParameters() {
        return chargingParameters;
    }


    /**
     * Sets the chargingParameters value for this ImmediateChargeRequest.
     * 
     * @param chargingParameters
     */
    public void setChargingParameters(test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        this.chargingParameters = chargingParameters;
    }


    /**
     * Gets the reportSubscription value for this ImmediateChargeRequest.
     * 
     * @return reportSubscription
     */
    public test.wsdl.dataobjects.good.CSText getReportSubscription() {
        return reportSubscription;
    }


    /**
     * Sets the reportSubscription value for this ImmediateChargeRequest.
     * 
     * @param reportSubscription
     */
    public void setReportSubscription(test.wsdl.dataobjects.good.CSText reportSubscription) {
        this.reportSubscription = reportSubscription;
    }


    /**
     * Gets the pricingModel value for this ImmediateChargeRequest.
     * 
     * @return pricingModel
     */
    public test.wsdl.dataobjects.good.CSPricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this ImmediateChargeRequest.
     * 
     * @param pricingModel
     */
    public void setPricingModel(test.wsdl.dataobjects.good.CSPricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImmediateChargeRequest)) return false;
        ImmediateChargeRequest other = (ImmediateChargeRequest) obj;
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
            ((this.chargeAmount==null && other.getChargeAmount()==null) || 
             (this.chargeAmount!=null &&
              this.chargeAmount.equals(other.getChargeAmount()))) &&
            ((this.subscriberExternalIdType==null && other.getSubscriberExternalIdType()==null) || 
             (this.subscriberExternalIdType!=null &&
              this.subscriberExternalIdType.equals(other.getSubscriberExternalIdType()))) &&
            ((this.chargingParameters==null && other.getChargingParameters()==null) || 
             (this.chargingParameters!=null &&
              this.chargingParameters.equals(other.getChargingParameters()))) &&
            ((this.reportSubscription==null && other.getReportSubscription()==null) || 
             (this.reportSubscription!=null &&
              this.reportSubscription.equals(other.getReportSubscription()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel())));
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
        if (getChargeAmount() != null) {
            _hashCode += getChargeAmount().hashCode();
        }
        if (getSubscriberExternalIdType() != null) {
            _hashCode += getSubscriberExternalIdType().hashCode();
        }
        if (getChargingParameters() != null) {
            _hashCode += getChargingParameters().hashCode();
        }
        if (getReportSubscription() != null) {
            _hashCode += getReportSubscription().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImmediateChargeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "immediateChargeRequest"));
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
        elemField.setFieldName("chargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSubscription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSubscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingModel"));
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
