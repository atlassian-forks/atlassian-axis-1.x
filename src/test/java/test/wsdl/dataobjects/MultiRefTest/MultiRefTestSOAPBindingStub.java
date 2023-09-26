/**
 * MultiRefTestSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.MultiRefTest;

public class MultiRefTestSOAPBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.MultiRefTest.MultiRefTest_PortType {
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
        oper.setName("testSimpleTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testDiamond");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testLoop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testSelfRef");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testSameArgs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root1"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root2"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testArgsRefSameNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root1"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root2"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testArgsRefEachOther");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root1"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "root2"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:MultiRefTest2", "node"), test.wsdl.dataobjects.MultiRefTest.Node.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rc"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

    }

    public MultiRefTestSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MultiRefTestSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MultiRefTestSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:MultiRefTest2", "node");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.MultiRefTest.Node.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:MultiRefTest2", "nodebase");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.MultiRefTest.Nodebase.class;
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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public int testSimpleTree(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testSimpleTree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root"));
            } catch (java.lang.Exception _exception) {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testDiamond(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testDiamond"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root"));
            } catch (java.lang.Exception _exception) {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testLoop(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testLoop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root"));
            } catch (java.lang.Exception _exception) {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testSelfRef(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testSelfRef"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root"));
            } catch (java.lang.Exception _exception) {
                root.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testSameArgs(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testSameArgs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root1.value, root2.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root1"));
            } catch (java.lang.Exception _exception) {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root1")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root2"));
            } catch (java.lang.Exception _exception) {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root2")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testArgsRefSameNode(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testArgsRefSameNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root1.value, root2.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root1"));
            } catch (java.lang.Exception _exception) {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root1")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root2"));
            } catch (java.lang.Exception _exception) {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root2")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testArgsRefEachOther(test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root1, test.wsdl.dataobjects.MultiRefTest.holders.NodeHolder root2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:MultiRefTest2", "testArgsRefEachOther"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {root1.value, root2.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root1"));
            } catch (java.lang.Exception _exception) {
                root1.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root1")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) _output.get(new javax.xml.namespace.QName("", "root2"));
            } catch (java.lang.Exception _exception) {
                root2.value = (test.wsdl.dataobjects.MultiRefTest.Node) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "root2")), test.wsdl.dataobjects.MultiRefTest.Node.class);
            }
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
