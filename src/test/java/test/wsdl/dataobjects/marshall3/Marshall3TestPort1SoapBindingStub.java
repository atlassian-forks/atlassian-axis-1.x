/**
 * Marshall3TestPort1SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall3;

public class Marshall3TestPort1SoapBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.marshall3.MarshallTest {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shortArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTest"), test.wsdl.dataobjects.marshall3.ShortArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall3.ShortArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stringArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTest"), test.wsdl.dataobjects.marshall3.StringArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall3.StringArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoShortListTypeTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://marshalltestservice.org/types2", "FooShortListType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshalltestservice.org/types2", "FooShortListType"), short[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshalltestservice.org/types2", "FooShortListType"));
        oper.setReturnClass(short[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://marshalltestservice.org/types2", "FooShortListType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("qnameArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTest"), test.wsdl.dataobjects.marshall3.QNameArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall3.QNameArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public Marshall3TestPort1SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Marshall3TestPort1SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Marshall3TestPort1SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types2", "FooShortListType");
            cachedSerQNames.add(qName);
            cls = short[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.QNameArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "QNameArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.QNameArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.ShortArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "ShortArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.ShortArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.StringArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshalltestservice.org/types", "StringArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall3.StringArrayTestResponse.class;
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

    public test.wsdl.dataobjects.marshall3.ShortArrayTestResponse shortArrayTest(test.wsdl.dataobjects.marshall3.ShortArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shortArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall3.ShortArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall3.ShortArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall3.ShortArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall3.StringArrayTestResponse stringArrayTest(test.wsdl.dataobjects.marshall3.StringArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stringArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall3.StringArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall3.StringArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall3.StringArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public short[] echoShortListTypeTest(short[] fooShortListTypeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoShortListTypeTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fooShortListTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (short[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (short[]) org.apache.axis.utils.JavaUtils.convert(_resp, short[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall3.QNameArrayTestResponse qnameArrayTest(test.wsdl.dataobjects.marshall3.QNameArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "qnameArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall3.QNameArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall3.QNameArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall3.QNameArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
