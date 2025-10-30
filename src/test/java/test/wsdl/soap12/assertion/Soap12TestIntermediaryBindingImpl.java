package test.wsdl.soap12.assertion;

import org.apache.axis.MessageContext;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;

import java.util.Vector;

/**
 * SOAP 1.2 Intermediary Service - forwards requests to ultimate receiver
 */
public class Soap12TestIntermediaryBindingImpl implements test.wsdl.soap12.assertion.Soap12TestPortTypeDoc {
    
    private static final String SUPPORTED_ROLE = "http://example.org/ts-tests/C";
    
    // Create an instance of the ultimate receiver
    private final Soap12TestDocBindingImpl ultimateReceiver = new Soap12TestDocBindingImpl();
    
    public void emptyBody() throws java.rmi.RemoteException {
        try {
            MessageContext msgContext = MessageContext.getCurrentContext();
            SOAPEnvelope reqEnv = msgContext.getRequestMessage().getSOAPEnvelope();
            
            // Check for headers targeted at this intermediary
            Vector headers = reqEnv.getHeaders();
            boolean shouldForward = false;
            SOAPHeaderElement headerToForward = null;
            
            if (headers != null) {
                for (int i = 0; i < headers.size(); i++) {
                    SOAPHeaderElement header = (SOAPHeaderElement) headers.get(i);
                    String role = header.getRole();
                    
                    // Check if this header is targeted at our supported role
                    if (SUPPORTED_ROLE.equals(role)) {
                        shouldForward = true;
                        // Create a new header to forward to ultimate receiver (remove role)
                        headerToForward = new SOAPHeaderElement(
                            header.getNamespaceURI(), 
                            header.getName(), 
                            header.getValue()
                        );
                        // Remove role so it targets ultimate receiver
                        headerToForward.setRole(null);
                        break;
                    }
                }
            }
            
            if (shouldForward && headerToForward != null) {
                // Create a new message context for the ultimate receiver
                // We'll modify the current request to forward to the ultimate receiver
                reqEnv.removeHeaders();  // Clear existing headers
                reqEnv.addHeader(headerToForward);  // Add the forwarded header
                
                // Call the ultimate receiver directly
                ultimateReceiver.emptyBody();
                
                // The response will be set by the ultimate receiver in the same message context
            } else {
                // No forwarding needed, just return empty response
                SOAPEnvelope respEnv = msgContext.getResponseMessage().getSOAPEnvelope();
                // Could add default headers here if needed
            }
            
        } catch (Exception e) {
            throw new java.rmi.RemoteException("Intermediary processing failed", e);
        }
    }
    
    public String echoOk(String echoOk) throws java.rmi.RemoteException {
        // For this intermediary, we don't implement this method
        // It's only here to satisfy the interface
        throw new java.rmi.RemoteException("echoOk not supported by intermediary");
    }
}