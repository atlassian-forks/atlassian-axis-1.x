/**
 * ArrayOfReportParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfReportParameter  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ReportParameter[] reportParameter;

    public ArrayOfReportParameter() {
    }

    public ArrayOfReportParameter(
           test.wsdl.dataobjects.reportservice.ReportParameter[] reportParameter) {
           this.reportParameter = reportParameter;
    }


    /**
     * Gets the reportParameter value for this ArrayOfReportParameter.
     * 
     * @return reportParameter
     */
    public test.wsdl.dataobjects.reportservice.ReportParameter[] getReportParameter() {
        return reportParameter;
    }


    /**
     * Sets the reportParameter value for this ArrayOfReportParameter.
     * 
     * @param reportParameter
     */
    public void setReportParameter(test.wsdl.dataobjects.reportservice.ReportParameter[] reportParameter) {
        this.reportParameter = reportParameter;
    }

    public test.wsdl.dataobjects.reportservice.ReportParameter getReportParameter(int i) {
        return this.reportParameter[i];
    }

    public void setReportParameter(int i, test.wsdl.dataobjects.reportservice.ReportParameter _value) {
        this.reportParameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfReportParameter)) return false;
        ArrayOfReportParameter other = (ArrayOfReportParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportParameter==null && other.getReportParameter()==null) || 
             (this.reportParameter!=null &&
              java.util.Arrays.equals(this.reportParameter, other.getReportParameter())));
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
        if (getReportParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfReportParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfReportParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ReportParameter"));
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
