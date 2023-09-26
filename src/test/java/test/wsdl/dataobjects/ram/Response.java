/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ram;

public class Response  implements java.io.Serializable {
    private java.lang.String salePostingReferenceText;

    private java.lang.String authorization;

    private java.lang.String hostResponseCode;

    private java.lang.String hostResponseMessage;

    private java.lang.String protoBaseResponseCode;

    private java.lang.String protoBaseResponseMessage;

    private java.lang.String transactionReferenceNumber;

    private java.lang.String reasonCode;

    private java.lang.String returnCode;

    private java.util.Date accountingDate;

    public Response() {
    }

    public Response(
           java.lang.String salePostingReferenceText,
           java.lang.String authorization,
           java.lang.String hostResponseCode,
           java.lang.String hostResponseMessage,
           java.lang.String protoBaseResponseCode,
           java.lang.String protoBaseResponseMessage,
           java.lang.String transactionReferenceNumber,
           java.lang.String reasonCode,
           java.lang.String returnCode,
           java.util.Date accountingDate) {
           this.salePostingReferenceText = salePostingReferenceText;
           this.authorization = authorization;
           this.hostResponseCode = hostResponseCode;
           this.hostResponseMessage = hostResponseMessage;
           this.protoBaseResponseCode = protoBaseResponseCode;
           this.protoBaseResponseMessage = protoBaseResponseMessage;
           this.transactionReferenceNumber = transactionReferenceNumber;
           this.reasonCode = reasonCode;
           this.returnCode = returnCode;
           this.accountingDate = accountingDate;
    }


    /**
     * Gets the salePostingReferenceText value for this Response.
     * 
     * @return salePostingReferenceText
     */
    public java.lang.String getSalePostingReferenceText() {
        return salePostingReferenceText;
    }


    /**
     * Sets the salePostingReferenceText value for this Response.
     * 
     * @param salePostingReferenceText
     */
    public void setSalePostingReferenceText(java.lang.String salePostingReferenceText) {
        this.salePostingReferenceText = salePostingReferenceText;
    }


    /**
     * Gets the authorization value for this Response.
     * 
     * @return authorization
     */
    public java.lang.String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this Response.
     * 
     * @param authorization
     */
    public void setAuthorization(java.lang.String authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the hostResponseCode value for this Response.
     * 
     * @return hostResponseCode
     */
    public java.lang.String getHostResponseCode() {
        return hostResponseCode;
    }


    /**
     * Sets the hostResponseCode value for this Response.
     * 
     * @param hostResponseCode
     */
    public void setHostResponseCode(java.lang.String hostResponseCode) {
        this.hostResponseCode = hostResponseCode;
    }


    /**
     * Gets the hostResponseMessage value for this Response.
     * 
     * @return hostResponseMessage
     */
    public java.lang.String getHostResponseMessage() {
        return hostResponseMessage;
    }


    /**
     * Sets the hostResponseMessage value for this Response.
     * 
     * @param hostResponseMessage
     */
    public void setHostResponseMessage(java.lang.String hostResponseMessage) {
        this.hostResponseMessage = hostResponseMessage;
    }


    /**
     * Gets the protoBaseResponseCode value for this Response.
     * 
     * @return protoBaseResponseCode
     */
    public java.lang.String getProtoBaseResponseCode() {
        return protoBaseResponseCode;
    }


    /**
     * Sets the protoBaseResponseCode value for this Response.
     * 
     * @param protoBaseResponseCode
     */
    public void setProtoBaseResponseCode(java.lang.String protoBaseResponseCode) {
        this.protoBaseResponseCode = protoBaseResponseCode;
    }


    /**
     * Gets the protoBaseResponseMessage value for this Response.
     * 
     * @return protoBaseResponseMessage
     */
    public java.lang.String getProtoBaseResponseMessage() {
        return protoBaseResponseMessage;
    }


    /**
     * Sets the protoBaseResponseMessage value for this Response.
     * 
     * @param protoBaseResponseMessage
     */
    public void setProtoBaseResponseMessage(java.lang.String protoBaseResponseMessage) {
        this.protoBaseResponseMessage = protoBaseResponseMessage;
    }


    /**
     * Gets the transactionReferenceNumber value for this Response.
     * 
     * @return transactionReferenceNumber
     */
    public java.lang.String getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }


    /**
     * Sets the transactionReferenceNumber value for this Response.
     * 
     * @param transactionReferenceNumber
     */
    public void setTransactionReferenceNumber(java.lang.String transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }


    /**
     * Gets the reasonCode value for this Response.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this Response.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the returnCode value for this Response.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this Response.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the accountingDate value for this Response.
     * 
     * @return accountingDate
     */
    public java.util.Date getAccountingDate() {
        return accountingDate;
    }


    /**
     * Sets the accountingDate value for this Response.
     * 
     * @param accountingDate
     */
    public void setAccountingDate(java.util.Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salePostingReferenceText==null && other.getSalePostingReferenceText()==null) || 
             (this.salePostingReferenceText!=null &&
              this.salePostingReferenceText.equals(other.getSalePostingReferenceText()))) &&
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization()))) &&
            ((this.hostResponseCode==null && other.getHostResponseCode()==null) || 
             (this.hostResponseCode!=null &&
              this.hostResponseCode.equals(other.getHostResponseCode()))) &&
            ((this.hostResponseMessage==null && other.getHostResponseMessage()==null) || 
             (this.hostResponseMessage!=null &&
              this.hostResponseMessage.equals(other.getHostResponseMessage()))) &&
            ((this.protoBaseResponseCode==null && other.getProtoBaseResponseCode()==null) || 
             (this.protoBaseResponseCode!=null &&
              this.protoBaseResponseCode.equals(other.getProtoBaseResponseCode()))) &&
            ((this.protoBaseResponseMessage==null && other.getProtoBaseResponseMessage()==null) || 
             (this.protoBaseResponseMessage!=null &&
              this.protoBaseResponseMessage.equals(other.getProtoBaseResponseMessage()))) &&
            ((this.transactionReferenceNumber==null && other.getTransactionReferenceNumber()==null) || 
             (this.transactionReferenceNumber!=null &&
              this.transactionReferenceNumber.equals(other.getTransactionReferenceNumber()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.accountingDate==null && other.getAccountingDate()==null) || 
             (this.accountingDate!=null &&
              this.accountingDate.equals(other.getAccountingDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSalePostingReferenceText() != null) {
            _hashCode += getSalePostingReferenceText().hashCode();
        }
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        if (getHostResponseCode() != null) {
            _hashCode += getHostResponseCode().hashCode();
        }
        if (getHostResponseMessage() != null) {
            _hashCode += getHostResponseMessage().hashCode();
        }
        if (getProtoBaseResponseCode() != null) {
            _hashCode += getProtoBaseResponseCode().hashCode();
        }
        if (getProtoBaseResponseMessage() != null) {
            _hashCode += getProtoBaseResponseMessage().hashCode();
        }
        if (getTransactionReferenceNumber() != null) {
            _hashCode += getTransactionReferenceNumber().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getAccountingDate() != null) {
            _hashCode += getAccountingDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ram.uspto.gov", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salePostingReferenceText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salePostingReferenceText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostResponseMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostResponseMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protoBaseResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protoBaseResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protoBaseResponseMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protoBaseResponseMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
