/**
 * ArrayOfCatalogItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public class ArrayOfCatalogItem  implements java.io.Serializable {
    private test.wsdl.dataobjects.reportservice.CatalogItem[] catalogItem;

    public ArrayOfCatalogItem() {
    }

    public ArrayOfCatalogItem(
           test.wsdl.dataobjects.reportservice.CatalogItem[] catalogItem) {
           this.catalogItem = catalogItem;
    }


    /**
     * Gets the catalogItem value for this ArrayOfCatalogItem.
     * 
     * @return catalogItem
     */
    public test.wsdl.dataobjects.reportservice.CatalogItem[] getCatalogItem() {
        return catalogItem;
    }


    /**
     * Sets the catalogItem value for this ArrayOfCatalogItem.
     * 
     * @param catalogItem
     */
    public void setCatalogItem(test.wsdl.dataobjects.reportservice.CatalogItem[] catalogItem) {
        this.catalogItem = catalogItem;
    }

    public test.wsdl.dataobjects.reportservice.CatalogItem getCatalogItem(int i) {
        return this.catalogItem[i];
    }

    public void setCatalogItem(int i, test.wsdl.dataobjects.reportservice.CatalogItem _value) {
        this.catalogItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCatalogItem)) return false;
        ArrayOfCatalogItem other = (ArrayOfCatalogItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catalogItem==null && other.getCatalogItem()==null) || 
             (this.catalogItem!=null &&
              java.util.Arrays.equals(this.catalogItem, other.getCatalogItem())));
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
        if (getCatalogItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatalogItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatalogItem(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCatalogItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "ArrayOfCatalogItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CatalogItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/sqlserver/2003/12/reporting/reportingservices", "CatalogItem"));
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
