/**
 * Record2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ChoiceService;

public class Record2  implements java.io.Serializable {
    private test.wsdl.dataobjects.ChoiceService.FaultPropertyType elem;

    public Record2() {
    }

    public Record2(
           test.wsdl.dataobjects.ChoiceService.FaultPropertyType elem) {
           this.elem = elem;
    }


    /**
     * Gets the elem value for this Record2.
     * 
     * @return elem
     */
    public test.wsdl.dataobjects.ChoiceService.FaultPropertyType getElem() {
        return elem;
    }


    /**
     * Sets the elem value for this Record2.
     * 
     * @param elem
     */
    public void setElem(test.wsdl.dataobjects.ChoiceService.FaultPropertyType elem) {
        this.elem = elem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Record2)) return false;
        Record2 other = (Record2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elem==null && other.getElem()==null) || 
             (this.elem!=null &&
              this.elem.equals(other.getElem())));
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
        if (getElem() != null) {
            _hashCode += getElem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Record2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Record2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "elem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "FaultPropertyType"));
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
