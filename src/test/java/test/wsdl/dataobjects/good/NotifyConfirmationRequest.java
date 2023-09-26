/**
 * NotifyConfirmationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class NotifyConfirmationRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSTimeStamp confirmationTimeStamp;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSBoolean confirmationNotification;

    private test.wsdl.dataobjects.good.CSPricingModel pricingModel;

    private test.wsdl.dataobjects.good.CSRequestId reservationRequestNumber;

    public NotifyConfirmationRequest() {
    }

    public NotifyConfirmationRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSTimeStamp confirmationTimeStamp,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSBoolean confirmationNotification,
           test.wsdl.dataobjects.good.CSPricingModel pricingModel,
           test.wsdl.dataobjects.good.CSRequestId reservationRequestNumber) {
        super(
            transactionId,
            additionalParameters);
        this.chargingSessionId = chargingSessionId;
        this.applicationTicket = applicationTicket;
        this.confirmationTimeStamp = confirmationTimeStamp;
        this.requestNumber = requestNumber;
        this.confirmationNotification = confirmationNotification;
        this.pricingModel = pricingModel;
        this.reservationRequestNumber = reservationRequestNumber;
    }


    /**
     * Gets the chargingSessionId value for this NotifyConfirmationRequest.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this NotifyConfirmationRequest.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the applicationTicket value for this NotifyConfirmationRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this NotifyConfirmationRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the confirmationTimeStamp value for this NotifyConfirmationRequest.
     * 
     * @return confirmationTimeStamp
     */
    public test.wsdl.dataobjects.good.CSTimeStamp getConfirmationTimeStamp() {
        return confirmationTimeStamp;
    }


    /**
     * Sets the confirmationTimeStamp value for this NotifyConfirmationRequest.
     * 
     * @param confirmationTimeStamp
     */
    public void setConfirmationTimeStamp(test.wsdl.dataobjects.good.CSTimeStamp confirmationTimeStamp) {
        this.confirmationTimeStamp = confirmationTimeStamp;
    }


    /**
     * Gets the requestNumber value for this NotifyConfirmationRequest.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this NotifyConfirmationRequest.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the confirmationNotification value for this NotifyConfirmationRequest.
     * 
     * @return confirmationNotification
     */
    public test.wsdl.dataobjects.good.CSBoolean getConfirmationNotification() {
        return confirmationNotification;
    }


    /**
     * Sets the confirmationNotification value for this NotifyConfirmationRequest.
     * 
     * @param confirmationNotification
     */
    public void setConfirmationNotification(test.wsdl.dataobjects.good.CSBoolean confirmationNotification) {
        this.confirmationNotification = confirmationNotification;
    }


    /**
     * Gets the pricingModel value for this NotifyConfirmationRequest.
     * 
     * @return pricingModel
     */
    public test.wsdl.dataobjects.good.CSPricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this NotifyConfirmationRequest.
     * 
     * @param pricingModel
     */
    public void setPricingModel(test.wsdl.dataobjects.good.CSPricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the reservationRequestNumber value for this NotifyConfirmationRequest.
     * 
     * @return reservationRequestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getReservationRequestNumber() {
        return reservationRequestNumber;
    }


    /**
     * Sets the reservationRequestNumber value for this NotifyConfirmationRequest.
     * 
     * @param reservationRequestNumber
     */
    public void setReservationRequestNumber(test.wsdl.dataobjects.good.CSRequestId reservationRequestNumber) {
        this.reservationRequestNumber = reservationRequestNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyConfirmationRequest)) return false;
        NotifyConfirmationRequest other = (NotifyConfirmationRequest) obj;
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
            ((this.applicationTicket==null && other.getApplicationTicket()==null) || 
             (this.applicationTicket!=null &&
              this.applicationTicket.equals(other.getApplicationTicket()))) &&
            ((this.confirmationTimeStamp==null && other.getConfirmationTimeStamp()==null) || 
             (this.confirmationTimeStamp!=null &&
              this.confirmationTimeStamp.equals(other.getConfirmationTimeStamp()))) &&
            ((this.requestNumber==null && other.getRequestNumber()==null) || 
             (this.requestNumber!=null &&
              this.requestNumber.equals(other.getRequestNumber()))) &&
            ((this.confirmationNotification==null && other.getConfirmationNotification()==null) || 
             (this.confirmationNotification!=null &&
              this.confirmationNotification.equals(other.getConfirmationNotification()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.reservationRequestNumber==null && other.getReservationRequestNumber()==null) || 
             (this.reservationRequestNumber!=null &&
              this.reservationRequestNumber.equals(other.getReservationRequestNumber())));
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
        if (getApplicationTicket() != null) {
            _hashCode += getApplicationTicket().hashCode();
        }
        if (getConfirmationTimeStamp() != null) {
            _hashCode += getConfirmationTimeStamp().hashCode();
        }
        if (getRequestNumber() != null) {
            _hashCode += getRequestNumber().hashCode();
        }
        if (getConfirmationNotification() != null) {
            _hashCode += getConfirmationNotification().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getReservationRequestNumber() != null) {
            _hashCode += getReservationRequestNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyConfirmationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "notifyConfirmationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmationTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeStamp"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmationNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingModel"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationRequestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservationRequestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId"));
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
