/**
 * TModelInfos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class TModelInfos  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.TModelInfo[] tModelInfo;

    public TModelInfos() {
    }

    public TModelInfos(
           test.wsdl.dataobjects.uddi_v2.TModelInfo[] tModelInfo) {
           this.tModelInfo = tModelInfo;
    }


    /**
     * Gets the tModelInfo value for this TModelInfos.
     * 
     * @return tModelInfo
     */
    public test.wsdl.dataobjects.uddi_v2.TModelInfo[] getTModelInfo() {
        return tModelInfo;
    }


    /**
     * Sets the tModelInfo value for this TModelInfos.
     * 
     * @param tModelInfo
     */
    public void setTModelInfo(test.wsdl.dataobjects.uddi_v2.TModelInfo[] tModelInfo) {
        this.tModelInfo = tModelInfo;
    }

    public test.wsdl.dataobjects.uddi_v2.TModelInfo getTModelInfo(int i) {
        return this.tModelInfo[i];
    }

    public void setTModelInfo(int i, test.wsdl.dataobjects.uddi_v2.TModelInfo _value) {
        this.tModelInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TModelInfos)) return false;
        TModelInfos other = (TModelInfos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tModelInfo==null && other.getTModelInfo()==null) || 
             (this.tModelInfo!=null &&
              java.util.Arrays.equals(this.tModelInfo, other.getTModelInfo())));
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
        if (getTModelInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTModelInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTModelInfo(), i);
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
        new org.apache.axis.description.TypeDesc(TModelInfos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInfos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelInfo"));
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
