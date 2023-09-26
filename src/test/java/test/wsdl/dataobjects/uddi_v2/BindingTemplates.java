/**
 * BindingTemplates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class BindingTemplates  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate;

    public BindingTemplates() {
    }

    public BindingTemplates(
           test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate) {
           this.bindingTemplate = bindingTemplate;
    }


    /**
     * Gets the bindingTemplate value for this BindingTemplates.
     * 
     * @return bindingTemplate
     */
    public test.wsdl.dataobjects.uddi_v2.BindingTemplate[] getBindingTemplate() {
        return bindingTemplate;
    }


    /**
     * Sets the bindingTemplate value for this BindingTemplates.
     * 
     * @param bindingTemplate
     */
    public void setBindingTemplate(test.wsdl.dataobjects.uddi_v2.BindingTemplate[] bindingTemplate) {
        this.bindingTemplate = bindingTemplate;
    }

    public test.wsdl.dataobjects.uddi_v2.BindingTemplate getBindingTemplate(int i) {
        return this.bindingTemplate[i];
    }

    public void setBindingTemplate(int i, test.wsdl.dataobjects.uddi_v2.BindingTemplate _value) {
        this.bindingTemplate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BindingTemplates)) return false;
        BindingTemplates other = (BindingTemplates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bindingTemplate==null && other.getBindingTemplate()==null) || 
             (this.bindingTemplate!=null &&
              java.util.Arrays.equals(this.bindingTemplate, other.getBindingTemplate())));
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
        if (getBindingTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindingTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindingTemplate(), i);
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
        new org.apache.axis.description.TypeDesc(BindingTemplates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "bindingTemplate"));
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
