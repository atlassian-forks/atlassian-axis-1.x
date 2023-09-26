/**
 * DataSetDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class DataSetDefinition  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.ArrayOfField fields;

    private test.wsdl.dataobjects.reportservice.QueryDefinition query;

    private test.wsdl.dataobjects.reportservice.SensitivityEnum caseSensitivity;

    private java.lang.String collation;

    private test.wsdl.dataobjects.reportservice.SensitivityEnum accentSensitivity;

    private test.wsdl.dataobjects.reportservice.SensitivityEnum kanatypeSensitivity;

    private test.wsdl.dataobjects.reportservice.SensitivityEnum widthSensitivity;

    private java.lang.String name;

    public DataSetDefinition() {
    }

    public DataSetDefinition(
           test.wsdl.dataobjects.reportservice.ArrayOfField fields,
           test.wsdl.dataobjects.reportservice.QueryDefinition query,
           test.wsdl.dataobjects.reportservice.SensitivityEnum caseSensitivity,
           java.lang.String collation,
           test.wsdl.dataobjects.reportservice.SensitivityEnum accentSensitivity,
           test.wsdl.dataobjects.reportservice.SensitivityEnum kanatypeSensitivity,
           test.wsdl.dataobjects.reportservice.SensitivityEnum widthSensitivity,
           java.lang.String name) {
           this.fields = fields;
           this.query = query;
           this.caseSensitivity = caseSensitivity;
           this.collation = collation;
           this.accentSensitivity = accentSensitivity;
           this.kanatypeSensitivity = kanatypeSensitivity;
           this.widthSensitivity = widthSensitivity;
           this.name = name;
    }


    /**
     * Gets the fields value for this DataSetDefinition.
     * 
     * @return fields
     */
    public test.wsdl.dataobjects.reportservice.ArrayOfField getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this DataSetDefinition.
     * 
     * @param fields
     */
    public void setFields(test.wsdl.dataobjects.reportservice.ArrayOfField fields) {
        this.fields = fields;
    }


    /**
     * Gets the query value for this DataSetDefinition.
     * 
     * @return query
     */
    public test.wsdl.dataobjects.reportservice.QueryDefinition getQuery() {
        return query;
    }


    /**
     * Sets the query value for this DataSetDefinition.
     * 
     * @param query
     */
    public void setQuery(test.wsdl.dataobjects.reportservice.QueryDefinition query) {
        this.query = query;
    }


    /**
     * Gets the caseSensitivity value for this DataSetDefinition.
     * 
     * @return caseSensitivity
     */
    public test.wsdl.dataobjects.reportservice.SensitivityEnum getCaseSensitivity() {
        return caseSensitivity;
    }


    /**
     * Sets the caseSensitivity value for this DataSetDefinition.
     * 
     * @param caseSensitivity
     */
    public void setCaseSensitivity(test.wsdl.dataobjects.reportservice.SensitivityEnum caseSensitivity) {
        this.caseSensitivity = caseSensitivity;
    }


    /**
     * Gets the collation value for this DataSetDefinition.
     * 
     * @return collation
     */
    public java.lang.String getCollation() {
        return collation;
    }


    /**
     * Sets the collation value for this DataSetDefinition.
     * 
     * @param collation
     */
    public void setCollation(java.lang.String collation) {
        this.collation = collation;
    }


    /**
     * Gets the accentSensitivity value for this DataSetDefinition.
     * 
     * @return accentSensitivity
     */
    public test.wsdl.dataobjects.reportservice.SensitivityEnum getAccentSensitivity() {
        return accentSensitivity;
    }


    /**
     * Sets the accentSensitivity value for this DataSetDefinition.
     * 
     * @param accentSensitivity
     */
    public void setAccentSensitivity(test.wsdl.dataobjects.reportservice.SensitivityEnum accentSensitivity) {
        this.accentSensitivity = accentSensitivity;
    }


    /**
     * Gets the kanatypeSensitivity value for this DataSetDefinition.
     * 
     * @return kanatypeSensitivity
     */
    public test.wsdl.dataobjects.reportservice.SensitivityEnum getKanatypeSensitivity() {
        return kanatypeSensitivity;
    }


    /**
     * Sets the kanatypeSensitivity value for this DataSetDefinition.
     * 
     * @param kanatypeSensitivity
     */
    public void setKanatypeSensitivity(test.wsdl.dataobjects.reportservice.SensitivityEnum kanatypeSensitivity) {
        this.kanatypeSensitivity = kanatypeSensitivity;
    }


    /**
     * Gets the widthSensitivity value for this DataSetDefinition.
     * 
     * @return widthSensitivity
     */
    public test.wsdl.dataobjects.reportservice.SensitivityEnum getWidthSensitivity() {
        return widthSensitivity;
    }


    /**
     * Sets the widthSensitivity value for this DataSetDefinition.
     * 
     * @param widthSensitivity
     */
    public void setWidthSensitivity(test.wsdl.dataobjects.reportservice.SensitivityEnum widthSensitivity) {
        this.widthSensitivity = widthSensitivity;
    }


    /**
     * Gets the name value for this DataSetDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataSetDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSetDefinition)) return false;
        DataSetDefinition other = (DataSetDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.caseSensitivity==null && other.getCaseSensitivity()==null) || 
             (this.caseSensitivity!=null &&
              this.caseSensitivity.equals(other.getCaseSensitivity()))) &&
            ((this.collation==null && other.getCollation()==null) || 
             (this.collation!=null &&
              this.collation.equals(other.getCollation()))) &&
            ((this.accentSensitivity==null && other.getAccentSensitivity()==null) || 
             (this.accentSensitivity!=null &&
              this.accentSensitivity.equals(other.getAccentSensitivity()))) &&
            ((this.kanatypeSensitivity==null && other.getKanatypeSensitivity()==null) || 
             (this.kanatypeSensitivity!=null &&
              this.kanatypeSensitivity.equals(other.getKanatypeSensitivity()))) &&
            ((this.widthSensitivity==null && other.getWidthSensitivity()==null) || 
             (this.widthSensitivity!=null &&
              this.widthSensitivity.equals(other.getWidthSensitivity()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getCaseSensitivity() != null) {
            _hashCode += getCaseSensitivity().hashCode();
        }
        if (getCollation() != null) {
            _hashCode += getCollation().hashCode();
        }
        if (getAccentSensitivity() != null) {
            _hashCode += getAccentSensitivity().hashCode();
        }
        if (getKanatypeSensitivity() != null) {
            _hashCode += getKanatypeSensitivity().hashCode();
        }
        if (getWidthSensitivity() != null) {
            _hashCode += getWidthSensitivity().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSetDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "DataSetDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "QueryDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseSensitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CaseSensitivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SensitivityEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Collation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accentSensitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "AccentSensitivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SensitivityEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kanatypeSensitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "KanatypeSensitivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SensitivityEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widthSensitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "WidthSensitivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "SensitivityEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
