/**
 * BusinessServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BusinessServices  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BusinessService[] businessService;

    public BusinessServices() {
    }

    public BusinessServices(
           test.wsdl.dataobjects.uddi_v2.BusinessService[] businessService) {
           this.businessService = businessService;
    }


    /**
     * Gets the businessService value for this BusinessServices.
     * 
     * @return businessService
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessService[] getBusinessService() {
        return businessService;
    }


    /**
     * Sets the businessService value for this BusinessServices.
     * 
     * @param businessService
     */
    public void setBusinessService(test.wsdl.dataobjects.uddi_v2.BusinessService[] businessService) {
        this.businessService = businessService;
    }

    public test.wsdl.dataobjects.uddi_v2.BusinessService getBusinessService(int i) {
        return this.businessService[i];
    }

    public void setBusinessService(int i, test.wsdl.dataobjects.uddi_v2.BusinessService _value) {
        this.businessService[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessServices)) return false;
        BusinessServices other = (BusinessServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessService==null && other.getBusinessService()==null) || 
             (this.businessService!=null &&
              java.util.Arrays.equals(this.businessService, other.getBusinessService())));
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
        if (getBusinessService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessService(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessServices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessService"));
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
