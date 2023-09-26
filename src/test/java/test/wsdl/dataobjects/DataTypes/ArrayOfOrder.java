/**
 * ArrayOfOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataTypes;

public class ArrayOfOrder  implements java.io.Serializable {
    private test.wsdl.dataobjects.DataTypes.Order[] order;

    public ArrayOfOrder() {
    }

    public ArrayOfOrder(
           test.wsdl.dataobjects.DataTypes.Order[] order) {
           this.order = order;
    }


    /**
     * Gets the order value for this ArrayOfOrder.
     * 
     * @return order
     */
    public test.wsdl.dataobjects.DataTypes.Order[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ArrayOfOrder.
     * 
     * @param order
     */
    public void setOrder(test.wsdl.dataobjects.DataTypes.Order[] order) {
        this.order = order;
    }

    public test.wsdl.dataobjects.DataTypes.Order getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, test.wsdl.dataobjects.DataTypes.Order _value) {
        this.order[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOrder)) return false;
        ArrayOfOrder other = (ArrayOfOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder())));
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
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:dataTypes", "ArrayOfOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:dataTypes", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:dataTypes", "Order"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
