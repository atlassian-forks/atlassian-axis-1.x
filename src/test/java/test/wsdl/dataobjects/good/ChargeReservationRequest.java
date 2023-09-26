/**
 * ChargeReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ChargeReservationRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    private test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription;

    private test.wsdl.dataobjects.good.CSQualifiedAmount amount;

    private test.wsdl.dataobjects.good.CSTimeStamp chargeReservationTimeStamp;

    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSBoolean releaseIndicator;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSChargingParameters chargingParameters;

    public ChargeReservationRequest() {
    }

    public ChargeReservationRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId,
           test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription,
           test.wsdl.dataobjects.good.CSQualifiedAmount amount,
           test.wsdl.dataobjects.good.CSTimeStamp chargeReservationTimeStamp,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSBoolean releaseIndicator,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        super(
            transactionId,
            additionalParameters);
        this.chargingSessionId = chargingSessionId;
        this.applicationDescription = applicationDescription;
        this.amount = amount;
        this.chargeReservationTimeStamp = chargeReservationTimeStamp;
        this.applicationTicket = applicationTicket;
        this.releaseIndicator = releaseIndicator;
        this.requestNumber = requestNumber;
        this.chargingParameters = chargingParameters;
    }


    /**
     * Gets the chargingSessionId value for this ChargeReservationRequest.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this ChargeReservationRequest.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the applicationDescription value for this ChargeReservationRequest.
     * 
     * @return applicationDescription
     */
    public test.wsdl.dataobjects.good.CSApplicationDescription getApplicationDescription() {
        return applicationDescription;
    }


    /**
     * Sets the applicationDescription value for this ChargeReservationRequest.
     * 
     * @param applicationDescription
     */
    public void setApplicationDescription(test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription) {
        this.applicationDescription = applicationDescription;
    }


    /**
     * Gets the amount value for this ChargeReservationRequest.
     * 
     * @return amount
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ChargeReservationRequest.
     * 
     * @param amount
     */
    public void setAmount(test.wsdl.dataobjects.good.CSQualifiedAmount amount) {
        this.amount = amount;
    }


    /**
     * Gets the chargeReservationTimeStamp value for this ChargeReservationRequest.
     * 
     * @return chargeReservationTimeStamp
     */
    public test.wsdl.dataobjects.good.CSTimeStamp getChargeReservationTimeStamp() {
        return chargeReservationTimeStamp;
    }


    /**
     * Sets the chargeReservationTimeStamp value for this ChargeReservationRequest.
     * 
     * @param chargeReservationTimeStamp
     */
    public void setChargeReservationTimeStamp(test.wsdl.dataobjects.good.CSTimeStamp chargeReservationTimeStamp) {
        this.chargeReservationTimeStamp = chargeReservationTimeStamp;
    }


    /**
     * Gets the applicationTicket value for this ChargeReservationRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this ChargeReservationRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the releaseIndicator value for this ChargeReservationRequest.
     * 
     * @return releaseIndicator
     */
    public test.wsdl.dataobjects.good.CSBoolean getReleaseIndicator() {
        return releaseIndicator;
    }


    /**
     * Sets the releaseIndicator value for this ChargeReservationRequest.
     * 
     * @param releaseIndicator
     */
    public void setReleaseIndicator(test.wsdl.dataobjects.good.CSBoolean releaseIndicator) {
        this.releaseIndicator = releaseIndicator;
    }


    /**
     * Gets the requestNumber value for this ChargeReservationRequest.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ChargeReservationRequest.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the chargingParameters value for this ChargeReservationRequest.
     * 
     * @return chargingParameters
     */
    public test.wsdl.dataobjects.good.CSChargingParameters getChargingParameters() {
        return chargingParameters;
    }


    /**
     * Sets the chargingParameters value for this ChargeReservationRequest.
     * 
     * @param chargingParameters
     */
    public void setChargingParameters(test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        this.chargingParameters = chargingParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeReservationRequest)) return false;
        ChargeReservationRequest other = (ChargeReservationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chargingSessionId==null && other.getChargingSessionId()==null) || 
             (this.chargingSessionId!=null &&
              this.chargingSessionId.equals(other.getChargingSessionId()))) &&
            ((this.applicationDescription==null && other.getApplicationDescription()==null) || 
             (this.applicationDescription!=null &&
              this.applicationDescription.equals(other.getApplicationDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.chargeReservationTimeStamp==null && other.getChargeReservationTimeStamp()==null) || 
             (this.chargeReservationTimeStamp!=null &&
              this.chargeReservationTimeStamp.equals(other.getChargeReservationTimeStamp()))) &&
            ((this.applicationTicket==null && other.getApplicationTicket()==null) || 
             (this.applicationTicket!=null &&
              this.applicationTicket.equals(other.getApplicationTicket()))) &&
            ((this.releaseIndicator==null && other.getReleaseIndicator()==null) || 
             (this.releaseIndicator!=null &&
              this.releaseIndicator.equals(other.getReleaseIndicator()))) &&
            ((this.requestNumber==null && other.getRequestNumber()==null) || 
             (this.requestNumber!=null &&
              this.requestNumber.equals(other.getRequestNumber()))) &&
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
        if (getChargingSessionId() != null) {
            _hashCode += getChargingSessionId().hashCode();
        }
        if (getApplicationDescription() != null) {
            _hashCode += getApplicationDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getChargeReservationTimeStamp() != null) {
            _hashCode += getChargeReservationTimeStamp().hashCode();
        }
        if (getApplicationTicket() != null) {
            _hashCode += getApplicationTicket().hashCode();
        }
        if (getReleaseIndicator() != null) {
            _hashCode += getReleaseIndicator().hashCode();
        }
        if (getRequestNumber() != null) {
            _hashCode += getRequestNumber().hashCode();
        }
        if (getChargingParameters() != null) {
            _hashCode += getChargingParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeReservationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationDescription"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeReservationTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeReservationTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeStamp"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId"));
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
