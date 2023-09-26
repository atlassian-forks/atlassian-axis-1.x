/**
 * SimpleDocLitBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-doc-literal;

public class SimpleDocLitBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.simple-doc-literal.SimpleDocLitPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoEmptyFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoEmptyFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoEmptyFaultRequest"), test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoEmptyFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoEmptyFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "EmptyPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.EmptyPart",
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", ">EmptyPart"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoStringFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoStringFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoStringFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoStringFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "StringPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoIntArrayFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoIntArrayFaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt"), test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoIntArrayFaultResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoIntArrayFaultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "ArrayOfIntPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults1Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Request"), test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Response"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "EmptyPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.EmptyPart",
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", ">EmptyPart"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "StringPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "ArrayOfFloatPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfFloat"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Request"), test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Response"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "StringPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "FloatPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.FloatFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "ArrayOfStringPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.ArrayOfString",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults3Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults3Request"), test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults3Response"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults3Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "StringPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "String2Part"),
                      "test.wsdl.dataobjects.simple-doc-literal.String2Fault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults4Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults4Request"), test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults4Response"));
        oper.setReturnClass(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", "echoMultipleFaults4Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "IntPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.IntFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/types/part", "EnumPart"),
                      "test.wsdl.dataobjects.simple-doc-literal.EnumFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum"), 
                      false
                     ));
        _operations[6] = oper;

    }

    public SimpleDocLitBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SimpleDocLitBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SimpleDocLitBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/part", ">EmptyPart");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EmptyPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoEmptyFaultRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoEmptyFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoIntArrayFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults1Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults2Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults3Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults3Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults4Request");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoMultipleFaults4Response");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types/requestresponse", ">echoStringFaultResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfFloat");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.ArrayOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-doc-literal.Enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse echoEmptyFault(test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultRequest param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.EmptyPart {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoEmptyFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoEmptyFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.EmptyPart) {
              throw (test.wsdl.dataobjects.simple-doc-literal.EmptyPart) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse echoStringFault(java.lang.String param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoStringFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoStringFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.StringFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.StringFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse echoIntArrayFault(test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoIntArrayFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoIntArrayFaultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt) {
              throw (test.wsdl.dataobjects.simple-doc-literal.ArrayOfInt) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response echoMultipleFaults1(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.EmptyPart, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
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
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.EmptyPart) {
              throw (test.wsdl.dataobjects.simple-doc-literal.EmptyPart) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.StringFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat) {
              throw (test.wsdl.dataobjects.simple-doc-literal.ArrayOfFloat) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response echoMultipleFaults2(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.FloatFault, test.wsdl.dataobjects.simple-doc-literal.ArrayOfString {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
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
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.StringFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.FloatFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.FloatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.ArrayOfString) {
              throw (test.wsdl.dataobjects.simple-doc-literal.ArrayOfString) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response echoMultipleFaults3(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.StringFault, test.wsdl.dataobjects.simple-doc-literal.String2Fault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoMultipleFaults3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults3Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.StringFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.String2Fault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.String2Fault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response echoMultipleFaults4(test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Request param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-doc-literal.IntFault, test.wsdl.dataobjects.simple-doc-literal.EnumFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soapinterop.org/r4/groupg/");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "echoMultipleFaults4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.simple-doc-literal.EchoMultipleFaults4Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.IntFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.IntFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-doc-literal.EnumFault) {
              throw (test.wsdl.dataobjects.simple-doc-literal.EnumFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
