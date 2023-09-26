/**
 * ArrayOfReportHistorySnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfReportHistorySnapshot  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ReportHistorySnapshot[] reportHistorySnapshot;

    public ArrayOfReportHistorySnapshot() {
    }

    public ArrayOfReportHistorySnapshot(
           test.wsdl.dataobjects.reportservice.ReportHistorySnapshot[] reportHistorySnapshot) {
           this.reportHistorySnapshot = reportHistorySnapshot;
    }


    /**
     * Gets the reportHistorySnapshot value for this ArrayOfReportHistorySnapshot.
     * 
     * @return reportHistorySnapshot
     */
    public test.wsdl.dataobjects.reportservice.ReportHistorySnapshot[] getReportHistorySnapshot() {
        return reportHistorySnapshot;
    }


    /**
     * Sets the reportHistorySnapshot value for this ArrayOfReportHistorySnapshot.
     * 
     * @param reportHistorySnapshot
     */
    public void setReportHistorySnapshot(test.wsdl.dataobjects.reportservice.ReportHistorySnapshot[] reportHistorySnapshot) {
        this.reportHistorySnapshot = reportHistorySnapshot;
    }

    public test.wsdl.dataobjects.reportservice.ReportHistorySnapshot getReportHistorySnapshot(int i) {
        return this.reportHistorySnapshot[i];
    }

    public void setReportHistorySnapshot(int i, test.wsdl.dataobjects.reportservice.ReportHistorySnapshot _value) {
        this.reportHistorySnapshot[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfReportHistorySnapshot)) return false;
        ArrayOfReportHistorySnapshot other = (ArrayOfReportHistorySnapshot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportHistorySnapshot==null && other.getReportHistorySnapshot()==null) || 
             (this.reportHistorySnapshot!=null &&
              java.util.Arrays.equals(this.reportHistorySnapshot, other.getReportHistorySnapshot())));
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
        if (getReportHistorySnapshot() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportHistorySnapshot());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportHistorySnapshot(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfReportHistorySnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfReportHistorySnapshot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportHistorySnapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportHistorySnapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportHistorySnapshot"));
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
