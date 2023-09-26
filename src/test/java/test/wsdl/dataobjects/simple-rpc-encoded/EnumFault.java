/**
 * EnumFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class EnumFault extends org.apache.axis.AxisFault {
    public test.wsdl.dataobjects.simple-rpc-encoded.Enum part9;
    public test.wsdl.dataobjects.simple-rpc-encoded.Enum getPart9() {
        return this.part9;
    }

    public EnumFault() {
    }

    public EnumFault(java.lang.Exception target) {
        super(target);
    }

    public EnumFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public EnumFault(test.wsdl.dataobjects.simple-rpc-encoded.Enum part9) {
        this.part9 = part9;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, part9);
    }
}
