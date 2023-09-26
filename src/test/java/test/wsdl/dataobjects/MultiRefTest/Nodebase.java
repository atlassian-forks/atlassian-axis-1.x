/**
 * Nodebase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MultiRefTest;

public class Nodebase  implements java.io.Serializable {
    private test.wsdl.dataobjects.MultiRefTest.Node left;

    private test.wsdl.dataobjects.MultiRefTest.Node right;

    public Nodebase() {
    }

    public Nodebase(
           test.wsdl.dataobjects.MultiRefTest.Node left,
           test.wsdl.dataobjects.MultiRefTest.Node right) {
           this.left = left;
           this.right = right;
    }


    /**
     * Gets the left value for this Nodebase.
     * 
     * @return left
     */
    public test.wsdl.dataobjects.MultiRefTest.Node getLeft() {
        return left;
    }


    /**
     * Sets the left value for this Nodebase.
     * 
     * @param left
     */
    public void setLeft(test.wsdl.dataobjects.MultiRefTest.Node left) {
        this.left = left;
    }


    /**
     * Gets the right value for this Nodebase.
     * 
     * @return right
     */
    public test.wsdl.dataobjects.MultiRefTest.Node getRight() {
        return right;
    }


    /**
     * Sets the right value for this Nodebase.
     * 
     * @param right
     */
    public void setRight(test.wsdl.dataobjects.MultiRefTest.Node right) {
        this.right = right;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nodebase)) return false;
        Nodebase other = (Nodebase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.left==null && other.getLeft()==null) || 
             (this.left!=null &&
              this.left.equals(other.getLeft()))) &&
            ((this.right==null && other.getRight()==null) || 
             (this.right!=null &&
              this.right.equals(other.getRight())));
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
        if (getLeft() != null) {
            _hashCode += getLeft().hashCode();
        }
        if (getRight() != null) {
            _hashCode += getRight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nodebase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:MultiRefTest2", "nodebase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:MultiRefTest2", "node"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("right");
        elemField.setXmlName(new javax.xml.namespace.QName("", "right"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:MultiRefTest2", "node"));
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