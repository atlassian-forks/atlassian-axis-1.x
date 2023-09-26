/**
 * ArrayOfAttributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.echo;

public class ArrayOfAttributeRequest  implements java.io.Serializable {
    private test.wsdl.dataobjects.echo.AttributeRequest[] item;

    public ArrayOfAttributeRequest() {
    }

    public ArrayOfAttributeRequest(
           test.wsdl.dataobjects.echo.AttributeRequest[] item) {
           this.item = item;
    }


    /**
     * Gets the item value for this ArrayOfAttributeRequest.
     * 
     * @return item
     */
    public test.wsdl.dataobjects.echo.AttributeRequest[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ArrayOfAttributeRequest.
     * 
     * @param item
     */
    public void setItem(test.wsdl.dataobjects.echo.AttributeRequest[] item) {
        this.item = item;
    }

    public test.wsdl.dataobjects.echo.AttributeRequest getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, test.wsdl.dataobjects.echo.AttributeRequest _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAttributeRequest)) return false;
        ArrayOfAttributeRequest other = (ArrayOfAttributeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAttributeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "ArrayOfAttributeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.echo.services", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.echo.services", "AttributeRequest"));
        elemField.setMinOccurs(0);
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
