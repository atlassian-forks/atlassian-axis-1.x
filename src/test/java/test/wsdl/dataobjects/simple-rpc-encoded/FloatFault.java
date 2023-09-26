/**
 * FloatFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class FloatFault extends org.apache.axis.AxisFault {
    public float part4;
    public float getPart4() {
        return this.part4;
    }

    public FloatFault() {
    }

    public FloatFault(java.lang.Exception target) {
        super(target);
    }

    public FloatFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public FloatFault(float part4) {
        this.part4 = part4;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, new java.lang.Float(part4));
    }
}
