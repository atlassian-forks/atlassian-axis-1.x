/**
 * ChargeReservationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ChargeReservationResponse  extends test.wsdl.dataobjects.good.CSCommonResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSAmount reservedAmountLeft;

    private test.wsdl.dataobjects.good.CSQualifiedAmount chargedAmount;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    public ChargeReservationResponse() {
    }

    public ChargeReservationResponse(
           test.wsdl.dataobjects.good.CSResult result,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSText transactionId,
           test.wsdl.dataobjects.good.CSAmount reservedAmountLeft,
           test.wsdl.dataobjects.good.CSQualifiedAmount chargedAmount,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        super(
            result,
            additionalParameters,
            transactionId);
        this.reservedAmountLeft = reservedAmountLeft;
        this.chargedAmount = chargedAmount;
        this.requestNumber = requestNumber;
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the reservedAmountLeft value for this ChargeReservationResponse.
     * 
     * @return reservedAmountLeft
     */
    public test.wsdl.dataobjects.good.CSAmount getReservedAmountLeft() {
        return reservedAmountLeft;
    }


    /**
     * Sets the reservedAmountLeft value for this ChargeReservationResponse.
     * 
     * @param reservedAmountLeft
     */
    public void setReservedAmountLeft(test.wsdl.dataobjects.good.CSAmount reservedAmountLeft) {
        this.reservedAmountLeft = reservedAmountLeft;
    }


    /**
     * Gets the chargedAmount value for this ChargeReservationResponse.
     * 
     * @return chargedAmount
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getChargedAmount() {
        return chargedAmount;
    }


    /**
     * Sets the chargedAmount value for this ChargeReservationResponse.
     * 
     * @param chargedAmount
     */
    public void setChargedAmount(test.wsdl.dataobjects.good.CSQualifiedAmount chargedAmount) {
        this.chargedAmount = chargedAmount;
    }


    /**
     * Gets the requestNumber value for this ChargeReservationResponse.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ChargeReservationResponse.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the chargingSessionId value for this ChargeReservationResponse.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this ChargeReservationResponse.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeReservationResponse)) return false;
        ChargeReservationResponse other = (ChargeReservationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reservedAmountLeft==null && other.getReservedAmountLeft()==null) || 
             (this.reservedAmountLeft!=null &&
              this.reservedAmountLeft.equals(other.getReservedAmountLeft()))) &&
            ((this.chargedAmount==null && other.getChargedAmount()==null) || 
             (this.chargedAmount!=null &&
              this.chargedAmount.equals(other.getChargedAmount()))) &&
            ((this.requestNumber==null && other.getRequestNumber()==null) || 
             (this.requestNumber!=null &&
              this.requestNumber.equals(other.getRequestNumber()))) &&
            ((this.chargingSessionId==null && other.getChargingSessionId()==null) || 
             (this.chargingSessionId!=null &&
              this.chargingSessionId.equals(other.getChargingSessionId())));
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
        if (getReservedAmountLeft() != null) {
            _hashCode += getReservedAmountLeft().hashCode();
        }
        if (getChargedAmount() != null) {
            _hashCode += getChargedAmount().hashCode();
        }
        if (getRequestNumber() != null) {
            _hashCode += getRequestNumber().hashCode();
        }
        if (getChargingSessionId() != null) {
            _hashCode += getChargingSessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeReservationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedAmountLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservedAmountLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAmount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargedAmount"));
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
        elemField.setFieldName("chargingSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
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
