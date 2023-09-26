/**
 * DataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class DataSource  implements java.io.Serializable {
    private java.lang.String name;

    private test.wsdl.dataobjects.reportservice.InvalidDataSourceReference invalidDataSourceReference;

    private test.wsdl.dataobjects.reportservice.DataSourceReference dataSourceReference;

    private test.wsdl.dataobjects.reportservice.DataSourceDefinition dataSourceDefinition;

    public DataSource() {
    }

    public DataSource(
           java.lang.String name,
           test.wsdl.dataobjects.reportservice.InvalidDataSourceReference invalidDataSourceReference,
           test.wsdl.dataobjects.reportservice.DataSourceReference dataSourceReference,
           test.wsdl.dataobjects.reportservice.DataSourceDefinition dataSourceDefinition) {
           this.name = name;
           this.invalidDataSourceReference = invalidDataSourceReference;
           this.dataSourceReference = dataSourceReference;
           this.dataSourceDefinition = dataSourceDefinition;
    }


    /**
     * Gets the name value for this DataSource.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataSource.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the invalidDataSourceReference value for this DataSource.
     * 
     * @return invalidDataSourceReference
     */
    public test.wsdl.dataobjects.reportservice.InvalidDataSourceReference getInvalidDataSourceReference() {
        return invalidDataSourceReference;
    }


    /**
     * Sets the invalidDataSourceReference value for this DataSource.
     * 
     * @param invalidDataSourceReference
     */
    public void setInvalidDataSourceReference(test.wsdl.dataobjects.reportservice.InvalidDataSourceReference invalidDataSourceReference) {
        this.invalidDataSourceReference = invalidDataSourceReference;
    }


    /**
     * Gets the dataSourceReference value for this DataSource.
     * 
     * @return dataSourceReference
     */
    public test.wsdl.dataobjects.reportservice.DataSourceReference getDataSourceReference() {
        return dataSourceReference;
    }


    /**
     * Sets the dataSourceReference value for this DataSource.
     * 
     * @param dataSourceReference
     */
    public void setDataSourceReference(test.wsdl.dataobjects.reportservice.DataSourceReference dataSourceReference) {
        this.dataSourceReference = dataSourceReference;
    }


    /**
     * Gets the dataSourceDefinition value for this DataSource.
     * 
     * @return dataSourceDefinition
     */
    public test.wsdl.dataobjects.reportservice.DataSourceDefinition getDataSourceDefinition() {
        return dataSourceDefinition;
    }


    /**
     * Sets the dataSourceDefinition value for this DataSource.
     * 
     * @param dataSourceDefinition
     */
    public void setDataSourceDefinition(test.wsdl.dataobjects.reportservice.DataSourceDefinition dataSourceDefinition) {
        this.dataSourceDefinition = dataSourceDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSource)) return false;
        DataSource other = (DataSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.invalidDataSourceReference==null && other.getInvalidDataSourceReference()==null) || 
             (this.invalidDataSourceReference!=null &&
              this.invalidDataSourceReference.equals(other.getInvalidDataSourceReference()))) &&
            ((this.dataSourceReference==null && other.getDataSourceReference()==null) || 
             (this.dataSourceReference!=null &&
              this.dataSourceReference.equals(other.getDataSourceReference()))) &&
            ((this.dataSourceDefinition==null && other.getDataSourceDefinition()==null) || 
             (this.dataSourceDefinition!=null &&
              this.dataSourceDefinition.equals(other.getDataSourceDefinition())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getInvalidDataSourceReference() != null) {
            _hashCode += getInvalidDataSourceReference().hashCode();
        }
        if (getDataSourceReference() != null) {
            _hashCode += getDataSourceReference().hashCode();
        }
        if (getDataSourceDefinition() != null) {
            _hashCode += getDataSourceDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidDataSourceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "InvalidDataSourceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "InvalidDataSourceReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSourceDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
