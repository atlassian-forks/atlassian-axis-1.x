/**
 * ReleaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class ReleaseRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSRequestId requestNumber;

    private test.wsdl.dataobjects.good.CSSessionId chargingSessionId;

    public ReleaseRequest() {
    }

    public ReleaseRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSRequestId requestNumber,
           test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        super(
            transactionId,
            additionalParameters);
        this.applicationTicket = applicationTicket;
        this.requestNumber = requestNumber;
        this.chargingSessionId = chargingSessionId;
    }


    /**
     * Gets the applicationTicket value for this ReleaseRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this ReleaseRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the requestNumber value for this ReleaseRequest.
     * 
     * @return requestNumber
     */
    public test.wsdl.dataobjects.good.CSRequestId getRequestNumber() {
        return requestNumber;
    }


    /**
     * Sets the requestNumber value for this ReleaseRequest.
     * 
     * @param requestNumber
     */
    public void setRequestNumber(test.wsdl.dataobjects.good.CSRequestId requestNumber) {
        this.requestNumber = requestNumber;
    }


    /**
     * Gets the chargingSessionId value for this ReleaseRequest.
     * 
     * @return chargingSessionId
     */
    public test.wsdl.dataobjects.good.CSSessionId getChargingSessionId() {
        return chargingSessionId;
    }


    /**
     * Sets the chargingSessionId value for this ReleaseRequest.
     * 
     * @param chargingSessionId
     */
    public void setChargingSessionId(test.wsdl.dataobjects.good.CSSessionId chargingSessionId) {
        this.chargingSessionId = chargingSessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReleaseRequest)) return false;
        ReleaseRequest other = (ReleaseRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationTicket==null && other.getApplicationTicket()==null) || 
             (this.applicationTicket!=null &&
              this.applicationTicket.equals(other.getApplicationTicket()))) &&
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
        if (getApplicationTicket() != null) {
            _hashCode += getApplicationTicket().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReleaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "releaseRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket"));
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
