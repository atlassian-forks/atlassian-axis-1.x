/**
 * CSTimeStamp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSTimeStamp  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSInteger timeZone;

    private test.wsdl.dataobjects.good.CSBoolean daylightSaving;

    private test.wsdl.dataobjects.good.CSUniversalTime universalTime;

    public CSTimeStamp() {
    }

    public CSTimeStamp(
           test.wsdl.dataobjects.good.CSInteger timeZone,
           test.wsdl.dataobjects.good.CSBoolean daylightSaving,
           test.wsdl.dataobjects.good.CSUniversalTime universalTime) {
           this.timeZone = timeZone;
           this.daylightSaving = daylightSaving;
           this.universalTime = universalTime;
    }


    /**
     * Gets the timeZone value for this CSTimeStamp.
     * 
     * @return timeZone
     */
    public test.wsdl.dataobjects.good.CSInteger getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this CSTimeStamp.
     * 
     * @param timeZone
     */
    public void setTimeZone(test.wsdl.dataobjects.good.CSInteger timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the daylightSaving value for this CSTimeStamp.
     * 
     * @return daylightSaving
     */
    public test.wsdl.dataobjects.good.CSBoolean getDaylightSaving() {
        return daylightSaving;
    }


    /**
     * Sets the daylightSaving value for this CSTimeStamp.
     * 
     * @param daylightSaving
     */
    public void setDaylightSaving(test.wsdl.dataobjects.good.CSBoolean daylightSaving) {
        this.daylightSaving = daylightSaving;
    }


    /**
     * Gets the universalTime value for this CSTimeStamp.
     * 
     * @return universalTime
     */
    public test.wsdl.dataobjects.good.CSUniversalTime getUniversalTime() {
        return universalTime;
    }


    /**
     * Sets the universalTime value for this CSTimeStamp.
     * 
     * @param universalTime
     */
    public void setUniversalTime(test.wsdl.dataobjects.good.CSUniversalTime universalTime) {
        this.universalTime = universalTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSTimeStamp)) return false;
        CSTimeStamp other = (CSTimeStamp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.daylightSaving==null && other.getDaylightSaving()==null) || 
             (this.daylightSaving!=null &&
              this.daylightSaving.equals(other.getDaylightSaving()))) &&
            ((this.universalTime==null && other.getUniversalTime()==null) || 
             (this.universalTime!=null &&
              this.universalTime.equals(other.getUniversalTime())));
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
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getDaylightSaving() != null) {
            _hashCode += getDaylightSaving().hashCode();
        }
        if (getUniversalTime() != null) {
            _hashCode += getUniversalTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSTimeStamp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeStamp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daylightSaving");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daylightSaving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("universalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "universalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSUniversalTime"));
        elemField.setNillable(true);
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
