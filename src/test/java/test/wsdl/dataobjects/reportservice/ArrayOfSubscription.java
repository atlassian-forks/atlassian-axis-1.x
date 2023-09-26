/**
 * ArrayOfSubscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfSubscription  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.Subscription[] subscription;

    public ArrayOfSubscription() {
    }

    public ArrayOfSubscription(
           test.wsdl.dataobjects.reportservice.Subscription[] subscription) {
           this.subscription = subscription;
    }


    /**
     * Gets the subscription value for this ArrayOfSubscription.
     * 
     * @return subscription
     */
    public test.wsdl.dataobjects.reportservice.Subscription[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this ArrayOfSubscription.
     * 
     * @param subscription
     */
    public void setSubscription(test.wsdl.dataobjects.reportservice.Subscription[] subscription) {
        this.subscription = subscription;
    }

    public test.wsdl.dataobjects.reportservice.Subscription getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, test.wsdl.dataobjects.reportservice.Subscription _value) {
        this.subscription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSubscription)) return false;
        ArrayOfSubscription other = (ArrayOfSubscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription())));
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
        if (getSubscription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscription(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSubscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfSubscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Subscription"));
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
