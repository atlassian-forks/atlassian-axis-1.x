/**
 * AttachmentsBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.dime-doc;

public class AttachmentsBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.dime-doc.AttachmentsPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "In"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"), org.apache.axis.attachments.OctetStream.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"));
        oper.setReturnClass(org.apache.axis.attachments.OctetStream.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Out"));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"), org.apache.axis.attachments.OctetStream[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"));
        oper.setReturnClass(org.apache.axis.attachments.OctetStream[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Item"));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoAttachmentAsBase64");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "In"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"), org.apache.axis.attachments.OctetStream.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Out"));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoBase64AsAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "In"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"));
        oper.setReturnClass(org.apache.axis.attachments.OctetStream.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoUnrefAttachments");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoAttachmentAsString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "In"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "PlainText"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "Out"));
        _operations[5] = oper;

    }

    public AttachmentsBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AttachmentsBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AttachmentsBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            java.lang.Class mimesf = org.apache.axis.encoding.ser.JAFDataHandlerSerializerFactory.class;
            java.lang.Class mimedf = org.apache.axis.encoding.ser.JAFDataHandlerDeserializerFactory.class;

            qName = new javax.xml.namespace.QName("http://soapinterop.org/attachments/wsdl", "DataHandler");
            cachedSerQNames.add(qName);
            cls = javax.activation.DataHandler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(mimesf);
            cachedDeserFactories.add(mimedf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "ReferencedBinary");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.dime-doc.ReferencedBinary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "ReferencedText");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.dime-doc.ReferencedText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.apache.axis.attachments.OctetStream echoAttachment(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.setProperty(_call.ATTACHMENT_ENCAPSULATION_FORMAT, _call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.attachments.OctetStream) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.attachments.OctetStream) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.dime-doc.ReferencedBinary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.attachments.OctetStream[] echoAttachments(org.apache.axis.attachments.OctetStream[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.setProperty(_call.ATTACHMENT_ENCAPSULATION_FORMAT, _call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.attachments.OctetStream[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.attachments.OctetStream[]) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.dime-doc.ReferencedBinary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] echoAttachmentAsBase64(org.apache.axis.attachments.OctetStream in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoAttachmentAsBase64"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.setProperty(_call.ATTACHMENT_ENCAPSULATION_FORMAT, _call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.attachments.OctetStream echoBase64AsAttachment(byte[] in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoBase64AsAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.setProperty(_call.ATTACHMENT_ENCAPSULATION_FORMAT, _call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.attachments.OctetStream) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.attachments.OctetStream) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.dime-doc.ReferencedBinary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void echoUnrefAttachments() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoUnrefAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String echoAttachmentAsString(java.lang.String in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/attachments/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/attachments/xsd", "EchoAttachmentAsString"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.setProperty(_call.ATTACHMENT_ENCAPSULATION_FORMAT, _call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
