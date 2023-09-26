/**
 * TModelInstanceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class TModelInstanceDetails  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo[] tModelInstanceInfo;

    public TModelInstanceDetails() {
    }

    public TModelInstanceDetails(
           test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo[] tModelInstanceInfo) {
           this.tModelInstanceInfo = tModelInstanceInfo;
    }


    /**
     * Gets the tModelInstanceInfo value for this TModelInstanceDetails.
     * 
     * @return tModelInstanceInfo
     */
    public test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo[] getTModelInstanceInfo() {
        return tModelInstanceInfo;
    }


    /**
     * Sets the tModelInstanceInfo value for this TModelInstanceDetails.
     * 
     * @param tModelInstanceInfo
     */
    public void setTModelInstanceInfo(test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo[] tModelInstanceInfo) {
        this.tModelInstanceInfo = tModelInstanceInfo;
    }

    public test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo getTModelInstanceInfo(int i) {
        return this.tModelInstanceInfo[i];
    }

    public void setTModelInstanceInfo(int i, test.wsdl.dataobjects.uddi_v2.TModelInstanceInfo _value) {
        this.tModelInstanceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TModelInstanceDetails)) return false;
        TModelInstanceDetails other = (TModelInstanceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tModelInstanceInfo==null && other.getTModelInstanceInfo()==null) || 
             (this.tModelInstanceInfo!=null &&
              java.util.Arrays.equals(this.tModelInstanceInfo, other.getTModelInstanceInfo())));
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
        if (getTModelInstanceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTModelInstanceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTModelInstanceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(TModelInstanceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInstanceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelInstanceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInstanceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInstanceInfo"));
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
