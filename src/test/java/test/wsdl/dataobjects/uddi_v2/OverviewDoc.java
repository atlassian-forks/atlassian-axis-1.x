/**
 * OverviewDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class OverviewDoc  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private java.lang.String overviewURL;

    public OverviewDoc() {
    }

    public OverviewDoc(
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           java.lang.String overviewURL) {
           this.description = description;
           this.overviewURL = overviewURL;
    }


    /**
     * Gets the description value for this OverviewDoc.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OverviewDoc.
     * 
     * @param description
     */
    public void setDescription(test.wsdl.dataobjects.uddi_v2.Description[] description) {
        this.description = description;
    }

    public test.wsdl.dataobjects.uddi_v2.Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, test.wsdl.dataobjects.uddi_v2.Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the overviewURL value for this OverviewDoc.
     * 
     * @return overviewURL
     */
    public java.lang.String getOverviewURL() {
        return overviewURL;
    }


    /**
     * Sets the overviewURL value for this OverviewDoc.
     * 
     * @param overviewURL
     */
    public void setOverviewURL(java.lang.String overviewURL) {
        this.overviewURL = overviewURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverviewDoc)) return false;
        OverviewDoc other = (OverviewDoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.overviewURL==null && other.getOverviewURL()==null) || 
             (this.overviewURL!=null &&
              this.overviewURL.equals(other.getOverviewURL())));
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverviewURL() != null) {
            _hashCode += getOverviewURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverviewDoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "overviewDoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overviewURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "overviewURL"));
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
