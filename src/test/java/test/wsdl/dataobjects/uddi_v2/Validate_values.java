/**
 * Validate_values.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Validate_values  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity;

    private test.wsdl.dataobjects.uddi_v2.BusinessService[] businessService;

    private test.wsdl.dataobjects.uddi_v2.TModel[] tModel;

    private java.lang.String generic;  // attribute

    public Validate_values() {
    }

    public Validate_values(
           test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity,
           test.wsdl.dataobjects.uddi_v2.BusinessService[] businessService,
           test.wsdl.dataobjects.uddi_v2.TModel[] tModel,
           java.lang.String generic) {
           this.businessEntity = businessEntity;
           this.businessService = businessService;
           this.tModel = tModel;
           this.generic = generic;
    }


    /**
     * Gets the businessEntity value for this Validate_values.
     * 
     * @return businessEntity
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessEntity[] getBusinessEntity() {
        return businessEntity;
    }


    /**
     * Sets the businessEntity value for this Validate_values.
     * 
     * @param businessEntity
     */
    public void setBusinessEntity(test.wsdl.dataobjects.uddi_v2.BusinessEntity[] businessEntity) {
        this.businessEntity = businessEntity;
    }

    public test.wsdl.dataobjects.uddi_v2.BusinessEntity getBusinessEntity(int i) {
        return this.businessEntity[i];
    }

    public void setBusinessEntity(int i, test.wsdl.dataobjects.uddi_v2.BusinessEntity _value) {
        this.businessEntity[i] = _value;
    }


    /**
     * Gets the businessService value for this Validate_values.
     * 
     * @return businessService
     */
    public test.wsdl.dataobjects.uddi_v2.BusinessService[] getBusinessService() {
        return businessService;
    }


    /**
     * Sets the businessService value for this Validate_values.
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


    /**
     * Gets the tModel value for this Validate_values.
     * 
     * @return tModel
     */
    public test.wsdl.dataobjects.uddi_v2.TModel[] getTModel() {
        return tModel;
    }


    /**
     * Sets the tModel value for this Validate_values.
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
     * Gets the generic value for this Validate_values.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this Validate_values.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Validate_values)) return false;
        Validate_values other = (Validate_values) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessEntity==null && other.getBusinessEntity()==null) || 
             (this.businessEntity!=null &&
              java.util.Arrays.equals(this.businessEntity, other.getBusinessEntity()))) &&
            ((this.businessService==null && other.getBusinessService()==null) || 
             (this.businessService!=null &&
              java.util.Arrays.equals(this.businessService, other.getBusinessService()))) &&
            ((this.tModel==null && other.getTModel()==null) || 
             (this.tModel!=null &&
              java.util.Arrays.equals(this.tModel, other.getTModel()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric())));
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
        if (getBusinessEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Validate_values.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "validate_values"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("generic");
        attrField.setXmlName(new javax.xml.namespace.QName("", "generic"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "businessService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "tModel"));
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
