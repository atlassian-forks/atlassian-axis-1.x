/**
 * Info.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.refattr;

public class Info  implements java.io.Serializable {
    private test.wsdl.dataobjects.refattr.Phone[] phone;

    private test.wsdl.dataobjects.refattr.Enum enum;

    private test.wsdl.dataobjects.refattr.Forward forward;

    private test.wsdl.dataobjects.refattr.Example noMangle;

    private test.wsdl.dataobjects.refattr.NoMangle noMangle2;

    private test.wsdl.dataobjects.refattr.Mangle mangle;

    private test.wsdl.dataobjects.refattr.Mangle[] mangle2;

    private test.wsdl.dataobjects.refattr.OptionType[] option;

    public Info() {
    }

    public Info(
           test.wsdl.dataobjects.refattr.Phone[] phone,
           test.wsdl.dataobjects.refattr.Enum enum,
           test.wsdl.dataobjects.refattr.Forward forward,
           test.wsdl.dataobjects.refattr.Example noMangle,
           test.wsdl.dataobjects.refattr.NoMangle noMangle2,
           test.wsdl.dataobjects.refattr.Mangle mangle,
           test.wsdl.dataobjects.refattr.Mangle[] mangle2,
           test.wsdl.dataobjects.refattr.OptionType[] option) {
           this.phone = phone;
           this.enum = enum;
           this.forward = forward;
           this.noMangle = noMangle;
           this.noMangle2 = noMangle2;
           this.mangle = mangle;
           this.mangle2 = mangle2;
           this.option = option;
    }


    /**
     * Gets the phone value for this Info.
     * 
     * @return phone
     */
    public test.wsdl.dataobjects.refattr.Phone[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Info.
     * 
     * @param phone
     */
    public void setPhone(test.wsdl.dataobjects.refattr.Phone[] phone) {
        this.phone = phone;
    }


    /**
     * Gets the enum value for this Info.
     * 
     * @return enum
     */
    public test.wsdl.dataobjects.refattr.Enum getEnum() {
        return enum;
    }


    /**
     * Sets the enum value for this Info.
     * 
     * @param enum
     */
    public void setEnum(test.wsdl.dataobjects.refattr.Enum enum) {
        this.enum = enum;
    }


    /**
     * Gets the forward value for this Info.
     * 
     * @return forward
     */
    public test.wsdl.dataobjects.refattr.Forward getForward() {
        return forward;
    }


    /**
     * Sets the forward value for this Info.
     * 
     * @param forward
     */
    public void setForward(test.wsdl.dataobjects.refattr.Forward forward) {
        this.forward = forward;
    }


    /**
     * Gets the noMangle value for this Info.
     * 
     * @return noMangle
     */
    public test.wsdl.dataobjects.refattr.Example getNoMangle() {
        return noMangle;
    }


    /**
     * Sets the noMangle value for this Info.
     * 
     * @param noMangle
     */
    public void setNoMangle(test.wsdl.dataobjects.refattr.Example noMangle) {
        this.noMangle = noMangle;
    }


    /**
     * Gets the noMangle2 value for this Info.
     * 
     * @return noMangle2
     */
    public test.wsdl.dataobjects.refattr.NoMangle getNoMangle2() {
        return noMangle2;
    }


    /**
     * Sets the noMangle2 value for this Info.
     * 
     * @param noMangle2
     */
    public void setNoMangle2(test.wsdl.dataobjects.refattr.NoMangle noMangle2) {
        this.noMangle2 = noMangle2;
    }


    /**
     * Gets the mangle value for this Info.
     * 
     * @return mangle
     */
    public test.wsdl.dataobjects.refattr.Mangle getMangle() {
        return mangle;
    }


    /**
     * Sets the mangle value for this Info.
     * 
     * @param mangle
     */
    public void setMangle(test.wsdl.dataobjects.refattr.Mangle mangle) {
        this.mangle = mangle;
    }


    /**
     * Gets the mangle2 value for this Info.
     * 
     * @return mangle2
     */
    public test.wsdl.dataobjects.refattr.Mangle[] getMangle2() {
        return mangle2;
    }


    /**
     * Sets the mangle2 value for this Info.
     * 
     * @param mangle2
     */
    public void setMangle2(test.wsdl.dataobjects.refattr.Mangle[] mangle2) {
        this.mangle2 = mangle2;
    }

    public test.wsdl.dataobjects.refattr.Mangle getMangle2(int i) {
        return this.mangle2[i];
    }

    public void setMangle2(int i, test.wsdl.dataobjects.refattr.Mangle _value) {
        this.mangle2[i] = _value;
    }


    /**
     * Gets the option value for this Info.
     * 
     * @return option
     */
    public test.wsdl.dataobjects.refattr.OptionType[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this Info.
     * 
     * @param option
     */
    public void setOption(test.wsdl.dataobjects.refattr.OptionType[] option) {
        this.option = option;
    }

    public test.wsdl.dataobjects.refattr.OptionType getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, test.wsdl.dataobjects.refattr.OptionType _value) {
        this.option[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Info)) return false;
        Info other = (Info) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.enum==null && other.getEnum()==null) || 
             (this.enum!=null &&
              this.enum.equals(other.getEnum()))) &&
            ((this.forward==null && other.getForward()==null) || 
             (this.forward!=null &&
              this.forward.equals(other.getForward()))) &&
            ((this.noMangle==null && other.getNoMangle()==null) || 
             (this.noMangle!=null &&
              this.noMangle.equals(other.getNoMangle()))) &&
            ((this.noMangle2==null && other.getNoMangle2()==null) || 
             (this.noMangle2!=null &&
              this.noMangle2.equals(other.getNoMangle2()))) &&
            ((this.mangle==null && other.getMangle()==null) || 
             (this.mangle!=null &&
              this.mangle.equals(other.getMangle()))) &&
            ((this.mangle2==null && other.getMangle2()==null) || 
             (this.mangle2!=null &&
              java.util.Arrays.equals(this.mangle2, other.getMangle2()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption())));
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
        if (getEnum() != null) {
            _hashCode += getEnum().hashCode();
        }
        if (getForward() != null) {
            _hashCode += getForward().hashCode();
        }
        if (getNoMangle() != null) {
            _hashCode += getNoMangle().hashCode();
        }
        if (getNoMangle2() != null) {
            _hashCode += getNoMangle2().hashCode();
        }
        if (getMangle() != null) {
            _hashCode += getMangle().hashCode();
        }
        if (getMangle2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMangle2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMangle2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
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
        new org.apache.axis.description.TypeDesc(Info.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "info"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ref.types", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "phone[,unbounded]"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ref.types", "enum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forward");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forward"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "forward"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noMangle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ref.types", "noMangle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "example"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noMangle2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noMangle2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "noMangle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mangle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ref.types", "mangle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", ">mangle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mangle2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mangle2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "mangle"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ref.types", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ref.types", "option"));
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
