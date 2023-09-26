/**
 * MarshallTestSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.marshall2;

public class MarshallTestSoapBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.marshall2.MarshallTest {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bigDecimalArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArrayTest"), test.wsdl.dataobjects.marshall2.BigDecimalArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bigDecimalTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalTest"), test.wsdl.dataobjects.marshall2.BigDecimalTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BigDecimalTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bigIntegerArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArrayTest"), test.wsdl.dataobjects.marshall2.BigIntegerArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bigIntegerTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerTest"), test.wsdl.dataobjects.marshall2.BigIntegerTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BigIntegerTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("booleanArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanArrayTest"), test.wsdl.dataobjects.marshall2.BooleanArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("booleanTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanTest"), test.wsdl.dataobjects.marshall2.BooleanTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.BooleanTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("byteArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteArrayTest"), test.wsdl.dataobjects.marshall2.ByteArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.ByteArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("byteTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteTest"), test.wsdl.dataobjects.marshall2.ByteTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.ByteTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doubleArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleArrayTest"), test.wsdl.dataobjects.marshall2.DoubleArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doubleTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleTest"), test.wsdl.dataobjects.marshall2.DoubleTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.DoubleTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("floatArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatArrayTest"), test.wsdl.dataobjects.marshall2.FloatArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.FloatArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("floatTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatTest"), test.wsdl.dataobjects.marshall2.FloatTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.FloatTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("intArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntArrayTest"), test.wsdl.dataobjects.marshall2.IntArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.IntArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("intTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntTest"), test.wsdl.dataobjects.marshall2.IntTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.IntTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("longArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongArrayTest"), test.wsdl.dataobjects.marshall2.LongArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.LongArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("longTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongTest"), test.wsdl.dataobjects.marshall2.LongTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.LongTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shortArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortArrayTest"), test.wsdl.dataobjects.marshall2.ShortArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.ShortArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shortTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortTest"), test.wsdl.dataobjects.marshall2.ShortTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.ShortTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stringArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringArrayTest"), test.wsdl.dataobjects.marshall2.StringArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.StringArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stringTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringTest"), test.wsdl.dataobjects.marshall2.StringTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.StringTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("qnameTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameTest"), test.wsdl.dataobjects.marshall2.QNameTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.QNameTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("qnameArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameArrayTest"), test.wsdl.dataobjects.marshall2.QNameArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.QNameArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calendarArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArrayTest"), test.wsdl.dataobjects.marshall2.CalendarArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("calendarTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarTest"), test.wsdl.dataobjects.marshall2.CalendarTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.CalendarTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("javaBeanArrayTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArrayTest"), test.wsdl.dataobjects.marshall2.JavaBeanArrayTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArrayTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("javaBeanTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanTest"), test.wsdl.dataobjects.marshall2.JavaBeanTest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanTestResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.JavaBeanTestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fooAnyURITest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURIType"), test.wsdl.dataobjects.marshall2.FooAnyURIType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURITypeResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

    }

    public MarshallTestSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MarshallTestSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MarshallTestSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigDecimalArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigDecimalTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigDecimalTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigDecimalTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigIntegerArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigIntegerTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BigIntegerTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BigIntegerTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BooleanArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BooleanTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "BooleanTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.BooleanTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ByteArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ByteArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ByteTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ByteTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ByteTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.CalendarArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.CalendarTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "CalendarTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.CalendarTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.DoubleArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.DoubleTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "DoubleTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.DoubleTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FloatArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FloatArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FloatTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FloatTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FloatTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURIType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FooAnyURIType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "FooAnyURITypeResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.IntArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.IntArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.IntTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "IntTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.IntTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBean2");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBean2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBeanArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBeanTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "JavaBeanTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.JavaBeanTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.LongArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.LongArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.LongTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "LongTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.LongTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.QNameArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.QNameArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.QNameTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "QNameTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.QNameTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ShortArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ShortArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ShortTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "ShortTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.ShortTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringArrayTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.StringArrayTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringArrayTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.StringArrayTestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringTest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.StringTest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://marshall2.wsdl.test/types", "StringTestResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.marshall2.StringTestResponse.class;
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

    public test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse bigDecimalArrayTest(test.wsdl.dataobjects.marshall2.BigDecimalArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "bigDecimalArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BigDecimalArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.BigDecimalTestResponse bigDecimalTest(test.wsdl.dataobjects.marshall2.BigDecimalTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "bigDecimalTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BigDecimalTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BigDecimalTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BigDecimalTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse bigIntegerArrayTest(test.wsdl.dataobjects.marshall2.BigIntegerArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "bigIntegerArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BigIntegerArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.BigIntegerTestResponse bigIntegerTest(test.wsdl.dataobjects.marshall2.BigIntegerTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "bigIntegerTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BigIntegerTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BigIntegerTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BigIntegerTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse booleanArrayTest(test.wsdl.dataobjects.marshall2.BooleanArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "booleanArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BooleanArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.BooleanTestResponse booleanTest(test.wsdl.dataobjects.marshall2.BooleanTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "booleanTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.BooleanTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.BooleanTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.BooleanTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.ByteArrayTestResponse byteArrayTest(test.wsdl.dataobjects.marshall2.ByteArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "byteArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.ByteArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.ByteArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.ByteArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.ByteTestResponse byteTest(test.wsdl.dataobjects.marshall2.ByteTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "byteTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.ByteTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.ByteTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.ByteTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse doubleArrayTest(test.wsdl.dataobjects.marshall2.DoubleArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "doubleArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.DoubleArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.DoubleTestResponse doubleTest(test.wsdl.dataobjects.marshall2.DoubleTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "doubleTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.DoubleTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.DoubleTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.DoubleTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.FloatArrayTestResponse floatArrayTest(test.wsdl.dataobjects.marshall2.FloatArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "floatArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.FloatArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.FloatArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.FloatArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.FloatTestResponse floatTest(test.wsdl.dataobjects.marshall2.FloatTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "floatTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.FloatTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.FloatTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.FloatTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.IntArrayTestResponse intArrayTest(test.wsdl.dataobjects.marshall2.IntArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "intArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.IntArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.IntArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.IntArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.IntTestResponse intTest(test.wsdl.dataobjects.marshall2.IntTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "intTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.IntTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.IntTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.IntTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.LongArrayTestResponse longArrayTest(test.wsdl.dataobjects.marshall2.LongArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "longArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.LongArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.LongArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.LongArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.LongTestResponse longTest(test.wsdl.dataobjects.marshall2.LongTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "longTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.LongTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.LongTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.LongTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.ShortArrayTestResponse shortArrayTest(test.wsdl.dataobjects.marshall2.ShortArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "shortArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.ShortArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.ShortArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.ShortArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.ShortTestResponse shortTest(test.wsdl.dataobjects.marshall2.ShortTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "shortTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.ShortTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.ShortTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.ShortTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.StringArrayTestResponse stringArrayTest(test.wsdl.dataobjects.marshall2.StringArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "stringArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.StringArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.StringArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.StringArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.StringTestResponse stringTest(test.wsdl.dataobjects.marshall2.StringTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "stringTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.StringTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.StringTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.StringTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.QNameTestResponse qnameTest(test.wsdl.dataobjects.marshall2.QNameTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "qnameTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.QNameTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.QNameTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.QNameTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.QNameArrayTestResponse qnameArrayTest(test.wsdl.dataobjects.marshall2.QNameArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "qnameArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.QNameArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.QNameArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.QNameArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse calendarArrayTest(test.wsdl.dataobjects.marshall2.CalendarArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "calendarArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.CalendarArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.CalendarTestResponse calendarTest(test.wsdl.dataobjects.marshall2.CalendarTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "calendarTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.CalendarTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.CalendarTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.CalendarTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse javaBeanArrayTest(test.wsdl.dataobjects.marshall2.JavaBeanArrayTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "javaBeanArrayTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.JavaBeanArrayTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.JavaBeanTestResponse javaBeanTest(test.wsdl.dataobjects.marshall2.JavaBeanTest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "javaBeanTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.JavaBeanTestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.JavaBeanTestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.JavaBeanTestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse fooAnyURITest(test.wsdl.dataobjects.marshall2.FooAnyURIType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://marshall2.wsdl.test/", "fooAnyURITest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.marshall2.FooAnyURITypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
