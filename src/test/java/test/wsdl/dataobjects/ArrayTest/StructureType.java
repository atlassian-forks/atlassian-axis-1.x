/**
 * StructureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ArrayTest;

public class StructureType  implements java.io.Serializable {
    private java.lang.Integer[] fld1;

    private java.lang.Integer[] fld2;

    private java.lang.Integer[][] fld3;

    public StructureType() {
    }

    public StructureType(
           java.lang.Integer[] fld1,
           java.lang.Integer[] fld2,
           java.lang.Integer[][] fld3) {
           this.fld1 = fld1;
           this.fld2 = fld2;
           this.fld3 = fld3;
    }


    /**
     * Gets the fld1 value for this StructureType.
     * 
     * @return fld1
     */
    public java.lang.Integer[] getFld1() {
        return fld1;
    }


    /**
     * Sets the fld1 value for this StructureType.
     * 
     * @param fld1
     */
    public void setFld1(java.lang.Integer[] fld1) {
        this.fld1 = fld1;
    }

    public java.lang.Integer getFld1(int i) {
        return this.fld1[i];
    }

    public void setFld1(int i, java.lang.Integer _value) {
        this.fld1[i] = _value;
    }


    /**
     * Gets the fld2 value for this StructureType.
     * 
     * @return fld2
     */
    public java.lang.Integer[] getFld2() {
        return fld2;
    }


    /**
     * Sets the fld2 value for this StructureType.
     * 
     * @param fld2
     */
    public void setFld2(java.lang.Integer[] fld2) {
        this.fld2 = fld2;
    }


    /**
     * Gets the fld3 value for this StructureType.
     * 
     * @return fld3
     */
    public java.lang.Integer[][] getFld3() {
        return fld3;
    }


    /**
     * Sets the fld3 value for this StructureType.
     * 
     * @param fld3
     */
    public void setFld3(java.lang.Integer[][] fld3) {
        this.fld3 = fld3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructureType)) return false;
        StructureType other = (StructureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fld1==null && other.getFld1()==null) || 
             (this.fld1!=null &&
              java.util.Arrays.equals(this.fld1, other.getFld1()))) &&
            ((this.fld2==null && other.getFld2()==null) || 
             (this.fld2!=null &&
              java.util.Arrays.equals(this.fld2, other.getFld2()))) &&
            ((this.fld3==null && other.getFld3()==null) || 
             (this.fld3!=null &&
              java.util.Arrays.equals(this.fld3, other.getFld3())));
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
        if (getFld1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFld1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFld1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFld2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFld2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFld2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFld3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFld3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFld3(), i);
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
        new org.apache.axis.description.TypeDesc(StructureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ArrayTest4", "StructureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fld1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fld1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fld2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fld2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fld3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fld3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ArrayTest4", "intarr"));
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
