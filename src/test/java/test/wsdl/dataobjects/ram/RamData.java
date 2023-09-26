/**
 * RamData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ram;

public class RamData  implements java.io.Serializable {
    private java.util.Date mailRoomDate;

    private java.lang.String callingClientUserIdentifier;

    private java.lang.String bankInfoRequestType;

    private java.lang.String callingClientPortNumber;

    private java.lang.String salePostingReferenceText;

    private java.lang.String bankInfoPaymentType;

    private double saleOtherPaymentTotalAmount;

    private test.wsdl.dataobjects.ram.Fee[] fees;

    private test.wsdl.dataobjects.ram.CreditCard creditCard;

    public RamData() {
    }

    public RamData(
           java.util.Date mailRoomDate,
           java.lang.String callingClientUserIdentifier,
           java.lang.String bankInfoRequestType,
           java.lang.String callingClientPortNumber,
           java.lang.String salePostingReferenceText,
           java.lang.String bankInfoPaymentType,
           double saleOtherPaymentTotalAmount,
           test.wsdl.dataobjects.ram.Fee[] fees,
           test.wsdl.dataobjects.ram.CreditCard creditCard) {
           this.mailRoomDate = mailRoomDate;
           this.callingClientUserIdentifier = callingClientUserIdentifier;
           this.bankInfoRequestType = bankInfoRequestType;
           this.callingClientPortNumber = callingClientPortNumber;
           this.salePostingReferenceText = salePostingReferenceText;
           this.bankInfoPaymentType = bankInfoPaymentType;
           this.saleOtherPaymentTotalAmount = saleOtherPaymentTotalAmount;
           this.fees = fees;
           this.creditCard = creditCard;
    }


    /**
     * Gets the mailRoomDate value for this RamData.
     * 
     * @return mailRoomDate
     */
    public java.util.Date getMailRoomDate() {
        return mailRoomDate;
    }


    /**
     * Sets the mailRoomDate value for this RamData.
     * 
     * @param mailRoomDate
     */
    public void setMailRoomDate(java.util.Date mailRoomDate) {
        this.mailRoomDate = mailRoomDate;
    }


    /**
     * Gets the callingClientUserIdentifier value for this RamData.
     * 
     * @return callingClientUserIdentifier
     */
    public java.lang.String getCallingClientUserIdentifier() {
        return callingClientUserIdentifier;
    }


    /**
     * Sets the callingClientUserIdentifier value for this RamData.
     * 
     * @param callingClientUserIdentifier
     */
    public void setCallingClientUserIdentifier(java.lang.String callingClientUserIdentifier) {
        this.callingClientUserIdentifier = callingClientUserIdentifier;
    }


    /**
     * Gets the bankInfoRequestType value for this RamData.
     * 
     * @return bankInfoRequestType
     */
    public java.lang.String getBankInfoRequestType() {
        return bankInfoRequestType;
    }


    /**
     * Sets the bankInfoRequestType value for this RamData.
     * 
     * @param bankInfoRequestType
     */
    public void setBankInfoRequestType(java.lang.String bankInfoRequestType) {
        this.bankInfoRequestType = bankInfoRequestType;
    }


    /**
     * Gets the callingClientPortNumber value for this RamData.
     * 
     * @return callingClientPortNumber
     */
    public java.lang.String getCallingClientPortNumber() {
        return callingClientPortNumber;
    }


    /**
     * Sets the callingClientPortNumber value for this RamData.
     * 
     * @param callingClientPortNumber
     */
    public void setCallingClientPortNumber(java.lang.String callingClientPortNumber) {
        this.callingClientPortNumber = callingClientPortNumber;
    }


    /**
     * Gets the salePostingReferenceText value for this RamData.
     * 
     * @return salePostingReferenceText
     */
    public java.lang.String getSalePostingReferenceText() {
        return salePostingReferenceText;
    }


    /**
     * Sets the salePostingReferenceText value for this RamData.
     * 
     * @param salePostingReferenceText
     */
    public void setSalePostingReferenceText(java.lang.String salePostingReferenceText) {
        this.salePostingReferenceText = salePostingReferenceText;
    }


    /**
     * Gets the bankInfoPaymentType value for this RamData.
     * 
     * @return bankInfoPaymentType
     */
    public java.lang.String getBankInfoPaymentType() {
        return bankInfoPaymentType;
    }


    /**
     * Sets the bankInfoPaymentType value for this RamData.
     * 
     * @param bankInfoPaymentType
     */
    public void setBankInfoPaymentType(java.lang.String bankInfoPaymentType) {
        this.bankInfoPaymentType = bankInfoPaymentType;
    }


    /**
     * Gets the saleOtherPaymentTotalAmount value for this RamData.
     * 
     * @return saleOtherPaymentTotalAmount
     */
    public double getSaleOtherPaymentTotalAmount() {
        return saleOtherPaymentTotalAmount;
    }


    /**
     * Sets the saleOtherPaymentTotalAmount value for this RamData.
     * 
     * @param saleOtherPaymentTotalAmount
     */
    public void setSaleOtherPaymentTotalAmount(double saleOtherPaymentTotalAmount) {
        this.saleOtherPaymentTotalAmount = saleOtherPaymentTotalAmount;
    }


    /**
     * Gets the fees value for this RamData.
     * 
     * @return fees
     */
    public test.wsdl.dataobjects.ram.Fee[] getFees() {
        return fees;
    }


    /**
     * Sets the fees value for this RamData.
     * 
     * @param fees
     */
    public void setFees(test.wsdl.dataobjects.ram.Fee[] fees) {
        this.fees = fees;
    }


    /**
     * Gets the creditCard value for this RamData.
     * 
     * @return creditCard
     */
    public test.wsdl.dataobjects.ram.CreditCard getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this RamData.
     * 
     * @param creditCard
     */
    public void setCreditCard(test.wsdl.dataobjects.ram.CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RamData)) return false;
        RamData other = (RamData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mailRoomDate==null && other.getMailRoomDate()==null) || 
             (this.mailRoomDate!=null &&
              this.mailRoomDate.equals(other.getMailRoomDate()))) &&
            ((this.callingClientUserIdentifier==null && other.getCallingClientUserIdentifier()==null) || 
             (this.callingClientUserIdentifier!=null &&
              this.callingClientUserIdentifier.equals(other.getCallingClientUserIdentifier()))) &&
            ((this.bankInfoRequestType==null && other.getBankInfoRequestType()==null) || 
             (this.bankInfoRequestType!=null &&
              this.bankInfoRequestType.equals(other.getBankInfoRequestType()))) &&
            ((this.callingClientPortNumber==null && other.getCallingClientPortNumber()==null) || 
             (this.callingClientPortNumber!=null &&
              this.callingClientPortNumber.equals(other.getCallingClientPortNumber()))) &&
            ((this.salePostingReferenceText==null && other.getSalePostingReferenceText()==null) || 
             (this.salePostingReferenceText!=null &&
              this.salePostingReferenceText.equals(other.getSalePostingReferenceText()))) &&
            ((this.bankInfoPaymentType==null && other.getBankInfoPaymentType()==null) || 
             (this.bankInfoPaymentType!=null &&
              this.bankInfoPaymentType.equals(other.getBankInfoPaymentType()))) &&
            this.saleOtherPaymentTotalAmount == other.getSaleOtherPaymentTotalAmount() &&
            ((this.fees==null && other.getFees()==null) || 
             (this.fees!=null &&
              java.util.Arrays.equals(this.fees, other.getFees()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard())));
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
        if (getMailRoomDate() != null) {
            _hashCode += getMailRoomDate().hashCode();
        }
        if (getCallingClientUserIdentifier() != null) {
            _hashCode += getCallingClientUserIdentifier().hashCode();
        }
        if (getBankInfoRequestType() != null) {
            _hashCode += getBankInfoRequestType().hashCode();
        }
        if (getCallingClientPortNumber() != null) {
            _hashCode += getCallingClientPortNumber().hashCode();
        }
        if (getSalePostingReferenceText() != null) {
            _hashCode += getSalePostingReferenceText().hashCode();
        }
        if (getBankInfoPaymentType() != null) {
            _hashCode += getBankInfoPaymentType().hashCode();
        }
        _hashCode += new Double(getSaleOtherPaymentTotalAmount()).hashCode();
        if (getFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RamData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ram.uspto.gov", "RamData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailRoomDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailRoomDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingClientUserIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingClientUserIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfoRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankInfoRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingClientPortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingClientPortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salePostingReferenceText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salePostingReferenceText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfoPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankInfoPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleOtherPaymentTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saleOtherPaymentTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ram.uspto.gov", "Fee"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ram.uspto.gov", "CreditCard"));
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
