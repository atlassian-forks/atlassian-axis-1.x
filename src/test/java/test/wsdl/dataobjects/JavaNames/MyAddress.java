/**
 * MyAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.JavaNames;

public class MyAddress  implements java.io.Serializable {
    private int streetNum;

    private java.lang.String streetName;

    private java.lang.String city;

    private java.lang.String state;

    private int zip;

    private test.wsdl.dataobjects.JavaNames.MyPhone phoneNumber;

    public MyAddress() {
    }

    public MyAddress(
           int streetNum,
           java.lang.String streetName,
           java.lang.String city,
           java.lang.String state,
           int zip,
           test.wsdl.dataobjects.JavaNames.MyPhone phoneNumber) {
           this.streetNum = streetNum;
           this.streetName = streetName;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the streetNum value for this MyAddress.
     * 
     * @return streetNum
     */
    public int getStreetNum() {
        return streetNum;
    }


    /**
     * Sets the streetNum value for this MyAddress.
     * 
     * @param streetNum
     */
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }


    /**
     * Gets the streetName value for this MyAddress.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this MyAddress.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the city value for this MyAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this MyAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this MyAddress.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this MyAddress.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this MyAddress.
     * 
     * @return zip
     */
    public int getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this MyAddress.
     * 
     * @param zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }


    /**
     * Gets the phoneNumber value for this MyAddress.
     * 
     * @return phoneNumber
     */
    public test.wsdl.dataobjects.JavaNames.MyPhone getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this MyAddress.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(test.wsdl.dataobjects.JavaNames.MyPhone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyAddress)) return false;
        MyAddress other = (MyAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.streetNum == other.getStreetNum() &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.zip == other.getZip() &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber())));
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
        _hashCode += getStreetNum();
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getZip();
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://names.wsdl.test/javanames", "my.address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street-Num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street-Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone.Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://names.wsdl.test/javanames", "my-phone"));
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
