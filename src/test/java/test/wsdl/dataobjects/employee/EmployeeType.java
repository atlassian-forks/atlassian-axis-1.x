/**
 * EmployeeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.employee;

public class EmployeeType  implements java.io.Serializable {
    private test.wsdl.dataobjects.employee.NameType empName;

    private int empID;

    public EmployeeType() {
    }

    public EmployeeType(
           test.wsdl.dataobjects.employee.NameType empName,
           int empID) {
           this.empName = empName;
           this.empID = empID;
    }


    /**
     * Gets the empName value for this EmployeeType.
     * 
     * @return empName
     */
    public test.wsdl.dataobjects.employee.NameType getEmpName() {
        return empName;
    }


    /**
     * Sets the empName value for this EmployeeType.
     * 
     * @param empName
     */
    public void setEmpName(test.wsdl.dataobjects.employee.NameType empName) {
        this.empName = empName;
    }


    /**
     * Gets the empID value for this EmployeeType.
     * 
     * @return empID
     */
    public int getEmpID() {
        return empID;
    }


    /**
     * Sets the empID value for this EmployeeType.
     * 
     * @param empID
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeType)) return false;
        EmployeeType other = (EmployeeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empName==null && other.getEmpName()==null) || 
             (this.empName!=null &&
              this.empName.equals(other.getEmpName()))) &&
            this.empID == other.getEmpID();
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
        if (getEmpName() != null) {
            _hashCode += getEmpName().hashCode();
        }
        _hashCode += getEmpID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sun.com/JSR172AppendixA.xsd", "EmployeeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sun.com/JSR172AppendixA.xsd", "empName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sun.com/JSR172AppendixA.xsd", "NameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sun.com/JSR172AppendixA.xsd", "empID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
