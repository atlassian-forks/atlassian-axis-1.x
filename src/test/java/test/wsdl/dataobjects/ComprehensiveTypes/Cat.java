/**
 * Cat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class Cat  extends test.wsdl.dataobjects.ComprehensiveTypes.Animal  implements java.io.Serializable {
    private java.lang.String purr;

    public Cat() {
    }

    public Cat(
           java.lang.String name,
           java.lang.String purr) {
        super(
            name);
        this.purr = purr;
    }


    /**
     * Gets the purr value for this Cat.
     * 
     * @return purr
     */
    public java.lang.String getPurr() {
        return purr;
    }


    /**
     * Sets the purr value for this Cat.
     * 
     * @param purr
     */
    public void setPurr(java.lang.String purr) {
        this.purr = purr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cat)) return false;
        Cat other = (Cat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purr==null && other.getPurr()==null) || 
             (this.purr!=null &&
              this.purr.equals(other.getPurr())));
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
        if (getPurr() != null) {
            _hashCode += getPurr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Purr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(true);
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
