/**
 * ComplexRpcEncBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.complex-rpc-encoded;

public class ComplexRpcEncBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.complex-rpc-encoded.ComplexRpcEncPortType {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"), test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part1"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoBaseStructFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoExtendedStructFault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part3"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStruct"), test.wsdl.dataobjects.complex-rpc-encoded.SOAPStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part1"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("echoMultipleFaults2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "whichFault"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soapinterop.org/types", "MoreExtendedStruct"), test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part4"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "MoreExtendedStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part3"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "part2"),
                      "test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct",
                      new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public ComplexRpcEncBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ComplexRpcEncBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ComplexRpcEncBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "BaseStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "ExtendedStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "MoreExtendedStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStruct");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-rpc-encoded.SOAPStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soapinterop.org/types", "SOAPStructFault");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault.class;
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

    public void echoSOAPStructFault(test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoSOAPStructFault"));

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
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoBaseStructFault(test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoBaseStructFault"));

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
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoExtendedStructFault(test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct param) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soapinterop.org/wsdl", "echoExtendedStructFault"));

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
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults1(int whichFault, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStruct param1, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param2) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct, test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault {
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
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.SOAPStructFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void echoMultipleFaults2(int whichFault, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct param1, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct param2, test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct param3) throws java.rmi.RemoteException, test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct, test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct, test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(whichFault), param1, param2, param3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.MoreExtendedStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.ExtendedStruct) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) {
              throw (test.wsdl.dataobjects.complex-rpc-encoded.BaseStruct) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
