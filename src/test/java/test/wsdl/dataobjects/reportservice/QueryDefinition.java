/**
 * QueryDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class QueryDefinition  implements java.io.Serializable {
    private java.lang.String commandType;

    private java.lang.String commandText;

    private java.lang.Integer timeout;

    public QueryDefinition() {
    }

    public QueryDefinition(
           java.lang.String commandType,
           java.lang.String commandText,
           java.lang.Integer timeout) {
           this.commandType = commandType;
           this.commandText = commandText;
           this.timeout = timeout;
    }


    /**
     * Gets the commandType value for this QueryDefinition.
     * 
     * @return commandType
     */
    public java.lang.String getCommandType() {
        return commandType;
    }


    /**
     * Sets the commandType value for this QueryDefinition.
     * 
     * @param commandType
     */
    public void setCommandType(java.lang.String commandType) {
        this.commandType = commandType;
    }


    /**
     * Gets the commandText value for this QueryDefinition.
     * 
     * @return commandText
     */
    public java.lang.String getCommandText() {
        return commandText;
    }


    /**
     * Sets the commandText value for this QueryDefinition.
     * 
     * @param commandText
     */
    public void setCommandText(java.lang.String commandText) {
        this.commandText = commandText;
    }


    /**
     * Gets the timeout value for this QueryDefinition.
     * 
     * @return timeout
     */
    public java.lang.Integer getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this QueryDefinition.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.Integer timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDefinition)) return false;
        QueryDefinition other = (QueryDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commandType==null && other.getCommandType()==null) || 
             (this.commandType!=null &&
              this.commandType.equals(other.getCommandType()))) &&
            ((this.commandText==null && other.getCommandText()==null) || 
             (this.commandText!=null &&
              this.commandText.equals(other.getCommandText()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        if (getCommandType() != null) {
            _hashCode += getCommandType().hashCode();
        }
        if (getCommandText() != null) {
            _hashCode += getCommandText().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "QueryDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CommandType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CommandText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
