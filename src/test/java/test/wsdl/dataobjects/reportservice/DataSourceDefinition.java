/**
 * DataSourceDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class DataSourceDefinition  extends test.wsdl.dataobjects.reportservice.DataSourceDefinitionOrReference  implements java.io.Serializable {
    private java.lang.String extension;

    private java.lang.String connectString;

    private test.wsdl.dataobjects.reportservice.CredentialRetrievalEnum credentialRetrieval;

    private boolean windowsCredentials;

    private java.lang.Boolean impersonateUser;

    private java.lang.String prompt;

    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.Boolean enabled;

    public DataSourceDefinition() {
    }

    public DataSourceDefinition(
           java.lang.String extension,
           java.lang.String connectString,
           test.wsdl.dataobjects.reportservice.CredentialRetrievalEnum credentialRetrieval,
           boolean windowsCredentials,
           java.lang.Boolean impersonateUser,
           java.lang.String prompt,
           java.lang.String userName,
           java.lang.String password,
           java.lang.Boolean enabled) {
        this.extension = extension;
        this.connectString = connectString;
        this.credentialRetrieval = credentialRetrieval;
        this.windowsCredentials = windowsCredentials;
        this.impersonateUser = impersonateUser;
        this.prompt = prompt;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
    }


    /**
     * Gets the extension value for this DataSourceDefinition.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this DataSourceDefinition.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the connectString value for this DataSourceDefinition.
     * 
     * @return connectString
     */
    public java.lang.String getConnectString() {
        return connectString;
    }


    /**
     * Sets the connectString value for this DataSourceDefinition.
     * 
     * @param connectString
     */
    public void setConnectString(java.lang.String connectString) {
        this.connectString = connectString;
    }


    /**
     * Gets the credentialRetrieval value for this DataSourceDefinition.
     * 
     * @return credentialRetrieval
     */
    public test.wsdl.dataobjects.reportservice.CredentialRetrievalEnum getCredentialRetrieval() {
        return credentialRetrieval;
    }


    /**
     * Sets the credentialRetrieval value for this DataSourceDefinition.
     * 
     * @param credentialRetrieval
     */
    public void setCredentialRetrieval(test.wsdl.dataobjects.reportservice.CredentialRetrievalEnum credentialRetrieval) {
        this.credentialRetrieval = credentialRetrieval;
    }


    /**
     * Gets the windowsCredentials value for this DataSourceDefinition.
     * 
     * @return windowsCredentials
     */
    public boolean isWindowsCredentials() {
        return windowsCredentials;
    }


    /**
     * Sets the windowsCredentials value for this DataSourceDefinition.
     * 
     * @param windowsCredentials
     */
    public void setWindowsCredentials(boolean windowsCredentials) {
        this.windowsCredentials = windowsCredentials;
    }


    /**
     * Gets the impersonateUser value for this DataSourceDefinition.
     * 
     * @return impersonateUser
     */
    public java.lang.Boolean getImpersonateUser() {
        return impersonateUser;
    }


    /**
     * Sets the impersonateUser value for this DataSourceDefinition.
     * 
     * @param impersonateUser
     */
    public void setImpersonateUser(java.lang.Boolean impersonateUser) {
        this.impersonateUser = impersonateUser;
    }


    /**
     * Gets the prompt value for this DataSourceDefinition.
     * 
     * @return prompt
     */
    public java.lang.String getPrompt() {
        return prompt;
    }


    /**
     * Sets the prompt value for this DataSourceDefinition.
     * 
     * @param prompt
     */
    public void setPrompt(java.lang.String prompt) {
        this.prompt = prompt;
    }


    /**
     * Gets the userName value for this DataSourceDefinition.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this DataSourceDefinition.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this DataSourceDefinition.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DataSourceDefinition.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the enabled value for this DataSourceDefinition.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this DataSourceDefinition.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSourceDefinition)) return false;
        DataSourceDefinition other = (DataSourceDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.connectString==null && other.getConnectString()==null) || 
             (this.connectString!=null &&
              this.connectString.equals(other.getConnectString()))) &&
            ((this.credentialRetrieval==null && other.getCredentialRetrieval()==null) || 
             (this.credentialRetrieval!=null &&
              this.credentialRetrieval.equals(other.getCredentialRetrieval()))) &&
            this.windowsCredentials == other.isWindowsCredentials() &&
            ((this.impersonateUser==null && other.getImpersonateUser()==null) || 
             (this.impersonateUser!=null &&
              this.impersonateUser.equals(other.getImpersonateUser()))) &&
            ((this.prompt==null && other.getPrompt()==null) || 
             (this.prompt!=null &&
              this.prompt.equals(other.getPrompt()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled())));
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
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getConnectString() != null) {
            _hashCode += getConnectString().hashCode();
        }
        if (getCredentialRetrieval() != null) {
            _hashCode += getCredentialRetrieval().hashCode();
        }
        _hashCode += (isWindowsCredentials() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getImpersonateUser() != null) {
            _hashCode += getImpersonateUser().hashCode();
        }
        if (getPrompt() != null) {
            _hashCode += getPrompt().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSourceDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ConnectString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialRetrieval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CredentialRetrieval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CredentialRetrievalEnum"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WindowsCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ImpersonateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prompt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Prompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Enabled"));
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
