/**
 * TModelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class TModelDetail  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.TModel[] tModel;

    private java.lang.String generic;  // attribute

    private java.lang.String operator;  // attribute

    private test.wsdl.dataobjects.uddi_v2.Truncated truncated;  // attribute

    public TModelDetail() {
    }

    public TModelDetail(
           test.wsdl.dataobjects.uddi_v2.TModel[] tModel,
           java.lang.String generic,
           java.lang.String operator,
           test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
           this.tModel = tModel;
           this.generic = generic;
           this.operator = operator;
           this.truncated = truncated;
    }


    /**
     * Gets the tModel value for this TModelDetail.
     * 
     * @return tModel
     */
    public test.wsdl.dataobjects.uddi_v2.TModel[] getTModel() {
        return tModel;
    }


    /**
     * Sets the tModel value for this TModelDetail.
     * 
     * @param tModel
     */
    public void setTModel(test.wsdl.dataobjects.uddi_v2.TModel[] tModel) {
        this.tModel = tModel;
    }

    public test.wsdl.dataobjects.uddi_v2.TModel getTModel(int i) {
        return this.tModel[i];
    }

    public void setTModel(int i, test.wsdl.dataobjects.uddi_v2.TModel _value) {
        this.tModel[i] = _value;
    }


    /**
     * Gets the generic value for this TModelDetail.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this TModelDetail.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the operator value for this TModelDetail.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this TModelDetail.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the truncated value for this TModelDetail.
     * 
     * @return truncated
     */
    public test.wsdl.dataobjects.uddi_v2.Truncated getTruncated() {
        return truncated;
    }


    /**
     * Sets the truncated value for this TModelDetail.
     * 
     * @param truncated
     */
    public void setTruncated(test.wsdl.dataobjects.uddi_v2.Truncated truncated) {
        this.truncated = truncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TModelDetail)) return false;
        TModelDetail other = (TModelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tModel==null && other.getTModel()==null) || 
             (this.tModel!=null &&
              java.util.Arrays.equals(this.tModel, other.getTModel()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.truncated==null && other.getTruncated()==null) || 
             (this.truncated!=null &&
              this.truncated.equals(other.getTruncated())));
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
        if (getTModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTModel(), i);
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
        if (getTruncated() != null) {
            _hashCode += getTruncated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TModelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModelDetail"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("truncated");
        attrField.setXmlName(new javax.xml.namespace.QName("", "truncated"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "truncated"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModel"));
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
