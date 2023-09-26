/**
 * PutTitleAuthors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.DataService;

public class PutTitleAuthors  implements java.io.Serializable {
    private test.wsdl.dataobjects.DataService.PutTitleAuthorsDS DS;

    public PutTitleAuthors() {
    }

    public PutTitleAuthors(
           test.wsdl.dataobjects.DataService.PutTitleAuthorsDS DS) {
           this.DS = DS;
    }


    /**
     * Gets the DS value for this PutTitleAuthors.
     * 
     * @return DS
     */
    public test.wsdl.dataobjects.DataService.PutTitleAuthorsDS getDS() {
        return DS;
    }


    /**
     * Sets the DS value for this PutTitleAuthors.
     * 
     * @param DS
     */
    public void setDS(test.wsdl.dataobjects.DataService.PutTitleAuthorsDS DS) {
        this.DS = DS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PutTitleAuthors)) return false;
        PutTitleAuthors other = (PutTitleAuthors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DS==null && other.getDS()==null) || 
             (this.DS!=null &&
              this.DS.equals(other.getDS())));
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
        if (getDS() != null) {
            _hashCode += getDS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PutTitleAuthors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PutTitleAuthors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>PutTitleAuthors>DS"));
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
