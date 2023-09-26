/**
 * EnumLong.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class EnumLong implements java.io.Serializable {
    private long _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumLong(long value) {
        _value_ = value;
        _table_.put(new java.lang.Long(_value_),this);
    }

    public static final long _value1 = 1L;
    public static final long _value2 = 2L;
    public static final long _value3 = 3L;
    public static final long _value4 = -9223372036854775808L;
    public static final long _value5 = 9223372036854775807L;
    public static final EnumLong value1 = new EnumLong(_value1);
    public static final EnumLong value2 = new EnumLong(_value2);
    public static final EnumLong value3 = new EnumLong(_value3);
    public static final EnumLong value4 = new EnumLong(_value4);
    public static final EnumLong value5 = new EnumLong(_value5);
    public long getValue() { return _value_;}
    public static EnumLong fromValue(long value)
          throws java.lang.IllegalArgumentException {
        EnumLong enumeration = (EnumLong)
            _table_.get(new java.lang.Long(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumLong fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(java.lang.Long.parseLong(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}
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
        new org.apache.axis.description.TypeDesc(EnumLong.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumLong"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
