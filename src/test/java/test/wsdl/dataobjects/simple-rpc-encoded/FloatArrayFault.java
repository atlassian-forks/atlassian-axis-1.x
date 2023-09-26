/**
 * FloatArrayFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class FloatArrayFault extends org.apache.axis.AxisFault {
    public float[] part7;
    public float[] getPart7() {
        return this.part7;
    }

    public FloatArrayFault() {
    }

    public FloatArrayFault(java.lang.Exception target) {
        super(target);
    }

    public FloatArrayFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public FloatArrayFault(float[] part7) {
        this.part7 = part7;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, part7);
    }
}
