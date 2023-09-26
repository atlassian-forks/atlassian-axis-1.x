/**
 * InvalidTickerFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.FaultService;

public class InvalidTickerFaultMessage extends org.apache.axis.AxisFault {
    public java.lang.String tickerSymbol;
    public java.lang.String getTickerSymbol() {
        return this.tickerSymbol;
    }

    public InvalidTickerFaultMessage() {
    }

    public InvalidTickerFaultMessage(java.lang.Exception target) {
        super(target);
    }

    public InvalidTickerFaultMessage(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public InvalidTickerFaultMessage(java.lang.String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, tickerSymbol);
    }
}
