/**
 * ReserveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ReserveRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSAmount minimumAmount;

    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    private test.wsdl.dataobjects.good.CSBoolean rateIndicator;

    private test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription;

    private test.wsdl.dataobjects.good.CSTimeStamp reservationTimeStamp;

    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSQualifiedAmount preferredAmount;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSChargingParameters chargingParameters;

    public ReserveRequest() {
    }

    public ReserveRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSAmount minimumAmount,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId,
           test.wsdl.dataobjects.good.CSBoolean rateIndicator,
           test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription,
           test.wsdl.dataobjects.good.CSTimeStamp reservationTimeStamp,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSQualifiedAmount preferredAmount,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        super(
            transactionId,
            additionalParameters);
        this.minimumAmount = minimumAmount;
        this.chargingSessionId = chargingSessionId;
        this.rateIndicator = rateIndicator;
        this.applicationDescription = applicationDescription;
        this.reservationTimeStamp = reservationTimeStamp;
        this.applicationTicket = applicationTicket;
        this.preferredAmount = preferredAmount;
        this.requestNumber = requestNumber;
        this.chargingParameters = chargingParameters;
    }


    /**
     * Gets the minimumAmount value for this ReserveRequest.
     * 
     * @return minimumAmount
     */
    public test.wsdl.dataobjects.good.CSAmount getMinimumAmount() {
        return minimumAmount;
    }


    /**
     * Sets the minimumAmount value for this ReserveRequest.
     * 
     * @param minimumAmount
     */
    public void setMinimumAmount(test.wsdl.dataobjects.good.CSAmount minimumAmount) {
        this.minimumAmount = minimumAmount;
    }


    /**
     * Gets the chargingSessionId value for this ReserveRequest.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this ReserveRequest.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the rateIndicator value for this ReserveRequest.
     * 
     * @return rateIndicator
     */
    public test.wsdl.dataobjects.good.CSBoolean getRateIndicator() {
        return rateIndicator;
    }


    /**
     * Sets the rateIndicator value for this ReserveRequest.
     * 
     * @param rateIndicator
     */
    public void setRateIndicator(test.wsdl.dataobjects.good.CSBoolean rateIndicator) {
        this.rateIndicator = rateIndicator;
    }


    /**
     * Gets the applicationDescription value for this ReserveRequest.
     * 
     * @return applicationDescription
     */
    public test.wsdl.dataobjects.good.CSApplicationDescription getApplicationDescription() {
        return applicationDescription;
    }


    /**
     * Sets the applicationDescription value for this ReserveRequest.
     * 
     * @param applicationDescription
     */
    public void setApplicationDescription(test.wsdl.dataobjects.good.CSApplicationDescription applicationDescription) {
        this.applicationDescription = applicationDescription;
    }


    /**
     * Gets the reservationTimeStamp value for this ReserveRequest.
     * 
     * @return reservationTimeStamp
     */
    public test.wsdl.dataobjects.good.CSTimeStamp getReservationTimeStamp() {
        return reservationTimeStamp;
    }


    /**
     * Sets the reservationTimeStamp value for this ReserveRequest.
     * 
     * @param reservationTimeStamp
     */
    public void setReservationTimeStamp(test.wsdl.dataobjects.good.CSTimeStamp reservationTimeStamp) {
        this.reservationTimeStamp = reservationTimeStamp;
    }


    /**
     * Gets the applicationTicket value for this ReserveRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this ReserveRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the preferredAmount value for this ReserveRequest.
     * 
     * @return preferredAmount
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getPreferredAmount() {
        return preferredAmount;
    }


    /**
     * Sets the preferredAmount value for this ReserveRequest.
     * 
     * @param preferredAmount
     */
    public void setPreferredAmount(test.wsdl.dataobjects.good.CSQualifiedAmount preferredAmount) {
        this.preferredAmount = preferredAmount;
    }


    /**
     * Gets the requestNumber value for this ReserveRequest.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ReserveRequest.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the chargingParameters value for this ReserveRequest.
     * 
     * @return chargingParameters
     */
    public test.wsdl.dataobjects.good.CSChargingParameters getChargingParameters() {
        return chargingParameters;
    }


    /**
     * Sets the chargingParameters value for this ReserveRequest.
     * 
     * @param chargingParameters
     */
    public void setChargingParameters(test.wsdl.dataobjects.good.CSChargingParameters chargingParameters) {
        this.chargingParameters = chargingParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReserveRequest)) return false;
        ReserveRequest other = (ReserveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.minimumAmount==null && other.getMinimumAmount()==null) || 
             (this.minimumAmount!=null &&
              this.minimumAmount.equals(other.getMinimumAmount()))) &&
            ((this.chargingSessionId==null && other.getChargingSessionId()==null) || 
             (this.chargingSessionId!=null &&
              this.chargingSessionId.equals(other.getChargingSessionId()))) &&
            ((this.rateIndicator==null && other.getRateIndicator()==null) || 
             (this.rateIndicator!=null &&
              this.rateIndicator.equals(other.getRateIndicator()))) &&
            ((this.applicationDescription==null && other.getApplicationDescription()==null) || 
             (this.applicationDescription!=null &&
              this.applicationDescription.equals(other.getApplicationDescription()))) &&
            ((this.reservationTimeStamp==null && other.getReservationTimeStamp()==null) || 
             (this.reservationTimeStamp!=null &&
              this.reservationTimeStamp.equals(other.getReservationTimeStamp()))) &&
            ((this.applicationTicket==null && other.getApplicationTicket()==null) || 
             (this.applicationTicket!=null &&
              this.applicationTicket.equals(other.getApplicationTicket()))) &&
            ((this.preferredAmount==null && other.getPreferredAmount()==null) || 
             (this.preferredAmount!=null &&
              this.preferredAmount.equals(other.getPreferredAmount()))) &&
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
        if (getMinimumAmount() != null) {
            _hashCode += getMinimumAmount().hashCode();
        }
        if (getChargingSessionId() != null) {
            _hashCode += getChargingSessionId().hashCode();
        }
        if (getRateIndicator() != null) {
            _hashCode += getRateIndicator().hashCode();
        }
        if (getApplicationDescription() != null) {
            _hashCode += getApplicationDescription().hashCode();
        }
        if (getReservationTimeStamp() != null) {
            _hashCode += getReservationTimeStamp().hashCode();
        }
        if (getApplicationTicket() != null) {
            _hashCode += getApplicationTicket().hashCode();
        }
        if (getPreferredAmount() != null) {
            _hashCode += getPreferredAmount().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReserveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "reserveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAmount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationDescription"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationTimeStamp"));
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
        elemField.setFieldName("preferredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
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
