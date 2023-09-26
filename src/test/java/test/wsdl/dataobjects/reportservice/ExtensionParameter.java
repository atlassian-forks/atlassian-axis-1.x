/**
 * ExtensionParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ExtensionParameter  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String displayName;

    private java.lang.Boolean required;

    private boolean readOnly;

    private java.lang.String value;

    private java.lang.String error;

    private boolean encrypted;

    private boolean isPassword;

    private test.wsdl.dataobjects.reportservice.ArrayOfValidValue1 validValues;

    public ExtensionParameter() {
    }

    public ExtensionParameter(
           java.lang.String name,
           java.lang.String displayName,
           java.lang.Boolean required,
           boolean readOnly,
           java.lang.String value,
           java.lang.String error,
           boolean encrypted,
           boolean isPassword,
           test.wsdl.dataobjects.reportservice.ArrayOfValidValue1 validValues) {
           this.name = name;
           this.displayName = displayName;
           this.required = required;
           this.readOnly = readOnly;
           this.value = value;
           this.error = error;
           this.encrypted = encrypted;
           this.isPassword = isPassword;
           this.validValues = validValues;
    }


    /**
     * Gets the name value for this ExtensionParameter.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExtensionParameter.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this ExtensionParameter.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ExtensionParameter.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the required value for this ExtensionParameter.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this ExtensionParameter.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the readOnly value for this ExtensionParameter.
     * 
     * @return readOnly
     */
    public boolean isReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this ExtensionParameter.
     * 
     * @param readOnly
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the value value for this ExtensionParameter.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ExtensionParameter.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the error value for this ExtensionParameter.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ExtensionParameter.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the encrypted value for this ExtensionParameter.
     * 
     * @return encrypted
     */
    public boolean isEncrypted() {
        return encrypted;
    }


    /**
     * Sets the encrypted value for this ExtensionParameter.
     * 
     * @param encrypted
     */
    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }


    /**
     * Gets the isPassword value for this ExtensionParameter.
     * 
     * @return isPassword
     */
    public boolean isIsPassword() {
        return isPassword;
    }


    /**
     * Sets the isPassword value for this ExtensionParameter.
     * 
     * @param isPassword
     */
    public void setIsPassword(boolean isPassword) {
        this.isPassword = isPassword;
    }


    /**
     * Gets the validValues value for this ExtensionParameter.
     * 
     * @return validValues
     */
    public test.wsdl.dataobjects.reportservice.ArrayOfValidValue1 getValidValues() {
        return validValues;
    }


    /**
     * Sets the validValues value for this ExtensionParameter.
     * 
     * @param validValues
     */
    public void setValidValues(test.wsdl.dataobjects.reportservice.ArrayOfValidValue1 validValues) {
        this.validValues = validValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionParameter)) return false;
        ExtensionParameter other = (ExtensionParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            this.readOnly == other.isReadOnly() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            this.encrypted == other.isEncrypted() &&
            this.isPassword == other.isIsPassword() &&
            ((this.validValues==null && other.getValidValues()==null) || 
             (this.validValues!=null &&
              this.validValues.equals(other.getValidValues())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        _hashCode += (isReadOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        _hashCode += (isEncrypted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsPassword() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValidValues() != null) {
            _hashCode += getValidValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtensionParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ExtensionParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Encrypted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "IsPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ValidValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfValidValue1"));
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
