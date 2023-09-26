/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.uddi_v2;

public class Contact  implements java.io.Serializable {
    private test.wsdl.dataobjects.uddi_v2.Description[] description;

    private java.lang.String personName;

    private test.wsdl.dataobjects.uddi_v2.Phone[] phone;

    private test.wsdl.dataobjects.uddi_v2.Email[] email;

    private test.wsdl.dataobjects.uddi_v2.Address[] address;

    private java.lang.String useType;  // attribute

    public Contact() {
    }

    public Contact(
           test.wsdl.dataobjects.uddi_v2.Description[] description,
           java.lang.String personName,
           test.wsdl.dataobjects.uddi_v2.Phone[] phone,
           test.wsdl.dataobjects.uddi_v2.Email[] email,
           test.wsdl.dataobjects.uddi_v2.Address[] address,
           java.lang.String useType) {
           this.description = description;
           this.personName = personName;
           this.phone = phone;
           this.email = email;
           this.address = address;
           this.useType = useType;
    }


    /**
     * Gets the description value for this Contact.
     * 
     * @return description
     */
    public test.wsdl.dataobjects.uddi_v2.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contact.
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
     * Gets the personName value for this Contact.
     * 
     * @return personName
     */
    public java.lang.String getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this Contact.
     * 
     * @param personName
     */
    public void setPersonName(java.lang.String personName) {
        this.personName = personName;
    }


    /**
     * Gets the phone value for this Contact.
     * 
     * @return phone
     */
    public test.wsdl.dataobjects.uddi_v2.Phone[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Contact.
     * 
     * @param phone
     */
    public void setPhone(test.wsdl.dataobjects.uddi_v2.Phone[] phone) {
        this.phone = phone;
    }

    public test.wsdl.dataobjects.uddi_v2.Phone getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, test.wsdl.dataobjects.uddi_v2.Phone _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the email value for this Contact.
     * 
     * @return email
     */
    public test.wsdl.dataobjects.uddi_v2.Email[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contact.
     * 
     * @param email
     */
    public void setEmail(test.wsdl.dataobjects.uddi_v2.Email[] email) {
        this.email = email;
    }

    public test.wsdl.dataobjects.uddi_v2.Email getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, test.wsdl.dataobjects.uddi_v2.Email _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the address value for this Contact.
     * 
     * @return address
     */
    public test.wsdl.dataobjects.uddi_v2.Address[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Contact.
     * 
     * @param address
     */
    public void setAddress(test.wsdl.dataobjects.uddi_v2.Address[] address) {
        this.address = address;
    }

    public test.wsdl.dataobjects.uddi_v2.Address getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, test.wsdl.dataobjects.uddi_v2.Address _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the useType value for this Contact.
     * 
     * @return useType
     */
    public java.lang.String getUseType() {
        return useType;
    }


    /**
     * Sets the useType value for this Contact.
     * 
     * @param useType
     */
    public void setUseType(java.lang.String useType) {
        this.useType = useType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
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
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.useType==null && other.getUseType()==null) || 
             (this.useType!=null &&
              this.useType.equals(other.getUseType())));
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
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseType() != null) {
            _hashCode += getUseType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "contact"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "useType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "personName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "phone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "email"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:uddi-org:api_v2", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
