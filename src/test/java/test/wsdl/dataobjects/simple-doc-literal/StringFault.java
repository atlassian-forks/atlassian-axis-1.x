/**
 * StringFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public class StringFault extends org.apache.axis.AxisFault {
    public java.lang.String part2;
    public java.lang.String getPart2() {
        return this.part2;
    }

    public StringFault() {
    }

    public StringFault(java.lang.Exception target) {
        super(target);
    }

    public StringFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public StringFault(java.lang.String part2) {
        this.part2 = part2;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, part2);
    }
}
