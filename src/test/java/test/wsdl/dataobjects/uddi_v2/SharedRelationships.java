/**
 * SharedRelationships.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class SharedRelationships  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.KeyedReference[] keyedReference;

    private test.wsdl.dataobjects.uddi_v2.Direction direction;  // attribute

    public SharedRelationships() {
    }

    public SharedRelationships(
           test.wsdl.dataobjects.uddi_v2.KeyedReference[] keyedReference,
           test.wsdl.dataobjects.uddi_v2.Direction direction) {
           this.keyedReference = keyedReference;
           this.direction = direction;
    }


    /**
     * Gets the keyedReference value for this SharedRelationships.
     * 
     * @return keyedReference
     */
    public test.wsdl.dataobjects.uddi_v2.KeyedReference[] getKeyedReference() {
        return keyedReference;
    }


    /**
     * Sets the keyedReference value for this SharedRelationships.
     * 
     * @param keyedReference
     */
    public void setKeyedReference(test.wsdl.dataobjects.uddi_v2.KeyedReference[] keyedReference) {
        this.keyedReference = keyedReference;
    }

    public test.wsdl.dataobjects.uddi_v2.KeyedReference getKeyedReference(int i) {
        return this.keyedReference[i];
    }

    public void setKeyedReference(int i, test.wsdl.dataobjects.uddi_v2.KeyedReference _value) {
        this.keyedReference[i] = _value;
    }


    /**
     * Gets the direction value for this SharedRelationships.
     * 
     * @return direction
     */
    public test.wsdl.dataobjects.uddi_v2.Direction getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this SharedRelationships.
     * 
     * @param direction
     */
    public void setDirection(test.wsdl.dataobjects.uddi_v2.Direction direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedRelationships)) return false;
        SharedRelationships other = (SharedRelationships) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyedReference==null && other.getKeyedReference()==null) || 
             (this.keyedReference!=null &&
              java.util.Arrays.equals(this.keyedReference, other.getKeyedReference()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getKeyedReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyedReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyedReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedRelationships.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "sharedRelationships"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("direction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "direction"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyedReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "keyedReference"));
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