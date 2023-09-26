/**
 * Policy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class Policy  implements java.io.Serializable {
    private java.lang.String groupUserName;

    private test.wsdl.dataobjects.reportservice.ArrayOfRole roles;

    public Policy() {
    }

    public Policy(
           java.lang.String groupUserName,
           test.wsdl.dataobjects.reportservice.ArrayOfRole roles) {
           this.groupUserName = groupUserName;
           this.roles = roles;
    }


    /**
     * Gets the groupUserName value for this Policy.
     * 
     * @return groupUserName
     */
    public java.lang.String getGroupUserName() {
        return groupUserName;
    }


    /**
     * Sets the groupUserName value for this Policy.
     * 
     * @param groupUserName
     */
    public void setGroupUserName(java.lang.String groupUserName) {
        this.groupUserName = groupUserName;
    }


    /**
     * Gets the roles value for this Policy.
     * 
     * @return roles
     */
    public test.wsdl.dataobjects.reportservice.ArrayOfRole getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this Policy.
     * 
     * @param roles
     */
    public void setRoles(test.wsdl.dataobjects.reportservice.ArrayOfRole roles) {
        this.roles = roles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupUserName==null && other.getGroupUserName()==null) || 
             (this.groupUserName!=null &&
              this.groupUserName.equals(other.getGroupUserName()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              this.roles.equals(other.getRoles())));
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
        if (getGroupUserName() != null) {
            _hashCode += getGroupUserName().hashCode();
        }
        if (getRoles() != null) {
            _hashCode += getRoles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Policy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "GroupUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfRole"));
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
