/**
 * Record1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.AttrGroupService;

public class Record1  implements java.io.Serializable {
    private int elem1;

    private int attr1;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private org.apache.axis.types.URI href;  // attribute

    private java.lang.String attr3;  // attribute

    public Record1() {
    }

    public Record1(
           int elem1,
           int attr1,
           org.apache.axis.types.Id id,
           org.apache.axis.types.URI href,
           java.lang.String attr3) {
           this.elem1 = elem1;
           this.attr1 = attr1;
           this.id = id;
           this.href = href;
           this.attr3 = attr3;
    }


    /**
     * Gets the elem1 value for this Record1.
     * 
     * @return elem1
     */
    public int getElem1() {
        return elem1;
    }


    /**
     * Sets the elem1 value for this Record1.
     * 
     * @param elem1
     */
    public void setElem1(int elem1) {
        this.elem1 = elem1;
    }


    /**
     * Gets the attr1 value for this Record1.
     * 
     * @return attr1
     */
    public int getAttr1() {
        return attr1;
    }


    /**
     * Sets the attr1 value for this Record1.
     * 
     * @param attr1
     */
    public void setAttr1(int attr1) {
        this.attr1 = attr1;
    }


    /**
     * Gets the id value for this Record1.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Record1.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the href value for this Record1.
     * 
     * @return href
     */
    public org.apache.axis.types.URI getHref() {
        return href;
    }


    /**
     * Sets the href value for this Record1.
     * 
     * @param href
     */
    public void setHref(org.apache.axis.types.URI href) {
        this.href = href;
    }


    /**
     * Gets the attr3 value for this Record1.
     * 
     * @return attr3
     */
    public java.lang.String getAttr3() {
        return attr3;
    }


    /**
     * Sets the attr3 value for this Record1.
     * 
     * @param attr3
     */
    public void setAttr3(java.lang.String attr3) {
        this.attr3 = attr3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Record1)) return false;
        Record1 other = (Record1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.elem1 == other.getElem1() &&
            this.attr1 == other.getAttr1() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.attr3==null && other.getAttr3()==null) || 
             (this.attr3!=null &&
              this.attr3.equals(other.getAttr3())));
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
        _hashCode += getElem1();
        _hashCode += getAttr1();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getAttr3() != null) {
            _hashCode += getAttr3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Record1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Record1"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attr1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attr1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("href");
        attrField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "href"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attr3");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attr3"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elem1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "elem1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
