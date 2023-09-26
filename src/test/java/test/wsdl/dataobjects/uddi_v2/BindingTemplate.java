/**
 * BindingTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BindingTemplate  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private test.wsdl.dataobjects.uddi_v2.AccessPoint accessPoint;

    private test.wsdl.dataobjects.uddi_v2.HostingRedirector hostingRedirector;

    private test.wsdl.dataobjects.uddi_v2.TModelInstanceDetails tModelInstanceDetails;

    private java.lang.String serviceKey;  // attribute

    private java.lang.String bindingKey;  // attribute

    public BindingTemplate() {
    }

    public BindingTemplate(
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           test.wsdl.dataobjects.uddi_v2.AccessPoint accessPoint,
           test.wsdl.dataobjects.uddi_v2.HostingRedirector hostingRedirector,
           test.wsdl.dataobjects.uddi_v2.TModelInstanceDetails tModelInstanceDetails,
           java.lang.String serviceKey,
           java.lang.String bindingKey) {
           this.description = description;
           this.accessPoint = accessPoint;
           this.hostingRedirector = hostingRedirector;
           this.tModelInstanceDetails = tModelInstanceDetails;
           this.serviceKey = serviceKey;
           this.bindingKey = bindingKey;
    }


    /**
     * Gets the description value for this BindingTemplate.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BindingTemplate.
     * 
     * @param description
     */
    public void setDescription(test.wsdl.dataobjects.uddi_v2.Description[] description) {
        this.description = description;
    }

    public test.wsdl.dataobjects.uddi_v2.Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, test.wsdl.dataobjects.uddi_v2.Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the accessPoint value for this BindingTemplate.
     * 
     * @return accessPoint
     */
    public test.wsdl.dataobjects.uddi_v2.AccessPoint getAccessPoint() {
        return accessPoint;
    }


    /**
     * Sets the accessPoint value for this BindingTemplate.
     * 
     * @param accessPoint
     */
    public void setAccessPoint(test.wsdl.dataobjects.uddi_v2.AccessPoint accessPoint) {
        this.accessPoint = accessPoint;
    }


    /**
     * Gets the hostingRedirector value for this BindingTemplate.
     * 
     * @return hostingRedirector
     */
    public test.wsdl.dataobjects.uddi_v2.HostingRedirector getHostingRedirector() {
        return hostingRedirector;
    }


    /**
     * Sets the hostingRedirector value for this BindingTemplate.
     * 
     * @param hostingRedirector
     */
    public void setHostingRedirector(test.wsdl.dataobjects.uddi_v2.HostingRedirector hostingRedirector) {
        this.hostingRedirector = hostingRedirector;
    }


    /**
     * Gets the tModelInstanceDetails value for this BindingTemplate.
     * 
     * @return tModelInstanceDetails
     */
    public test.wsdl.dataobjects.uddi_v2.TModelInstanceDetails getTModelInstanceDetails() {
        return tModelInstanceDetails;
    }


    /**
     * Sets the tModelInstanceDetails value for this BindingTemplate.
     * 
     * @param tModelInstanceDetails
     */
    public void setTModelInstanceDetails(test.wsdl.dataobjects.uddi_v2.TModelInstanceDetails tModelInstanceDetails) {
        this.tModelInstanceDetails = tModelInstanceDetails;
    }


    /**
     * Gets the serviceKey value for this BindingTemplate.
     * 
     * @return serviceKey
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this BindingTemplate.
     * 
     * @param serviceKey
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }


    /**
     * Gets the bindingKey value for this BindingTemplate.
     * 
     * @return bindingKey
     */
    public java.lang.String getBindingKey() {
        return bindingKey;
    }


    /**
     * Sets the bindingKey value for this BindingTemplate.
     * 
     * @param bindingKey
     */
    public void setBindingKey(java.lang.String bindingKey) {
        this.bindingKey = bindingKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BindingTemplate)) return false;
        BindingTemplate other = (BindingTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.accessPoint==null && other.getAccessPoint()==null) || 
             (this.accessPoint!=null &&
              this.accessPoint.equals(other.getAccessPoint()))) &&
            ((this.hostingRedirector==null && other.getHostingRedirector()==null) || 
             (this.hostingRedirector!=null &&
              this.hostingRedirector.equals(other.getHostingRedirector()))) &&
            ((this.tModelInstanceDetails==null && other.getTModelInstanceDetails()==null) || 
             (this.tModelInstanceDetails!=null &&
              this.tModelInstanceDetails.equals(other.getTModelInstanceDetails()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey()))) &&
            ((this.bindingKey==null && other.getBindingKey()==null) || 
             (this.bindingKey!=null &&
              this.bindingKey.equals(other.getBindingKey())));
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessPoint() != null) {
            _hashCode += getAccessPoint().hashCode();
        }
        if (getHostingRedirector() != null) {
            _hashCode += getHostingRedirector().hashCode();
        }
        if (getTModelInstanceDetails() != null) {
            _hashCode += getTModelInstanceDetails().hashCode();
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        if (getBindingKey() != null) {
            _hashCode += getBindingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BindingTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplate"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "serviceKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceKey"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bindingKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "bindingKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingKey"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "accessPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "accessPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostingRedirector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "hostingRedirector"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "hostingRedirector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelInstanceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInstanceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInstanceDetails"));
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
