/**
 * Person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.Compound1;

public class Person  implements java.io.Serializable {
    private double age;

    private float ID;

    private java.lang.String name;  // attribute

    private boolean male;  // attribute

    public Person() {
    }

    public Person(
           double age,
           float ID,
           java.lang.String name,
           boolean male) {
           this.age = age;
           this.ID = ID;
           this.name = name;
           this.male = male;
    }


    /**
     * Gets the age value for this Person.
     * 
     * @return age
     */
    public double getAge() {
        return age;
    }


    /**
     * Sets the age value for this Person.
     * 
     * @param age
     */
    public void setAge(double age) {
        this.age = age;
    }


    /**
     * Gets the ID value for this Person.
     * 
     * @return ID
     */
    public float getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Person.
     * 
     * @param ID
     */
    public void setID(float ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this Person.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Person.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the male value for this Person.
     * 
     * @return male
     */
    public boolean isMale() {
        return male;
    }


    /**
     * Sets the male value for this Person.
     * 
     * @param male
     */
    public void setMale(boolean male) {
        this.male = male;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.age == other.getAge() &&
            this.ID == other.getID() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.male == other.isMale();
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
        _hashCode += new Double(getAge()).hashCode();
        _hashCode += new Float(getID()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isMale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Person.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "Person"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("male");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Male"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "Age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
