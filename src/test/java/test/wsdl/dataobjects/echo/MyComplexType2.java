/**
 * MyComplexType2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class MyComplexType2  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String password;

    private test.wsdl.dataobjects.echo.NamedValue[] options;

    private test.wsdl.dataobjects.echo.AttributeRequest[] userAttributes;

    public MyComplexType2() {
    }

    public MyComplexType2(
           java.lang.String username,
           java.lang.String password,
           test.wsdl.dataobjects.echo.NamedValue[] options,
           test.wsdl.dataobjects.echo.AttributeRequest[] userAttributes) {
           this.username = username;
           this.password = password;
           this.options = options;
           this.userAttributes = userAttributes;
    }


    /**
     * Gets the username value for this MyComplexType2.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this MyComplexType2.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this MyComplexType2.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this MyComplexType2.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the options value for this MyComplexType2.
     * 
     * @return options
     */
    public test.wsdl.dataobjects.echo.NamedValue[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this MyComplexType2.
     * 
     * @param options
     */
    public void setOptions(test.wsdl.dataobjects.echo.NamedValue[] options) {
        this.options = options;
    }

    public test.wsdl.dataobjects.echo.NamedValue getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, test.wsdl.dataobjects.echo.NamedValue _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the userAttributes value for this MyComplexType2.
     * 
     * @return userAttributes
     */
    public test.wsdl.dataobjects.echo.AttributeRequest[] getUserAttributes() {
        return userAttributes;
    }


    /**
     * Sets the userAttributes value for this MyComplexType2.
     * 
     * @param userAttributes
     */
    public void setUserAttributes(test.wsdl.dataobjects.echo.AttributeRequest[] userAttributes) {
        this.userAttributes = userAttributes;
    }

    public test.wsdl.dataobjects.echo.AttributeRequest getUserAttributes(int i) {
        return this.userAttributes[i];
    }

    public void setUserAttributes(int i, test.wsdl.dataobjects.echo.AttributeRequest _value) {
        this.userAttributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyComplexType2)) return false;
        MyComplexType2 other = (MyComplexType2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.userAttributes==null && other.getUserAttributes()==null) || 
             (this.userAttributes!=null &&
              java.util.Arrays.equals(this.userAttributes, other.getUserAttributes())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyComplexType2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "MyComplexType2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "NamedValue"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "userAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "AttributeRequest"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
