/**
 * ItemTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ItemTypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemTypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Folder = "Folder";
    public static final java.lang.String _Report = "Report";
    public static final java.lang.String _Resource = "Resource";
    public static final java.lang.String _LinkedReport = "LinkedReport";
    public static final java.lang.String _DataSource = "DataSource";
    public static final ItemTypeEnum Unknown = new ItemTypeEnum(_Unknown);
    public static final ItemTypeEnum Folder = new ItemTypeEnum(_Folder);
    public static final ItemTypeEnum Report = new ItemTypeEnum(_Report);
    public static final ItemTypeEnum Resource = new ItemTypeEnum(_Resource);
    public static final ItemTypeEnum LinkedReport = new ItemTypeEnum(_LinkedReport);
    public static final ItemTypeEnum DataSource = new ItemTypeEnum(_DataSource);
    public java.lang.String getValue() { return _value_;}
    public static ItemTypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemTypeEnum enumeration = (ItemTypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemTypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemTypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ItemTypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
