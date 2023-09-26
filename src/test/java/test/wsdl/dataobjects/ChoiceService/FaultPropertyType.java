/**
 * FaultPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ChoiceService;

public class FaultPropertyType  implements java.io.Serializable {
    private test.wsdl.dataobjects.ChoiceService.FaultType fault1;

    private test.wsdl.dataobjects.ChoiceService.StagingFaultType fault2;

    private test.wsdl.dataobjects.ChoiceService.SetResourceProperties setResourceProperties;

    public FaultPropertyType() {
    }

    public FaultPropertyType(
           test.wsdl.dataobjects.ChoiceService.FaultType fault1,
           test.wsdl.dataobjects.ChoiceService.StagingFaultType fault2,
           test.wsdl.dataobjects.ChoiceService.SetResourceProperties setResourceProperties) {
           this.fault1 = fault1;
           this.fault2 = fault2;
           this.setResourceProperties = setResourceProperties;
    }


    /**
     * Gets the fault1 value for this FaultPropertyType.
     * 
     * @return fault1
     */
    public test.wsdl.dataobjects.ChoiceService.FaultType getFault1() {
        return fault1;
    }


    /**
     * Sets the fault1 value for this FaultPropertyType.
     * 
     * @param fault1
     */
    public void setFault1(test.wsdl.dataobjects.ChoiceService.FaultType fault1) {
        this.fault1 = fault1;
    }


    /**
     * Gets the fault2 value for this FaultPropertyType.
     * 
     * @return fault2
     */
    public test.wsdl.dataobjects.ChoiceService.StagingFaultType getFault2() {
        return fault2;
    }


    /**
     * Sets the fault2 value for this FaultPropertyType.
     * 
     * @param fault2
     */
    public void setFault2(test.wsdl.dataobjects.ChoiceService.StagingFaultType fault2) {
        this.fault2 = fault2;
    }


    /**
     * Gets the setResourceProperties value for this FaultPropertyType.
     * 
     * @return setResourceProperties
     */
    public test.wsdl.dataobjects.ChoiceService.SetResourceProperties getSetResourceProperties() {
        return setResourceProperties;
    }


    /**
     * Sets the setResourceProperties value for this FaultPropertyType.
     * 
     * @param setResourceProperties
     */
    public void setSetResourceProperties(test.wsdl.dataobjects.ChoiceService.SetResourceProperties setResourceProperties) {
        this.setResourceProperties = setResourceProperties;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultPropertyType)) return false;
        FaultPropertyType other = (FaultPropertyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fault1==null && other.getFault1()==null) || 
             (this.fault1!=null &&
              this.fault1.equals(other.getFault1()))) &&
            ((this.fault2==null && other.getFault2()==null) || 
             (this.fault2!=null &&
              this.fault2.equals(other.getFault2()))) &&
            ((this.setResourceProperties==null && other.getSetResourceProperties()==null) || 
             (this.setResourceProperties!=null &&
              this.setResourceProperties.equals(other.getSetResourceProperties())));
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
        if (getFault1() != null) {
            _hashCode += getFault1().hashCode();
        }
        if (getFault2() != null) {
            _hashCode += getFault2().hashCode();
        }
        if (getSetResourceProperties() != null) {
            _hashCode += getSetResourceProperties().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultPropertyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "FaultPropertyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fault1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "FaultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fault2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "StagingFaultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setResourceProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SetResourceProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetResourceProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
