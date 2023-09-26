/**
 * GetSubscriberIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class GetSubscriberIdRequest  extends test.wsdl.dataobjects.good.CSCommonRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket;

    private test.wsdl.dataobjects.good.CSText externalId;

    private test.wsdl.dataobjects.good.CSText idType;

    public GetSubscriberIdRequest() {
    }

    public GetSubscriberIdRequest(
           java.lang.String transactionId,
           test.wsdl.dataobjects.good.CSAdditionalParameters additionalParameters,
           test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket,
           test.wsdl.dataobjects.good.CSText externalId,
           test.wsdl.dataobjects.good.CSText idType) {
        super(
            transactionId,
            additionalParameters);
        this.applicationTicket = applicationTicket;
        this.externalId = externalId;
        this.idType = idType;
    }


    /**
     * Gets the applicationTicket value for this GetSubscriberIdRequest.
     * 
     * @return applicationTicket
     */
    public test.wsdl.dataobjects.good.CSSecurityTicket getApplicationTicket() {
        return applicationTicket;
    }


    /**
     * Sets the applicationTicket value for this GetSubscriberIdRequest.
     * 
     * @param applicationTicket
     */
    public void setApplicationTicket(test.wsdl.dataobjects.good.CSSecurityTicket applicationTicket) {
        this.applicationTicket = applicationTicket;
    }


    /**
     * Gets the externalId value for this GetSubscriberIdRequest.
     * 
     * @return externalId
     */
    public test.wsdl.dataobjects.good.CSText getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this GetSubscriberIdRequest.
     * 
     * @param externalId
     */
    public void setExternalId(test.wsdl.dataobjects.good.CSText externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the idType value for this GetSubscriberIdRequest.
     * 
     * @return idType
     */
    public test.wsdl.dataobjects.good.CSText getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this GetSubscriberIdRequest.
     * 
     * @param idType
     */
    public void setIdType(test.wsdl.dataobjects.good.CSText idType) {
        this.idType = idType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberIdRequest)) return false;
        GetSubscriberIdRequest other = (GetSubscriberIdRequest) obj;
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
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType())));
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
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriberIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CPWSImpl", "getSubscriberIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idType"));
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
