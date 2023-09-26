/**
 * ServiceInfos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class ServiceInfos  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.ServiceInfo[] serviceInfo;

    public ServiceInfos() {
    }

    public ServiceInfos(
           test.wsdl.dataobjects.uddi_v2.ServiceInfo[] serviceInfo) {
           this.serviceInfo = serviceInfo;
    }


    /**
     * Gets the serviceInfo value for this ServiceInfos.
     * 
     * @return serviceInfo
     */
    public test.wsdl.dataobjects.uddi_v2.ServiceInfo[] getServiceInfo() {
        return serviceInfo;
    }


    /**
     * Sets the serviceInfo value for this ServiceInfos.
     * 
     * @param serviceInfo
     */
    public void setServiceInfo(test.wsdl.dataobjects.uddi_v2.ServiceInfo[] serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public test.wsdl.dataobjects.uddi_v2.ServiceInfo getServiceInfo(int i) {
        return this.serviceInfo[i];
    }

    public void setServiceInfo(int i, test.wsdl.dataobjects.uddi_v2.ServiceInfo _value) {
        this.serviceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfos)) return false;
        ServiceInfos other = (ServiceInfos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceInfo==null && other.getServiceInfo()==null) || 
             (this.serviceInfo!=null &&
              java.util.Arrays.equals(this.serviceInfo, other.getServiceInfo())));
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
        if (getServiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceInfos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "serviceInfo"));
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
