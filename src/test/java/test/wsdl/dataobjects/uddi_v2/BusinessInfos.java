/**
 * BusinessInfos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BusinessInfos  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BusinessInfo[] businessInfo;

    public BusinessInfos() {
    }

    public BusinessInfos(
           test.wsdl.dataobjects.uddi_v2.BusinessInfo[] businessInfo) {
           this.businessInfo = businessInfo;
    }


    /**
     * Gets the businessInfo value for this BusinessInfos.
     * 
     * @return businessInfo
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessInfo[] getBusinessInfo() {
        return businessInfo;
    }


    /**
     * Sets the businessInfo value for this BusinessInfos.
     * 
     * @param businessInfo
     */
    public void setBusinessInfo(test.wsdl.dataobjects.uddi_v2.BusinessInfo[] businessInfo) {
        this.businessInfo = businessInfo;
    }

    public test.wsdl.dataobjects.uddi_v2.BusinessInfo getBusinessInfo(int i) {
        return this.businessInfo[i];
    }

    public void setBusinessInfo(int i, test.wsdl.dataobjects.uddi_v2.BusinessInfo _value) {
        this.businessInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessInfos)) return false;
        BusinessInfos other = (BusinessInfos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessInfo==null && other.getBusinessInfo()==null) || 
             (this.businessInfo!=null &&
              java.util.Arrays.equals(this.businessInfo, other.getBusinessInfo())));
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
        if (getBusinessInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessInfo(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessInfos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessInfos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessInfo"));
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
