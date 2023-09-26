/**
 * ComplexChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class ComplexChoice  implements java.io.Serializable {
    private java.lang.Integer choiceA;

    private java.lang.String choiceB;

    private java.lang.String choiceC;

    public ComplexChoice() {
    }

    public ComplexChoice(
           java.lang.Integer choiceA,
           java.lang.String choiceB,
           java.lang.String choiceC) {
           this.choiceA = choiceA;
           this.choiceB = choiceB;
           this.choiceC = choiceC;
    }


    /**
     * Gets the choiceA value for this ComplexChoice.
     * 
     * @return choiceA
     */
    public java.lang.Integer getChoiceA() {
        return choiceA;
    }


    /**
     * Sets the choiceA value for this ComplexChoice.
     * 
     * @param choiceA
     */
    public void setChoiceA(java.lang.Integer choiceA) {
        this.choiceA = choiceA;
    }


    /**
     * Gets the choiceB value for this ComplexChoice.
     * 
     * @return choiceB
     */
    public java.lang.String getChoiceB() {
        return choiceB;
    }


    /**
     * Sets the choiceB value for this ComplexChoice.
     * 
     * @param choiceB
     */
    public void setChoiceB(java.lang.String choiceB) {
        this.choiceB = choiceB;
    }


    /**
     * Gets the choiceC value for this ComplexChoice.
     * 
     * @return choiceC
     */
    public java.lang.String getChoiceC() {
        return choiceC;
    }


    /**
     * Sets the choiceC value for this ComplexChoice.
     * 
     * @param choiceC
     */
    public void setChoiceC(java.lang.String choiceC) {
        this.choiceC = choiceC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexChoice)) return false;
        ComplexChoice other = (ComplexChoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.choiceA==null && other.getChoiceA()==null) || 
             (this.choiceA!=null &&
              this.choiceA.equals(other.getChoiceA()))) &&
            ((this.choiceB==null && other.getChoiceB()==null) || 
             (this.choiceB!=null &&
              this.choiceB.equals(other.getChoiceB()))) &&
            ((this.choiceC==null && other.getChoiceC()==null) || 
             (this.choiceC!=null &&
              this.choiceC.equals(other.getChoiceC())));
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
        if (getChoiceA() != null) {
            _hashCode += getChoiceA().hashCode();
        }
        if (getChoiceB() != null) {
            _hashCode += getChoiceB().hashCode();
        }
        if (getChoiceC() != null) {
            _hashCode += getChoiceC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexChoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexChoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
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
