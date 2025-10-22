/**
 * Soap12TestDocBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.wsdl.soap12.assertion;

public class Soap12TestDocBindingImpl implements test.wsdl.soap12.assertion.Soap12TestPortTypeDoc{
    public void emptyBody() throws java.rmi.RemoteException {
        try {
            org.apache.axis.MessageContext mc = org.apache.axis.MessageContext.getCurrentContext();

            if (mc != null) {
                // Get the input header "echoOk"
                org.apache.axis.message.SOAPEnvelope reqEnv = mc.getRequestMessage().getSOAPEnvelope();

                // First try to get the header by name
                org.apache.axis.message.SOAPHeaderElement inputHeader =
                    reqEnv.getHeaderByName("http://example.org/ts-tests", "echoOk");

                // If that fails, try to get it from all headers (role processing might be filtering it)
                if (inputHeader == null) {
                    java.util.Vector allHeaders = reqEnv.getHeaders();
                    if (allHeaders != null) {
                        for (int i = 0; i < allHeaders.size(); i++) {
                            org.apache.axis.message.SOAPHeaderElement headerElement =
                                (org.apache.axis.message.SOAPHeaderElement) allHeaders.get(i);
                            if ("echoOk".equals(headerElement.getName()) &&
                                "http://example.org/ts-tests".equals(headerElement.getNamespaceURI())) {
                                
                                // Check if this header has a supported role
                                String role = headerElement.getRole();
                                boolean isSupported = role == null || role.isEmpty() ||  // ultimate receiver
                                    "http://www.w3.org/2003/05/soap-envelope/role/next".equals(role) ||  // SOAP 1.2 next
                                    "http://schemas.xmlsoap.org/soap/actor/next".equals(role) ||  // SOAP 1.1 next
                                    "http://example.org/ts-tests/C".equals(role);  // custom supported role
                                
                                if (isSupported) {
                                    inputHeader = headerElement;
                                    break;
                                }
                            }
                        }
                    }
                }

                if (inputHeader != null) {
                    // Try different ways to get the header value
                    String headerValue = null;
                    try {
                        Object objValue = inputHeader.getObjectValue();
                        if (objValue != null) {
                            headerValue = objValue.toString();
                        } else {
                            // Try getValue() method instead
                            headerValue = inputHeader.getValue();
                        }
                    } catch (Exception e) {
                        headerValue = inputHeader.getValue();
                    }


                    if (headerValue != null) {
                        // Add response header "responseOk" with the same value and role
                        org.apache.axis.message.SOAPEnvelope respEnv = mc.getResponseMessage().getSOAPEnvelope();
                        org.apache.axis.message.SOAPHeaderElement responseHeader =
                            new org.apache.axis.message.SOAPHeaderElement("http://example.org/ts-tests", "responseOk", headerValue);

                        // Copy the role from the input header to maintain SOAP 1.2 compatibility
                        String inputRole = inputHeader.getRole();
                        if (inputRole != null) {
                            responseHeader.setRole(inputRole);
                        }

                        respEnv.addHeader(responseHeader);
                    }
                }
            }
        } catch (Exception e) {
            // Silently handle header processing errors
        }
    }

    public java.lang.String echoOk(java.lang.String echoOk) throws java.rmi.RemoteException {
        return echoOk;
    }
}
