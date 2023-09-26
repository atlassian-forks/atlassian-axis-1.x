/**
 * Record2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.AttrGroupService;

public class Record2  implements java.io.Serializable {
    private java.lang.String elem2;

    private int attr1;  // attribute

    private double attr2;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    public Record2() {
    }

    public Record2(
           java.lang.String elem2,
           int attr1,
           double attr2,
           org.apache.axis.types.Id id) {
           this.elem2 = elem2;
           this.attr1 = attr1;
           this.attr2 = attr2;
           this.id = id;
    }


    /**
     * Gets the elem2 value for this Record2.
     * 
     * @return elem2
     */
    public java.lang.String getElem2() {
        return elem2;
    }


    /**
     * Sets the elem2 value for this Record2.
     * 
     * @param elem2
     */
    public void setElem2(java.lang.String elem2) {
        this.elem2 = elem2;
    }


    /**
     * Gets the attr1 value for this Record2.
     * 
     * @return attr1
     */
    public int getAttr1() {
        return attr1;
    }


    /**
     * Sets the attr1 value for this Record2.
     * 
     * @param attr1
     */
    public void setAttr1(int attr1) {
        this.attr1 = attr1;
    }


    /**
     * Gets the attr2 value for this Record2.
     * 
     * @return attr2
     */
    public double getAttr2() {
        return attr2;
    }


    /**
     * Sets the attr2 value for this Record2.
     * 
     * @param attr2
     */
    public void setAttr2(double attr2) {
        this.attr2 = attr2;
    }


    /**
     * Gets the id value for this Record2.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Record2.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
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
            ((this.elem2==null && other.getElem2()==null) || 
             (this.elem2!=null &&
              this.elem2.equals(other.getElem2()))) &&
            this.attr1 == other.getAttr1() &&
            this.attr2 == other.getAttr2() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getElem2() != null) {
            _hashCode += getElem2().hashCode();
        }
        _hashCode += getAttr1();
        _hashCode += new Double(getAttr2()).hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Record2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Record2"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attr1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attr1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attr2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attr2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-encoding", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elem2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "elem2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
