/**
 * PersionCat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class PersionCat  extends test.wsdl.dataobjects.ComprehensiveTypes.Cat  implements java.io.Serializable {
    private java.lang.String color;

    private java.lang.Object toy;

    public PersionCat() {
    }

    public PersionCat(
           java.lang.String name,
           java.lang.String purr,
           java.lang.String color,
           java.lang.Object toy) {
        super(
            name,
            purr);
        this.color = color;
        this.toy = toy;
    }


    /**
     * Gets the color value for this PersionCat.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this PersionCat.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the toy value for this PersionCat.
     * 
     * @return toy
     */
    public java.lang.Object getToy() {
        return toy;
    }


    /**
     * Sets the toy value for this PersionCat.
     * 
     * @param toy
     */
    public void setToy(java.lang.Object toy) {
        this.toy = toy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersionCat)) return false;
        PersionCat other = (PersionCat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.toy==null && other.getToy()==null) || 
             (this.toy!=null &&
              this.toy.equals(other.getToy())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getToy() != null) {
            _hashCode += getToy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersionCat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "PersionCat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Toy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
