/**
 * ComplexDocLitBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-doc-literal;

public class ComplexDocLitBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.complex-doc-literal.ComplexDocLitPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoSOAPStructFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoSOAPStructFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStruct"), test.wsdl.dataobjects.complex-doc-literal.SOAPStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoSOAPStructFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoSOAPStructFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "SOAPStructFaultPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoBaseStructFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoBaseStructFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), test.wsdl.dataobjects.complex-doc-literal.BaseStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoBaseStructFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoBaseStructFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "BaseStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoExtendedStructFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoExtendedStructFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoExtendedStructFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoExtendedStructFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "ExtendedStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults1Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Request"), test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Response"));
        oper.setReturnClass(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "BaseStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "SOAPStructFaultPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Request"), test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Response"));
        oper.setReturnClass(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "MoreExtendedStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "MoreExtendedStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "ExtendedStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "BaseStructPart"),
                      "test.wsdl.dataobjects.complex-doc-literal.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public ComplexDocLitBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ComplexDocLitBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ComplexDocLitBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoBaseStructFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoExtendedStructFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoSOAPStructFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.BaseStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "MoreExtendedStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.SOAPStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse echoSOAPStructFault(test.wsdl.dataobjects.complex-doc-literal.SOAPStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoSOAPStructFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.complex-doc-literal.EchoSOAPStructFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault) {
              throw (test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse echoBaseStructFault(test.wsdl.dataobjects.complex-doc-literal.BaseStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.BaseStruct {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoBaseStructFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.complex-doc-literal.EchoBaseStructFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.BaseStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse echoExtendedStructFault(test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoExtendedStructFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.complex-doc-literal.EchoExtendedStructFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response echoMultipleFaults1(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.BaseStruct, test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoMultipleFaults1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.BaseStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault) {
              throw (test.wsdl.dataobjects.complex-doc-literal.SOAPStructFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response echoMultipleFaults2(test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct, test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct, test.wsdl.dataobjects.complex-doc-literal.BaseStruct {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoMultipleFaults2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.complex-doc-literal.EchoMultipleFaults2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.MoreExtendedStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.ExtendedStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-doc-literal.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-doc-literal.BaseStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
