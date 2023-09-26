/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.Compound2;

public class Employee  implements java.io.Serializable {
    private test.wsdl.dataobjects.Compound2.Person person;

    private double salary;

    private int ID;

    public Employee() {
    }

    public Employee(
           test.wsdl.dataobjects.Compound2.Person person,
           double salary,
           int ID) {
           this.person = person;
           this.salary = salary;
           this.ID = ID;
    }


    /**
     * Gets the person value for this Employee.
     * 
     * @return person
     */
    public test.wsdl.dataobjects.Compound2.Person getPerson() {
        return person;
    }


    /**
     * Sets the person value for this Employee.
     * 
     * @param person
     */
    public void setPerson(test.wsdl.dataobjects.Compound2.Person person) {
        this.person = person;
    }


    /**
     * Gets the salary value for this Employee.
     * 
     * @return salary
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this Employee.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Gets the ID value for this Employee.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Employee.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            this.salary == other.getSalary() &&
            this.ID == other.getID();
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        _hashCode += new Double(getSalary()).hashCode();
        _hashCode += getID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/employee", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/employee", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapinterop.org/person", "Person"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/employee", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soapinterop.org/employee", "ID"));
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
