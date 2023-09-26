/**
 * ReserveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ReserveResponse  extends test.wsdl.dataobjects.good.CSCommonResponse  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSPricingOptions pricingOptions;

    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    private test.wsdl.dataobjects.good.CSTimeSpan timeLeft;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSQualifiedAmount reservedAmount;

    public ReserveResponse() {
    }

    public ReserveResponse(
           test.wsdl.dataobjects.good.CSResult result,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSText transactionId,
           test.wsdl.dataobjects.good.CSPricingOptions pricingOptions,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId,
           test.wsdl.dataobjects.good.CSTimeSpan timeLeft,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSQualifiedAmount reservedAmount) {
        super(
            result,
            additionalParameters,
            transactionId);
        this.pricingOptions = pricingOptions;
        this.chargingSessionId = chargingSessionId;
        this.timeLeft = timeLeft;
        this.requestNumber = requestNumber;
        this.reservedAmount = reservedAmount;
    }


    /**
     * Gets the pricingOptions value for this ReserveResponse.
     * 
     * @return pricingOptions
     */
    public test.wsdl.dataobjects.good.CSPricingOptions getPricingOptions() {
        return pricingOptions;
    }


    /**
     * Sets the pricingOptions value for this ReserveResponse.
     * 
     * @param pricingOptions
     */
    public void setPricingOptions(test.wsdl.dataobjects.good.CSPricingOptions pricingOptions) {
        this.pricingOptions = pricingOptions;
    }


    /**
     * Gets the chargingSessionId value for this ReserveResponse.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this ReserveResponse.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the timeLeft value for this ReserveResponse.
     * 
     * @return timeLeft
     */
    public test.wsdl.dataobjects.good.CSTimeSpan getTimeLeft() {
        return timeLeft;
    }


    /**
     * Sets the timeLeft value for this ReserveResponse.
     * 
     * @param timeLeft
     */
    public void setTimeLeft(test.wsdl.dataobjects.good.CSTimeSpan timeLeft) {
        this.timeLeft = timeLeft;
    }


    /**
     * Gets the requestNumber value for this ReserveResponse.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ReserveResponse.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the reservedAmount value for this ReserveResponse.
     * 
     * @return reservedAmount
     */
    public test.wsdl.dataobjects.good.CSQualifiedAmount getReservedAmount() {
        return reservedAmount;
    }


    /**
     * Sets the reservedAmount value for this ReserveResponse.
     * 
     * @param reservedAmount
     */
    public void setReservedAmount(test.wsdl.dataobjects.good.CSQualifiedAmount reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReserveResponse)) return false;
        ReserveResponse other = (ReserveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pricingOptions==null && other.getPricingOptions()==null) || 
             (this.pricingOptions!=null &&
              this.pricingOptions.equals(other.getPricingOptions()))) &&
            ((this.chargingSessionId==null && other.getChargingSessionId()==null) || 
             (this.chargingSessionId!=null &&
              this.chargingSessionId.equals(other.getChargingSessionId()))) &&
            ((this.timeLeft==null && other.getTimeLeft()==null) || 
             (this.timeLeft!=null &&
              this.timeLeft.equals(other.getTimeLeft()))) &&
            ((this.requestNumber==null && other.getRequestNumber()==null) || 
             (this.requestNumber!=null &&
              this.requestNumber.equals(other.getRequestNumber()))) &&
            ((this.reservedAmount==null && other.getReservedAmount()==null) || 
             (this.reservedAmount!=null &&
              this.reservedAmount.equals(other.getReservedAmount())));
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
        if (getPricingOptions() != null) {
            _hashCode += getPricingOptions().hashCode();
        }
        if (getChargingSessionId() != null) {
            _hashCode += getChargingSessionId().hashCode();
        }
        if (getTimeLeft() != null) {
            _hashCode += getTimeLeft().hashCode();
        }
        if (getRequestNumber() != null) {
            _hashCode += getRequestNumber().hashCode();
        }
        if (getReservedAmount() != null) {
            _hashCode += getReservedAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReserveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "reserveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOptions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeSpan"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reservedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount"));
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
