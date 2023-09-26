/**
 * OpFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.FileGen;

public class OpFault extends org.apache.axis.AxisFault {
    public java.lang.String info;
    public java.lang.String getInfo() {
        return this.info;
    }

    public OpFault() {
    }

    public OpFault(java.lang.Exception target) {
        super(target);
    }

    public OpFault(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public OpFault(java.lang.String info) {
        this.info = info;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, info);
    }
}
