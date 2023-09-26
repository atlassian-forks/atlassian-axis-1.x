/**
 * Op1Fault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.header;

public class Op1Fault extends org.apache.axis.AxisFault {
    public java.lang.String message;
    public java.lang.String getMessage() {
        return this.message;
    }

    public Op1Fault() {
    }

    public Op1Fault(java.lang.Exception target) {
        super(target);
    }

    public Op1Fault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public Op1Fault(java.lang.String message) {
        this.message = message;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, message);
    }
}
