/**
 * ScheduleStateEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ScheduleStateEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleStateEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Ready = "Ready";
    public static final java.lang.String _Running = "Running";
    public static final java.lang.String _Paused = "Paused";
    public static final java.lang.String _Expired = "Expired";
    public static final java.lang.String _Failing = "Failing";
    public static final ScheduleStateEnum Ready = new ScheduleStateEnum(_Ready);
    public static final ScheduleStateEnum Running = new ScheduleStateEnum(_Running);
    public static final ScheduleStateEnum Paused = new ScheduleStateEnum(_Paused);
    public static final ScheduleStateEnum Expired = new ScheduleStateEnum(_Expired);
    public static final ScheduleStateEnum Failing = new ScheduleStateEnum(_Failing);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleStateEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleStateEnum enumeration = (ScheduleStateEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleStateEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleStateEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ScheduleStateEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
