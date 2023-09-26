/**
 * IntArrayFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class IntArrayFault extends org.apache.axis.AxisFault {
    public int[] part5;
    public int[] getPart5() {
        return this.part5;
    }

    public IntArrayFault() {
    }

    public IntArrayFault(java.lang.Exception target) {
        super(target);
    }

    public IntArrayFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public IntArrayFault(int[] part5) {
        this.part5 = part5;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, part5);
    }
}
