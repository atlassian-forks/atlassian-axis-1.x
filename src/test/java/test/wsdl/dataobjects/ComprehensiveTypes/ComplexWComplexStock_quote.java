/**
 * ComplexWComplexStock_quote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class ComplexWComplexStock_quote  implements java.io.Serializable {
    private test.wsdl.dataobjects.ComprehensiveTypes.Time time;

    private java.lang.String change;

    private java.lang.String pctchange;

    private java.lang.String bid;

    private java.lang.String ask;

    private test.wsdl.dataobjects.ComprehensiveTypes.ComplexChoice choice;

    private java.lang.String symbol;  // attribute

    private java.lang.String last;  // attribute

    public ComplexWComplexStock_quote() {
    }

    public ComplexWComplexStock_quote(
           test.wsdl.dataobjects.ComprehensiveTypes.Time time,
           java.lang.String change,
           java.lang.String pctchange,
           java.lang.String bid,
           java.lang.String ask,
           test.wsdl.dataobjects.ComprehensiveTypes.ComplexChoice choice,
           java.lang.String symbol,
           java.lang.String last) {
           this.time = time;
           this.change = change;
           this.pctchange = pctchange;
           this.bid = bid;
           this.ask = ask;
           this.choice = choice;
           this.symbol = symbol;
           this.last = last;
    }


    /**
     * Gets the time value for this ComplexWComplexStock_quote.
     * 
     * @return time
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this ComplexWComplexStock_quote.
     * 
     * @param time
     */
    public void setTime(test.wsdl.dataobjects.ComprehensiveTypes.Time time) {
        this.time = time;
    }


    /**
     * Gets the change value for this ComplexWComplexStock_quote.
     * 
     * @return change
     */
    public java.lang.String getChange() {
        return change;
    }


    /**
     * Sets the change value for this ComplexWComplexStock_quote.
     * 
     * @param change
     */
    public void setChange(java.lang.String change) {
        this.change = change;
    }


    /**
     * Gets the pctchange value for this ComplexWComplexStock_quote.
     * 
     * @return pctchange
     */
    public java.lang.String getPctchange() {
        return pctchange;
    }


    /**
     * Sets the pctchange value for this ComplexWComplexStock_quote.
     * 
     * @param pctchange
     */
    public void setPctchange(java.lang.String pctchange) {
        this.pctchange = pctchange;
    }


    /**
     * Gets the bid value for this ComplexWComplexStock_quote.
     * 
     * @return bid
     */
    public java.lang.String getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this ComplexWComplexStock_quote.
     * 
     * @param bid
     */
    public void setBid(java.lang.String bid) {
        this.bid = bid;
    }


    /**
     * Gets the ask value for this ComplexWComplexStock_quote.
     * 
     * @return ask
     */
    public java.lang.String getAsk() {
        return ask;
    }


    /**
     * Sets the ask value for this ComplexWComplexStock_quote.
     * 
     * @param ask
     */
    public void setAsk(java.lang.String ask) {
        this.ask = ask;
    }


    /**
     * Gets the choice value for this ComplexWComplexStock_quote.
     * 
     * @return choice
     */
    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexChoice getChoice() {
        return choice;
    }


    /**
     * Sets the choice value for this ComplexWComplexStock_quote.
     * 
     * @param choice
     */
    public void setChoice(test.wsdl.dataobjects.ComprehensiveTypes.ComplexChoice choice) {
        this.choice = choice;
    }


    /**
     * Gets the symbol value for this ComplexWComplexStock_quote.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this ComplexWComplexStock_quote.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the last value for this ComplexWComplexStock_quote.
     * 
     * @return last
     */
    public java.lang.String getLast() {
        return last;
    }


    /**
     * Sets the last value for this ComplexWComplexStock_quote.
     * 
     * @param last
     */
    public void setLast(java.lang.String last) {
        this.last = last;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexWComplexStock_quote)) return false;
        ComplexWComplexStock_quote other = (ComplexWComplexStock_quote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.change==null && other.getChange()==null) || 
             (this.change!=null &&
              this.change.equals(other.getChange()))) &&
            ((this.pctchange==null && other.getPctchange()==null) || 
             (this.pctchange!=null &&
              this.pctchange.equals(other.getPctchange()))) &&
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.ask==null && other.getAsk()==null) || 
             (this.ask!=null &&
              this.ask.equals(other.getAsk()))) &&
            ((this.choice==null && other.getChoice()==null) || 
             (this.choice!=null &&
              this.choice.equals(other.getChoice()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.last==null && other.getLast()==null) || 
             (this.last!=null &&
              this.last.equals(other.getLast())));
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getChange() != null) {
            _hashCode += getChange().hashCode();
        }
        if (getPctchange() != null) {
            _hashCode += getPctchange().hashCode();
        }
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getAsk() != null) {
            _hashCode += getAsk().hashCode();
        }
        if (getChoice() != null) {
            _hashCode += getChoice().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getLast() != null) {
            _hashCode += getLast().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplexWComplexStock_quote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", ">complexWComplex>stock_quote"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "symbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("last");
        attrField.setXmlName(new javax.xml.namespace.QName("", "last"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "simple"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pctchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexChoice"));
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
