/**
 * ServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class ServiceInfo  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.Name[] name;

    private java.lang.String serviceKey;  // attribute

    private java.lang.String businessKey;  // attribute

    public ServiceInfo() {
    }

    public ServiceInfo(
           test.wsdl.dataobjects.uddi_v2.Name[] name,
           java.lang.String serviceKey,
           java.lang.String businessKey) {
           this.name = name;
           this.serviceKey = serviceKey;
           this.businessKey = businessKey;
    }


    /**
     * Gets the name value for this ServiceInfo.
     * 
     * @return name
     */
    public test.wsdl.dataobjects.uddi_v2.Name[] getName() {
        return name;
    }


    /**
     * Sets the name value for this ServiceInfo.
     * 
     * @param name
     */
    public void setName(test.wsdl.dataobjects.uddi_v2.Name[] name) {
        this.name = name;
    }

    public test.wsdl.dataobjects.uddi_v2.Name getName(int i) {
        return this.name[i];
    }

    public void setName(int i, test.wsdl.dataobjects.uddi_v2.Name _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the serviceKey value for this ServiceInfo.
     * 
     * @return serviceKey
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this ServiceInfo.
     * 
     * @param serviceKey
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }


    /**
     * Gets the businessKey value for this ServiceInfo.
     * 
     * @return businessKey
     */
    public java.lang.String getBusinessKey() {
        return businessKey;
    }


    /**
     * Sets the businessKey value for this ServiceInfo.
     * 
     * @param businessKey
     */
    public void setBusinessKey(java.lang.String businessKey) {
        this.businessKey = businessKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfo)) return false;
        ServiceInfo other = (ServiceInfo) obj;
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
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey()))) &&
            ((this.businessKey==null && other.getBusinessKey()==null) || 
             (this.businessKey!=null &&
              this.businessKey.equals(other.getBusinessKey())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        if (getBusinessKey() != null) {
            _hashCode += getBusinessKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "serviceKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceKey"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("businessKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "businessKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessKey"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
