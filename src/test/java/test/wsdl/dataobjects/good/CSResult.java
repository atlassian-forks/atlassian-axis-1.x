/**
 * CSResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CSResult  implements java.io.Serializable {
    private test.wsdl.dataobjects.good.CSResultParameters resultParameters;

    private test.wsdl.dataobjects.good.CSInteger minorResultCode;

    private test.wsdl.dataobjects.good.CSInteger majorResultCode;

    public CSResult() {
    }

    public CSResult(
           test.wsdl.dataobjects.good.CSResultParameters resultParameters,
           test.wsdl.dataobjects.good.CSInteger minorResultCode,
           test.wsdl.dataobjects.good.CSInteger majorResultCode) {
           this.resultParameters = resultParameters;
           this.minorResultCode = minorResultCode;
           this.majorResultCode = majorResultCode;
    }


    /**
     * Gets the resultParameters value for this CSResult.
     * 
     * @return resultParameters
     */
    public test.wsdl.dataobjects.good.CSResultParameters getResultParameters() {
        return resultParameters;
    }


    /**
     * Sets the resultParameters value for this CSResult.
     * 
     * @param resultParameters
     */
    public void setResultParameters(test.wsdl.dataobjects.good.CSResultParameters resultParameters) {
        this.resultParameters = resultParameters;
    }


    /**
     * Gets the minorResultCode value for this CSResult.
     * 
     * @return minorResultCode
     */
    public test.wsdl.dataobjects.good.CSInteger getMinorResultCode() {
        return minorResultCode;
    }


    /**
     * Sets the minorResultCode value for this CSResult.
     * 
     * @param minorResultCode
     */
    public void setMinorResultCode(test.wsdl.dataobjects.good.CSInteger minorResultCode) {
        this.minorResultCode = minorResultCode;
    }


    /**
     * Gets the majorResultCode value for this CSResult.
     * 
     * @return majorResultCode
     */
    public test.wsdl.dataobjects.good.CSInteger getMajorResultCode() {
        return majorResultCode;
    }


    /**
     * Sets the majorResultCode value for this CSResult.
     * 
     * @param majorResultCode
     */
    public void setMajorResultCode(test.wsdl.dataobjects.good.CSInteger majorResultCode) {
        this.majorResultCode = majorResultCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSResult)) return false;
        CSResult other = (CSResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultParameters==null && other.getResultParameters()==null) || 
             (this.resultParameters!=null &&
              this.resultParameters.equals(other.getResultParameters()))) &&
            ((this.minorResultCode==null && other.getMinorResultCode()==null) || 
             (this.minorResultCode!=null &&
              this.minorResultCode.equals(other.getMinorResultCode()))) &&
            ((this.majorResultCode==null && other.getMajorResultCode()==null) || 
             (this.majorResultCode!=null &&
              this.majorResultCode.equals(other.getMajorResultCode())));
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
        if (getResultParameters() != null) {
            _hashCode += getResultParameters().hashCode();
        }
        if (getMinorResultCode() != null) {
            _hashCode += getMinorResultCode().hashCode();
        }
        if (getMajorResultCode() != null) {
            _hashCode += getMajorResultCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResultParameters"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger"));
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
