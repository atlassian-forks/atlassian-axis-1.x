/**
 * SimpleRpcEncBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.simple-rpc-encoded;

public class SimpleRpcEncBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.simple-rpc-encoded.SimpleRpcEncPortType {
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
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part1"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "EmptyFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoStringFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoIntArrayFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part5"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.IntArrayFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt"), 
                      false
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfFloat"), float[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part1"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "EmptyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part7"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.FloatArrayFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfFloat"), 
                      false
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part4"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.FloatFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part6"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.StringArrayFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString"), 
                      false
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl/fault1", "part2"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.StringFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl/fault2", "part2"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.String2Fault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum"), test.wsdl.dataobjects.simple-rpc-encoded.Enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part3"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.IntFault",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part9"),
                      "test.wsdl.dataobjects.simple-rpc-encoded.EnumFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum"), 
                      false
                     ));
        _operations[6] = oper;

    }

    public SimpleRpcEncBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SimpleRpcEncBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SimpleRpcEncBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfFloat");
            cachedSerQNames.add(qName);
            cls = float[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "EmptyFault");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "Enum");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.simple-rpc-encoded.Enum.class;
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

    public void echoEmptyFault() throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoEmptyFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoStringFault(java.lang.String param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoStringFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.StringFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.StringFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoIntArrayFault(int[] param) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.IntArrayFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoIntArrayFault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.IntArrayFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.IntArrayFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults1(int whichFault, java.lang.String param1, float[] param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.FloatArrayFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoMultipleFaults1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(whichFault), param1, param2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.EmptyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.StringFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.FloatArrayFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.FloatArrayFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults2(int whichFault, java.lang.String param1, float param2, java.lang.String[] param3) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.FloatFault, test.wsdl.dataobjects.simple-rpc-encoded.StringArrayFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoMultipleFaults2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(whichFault), param1, new java.lang.Float(param2), param3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.StringFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.FloatFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.FloatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.StringArrayFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.StringArrayFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults3(int whichFault, java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.StringFault, test.wsdl.dataobjects.simple-rpc-encoded.String2Fault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoMultipleFaults3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(whichFault), param1, param2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.StringFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.StringFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.String2Fault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.String2Fault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults4(int whichFault, int param1, test.wsdl.dataobjects.simple-rpc-encoded.Enum param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.simple-rpc-encoded.IntFault, test.wsdl.dataobjects.simple-rpc-encoded.EnumFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoMultipleFaults4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(whichFault), new java.lang.Integer(param1), param2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.IntFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.IntFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.simple-rpc-encoded.EnumFault) {
              throw (test.wsdl.dataobjects.simple-rpc-encoded.EnumFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
