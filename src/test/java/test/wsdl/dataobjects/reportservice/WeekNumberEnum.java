/**
 * WeekNumberEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class WeekNumberEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WeekNumberEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FirstWeek = "FirstWeek";
    public static final java.lang.String _SecondWeek = "SecondWeek";
    public static final java.lang.String _ThirdWeek = "ThirdWeek";
    public static final java.lang.String _FourthWeek = "FourthWeek";
    public static final java.lang.String _LastWeek = "LastWeek";
    public static final WeekNumberEnum FirstWeek = new WeekNumberEnum(_FirstWeek);
    public static final WeekNumberEnum SecondWeek = new WeekNumberEnum(_SecondWeek);
    public static final WeekNumberEnum ThirdWeek = new WeekNumberEnum(_ThirdWeek);
    public static final WeekNumberEnum FourthWeek = new WeekNumberEnum(_FourthWeek);
    public static final WeekNumberEnum LastWeek = new WeekNumberEnum(_LastWeek);
    public java.lang.String getValue() { return _value_;}
    public static WeekNumberEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WeekNumberEnum enumeration = (WeekNumberEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WeekNumberEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WeekNumberEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WeekNumberEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
