/**
 * ArrayOfDataSourceCredentials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfDataSourceCredentials  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.DataSourceCredentials[] dataSourceCredentials;

    public ArrayOfDataSourceCredentials() {
    }

    public ArrayOfDataSourceCredentials(
           test.wsdl.dataobjects.reportservice.DataSourceCredentials[] dataSourceCredentials) {
           this.dataSourceCredentials = dataSourceCredentials;
    }


    /**
     * Gets the dataSourceCredentials value for this ArrayOfDataSourceCredentials.
     * 
     * @return dataSourceCredentials
     */
    public test.wsdl.dataobjects.reportservice.DataSourceCredentials[] getDataSourceCredentials() {
        return dataSourceCredentials;
    }


    /**
     * Sets the dataSourceCredentials value for this ArrayOfDataSourceCredentials.
     * 
     * @param dataSourceCredentials
     */
    public void setDataSourceCredentials(test.wsdl.dataobjects.reportservice.DataSourceCredentials[] dataSourceCredentials) {
        this.dataSourceCredentials = dataSourceCredentials;
    }

    public test.wsdl.dataobjects.reportservice.DataSourceCredentials getDataSourceCredentials(int i) {
        return this.dataSourceCredentials[i];
    }

    public void setDataSourceCredentials(int i, test.wsdl.dataobjects.reportservice.DataSourceCredentials _value) {
        this.dataSourceCredentials[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDataSourceCredentials)) return false;
        ArrayOfDataSourceCredentials other = (ArrayOfDataSourceCredentials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSourceCredentials==null && other.getDataSourceCredentials()==null) || 
             (this.dataSourceCredentials!=null &&
              java.util.Arrays.equals(this.dataSourceCredentials, other.getDataSourceCredentials())));
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
        if (getDataSourceCredentials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataSourceCredentials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataSourceCredentials(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDataSourceCredentials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfDataSourceCredentials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceCredentials"));
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
