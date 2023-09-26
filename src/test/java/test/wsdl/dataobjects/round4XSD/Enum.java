/**
 * Enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.round4XSD;

public class Enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BitOne = "BitOne";
    public static final java.lang.String _BitTwo = "BitTwo";
    public static final java.lang.String _BitThree = "BitThree";
    public static final java.lang.String _BitFour = "BitFour";
    public static final java.lang.String _BitFive = "BitFive";
    public static final Enum BitOne = new Enum(_BitOne);
    public static final Enum BitTwo = new Enum(_BitTwo);
    public static final Enum BitThree = new Enum(_BitThree);
    public static final Enum BitFour = new Enum(_BitFour);
    public static final Enum BitFive = new Enum(_BitFive);
    public java.lang.String getValue() { return _value_;}
    public static Enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Enum enumeration = (Enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Enum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/xsd", "Enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
