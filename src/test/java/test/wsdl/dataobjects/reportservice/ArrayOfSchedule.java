/**
 * ArrayOfSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfSchedule  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.Schedule[] schedule;

    public ArrayOfSchedule() {
    }

    public ArrayOfSchedule(
           test.wsdl.dataobjects.reportservice.Schedule[] schedule) {
           this.schedule = schedule;
    }


    /**
     * Gets the schedule value for this ArrayOfSchedule.
     * 
     * @return schedule
     */
    public test.wsdl.dataobjects.reportservice.Schedule[] getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this ArrayOfSchedule.
     * 
     * @param schedule
     */
    public void setSchedule(test.wsdl.dataobjects.reportservice.Schedule[] schedule) {
        this.schedule = schedule;
    }

    public test.wsdl.dataobjects.reportservice.Schedule getSchedule(int i) {
        return this.schedule[i];
    }

    public void setSchedule(int i, test.wsdl.dataobjects.reportservice.Schedule _value) {
        this.schedule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSchedule)) return false;
        ArrayOfSchedule other = (ArrayOfSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              java.util.Arrays.equals(this.schedule, other.getSchedule())));
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
        if (getSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedule(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Schedule"));
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
