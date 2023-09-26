/**
 * StringArrayFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class StringArrayFault extends org.apache.axis.AxisFault {
    public java.lang.String[] part6;
    public java.lang.String[] getPart6() {
        return this.part6;
    }

    public StringArrayFault() {
    }

    public StringArrayFault(java.lang.Exception target) {
        super(target);
    }

    public StringArrayFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public StringArrayFault(java.lang.String[] part6) {
        this.part6 = part6;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, part6);
    }
}
