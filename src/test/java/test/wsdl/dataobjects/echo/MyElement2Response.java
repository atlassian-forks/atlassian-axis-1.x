/**
 * MyElement2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class MyElement2Response  implements java.io.Serializable {
    private test.wsdl.dataobjects.echo.NamedValue[] loginReturn;

    public MyElement2Response() {
    }

    public MyElement2Response(
           test.wsdl.dataobjects.echo.NamedValue[] loginReturn) {
           this.loginReturn = loginReturn;
    }


    /**
     * Gets the loginReturn value for this MyElement2Response.
     * 
     * @return loginReturn
     */
    public test.wsdl.dataobjects.echo.NamedValue[] getLoginReturn() {
        return loginReturn;
    }


    /**
     * Sets the loginReturn value for this MyElement2Response.
     * 
     * @param loginReturn
     */
    public void setLoginReturn(test.wsdl.dataobjects.echo.NamedValue[] loginReturn) {
        this.loginReturn = loginReturn;
    }

    public test.wsdl.dataobjects.echo.NamedValue getLoginReturn(int i) {
        return this.loginReturn[i];
    }

    public void setLoginReturn(int i, test.wsdl.dataobjects.echo.NamedValue _value) {
        this.loginReturn[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyElement2Response)) return false;
        MyElement2Response other = (MyElement2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginReturn==null && other.getLoginReturn()==null) || 
             (this.loginReturn!=null &&
              java.util.Arrays.equals(this.loginReturn, other.getLoginReturn())));
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
        if (getLoginReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoginReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoginReturn(), i);
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
        new org.apache.axis.description.TypeDesc(MyElement2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", ">MyElement2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "loginReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "NamedValue"));
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
