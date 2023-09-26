/**
 * RelatedBusinessInfos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class RelatedBusinessInfos  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo[] relatedBusinessInfo;

    public RelatedBusinessInfos() {
    }

    public RelatedBusinessInfos(
           test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo[] relatedBusinessInfo) {
           this.relatedBusinessInfo = relatedBusinessInfo;
    }


    /**
     * Gets the relatedBusinessInfo value for this RelatedBusinessInfos.
     * 
     * @return relatedBusinessInfo
     */
    public test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo[] getRelatedBusinessInfo() {
        return relatedBusinessInfo;
    }


    /**
     * Sets the relatedBusinessInfo value for this RelatedBusinessInfos.
     * 
     * @param relatedBusinessInfo
     */
    public void setRelatedBusinessInfo(test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo[] relatedBusinessInfo) {
        this.relatedBusinessInfo = relatedBusinessInfo;
    }

    public test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo getRelatedBusinessInfo(int i) {
        return this.relatedBusinessInfo[i];
    }

    public void setRelatedBusinessInfo(int i, test.wsdl.dataobjects.uddi_v2.RelatedBusinessInfo _value) {
        this.relatedBusinessInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedBusinessInfos)) return false;
        RelatedBusinessInfos other = (RelatedBusinessInfos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relatedBusinessInfo==null && other.getRelatedBusinessInfo()==null) || 
             (this.relatedBusinessInfo!=null &&
              java.util.Arrays.equals(this.relatedBusinessInfo, other.getRelatedBusinessInfo())));
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
        if (getRelatedBusinessInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedBusinessInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedBusinessInfo(), i);
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
        new org.apache.axis.description.TypeDesc(RelatedBusinessInfos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedBusinessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "relatedBusinessInfo"));
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
