/**
 * IntFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class IntFault extends org.apache.axis.AxisFault {
    public int part3;
    public int getPart3() {
        return this.part3;
    }

    public IntFault() {
    }

    public IntFault(java.lang.Exception target) {
        super(target);
    }

    public IntFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public IntFault(int part3) {
        this.part3 = part3;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, new java.lang.Integer(part3));
    }
}
