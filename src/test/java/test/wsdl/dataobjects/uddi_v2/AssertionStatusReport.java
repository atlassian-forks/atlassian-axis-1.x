/**
 * AssertionStatusReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class AssertionStatusReport  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.AssertionStatusItem[] assertionStatusItem;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    public AssertionStatusReport() {
    }

    public AssertionStatusReport(
           test.wsdl.dataobjects.uddi_v2.AssertionStatusItem[] assertionStatusItem,
           java.lang.String generic,
           java.lang.String operator) {
           this.assertionStatusItem = assertionStatusItem;
           this.generic = generic;
           this.operator = operator;
    }


    /**
     * Gets the assertionStatusItem value for this AssertionStatusReport.
     * 
     * @return assertionStatusItem
     */
    public test.wsdl.dataobjects.uddi_v2.AssertionStatusItem[] getAssertionStatusItem() {
        return assertionStatusItem;
    }


    /**
     * Sets the assertionStatusItem value for this AssertionStatusReport.
     * 
     * @param assertionStatusItem
     */
    public void setAssertionStatusItem(test.wsdl.dataobjects.uddi_v2.AssertionStatusItem[] assertionStatusItem) {
        this.assertionStatusItem = assertionStatusItem;
    }

    public test.wsdl.dataobjects.uddi_v2.AssertionStatusItem getAssertionStatusItem(int i) {
        return this.assertionStatusItem[i];
    }

    public void setAssertionStatusItem(int i, test.wsdl.dataobjects.uddi_v2.AssertionStatusItem _value) {
        this.assertionStatusItem[i] = _value;
    }


    /**
     * Gets the generic value for this AssertionStatusReport.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this AssertionStatusReport.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this AssertionStatusReport.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this AssertionStatusReport.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertionStatusReport)) return false;
        AssertionStatusReport other = (AssertionStatusReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assertionStatusItem==null && other.getAssertionStatusItem()==null) || 
             (this.assertionStatusItem!=null &&
              java.util.Arrays.equals(this.assertionStatusItem, other.getAssertionStatusItem()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getAssertionStatusItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssertionStatusItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssertionStatusItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssertionStatusReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "assertionStatusReport"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionStatusItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "assertionStatusItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "assertionStatusItem"));
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
