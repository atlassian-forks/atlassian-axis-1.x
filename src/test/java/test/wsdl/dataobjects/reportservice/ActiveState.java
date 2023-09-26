/**
 * ActiveState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ActiveState  implements java.io.Serializable {
    private java.lang.Boolean deliveryExtensionRemoved;

    private java.lang.Boolean sharedDataSourceRemoved;

    private java.lang.Boolean missingParameterValue;

    private java.lang.Boolean invalidParameterValue;

    private java.lang.Boolean unknownReportParameter;

    public ActiveState() {
    }

    public ActiveState(
           java.lang.Boolean deliveryExtensionRemoved,
           java.lang.Boolean sharedDataSourceRemoved,
           java.lang.Boolean missingParameterValue,
           java.lang.Boolean invalidParameterValue,
           java.lang.Boolean unknownReportParameter) {
           this.deliveryExtensionRemoved = deliveryExtensionRemoved;
           this.sharedDataSourceRemoved = sharedDataSourceRemoved;
           this.missingParameterValue = missingParameterValue;
           this.invalidParameterValue = invalidParameterValue;
           this.unknownReportParameter = unknownReportParameter;
    }


    /**
     * Gets the deliveryExtensionRemoved value for this ActiveState.
     * 
     * @return deliveryExtensionRemoved
     */
    public java.lang.Boolean getDeliveryExtensionRemoved() {
        return deliveryExtensionRemoved;
    }


    /**
     * Sets the deliveryExtensionRemoved value for this ActiveState.
     * 
     * @param deliveryExtensionRemoved
     */
    public void setDeliveryExtensionRemoved(java.lang.Boolean deliveryExtensionRemoved) {
        this.deliveryExtensionRemoved = deliveryExtensionRemoved;
    }


    /**
     * Gets the sharedDataSourceRemoved value for this ActiveState.
     * 
     * @return sharedDataSourceRemoved
     */
    public java.lang.Boolean getSharedDataSourceRemoved() {
        return sharedDataSourceRemoved;
    }


    /**
     * Sets the sharedDataSourceRemoved value for this ActiveState.
     * 
     * @param sharedDataSourceRemoved
     */
    public void setSharedDataSourceRemoved(java.lang.Boolean sharedDataSourceRemoved) {
        this.sharedDataSourceRemoved = sharedDataSourceRemoved;
    }


    /**
     * Gets the missingParameterValue value for this ActiveState.
     * 
     * @return missingParameterValue
     */
    public java.lang.Boolean getMissingParameterValue() {
        return missingParameterValue;
    }


    /**
     * Sets the missingParameterValue value for this ActiveState.
     * 
     * @param missingParameterValue
     */
    public void setMissingParameterValue(java.lang.Boolean missingParameterValue) {
        this.missingParameterValue = missingParameterValue;
    }


    /**
     * Gets the invalidParameterValue value for this ActiveState.
     * 
     * @return invalidParameterValue
     */
    public java.lang.Boolean getInvalidParameterValue() {
        return invalidParameterValue;
    }


    /**
     * Sets the invalidParameterValue value for this ActiveState.
     * 
     * @param invalidParameterValue
     */
    public void setInvalidParameterValue(java.lang.Boolean invalidParameterValue) {
        this.invalidParameterValue = invalidParameterValue;
    }


    /**
     * Gets the unknownReportParameter value for this ActiveState.
     * 
     * @return unknownReportParameter
     */
    public java.lang.Boolean getUnknownReportParameter() {
        return unknownReportParameter;
    }


    /**
     * Sets the unknownReportParameter value for this ActiveState.
     * 
     * @param unknownReportParameter
     */
    public void setUnknownReportParameter(java.lang.Boolean unknownReportParameter) {
        this.unknownReportParameter = unknownReportParameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActiveState)) return false;
        ActiveState other = (ActiveState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryExtensionRemoved==null && other.getDeliveryExtensionRemoved()==null) || 
             (this.deliveryExtensionRemoved!=null &&
              this.deliveryExtensionRemoved.equals(other.getDeliveryExtensionRemoved()))) &&
            ((this.sharedDataSourceRemoved==null && other.getSharedDataSourceRemoved()==null) || 
             (this.sharedDataSourceRemoved!=null &&
              this.sharedDataSourceRemoved.equals(other.getSharedDataSourceRemoved()))) &&
            ((this.missingParameterValue==null && other.getMissingParameterValue()==null) || 
             (this.missingParameterValue!=null &&
              this.missingParameterValue.equals(other.getMissingParameterValue()))) &&
            ((this.invalidParameterValue==null && other.getInvalidParameterValue()==null) || 
             (this.invalidParameterValue!=null &&
              this.invalidParameterValue.equals(other.getInvalidParameterValue()))) &&
            ((this.unknownReportParameter==null && other.getUnknownReportParameter()==null) || 
             (this.unknownReportParameter!=null &&
              this.unknownReportParameter.equals(other.getUnknownReportParameter())));
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
        if (getDeliveryExtensionRemoved() != null) {
            _hashCode += getDeliveryExtensionRemoved().hashCode();
        }
        if (getSharedDataSourceRemoved() != null) {
            _hashCode += getSharedDataSourceRemoved().hashCode();
        }
        if (getMissingParameterValue() != null) {
            _hashCode += getMissingParameterValue().hashCode();
        }
        if (getInvalidParameterValue() != null) {
            _hashCode += getInvalidParameterValue().hashCode();
        }
        if (getUnknownReportParameter() != null) {
            _hashCode += getUnknownReportParameter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActiveState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ActiveState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryExtensionRemoved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DeliveryExtensionRemoved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedDataSourceRemoved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SharedDataSourceRemoved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingParameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "MissingParameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidParameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "InvalidParameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unknownReportParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "UnknownReportParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
