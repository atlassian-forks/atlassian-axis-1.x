/**
 * InoutSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.inout;

public class InoutSOAPBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.inout.Inout {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[28];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout0In0");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout0In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout0InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout1In0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout1In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0Inout1InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0InoutManyIn0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0InoutManyIn1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out0InoutManyInMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout0In0");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "number"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout0In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "number"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout0InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "number"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout1In0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.apache.org/inout", "address"));
        oper.setReturnClass(test.wsdl.dataobjects.inout.Address.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "address"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout1In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "otherName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1Inout1InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "otherName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1InoutManyIn0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "otherName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1InoutManyIn1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "otherName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("out1InoutManyInMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "otherName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout0In0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout0In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout0InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout1In0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout1In1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInout1InMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInoutManyIn0");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInoutManyIn1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outManyInoutManyInMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "address"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.apache.org/inout", "address"), test.wsdl.dataobjects.inout.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.apache.org/inout", "phone"), test.wsdl.dataobjects.inout.Phone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "otherName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dateInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

    }

    public InoutSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public InoutSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public InoutSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.apache.org/inout", "address");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.inout.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.apache.org/inout", "phone");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.inout.Phone.class;
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

    public void out0Inout0In0() throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout0In0"));

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
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0Inout0In1(java.lang.String name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout0In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0Inout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout0InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0Inout1In0(test.wsdl.dataobjects.inout.holders.PhoneHolder phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout1In0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phone.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                phone.value = (test.wsdl.dataobjects.inout.Phone) _output.get(new javax.xml.namespace.QName("", "phone"));
            } catch (java.lang.Exception _exception) {
                phone.value = (test.wsdl.dataobjects.inout.Phone) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "phone")), test.wsdl.dataobjects.inout.Phone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0Inout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout1In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0Inout1InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.holders.PhoneHolder phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0Inout1InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, address, phone.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                phone.value = (test.wsdl.dataobjects.inout.Phone) _output.get(new javax.xml.namespace.QName("", "phone"));
            } catch (java.lang.Exception _exception) {
                phone.value = (test.wsdl.dataobjects.inout.Phone) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "phone")), test.wsdl.dataobjects.inout.Phone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0InoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0InoutManyIn0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0InoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0InoutManyIn1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void out0InoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int number) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out0InoutManyInMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone, new java.lang.Integer(number)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int out1Inout0In0() throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout0In0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int out1Inout0In1(java.lang.String name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout0In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int out1Inout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout0InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.inout.Address out1Inout1In0(javax.xml.rpc.holders.StringHolder name) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout1In0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                return (test.wsdl.dataobjects.inout.Address) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.inout.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String out1Inout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout1In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String out1Inout1InMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1Inout1InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address, phone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String out1InoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1InoutManyIn0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String out1InoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1InoutManyIn1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String out1InoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int number) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "out1InoutManyInMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone, new java.lang.Integer(number)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout0In0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout0In0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout0In1(java.lang.String name, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout0In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout0InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout0InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout1In0(javax.xml.rpc.holders.StringHolder name, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout1In0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout1In1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.Address address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout1In1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInout1InMany(java.lang.String name, test.wsdl.dataobjects.inout.Address address, test.wsdl.dataobjects.inout.holders.PhoneHolder phone, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInout1InMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, address, phone.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                phone.value = (test.wsdl.dataobjects.inout.Phone) _output.get(new javax.xml.namespace.QName("", "phone"));
            } catch (java.lang.Exception _exception) {
                phone.value = (test.wsdl.dataobjects.inout.Phone) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "phone")), test.wsdl.dataobjects.inout.Phone.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInoutManyIn0(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInoutManyIn0"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInoutManyIn1(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInoutManyIn1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void outManyInoutManyInMany(javax.xml.rpc.holders.StringHolder name, test.wsdl.dataobjects.inout.holders.AddressHolder address, test.wsdl.dataobjects.inout.Phone phone, int otherNumber, javax.xml.rpc.holders.IntHolder number, javax.xml.rpc.holders.StringHolder otherName) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "outManyInoutManyInMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name.value, address.value, phone, new java.lang.Integer(otherNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "name"));
            } catch (java.lang.Exception _exception) {
                name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "name")), java.lang.String.class);
            }
            try {
                address.value = (test.wsdl.dataobjects.inout.Address) _output.get(new javax.xml.namespace.QName("", "address"));
            } catch (java.lang.Exception _exception) {
                address.value = (test.wsdl.dataobjects.inout.Address) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "address")), test.wsdl.dataobjects.inout.Address.class);
            }
            try {
                number.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "number"))).intValue();
            } catch (java.lang.Exception _exception) {
                number.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "number")), int.class)).intValue();
            }
            try {
                otherName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "otherName"));
            } catch (java.lang.Exception _exception) {
                otherName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "otherName")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void dateInout(org.apache.axis.holders.DateHolder date) throws java.rmi.RemoteException, test.wsdl.dataobjects.inout.TestFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.apache.org/inout", "dateInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {date.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                date.value = (java.util.Date) _output.get(new javax.xml.namespace.QName("", "date"));
            } catch (java.lang.Exception _exception) {
                date.value = (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "date")), java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.inout.TestFailed) {
              throw (test.wsdl.dataobjects.inout.TestFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
