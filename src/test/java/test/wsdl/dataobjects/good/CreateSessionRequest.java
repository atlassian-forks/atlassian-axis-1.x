/**
 * CreateSessionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CreateSessionRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSApplicationId applicationId;

    private test.wsdl.dataobjects.good.CSApplicationId aggregatorId;

    private test.wsdl.dataobjects.good.CSPartnerAccountExternalId partnerAccountId;

    private test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription;

    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSCorrelationId correlationId;

    private test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberId;

    private test.wsdl.dataobjects.good.CSText subscriberIdType;

    public CreateSessionRequest() {
    }

    public CreateSessionRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSApplicationId applicationId,
           test.wsdl.dataobjects.good.CSApplicationId aggregatorId,
           test.wsdl.dataobjects.good.CSPartnerAccountExternalId partnerAccountId,
           test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSCorrelationId correlationId,
           test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberId,
           test.wsdl.dataobjects.good.CSText subscriberIdType) {
        super(
            transactionId,
            additionalParameters);
        this.applicationId = applicationId;
        this.aggregatorId = aggregatorId;
        this.partnerAccountId = partnerAccountId;
        this.applicationDescription = applicationDescription;
        this.applicationTicket = applicationTicket;
        this.correlationId = correlationId;
        this.subscriberId = subscriberId;
        this.subscriberIdType = subscriberIdType;
    }


    /**
     * Gets the applicationId value for this CreateSessionRequest.
     * 
     * @return applicationId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this CreateSessionRequest.
     * 
     * @param applicationId
     */
    public void setApplicationId(test.wsdl.dataobjects.good.CSApplicationId applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the aggregatorId value for this CreateSessionRequest.
     * 
     * @return aggregatorId
     */
    public test.wsdl.dataobjects.good.CSApplicationId getAggregatorId() {
        return aggregatorId;
    }


    /**
     * Sets the aggregatorId value for this CreateSessionRequest.
     * 
     * @param aggregatorId
     */
    public void setAggregatorId(test.wsdl.dataobjects.good.CSApplicationId aggregatorId) {
        this.aggregatorId = aggregatorId;
    }


    /**
     * Gets the partnerAccountId value for this CreateSessionRequest.
     * 
     * @return partnerAccountId
     */
    public test.wsdl.dataobjects.good.CSPartnerAccountExternalId getPartnerAccountId() {
        return partnerAccountId;
    }


    /**
     * Sets the partnerAccountId value for this CreateSessionRequest.
     * 
     * @param partnerAccountId
     */
    public void setPartnerAccountId(test.wsdl.dataobjects.good.CSPartnerAccountExternalId partnerAccountId) {
        this.partnerAccountId = partnerAccountId;
    }


    /**
     * Gets the applicationDescription value for this CreateSessionRequest.
     * 
     * @return applicationDescription
     */
    public test.wsdl.dataobjects.good.CSApplicationDescription getApplicationDescription() {
        return applicationDescription;
    }


    /**
     * Sets the applicationDescription value for this CreateSessionRequest.
     * 
     * @param applicationDescription
     */
    public void setApplicationDescription(test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription) {
        this.applicationDescription = applicationDescription;
    }


    /**
     * Gets the applicationTicket value for this CreateSessionRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this CreateSessionRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the correlationId value for this CreateSessionRequest.
     * 
     * @return correlationId
     */
    public test.wsdl.dataobjects.good.CSCorrelationId getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this CreateSessionRequest.
     * 
     * @param correlationId
     */
    public void setCorrelationId(test.wsdl.dataobjects.good.CSCorrelationId correlationId) {
        this.correlationId = correlationId;
    }


    /**
     * Gets the subscriberId value for this CreateSessionRequest.
     * 
     * @return subscriberId
     */
    public test.wsdl.dataobjects.good.CSSubscriberExternalId getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this CreateSessionRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(test.wsdl.dataobjects.good.CSSubscriberExternalId subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the subscriberIdType value for this CreateSessionRequest.
     * 
     * @return subscriberIdType
     */
    public test.wsdl.dataobjects.good.CSText getSubscriberIdType() {
        return subscriberIdType;
    }


    /**
     * Sets the subscriberIdType value for this CreateSessionRequest.
     * 
     * @param subscriberIdType
     */
    public void setSubscriberIdType(test.wsdl.dataobjects.good.CSText subscriberIdType) {
        this.subscriberIdType = subscriberIdType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSessionRequest)) return false;
        CreateSessionRequest other = (CreateSessionRequest) obj;
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
            ((this.partnerAccountId==null && other.getPartnerAccountId()==null) || 
             (this.partnerAccountId!=null &&
              this.partnerAccountId.equals(other.getPartnerAccountId()))) &&
            ((this.applicationDescription==null && other.getApplicationDescription()==null) || 
             (this.applicationDescription!=null &&
              this.applicationDescription.equals(other.getApplicationDescription()))) &&
            ((this.applicationTicket==null && other.getApplicationTicket()==null) || 
             (this.applicationTicket!=null &&
              this.applicationTicket.equals(other.getApplicationTicket()))) &&
            ((this.correlationId==null && other.getCorrelationId()==null) || 
             (this.correlationId!=null &&
              this.correlationId.equals(other.getCorrelationId()))) &&
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.subscriberIdType==null && other.getSubscriberIdType()==null) || 
             (this.subscriberIdType!=null &&
              this.subscriberIdType.equals(other.getSubscriberIdType())));
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
        if (getPartnerAccountId() != null) {
            _hashCode += getPartnerAccountId().hashCode();
        }
        if (getApplicationDescription() != null) {
            _hashCode += getApplicationDescription().hashCode();
        }
        if (getApplicationTicket() != null) {
            _hashCode += getApplicationTicket().hashCode();
        }
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getSubscriberIdType() != null) {
            _hashCode += getSubscriberIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSessionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "createSessionRequest"));
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
        elemField.setFieldName("partnerAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerAccountExternalId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationDescription"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correlationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCorrelationId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSubscriberExternalId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberIdType"));
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
