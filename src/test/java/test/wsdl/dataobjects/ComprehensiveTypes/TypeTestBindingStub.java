/**
 * TypeTestBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public class TypeTestBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.ComprehensiveTypes.TypeTest_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[82];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allPrimitivesIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "string"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "integer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "int"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "long"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "short"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decimal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "float"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "double"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boolean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "byte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"), byte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base64Binary"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hexBinary"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBoolean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapFloat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"), java.lang.Float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDouble"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDecimal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapShort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"), java.lang.Short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBase64"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"), org.apache.axis.types.Time.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedLong"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedShort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedByte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonNegativeInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"), org.apache.axis.types.NonNegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "positiveInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"), org.apache.axis.types.PositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonPositiveInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"), org.apache.axis.types.NonPositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "negativeInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"), org.apache.axis.types.NegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anyURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYear"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"), org.apache.axis.types.Year.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"), org.apache.axis.types.Month.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gDay"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"), org.apache.axis.types.Day.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYearMonth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"), org.apache.axis.types.YearMonth.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonthDay"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"), org.apache.axis.types.MonthDay.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allPrimitivesInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "string"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "integer"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "int"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "long"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "short"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decimal"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "float"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "double"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boolean"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "byte"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"), byte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QName"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateTime"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base64Binary"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hexBinary"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapString"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBoolean"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapFloat"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"), java.lang.Float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDouble"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDecimal"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapInt"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapShort"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"), java.lang.Short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBase64"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"), org.apache.axis.types.Time.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedLong"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedInt"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedShort"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedByte"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonNegativeInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"), org.apache.axis.types.NonNegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "positiveInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"), org.apache.axis.types.PositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonPositiveInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"), org.apache.axis.types.NonPositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "negativeInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"), org.apache.axis.types.NegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anyURI"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYear"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"), org.apache.axis.types.Year.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonth"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"), org.apache.axis.types.Month.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gDay"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"), org.apache.axis.types.Day.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYearMonth"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"), org.apache.axis.types.YearMonth.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonthDay"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"), org.apache.axis.types.MonthDay.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allPrimitivesOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "string"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "integer"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "int"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "long"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "short"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decimal"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "float"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "double"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boolean"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "byte"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"), byte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateTime"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base64Binary"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hexBinary"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapString"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBoolean"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapFloat"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"), java.lang.Float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDouble"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapDecimal"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapInt"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapShort"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"), java.lang.Short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapBase64"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"), org.apache.axis.types.Time.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedLong"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedInt"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedShort"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedByte"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonNegativeInteger"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"), org.apache.axis.types.NonNegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "positiveInteger"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"), org.apache.axis.types.PositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonPositiveInteger"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"), org.apache.axis.types.NonPositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "negativeInteger"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"), org.apache.axis.types.NegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anyURI"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYear"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"), org.apache.axis.types.Year.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonth"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"), org.apache.axis.types.Month.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gDay"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"), org.apache.axis.types.Day.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gYearMonth"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"), org.apache.axis.types.YearMonth.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gMonthDay"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"), org.apache.axis.types.MonthDay.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enum"), test.wsdl.dataobjects.ComprehensiveTypes.Enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enum"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enum"), test.wsdl.dataobjects.ComprehensiveTypes.Enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enum"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enum"), test.wsdl.dataobjects.ComprehensiveTypes.Enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enum"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.Enum.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enum"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumIntIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInt"), test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumIntInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumInt"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInt"), test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumIntOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumInt"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInt"), test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enumIntReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInt"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enumInt"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayMIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arrayM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM"), int[][][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayMInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arrayM"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM"), int[][][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayMOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arrayM"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM"), int[][][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arrayMReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM"));
        oper.setReturnClass(int[][][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "arrayM"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexAllIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexAll"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class, false, false);
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
        oper.setName("complexAllInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexAll"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexAll"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexAllOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexAll"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexAll"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexAllReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexAll"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "complexAll"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexSequenceIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexSequence"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexSequence"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexSequenceInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexSequence"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexSequence"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexSequenceOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexSequence"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexSequence"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexSequenceReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexSequence"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "complexSequence"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexWComplexIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexWComplex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexWComplexInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexWComplex"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexWComplexOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "complexWComplex"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex"), test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("complexWComplexReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "complexWComplex"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyComplexTypeIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emptyComplexType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyComplexType"), test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "theFault"),
                      "test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault",
                      new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyComplexTypeInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emptyComplexType"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyComplexType"), test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "theFault"),
                      "test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault",
                      new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyComplexTypeOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emptyComplexType"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyComplexType"), test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "theFault"),
                      "test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault",
                      new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyComplexTypeReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyComplexType"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "emptyComplexType"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "theFault"),
                      "test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault",
                      new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("anyIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "any"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("anyInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "any"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("anyOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "any"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("anyReturn");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        oper.setReturnClass(java.lang.Object.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "any"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animalIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "animal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Animal"), test.wsdl.dataobjects.ComprehensiveTypes.Animal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animalInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "animal"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Animal"), test.wsdl.dataobjects.ComprehensiveTypes.Animal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animalOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "animal"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Animal"), test.wsdl.dataobjects.ComprehensiveTypes.Animal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animalReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Animal"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.Animal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "animal"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat"), test.wsdl.dataobjects.ComprehensiveTypes.Cat.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catInout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat"), test.wsdl.dataobjects.ComprehensiveTypes.Cat.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat"), test.wsdl.dataobjects.ComprehensiveTypes.Cat.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("catReturn");
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.Cat.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cat"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodBoolean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inBoolean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "boolean"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodByte");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inByte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"), byte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "byte"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"), byte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        oper.setReturnClass(byte.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outByte"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodShort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inShort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "short"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        oper.setReturnClass(short.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outShort"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodInt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "int"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outInt"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodLong");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inLong"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "long"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outLong"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodFloat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inFloat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "float"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outFloat"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodDouble");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inDouble"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "double"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        oper.setReturnClass(double.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outDouble"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "string"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outString"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodInteger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "integer"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        oper.setReturnClass(java.math.BigInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outInteger"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodDecimal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inDecimal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decimal"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outDecimal"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodDateTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateTime"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outDateTime"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodQName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inQName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qName"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"), javax.xml.namespace.QName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
        oper.setReturnClass(javax.xml.namespace.QName.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outQName"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"), org.apache.axis.types.Time.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"), org.apache.axis.types.Time.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        oper.setReturnClass(org.apache.axis.types.Time.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outTime"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodUnsignedLong");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inUnsignedLong"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedLong"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        oper.setReturnClass(org.apache.axis.types.UnsignedLong.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outUnsignedLong"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodUnsignedInt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inUnsignedInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedInt"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        oper.setReturnClass(org.apache.axis.types.UnsignedInt.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outUnsignedInt"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodUnsignedShort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inUnsignedShort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedShort"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"), org.apache.axis.types.UnsignedShort.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        oper.setReturnClass(org.apache.axis.types.UnsignedShort.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outUnsignedShort"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodUnsignedByte");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inUnsignedByte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unsignedByte"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        oper.setReturnClass(org.apache.axis.types.UnsignedByte.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outUnsignedByte"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodNonNegativeInteger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inNonNegativeInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"), org.apache.axis.types.NonNegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NonNegativeInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"), org.apache.axis.types.NonNegativeInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        oper.setReturnClass(org.apache.axis.types.NonNegativeInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outNonNegativeInteger"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodPositiveInteger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inPositiveInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"), org.apache.axis.types.PositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PositiveInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"), org.apache.axis.types.PositiveInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        oper.setReturnClass(org.apache.axis.types.PositiveInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outPositiveInteger"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodNonPositiveInteger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inNonPositiveInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"), org.apache.axis.types.NonPositiveInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NonPositiveInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"), org.apache.axis.types.NonPositiveInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonPositiveInteger"));
        oper.setReturnClass(org.apache.axis.types.NonPositiveInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outNonPositiveInteger"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodNegativeInteger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inNegativeInteger"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"), org.apache.axis.types.NegativeInteger.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NegativeInteger"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"), org.apache.axis.types.NegativeInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "negativeInteger"));
        oper.setReturnClass(org.apache.axis.types.NegativeInteger.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outNegativeInteger"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodAnyURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inAnyURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anyURI"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        oper.setReturnClass(org.apache.axis.types.URI.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outAnyURI"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSimpleAnyURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inAnyURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "SimpleAnyURIType"), test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anyURI"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "SimpleAnyURIType"), test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "SimpleAnyURIType"));
        oper.setReturnClass(test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outAnyURI"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodYear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inYear"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"), org.apache.axis.types.Year.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Year"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"), org.apache.axis.types.Year.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        oper.setReturnClass(org.apache.axis.types.Year.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outYear"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodMonth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inMonth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"), org.apache.axis.types.Month.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Month"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"), org.apache.axis.types.Month.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonth"));
        oper.setReturnClass(org.apache.axis.types.Month.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outMonth"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodDay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inDay"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"), org.apache.axis.types.Day.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Day"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"), org.apache.axis.types.Day.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gDay"));
        oper.setReturnClass(org.apache.axis.types.Day.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outDay"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodYearMonth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inYearMonth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"), org.apache.axis.types.YearMonth.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "YearMonth"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"), org.apache.axis.types.YearMonth.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"));
        oper.setReturnClass(org.apache.axis.types.YearMonth.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outYearMonth"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodMonthDay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inMonthDay"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"), org.apache.axis.types.MonthDay.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "MonthDay"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"), org.apache.axis.types.MonthDay.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gMonthDay"));
        oper.setReturnClass(org.apache.axis.types.MonthDay.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outMonthDay"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencString"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapString"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapBoolean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapBoolean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencBoolean"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapFloat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapFloat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"), java.lang.Float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencFloat"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"), java.lang.Float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "float"));
        oper.setReturnClass(java.lang.Float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapFloat"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapDouble");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapDouble"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencDouble"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        oper.setReturnClass(java.lang.Double.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapDouble"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapDecimal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapDecimal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencDecimal"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapDecimal"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapInt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapInt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencInt"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapInt"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodSoapShort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inSoapShort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"), java.lang.Short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "soapencShort"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"), java.lang.Short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "short"));
        oper.setReturnClass(java.lang.Short.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "outSoapShort"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

    }

    public TypeTestBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TypeTestBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TypeTestBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", ">complexWComplex>stock_quote");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplexStock_quote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "AIDType");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Animal");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Animal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "array_of_base64");
            cachedSerQNames.add(qName);
            cls = byte[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "base64Binary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM");
            cachedSerQNames.add(qName);
            cls = int[][][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM2");
            cachedSerQNames.add(qName);
            cls = int[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM3");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "arrayM3");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Cat");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Cat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Class");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes._class.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexAll");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexChoice");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.ComplexChoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexSequence");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "complexWComplex");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyComplexType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "emptyFault");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enum");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumByte");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumByte.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumDouble");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumDouble.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumFloat");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumFloat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInt");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumInteger");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumLong");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumLong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumNMTOKEN");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumNMTOKEN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumShort");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "enumString");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.EnumString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "faultType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "flowDirectionType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.FlowDirectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Object");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Object.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "passModeType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.PassModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "PersionCat");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.PersionCat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "simple");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "simpleDate");
            cachedSerQNames.add(qName);
            cls = java.util.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "simpleDateTime");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "simpleFwd");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "String");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "StringParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.StringParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "time");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Time.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:comprehensive-types.types.wsdl.test", "Yarn");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.Yarn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "a");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.A.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "b");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.B.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "fwd");
            cachedSerQNames.add(qName);
            cls = javax.xml.namespace.QName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/XMLSchema", "QName");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:comprehensive-types2.types.wsdl.test", "SimpleAnyURIType");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class;
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

    public void allPrimitivesIn(java.lang.String string, java.math.BigInteger integer, int _int, long _long, short _short, java.math.BigDecimal decimal, float _float, double _double, boolean _boolean, byte _byte, javax.xml.namespace.QName QName, java.util.Calendar dateTime, byte[] base64Binary, byte[] hexBinary, java.lang.String soapString, java.lang.Boolean soapBoolean, java.lang.Float soapFloat, java.lang.Double soapDouble, java.math.BigDecimal soapDecimal, java.lang.Integer soapInt, java.lang.Short soapShort, byte[] soapBase64, org.apache.axis.types.Time time, org.apache.axis.types.UnsignedLong unsignedLong, org.apache.axis.types.UnsignedInt unsignedInt, org.apache.axis.types.UnsignedShort unsignedShort, org.apache.axis.types.UnsignedByte unsignedByte, org.apache.axis.types.NonNegativeInteger nonNegativeInteger, org.apache.axis.types.PositiveInteger positiveInteger, org.apache.axis.types.NonPositiveInteger nonPositiveInteger, org.apache.axis.types.NegativeInteger negativeInteger, org.apache.axis.types.URI anyURI, org.apache.axis.types.Year gYear, org.apache.axis.types.Month gMonth, org.apache.axis.types.Day gDay, org.apache.axis.types.YearMonth gYearMonth, org.apache.axis.types.MonthDay gMonthDay) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "allPrimitivesIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {string, integer, new java.lang.Integer(_int), new java.lang.Long(_long), new java.lang.Short(_short), decimal, new java.lang.Float(_float), new java.lang.Double(_double), new java.lang.Boolean(_boolean), new java.lang.Byte(_byte), QName, dateTime, base64Binary, new org.apache.axis.types.HexBinary(hexBinary), soapString, soapBoolean, soapFloat, soapDouble, soapDecimal, soapInt, soapShort, soapBase64, time, unsignedLong, unsignedInt, unsignedShort, unsignedByte, nonNegativeInteger, positiveInteger, nonPositiveInteger, negativeInteger, anyURI, gYear, gMonth, gDay, gYearMonth, gMonthDay});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void allPrimitivesInout(javax.xml.rpc.holders.StringHolder string, javax.xml.rpc.holders.BigIntegerHolder integer, javax.xml.rpc.holders.IntHolder _int, javax.xml.rpc.holders.LongHolder _long, javax.xml.rpc.holders.ShortHolder _short, javax.xml.rpc.holders.BigDecimalHolder decimal, javax.xml.rpc.holders.FloatHolder _float, javax.xml.rpc.holders.DoubleHolder _double, javax.xml.rpc.holders.BooleanHolder _boolean, javax.xml.rpc.holders.ByteHolder _byte, javax.xml.rpc.holders.QNameHolder QName, javax.xml.rpc.holders.CalendarHolder dateTime, javax.xml.rpc.holders.ByteArrayHolder base64Binary, javax.xml.rpc.holders.ByteArrayHolder hexBinary, javax.xml.rpc.holders.StringHolder soapString, javax.xml.rpc.holders.BooleanWrapperHolder soapBoolean, javax.xml.rpc.holders.FloatWrapperHolder soapFloat, javax.xml.rpc.holders.DoubleWrapperHolder soapDouble, javax.xml.rpc.holders.BigDecimalHolder soapDecimal, javax.xml.rpc.holders.IntegerWrapperHolder soapInt, javax.xml.rpc.holders.ShortWrapperHolder soapShort, javax.xml.rpc.holders.ByteArrayHolder soapBase64, org.apache.axis.holders.TimeHolder time, org.apache.axis.holders.UnsignedLongHolder unsignedLong, org.apache.axis.holders.UnsignedIntHolder unsignedInt, org.apache.axis.holders.UnsignedShortHolder unsignedShort, org.apache.axis.holders.UnsignedByteHolder unsignedByte, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger, org.apache.axis.holders.URIHolder anyURI, org.apache.axis.holders.YearHolder gYear, org.apache.axis.holders.MonthHolder gMonth, org.apache.axis.holders.DayHolder gDay, org.apache.axis.holders.YearMonthHolder gYearMonth, org.apache.axis.holders.MonthDayHolder gMonthDay) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "allPrimitivesInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {string.value, integer.value, new java.lang.Integer(_int.value), new java.lang.Long(_long.value), new java.lang.Short(_short.value), decimal.value, new java.lang.Float(_float.value), new java.lang.Double(_double.value), new java.lang.Boolean(_boolean.value), new java.lang.Byte(_byte.value), QName.value, dateTime.value, base64Binary.value, new org.apache.axis.types.HexBinary(hexBinary.value), soapString.value, soapBoolean.value, soapFloat.value, soapDouble.value, soapDecimal.value, soapInt.value, soapShort.value, soapBase64.value, time.value, unsignedLong.value, unsignedInt.value, unsignedShort.value, unsignedByte.value, nonNegativeInteger.value, positiveInteger.value, nonPositiveInteger.value, negativeInteger.value, anyURI.value, gYear.value, gMonth.value, gDay.value, gYearMonth.value, gMonthDay.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                string.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "string"));
            } catch (java.lang.Exception _exception) {
                string.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "string")), java.lang.String.class);
            }
            try {
                integer.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("", "integer"));
            } catch (java.lang.Exception _exception) {
                integer.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "integer")), java.math.BigInteger.class);
            }
            try {
                _int.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "int"))).intValue();
            } catch (java.lang.Exception _exception) {
                _int.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "int")), int.class)).intValue();
            }
            try {
                _long.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "long"))).longValue();
            } catch (java.lang.Exception _exception) {
                _long.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "long")), long.class)).longValue();
            }
            try {
                _short.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("", "short"))).shortValue();
            } catch (java.lang.Exception _exception) {
                _short.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "short")), short.class)).shortValue();
            }
            try {
                decimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "decimal"));
            } catch (java.lang.Exception _exception) {
                decimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "decimal")), java.math.BigDecimal.class);
            }
            try {
                _float.value = ((java.lang.Float) _output.get(new javax.xml.namespace.QName("", "float"))).floatValue();
            } catch (java.lang.Exception _exception) {
                _float.value = ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "float")), float.class)).floatValue();
            }
            try {
                _double.value = ((java.lang.Double) _output.get(new javax.xml.namespace.QName("", "double"))).doubleValue();
            } catch (java.lang.Exception _exception) {
                _double.value = ((java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "double")), double.class)).doubleValue();
            }
            try {
                _boolean.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "boolean"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                _boolean.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "boolean")), boolean.class)).booleanValue();
            }
            try {
                _byte.value = ((java.lang.Byte) _output.get(new javax.xml.namespace.QName("", "byte"))).byteValue();
            } catch (java.lang.Exception _exception) {
                _byte.value = ((java.lang.Byte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "byte")), byte.class)).byteValue();
            }
            try {
                QName.value = (javax.xml.namespace.QName) _output.get(new javax.xml.namespace.QName("", "QName"));
            } catch (java.lang.Exception _exception) {
                QName.value = (javax.xml.namespace.QName) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QName")), javax.xml.namespace.QName.class);
            }
            try {
                dateTime.value = (java.util.Calendar) _output.get(new javax.xml.namespace.QName("", "dateTime"));
            } catch (java.lang.Exception _exception) {
                dateTime.value = (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "dateTime")), java.util.Calendar.class);
            }
            try {
                base64Binary.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "base64Binary"));
            } catch (java.lang.Exception _exception) {
                base64Binary.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "base64Binary")), byte[].class);
            }
            try {
                hexBinary.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "hexBinary"));
            } catch (java.lang.Exception _exception) {
                hexBinary.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hexBinary")), byte[].class);
            }
            try {
                soapString.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "soapString"));
            } catch (java.lang.Exception _exception) {
                soapString.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapString")), java.lang.String.class);
            }
            try {
                soapBoolean.value = (java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "soapBoolean"));
            } catch (java.lang.Exception _exception) {
                soapBoolean.value = (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapBoolean")), java.lang.Boolean.class);
            }
            try {
                soapFloat.value = (java.lang.Float) _output.get(new javax.xml.namespace.QName("", "soapFloat"));
            } catch (java.lang.Exception _exception) {
                soapFloat.value = (java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapFloat")), java.lang.Float.class);
            }
            try {
                soapDouble.value = (java.lang.Double) _output.get(new javax.xml.namespace.QName("", "soapDouble"));
            } catch (java.lang.Exception _exception) {
                soapDouble.value = (java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapDouble")), java.lang.Double.class);
            }
            try {
                soapDecimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "soapDecimal"));
            } catch (java.lang.Exception _exception) {
                soapDecimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapDecimal")), java.math.BigDecimal.class);
            }
            try {
                soapInt.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "soapInt"));
            } catch (java.lang.Exception _exception) {
                soapInt.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapInt")), java.lang.Integer.class);
            }
            try {
                soapShort.value = (java.lang.Short) _output.get(new javax.xml.namespace.QName("", "soapShort"));
            } catch (java.lang.Exception _exception) {
                soapShort.value = (java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapShort")), java.lang.Short.class);
            }
            try {
                soapBase64.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "soapBase64"));
            } catch (java.lang.Exception _exception) {
                soapBase64.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapBase64")), byte[].class);
            }
            try {
                time.value = (org.apache.axis.types.Time) _output.get(new javax.xml.namespace.QName("", "time"));
            } catch (java.lang.Exception _exception) {
                time.value = (org.apache.axis.types.Time) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "time")), org.apache.axis.types.Time.class);
            }
            try {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) _output.get(new javax.xml.namespace.QName("", "unsignedLong"));
            } catch (java.lang.Exception _exception) {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedLong")), org.apache.axis.types.UnsignedLong.class);
            }
            try {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) _output.get(new javax.xml.namespace.QName("", "unsignedInt"));
            } catch (java.lang.Exception _exception) {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedInt")), org.apache.axis.types.UnsignedInt.class);
            }
            try {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) _output.get(new javax.xml.namespace.QName("", "unsignedShort"));
            } catch (java.lang.Exception _exception) {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedShort")), org.apache.axis.types.UnsignedShort.class);
            }
            try {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) _output.get(new javax.xml.namespace.QName("", "unsignedByte"));
            } catch (java.lang.Exception _exception) {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedByte")), org.apache.axis.types.UnsignedByte.class);
            }
            try {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) _output.get(new javax.xml.namespace.QName("", "nonNegativeInteger"));
            } catch (java.lang.Exception _exception) {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "nonNegativeInteger")), org.apache.axis.types.NonNegativeInteger.class);
            }
            try {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) _output.get(new javax.xml.namespace.QName("", "positiveInteger"));
            } catch (java.lang.Exception _exception) {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "positiveInteger")), org.apache.axis.types.PositiveInteger.class);
            }
            try {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) _output.get(new javax.xml.namespace.QName("", "nonPositiveInteger"));
            } catch (java.lang.Exception _exception) {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "nonPositiveInteger")), org.apache.axis.types.NonPositiveInteger.class);
            }
            try {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) _output.get(new javax.xml.namespace.QName("", "negativeInteger"));
            } catch (java.lang.Exception _exception) {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "negativeInteger")), org.apache.axis.types.NegativeInteger.class);
            }
            try {
                anyURI.value = (org.apache.axis.types.URI) _output.get(new javax.xml.namespace.QName("", "anyURI"));
            } catch (java.lang.Exception _exception) {
                anyURI.value = (org.apache.axis.types.URI) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "anyURI")), org.apache.axis.types.URI.class);
            }
            try {
                gYear.value = (org.apache.axis.types.Year) _output.get(new javax.xml.namespace.QName("", "gYear"));
            } catch (java.lang.Exception _exception) {
                gYear.value = (org.apache.axis.types.Year) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gYear")), org.apache.axis.types.Year.class);
            }
            try {
                gMonth.value = (org.apache.axis.types.Month) _output.get(new javax.xml.namespace.QName("", "gMonth"));
            } catch (java.lang.Exception _exception) {
                gMonth.value = (org.apache.axis.types.Month) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gMonth")), org.apache.axis.types.Month.class);
            }
            try {
                gDay.value = (org.apache.axis.types.Day) _output.get(new javax.xml.namespace.QName("", "gDay"));
            } catch (java.lang.Exception _exception) {
                gDay.value = (org.apache.axis.types.Day) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gDay")), org.apache.axis.types.Day.class);
            }
            try {
                gYearMonth.value = (org.apache.axis.types.YearMonth) _output.get(new javax.xml.namespace.QName("", "gYearMonth"));
            } catch (java.lang.Exception _exception) {
                gYearMonth.value = (org.apache.axis.types.YearMonth) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gYearMonth")), org.apache.axis.types.YearMonth.class);
            }
            try {
                gMonthDay.value = (org.apache.axis.types.MonthDay) _output.get(new javax.xml.namespace.QName("", "gMonthDay"));
            } catch (java.lang.Exception _exception) {
                gMonthDay.value = (org.apache.axis.types.MonthDay) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gMonthDay")), org.apache.axis.types.MonthDay.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void allPrimitivesOut(javax.xml.rpc.holders.StringHolder string, javax.xml.rpc.holders.BigIntegerHolder integer, javax.xml.rpc.holders.IntHolder _int, javax.xml.rpc.holders.LongHolder _long, javax.xml.rpc.holders.ShortHolder _short, javax.xml.rpc.holders.BigDecimalHolder decimal, javax.xml.rpc.holders.FloatHolder _float, javax.xml.rpc.holders.DoubleHolder _double, javax.xml.rpc.holders.BooleanHolder _boolean, javax.xml.rpc.holders.ByteHolder _byte, javax.xml.rpc.holders.QNameHolder QName, javax.xml.rpc.holders.CalendarHolder dateTime, javax.xml.rpc.holders.ByteArrayHolder base64Binary, javax.xml.rpc.holders.ByteArrayHolder hexBinary, javax.xml.rpc.holders.StringHolder soapString, javax.xml.rpc.holders.BooleanWrapperHolder soapBoolean, javax.xml.rpc.holders.FloatWrapperHolder soapFloat, javax.xml.rpc.holders.DoubleWrapperHolder soapDouble, javax.xml.rpc.holders.BigDecimalHolder soapDecimal, javax.xml.rpc.holders.IntegerWrapperHolder soapInt, javax.xml.rpc.holders.ShortWrapperHolder soapShort, javax.xml.rpc.holders.ByteArrayHolder soapBase64, org.apache.axis.holders.TimeHolder time, org.apache.axis.holders.UnsignedLongHolder unsignedLong, org.apache.axis.holders.UnsignedIntHolder unsignedInt, org.apache.axis.holders.UnsignedShortHolder unsignedShort, org.apache.axis.holders.UnsignedByteHolder unsignedByte, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger, org.apache.axis.holders.URIHolder anyURI, org.apache.axis.holders.YearHolder gYear, org.apache.axis.holders.MonthHolder gMonth, org.apache.axis.holders.DayHolder gDay, org.apache.axis.holders.YearMonthHolder gYearMonth, org.apache.axis.holders.MonthDayHolder gMonthDay) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "allPrimitivesOut"));

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
                string.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "string"));
            } catch (java.lang.Exception _exception) {
                string.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "string")), java.lang.String.class);
            }
            try {
                integer.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("", "integer"));
            } catch (java.lang.Exception _exception) {
                integer.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "integer")), java.math.BigInteger.class);
            }
            try {
                _int.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "int"))).intValue();
            } catch (java.lang.Exception _exception) {
                _int.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "int")), int.class)).intValue();
            }
            try {
                _long.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "long"))).longValue();
            } catch (java.lang.Exception _exception) {
                _long.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "long")), long.class)).longValue();
            }
            try {
                _short.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("", "short"))).shortValue();
            } catch (java.lang.Exception _exception) {
                _short.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "short")), short.class)).shortValue();
            }
            try {
                decimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "decimal"));
            } catch (java.lang.Exception _exception) {
                decimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "decimal")), java.math.BigDecimal.class);
            }
            try {
                _float.value = ((java.lang.Float) _output.get(new javax.xml.namespace.QName("", "float"))).floatValue();
            } catch (java.lang.Exception _exception) {
                _float.value = ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "float")), float.class)).floatValue();
            }
            try {
                _double.value = ((java.lang.Double) _output.get(new javax.xml.namespace.QName("", "double"))).doubleValue();
            } catch (java.lang.Exception _exception) {
                _double.value = ((java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "double")), double.class)).doubleValue();
            }
            try {
                _boolean.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "boolean"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                _boolean.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "boolean")), boolean.class)).booleanValue();
            }
            try {
                _byte.value = ((java.lang.Byte) _output.get(new javax.xml.namespace.QName("", "byte"))).byteValue();
            } catch (java.lang.Exception _exception) {
                _byte.value = ((java.lang.Byte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "byte")), byte.class)).byteValue();
            }
            try {
                QName.value = (javax.xml.namespace.QName) _output.get(new javax.xml.namespace.QName("", "QName"));
            } catch (java.lang.Exception _exception) {
                QName.value = (javax.xml.namespace.QName) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QName")), javax.xml.namespace.QName.class);
            }
            try {
                dateTime.value = (java.util.Calendar) _output.get(new javax.xml.namespace.QName("", "dateTime"));
            } catch (java.lang.Exception _exception) {
                dateTime.value = (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "dateTime")), java.util.Calendar.class);
            }
            try {
                base64Binary.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "base64Binary"));
            } catch (java.lang.Exception _exception) {
                base64Binary.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "base64Binary")), byte[].class);
            }
            try {
                hexBinary.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "hexBinary"));
            } catch (java.lang.Exception _exception) {
                hexBinary.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "hexBinary")), byte[].class);
            }
            try {
                soapString.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "soapString"));
            } catch (java.lang.Exception _exception) {
                soapString.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapString")), java.lang.String.class);
            }
            try {
                soapBoolean.value = (java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "soapBoolean"));
            } catch (java.lang.Exception _exception) {
                soapBoolean.value = (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapBoolean")), java.lang.Boolean.class);
            }
            try {
                soapFloat.value = (java.lang.Float) _output.get(new javax.xml.namespace.QName("", "soapFloat"));
            } catch (java.lang.Exception _exception) {
                soapFloat.value = (java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapFloat")), java.lang.Float.class);
            }
            try {
                soapDouble.value = (java.lang.Double) _output.get(new javax.xml.namespace.QName("", "soapDouble"));
            } catch (java.lang.Exception _exception) {
                soapDouble.value = (java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapDouble")), java.lang.Double.class);
            }
            try {
                soapDecimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "soapDecimal"));
            } catch (java.lang.Exception _exception) {
                soapDecimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapDecimal")), java.math.BigDecimal.class);
            }
            try {
                soapInt.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "soapInt"));
            } catch (java.lang.Exception _exception) {
                soapInt.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapInt")), java.lang.Integer.class);
            }
            try {
                soapShort.value = (java.lang.Short) _output.get(new javax.xml.namespace.QName("", "soapShort"));
            } catch (java.lang.Exception _exception) {
                soapShort.value = (java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapShort")), java.lang.Short.class);
            }
            try {
                soapBase64.value = (byte[]) _output.get(new javax.xml.namespace.QName("", "soapBase64"));
            } catch (java.lang.Exception _exception) {
                soapBase64.value = (byte[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapBase64")), byte[].class);
            }
            try {
                time.value = (org.apache.axis.types.Time) _output.get(new javax.xml.namespace.QName("", "time"));
            } catch (java.lang.Exception _exception) {
                time.value = (org.apache.axis.types.Time) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "time")), org.apache.axis.types.Time.class);
            }
            try {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) _output.get(new javax.xml.namespace.QName("", "unsignedLong"));
            } catch (java.lang.Exception _exception) {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedLong")), org.apache.axis.types.UnsignedLong.class);
            }
            try {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) _output.get(new javax.xml.namespace.QName("", "unsignedInt"));
            } catch (java.lang.Exception _exception) {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedInt")), org.apache.axis.types.UnsignedInt.class);
            }
            try {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) _output.get(new javax.xml.namespace.QName("", "unsignedShort"));
            } catch (java.lang.Exception _exception) {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedShort")), org.apache.axis.types.UnsignedShort.class);
            }
            try {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) _output.get(new javax.xml.namespace.QName("", "unsignedByte"));
            } catch (java.lang.Exception _exception) {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedByte")), org.apache.axis.types.UnsignedByte.class);
            }
            try {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) _output.get(new javax.xml.namespace.QName("", "nonNegativeInteger"));
            } catch (java.lang.Exception _exception) {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "nonNegativeInteger")), org.apache.axis.types.NonNegativeInteger.class);
            }
            try {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) _output.get(new javax.xml.namespace.QName("", "positiveInteger"));
            } catch (java.lang.Exception _exception) {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "positiveInteger")), org.apache.axis.types.PositiveInteger.class);
            }
            try {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) _output.get(new javax.xml.namespace.QName("", "nonPositiveInteger"));
            } catch (java.lang.Exception _exception) {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "nonPositiveInteger")), org.apache.axis.types.NonPositiveInteger.class);
            }
            try {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) _output.get(new javax.xml.namespace.QName("", "negativeInteger"));
            } catch (java.lang.Exception _exception) {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "negativeInteger")), org.apache.axis.types.NegativeInteger.class);
            }
            try {
                anyURI.value = (org.apache.axis.types.URI) _output.get(new javax.xml.namespace.QName("", "anyURI"));
            } catch (java.lang.Exception _exception) {
                anyURI.value = (org.apache.axis.types.URI) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "anyURI")), org.apache.axis.types.URI.class);
            }
            try {
                gYear.value = (org.apache.axis.types.Year) _output.get(new javax.xml.namespace.QName("", "gYear"));
            } catch (java.lang.Exception _exception) {
                gYear.value = (org.apache.axis.types.Year) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gYear")), org.apache.axis.types.Year.class);
            }
            try {
                gMonth.value = (org.apache.axis.types.Month) _output.get(new javax.xml.namespace.QName("", "gMonth"));
            } catch (java.lang.Exception _exception) {
                gMonth.value = (org.apache.axis.types.Month) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gMonth")), org.apache.axis.types.Month.class);
            }
            try {
                gDay.value = (org.apache.axis.types.Day) _output.get(new javax.xml.namespace.QName("", "gDay"));
            } catch (java.lang.Exception _exception) {
                gDay.value = (org.apache.axis.types.Day) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gDay")), org.apache.axis.types.Day.class);
            }
            try {
                gYearMonth.value = (org.apache.axis.types.YearMonth) _output.get(new javax.xml.namespace.QName("", "gYearMonth"));
            } catch (java.lang.Exception _exception) {
                gYearMonth.value = (org.apache.axis.types.YearMonth) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gYearMonth")), org.apache.axis.types.YearMonth.class);
            }
            try {
                gMonthDay.value = (org.apache.axis.types.MonthDay) _output.get(new javax.xml.namespace.QName("", "gMonthDay"));
            } catch (java.lang.Exception _exception) {
                gMonthDay.value = (org.apache.axis.types.MonthDay) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "gMonthDay")), org.apache.axis.types.MonthDay.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumIn(test.wsdl.dataobjects.ComprehensiveTypes.Enum enum) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enum});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumHolder enum) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enum.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                enum.value = (test.wsdl.dataobjects.ComprehensiveTypes.Enum) _output.get(new javax.xml.namespace.QName("", "enum"));
            } catch (java.lang.Exception _exception) {
                enum.value = (test.wsdl.dataobjects.ComprehensiveTypes.Enum) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "enum")), test.wsdl.dataobjects.ComprehensiveTypes.Enum.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumHolder enum) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumOut"));

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
                enum.value = (test.wsdl.dataobjects.ComprehensiveTypes.Enum) _output.get(new javax.xml.namespace.QName("", "enum"));
            } catch (java.lang.Exception _exception) {
                enum.value = (test.wsdl.dataobjects.ComprehensiveTypes.Enum) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "enum")), test.wsdl.dataobjects.ComprehensiveTypes.Enum.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.Enum enumReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Enum) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Enum) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.Enum.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumIntIn(test.wsdl.dataobjects.ComprehensiveTypes.EnumInt enumInt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumIntIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enumInt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumIntInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumIntHolder enumInt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumIntInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enumInt.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                enumInt.value = (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) _output.get(new javax.xml.namespace.QName("", "enumInt"));
            } catch (java.lang.Exception _exception) {
                enumInt.value = (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "enumInt")), test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void enumIntOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumIntHolder enumInt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumIntOut"));

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
                enumInt.value = (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) _output.get(new javax.xml.namespace.QName("", "enumInt"));
            } catch (java.lang.Exception _exception) {
                enumInt.value = (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "enumInt")), test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.EnumInt enumIntReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enumIntReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.EnumInt) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.EnumInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayIn(java.lang.String[] array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {array});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayHolder array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {array.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                array.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "array"));
            } catch (java.lang.Exception _exception) {
                array.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array")), java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayHolder array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayOut"));

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
                array.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "array"));
            } catch (java.lang.Exception _exception) {
                array.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array")), java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] arrayReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayMIn(int[][][] arrayM) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayMIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arrayM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayMInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayMHolder arrayM) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayMInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arrayM.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                arrayM.value = (int[][][]) _output.get(new javax.xml.namespace.QName("", "arrayM"));
            } catch (java.lang.Exception _exception) {
                arrayM.value = (int[][][]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "arrayM")), int[][][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arrayMOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayMHolder arrayM) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayMOut"));

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
                arrayM.value = (int[][][]) _output.get(new javax.xml.namespace.QName("", "arrayM"));
            } catch (java.lang.Exception _exception) {
                arrayM.value = (int[][][]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "arrayM")), int[][][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int[][][] arrayMReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "arrayMReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (int[][][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (int[][][]) org.apache.axis.utils.JavaUtils.convert(_resp, int[][][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexAllIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll complexAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexAllIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexAll});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexAllInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexAllHolder complexAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexAllInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexAll.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                complexAll.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) _output.get(new javax.xml.namespace.QName("", "complexAll"));
            } catch (java.lang.Exception _exception) {
                complexAll.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexAll")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexAllOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexAllHolder complexAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexAllOut"));

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
                complexAll.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) _output.get(new javax.xml.namespace.QName("", "complexAll"));
            } catch (java.lang.Exception _exception) {
                complexAll.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexAll")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll complexAllReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexAllReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexSequenceIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence complexSequence) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexSequenceIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexSequence});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexSequenceInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexSequenceHolder complexSequence) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexSequenceInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexSequence.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                complexSequence.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) _output.get(new javax.xml.namespace.QName("", "complexSequence"));
            } catch (java.lang.Exception _exception) {
                complexSequence.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexSequence")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexSequenceOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexSequenceHolder complexSequence) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexSequenceOut"));

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
                complexSequence.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) _output.get(new javax.xml.namespace.QName("", "complexSequence"));
            } catch (java.lang.Exception _exception) {
                complexSequence.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexSequence")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence complexSequenceReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexSequenceReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexWComplexIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex complexWComplex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexWComplexIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexWComplex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexWComplexInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexWComplexHolder complexWComplex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexWComplexInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complexWComplex.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                complexWComplex.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) _output.get(new javax.xml.namespace.QName("", "complexWComplex"));
            } catch (java.lang.Exception _exception) {
                complexWComplex.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexWComplex")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void complexWComplexOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexWComplexHolder complexWComplex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexWComplexOut"));

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
                complexWComplex.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) _output.get(new javax.xml.namespace.QName("", "complexWComplex"));
            } catch (java.lang.Exception _exception) {
                complexWComplex.value = (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "complexWComplex")), test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex complexWComplexReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "complexWComplexReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void emptyComplexTypeIn(test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emptyComplexTypeIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emptyComplexType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) {
              throw (test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void emptyComplexTypeInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EmptyComplexTypeHolder emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emptyComplexTypeInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emptyComplexType.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                emptyComplexType.value = (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) _output.get(new javax.xml.namespace.QName("", "emptyComplexType"));
            } catch (java.lang.Exception _exception) {
                emptyComplexType.value = (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "emptyComplexType")), test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) {
              throw (test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void emptyComplexTypeOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EmptyComplexTypeHolder emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emptyComplexTypeOut"));

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
                emptyComplexType.value = (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) _output.get(new javax.xml.namespace.QName("", "emptyComplexType"));
            } catch (java.lang.Exception _exception) {
                emptyComplexType.value = (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "emptyComplexType")), test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) {
              throw (test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType emptyComplexTypeReturn() throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emptyComplexTypeReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) {
              throw (test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void anyIn(java.lang.Object any) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "anyIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {any});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void anyInout(javax.xml.rpc.holders.ObjectHolder any) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "anyInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {any.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                any.value = (java.lang.Object) _output.get(new javax.xml.namespace.QName("", "any"));
            } catch (java.lang.Exception _exception) {
                any.value = (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "any")), java.lang.Object.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void anyOut(javax.xml.rpc.holders.ObjectHolder any) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "anyOut"));

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
                any.value = (java.lang.Object) _output.get(new javax.xml.namespace.QName("", "any"));
            } catch (java.lang.Exception _exception) {
                any.value = (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "any")), java.lang.Object.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Object anyReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "anyReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Object) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Object.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void animalIn(test.wsdl.dataobjects.ComprehensiveTypes.Animal animal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "animalIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {animal});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void animalInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.AnimalHolder animal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "animalInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {animal.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                animal.value = (test.wsdl.dataobjects.ComprehensiveTypes.Animal) _output.get(new javax.xml.namespace.QName("", "animal"));
            } catch (java.lang.Exception _exception) {
                animal.value = (test.wsdl.dataobjects.ComprehensiveTypes.Animal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "animal")), test.wsdl.dataobjects.ComprehensiveTypes.Animal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void animalOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.AnimalHolder animal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "animalOut"));

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
                animal.value = (test.wsdl.dataobjects.ComprehensiveTypes.Animal) _output.get(new javax.xml.namespace.QName("", "animal"));
            } catch (java.lang.Exception _exception) {
                animal.value = (test.wsdl.dataobjects.ComprehensiveTypes.Animal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "animal")), test.wsdl.dataobjects.ComprehensiveTypes.Animal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.Animal animalReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "animalReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Animal) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Animal) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.Animal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void catIn(test.wsdl.dataobjects.ComprehensiveTypes.Cat cat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void catInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.CatHolder cat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catInout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cat.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                cat.value = (test.wsdl.dataobjects.ComprehensiveTypes.Cat) _output.get(new javax.xml.namespace.QName("", "cat"));
            } catch (java.lang.Exception _exception) {
                cat.value = (test.wsdl.dataobjects.ComprehensiveTypes.Cat) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat")), test.wsdl.dataobjects.ComprehensiveTypes.Cat.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void catOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.CatHolder cat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catOut"));

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
                cat.value = (test.wsdl.dataobjects.ComprehensiveTypes.Cat) _output.get(new javax.xml.namespace.QName("", "cat"));
            } catch (java.lang.Exception _exception) {
                cat.value = (test.wsdl.dataobjects.ComprehensiveTypes.Cat) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat")), test.wsdl.dataobjects.ComprehensiveTypes.Cat.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.Cat catReturn() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "catReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Cat) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.Cat) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.Cat.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean methodBoolean(boolean inBoolean, javax.xml.rpc.holders.BooleanHolder _boolean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodBoolean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(inBoolean), new java.lang.Boolean(_boolean.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _boolean.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "boolean"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                _boolean.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "boolean")), boolean.class)).booleanValue();
            }
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte methodByte(byte inByte, javax.xml.rpc.holders.ByteHolder _byte) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodByte"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Byte(inByte), new java.lang.Byte(_byte.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _byte.value = ((java.lang.Byte) _output.get(new javax.xml.namespace.QName("", "byte"))).byteValue();
            } catch (java.lang.Exception _exception) {
                _byte.value = ((java.lang.Byte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "byte")), byte.class)).byteValue();
            }
            try {
                return ((java.lang.Byte) _resp).byteValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Byte) org.apache.axis.utils.JavaUtils.convert(_resp, byte.class)).byteValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public short methodShort(short inShort, javax.xml.rpc.holders.ShortHolder _short) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodShort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Short(inShort), new java.lang.Short(_short.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _short.value = ((java.lang.Short) _output.get(new javax.xml.namespace.QName("", "short"))).shortValue();
            } catch (java.lang.Exception _exception) {
                _short.value = ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "short")), short.class)).shortValue();
            }
            try {
                return ((java.lang.Short) _resp).shortValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_resp, short.class)).shortValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int methodInt(int inInt, javax.xml.rpc.holders.IntHolder _int) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodInt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(inInt), new java.lang.Integer(_int.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _int.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "int"))).intValue();
            } catch (java.lang.Exception _exception) {
                _int.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "int")), int.class)).intValue();
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

    public long methodLong(long inLong, javax.xml.rpc.holders.LongHolder _long) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodLong"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(inLong), new java.lang.Long(_long.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _long.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "long"))).longValue();
            } catch (java.lang.Exception _exception) {
                _long.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "long")), long.class)).longValue();
            }
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public float methodFloat(float inFloat, javax.xml.rpc.holders.FloatHolder _float) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodFloat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Float(inFloat), new java.lang.Float(_float.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _float.value = ((java.lang.Float) _output.get(new javax.xml.namespace.QName("", "float"))).floatValue();
            } catch (java.lang.Exception _exception) {
                _float.value = ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "float")), float.class)).floatValue();
            }
            try {
                return ((java.lang.Float) _resp).floatValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public double methodDouble(double inDouble, javax.xml.rpc.holders.DoubleHolder _double) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodDouble"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Double(inDouble), new java.lang.Double(_double.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _double.value = ((java.lang.Double) _output.get(new javax.xml.namespace.QName("", "double"))).doubleValue();
            } catch (java.lang.Exception _exception) {
                _double.value = ((java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "double")), double.class)).doubleValue();
            }
            try {
                return ((java.lang.Double) _resp).doubleValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_resp, double.class)).doubleValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String methodString(java.lang.String inString, javax.xml.rpc.holders.StringHolder string) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inString, string.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                string.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "string"));
            } catch (java.lang.Exception _exception) {
                string.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "string")), java.lang.String.class);
            }
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

    public java.math.BigInteger methodInteger(java.math.BigInteger inInteger, javax.xml.rpc.holders.BigIntegerHolder integer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodInteger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inInteger, integer.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                integer.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("", "integer"));
            } catch (java.lang.Exception _exception) {
                integer.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "integer")), java.math.BigInteger.class);
            }
            try {
                return (java.math.BigInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal methodDecimal(java.math.BigDecimal inDecimal, javax.xml.rpc.holders.BigDecimalHolder decimal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodDecimal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inDecimal, decimal.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                decimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "decimal"));
            } catch (java.lang.Exception _exception) {
                decimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "decimal")), java.math.BigDecimal.class);
            }
            try {
                return (java.math.BigDecimal) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar methodDateTime(java.util.Calendar inDateTime, javax.xml.rpc.holders.CalendarHolder dateTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inDateTime, dateTime.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                dateTime.value = (java.util.Calendar) _output.get(new javax.xml.namespace.QName("", "dateTime"));
            } catch (java.lang.Exception _exception) {
                dateTime.value = (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "dateTime")), java.util.Calendar.class);
            }
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public javax.xml.namespace.QName methodQName(javax.xml.namespace.QName inQName, javax.xml.rpc.holders.QNameHolder qName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodQName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inQName, qName.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                qName.value = (javax.xml.namespace.QName) _output.get(new javax.xml.namespace.QName("", "qName"));
            } catch (java.lang.Exception _exception) {
                qName.value = (javax.xml.namespace.QName) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "qName")), javax.xml.namespace.QName.class);
            }
            try {
                return (javax.xml.namespace.QName) _resp;
            } catch (java.lang.Exception _exception) {
                return (javax.xml.namespace.QName) org.apache.axis.utils.JavaUtils.convert(_resp, javax.xml.namespace.QName.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.Time methodTime(org.apache.axis.types.Time inTime, org.apache.axis.holders.TimeHolder time) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inTime, time.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                time.value = (org.apache.axis.types.Time) _output.get(new javax.xml.namespace.QName("", "time"));
            } catch (java.lang.Exception _exception) {
                time.value = (org.apache.axis.types.Time) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "time")), org.apache.axis.types.Time.class);
            }
            try {
                return (org.apache.axis.types.Time) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.Time) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.Time.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.UnsignedLong methodUnsignedLong(org.apache.axis.types.UnsignedLong inUnsignedLong, org.apache.axis.holders.UnsignedLongHolder unsignedLong) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodUnsignedLong"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inUnsignedLong, unsignedLong.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) _output.get(new javax.xml.namespace.QName("", "unsignedLong"));
            } catch (java.lang.Exception _exception) {
                unsignedLong.value = (org.apache.axis.types.UnsignedLong) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedLong")), org.apache.axis.types.UnsignedLong.class);
            }
            try {
                return (org.apache.axis.types.UnsignedLong) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedLong) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedLong.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.UnsignedInt methodUnsignedInt(org.apache.axis.types.UnsignedInt inUnsignedInt, org.apache.axis.holders.UnsignedIntHolder unsignedInt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodUnsignedInt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inUnsignedInt, unsignedInt.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) _output.get(new javax.xml.namespace.QName("", "unsignedInt"));
            } catch (java.lang.Exception _exception) {
                unsignedInt.value = (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedInt")), org.apache.axis.types.UnsignedInt.class);
            }
            try {
                return (org.apache.axis.types.UnsignedInt) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.UnsignedShort methodUnsignedShort(org.apache.axis.types.UnsignedShort inUnsignedShort, org.apache.axis.holders.UnsignedShortHolder unsignedShort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodUnsignedShort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inUnsignedShort, unsignedShort.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) _output.get(new javax.xml.namespace.QName("", "unsignedShort"));
            } catch (java.lang.Exception _exception) {
                unsignedShort.value = (org.apache.axis.types.UnsignedShort) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedShort")), org.apache.axis.types.UnsignedShort.class);
            }
            try {
                return (org.apache.axis.types.UnsignedShort) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedShort) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedShort.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.UnsignedByte methodUnsignedByte(org.apache.axis.types.UnsignedByte inUnsignedByte, org.apache.axis.holders.UnsignedByteHolder unsignedByte) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodUnsignedByte"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inUnsignedByte, unsignedByte.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) _output.get(new javax.xml.namespace.QName("", "unsignedByte"));
            } catch (java.lang.Exception _exception) {
                unsignedByte.value = (org.apache.axis.types.UnsignedByte) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unsignedByte")), org.apache.axis.types.UnsignedByte.class);
            }
            try {
                return (org.apache.axis.types.UnsignedByte) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.UnsignedByte) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.UnsignedByte.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.NonNegativeInteger methodNonNegativeInteger(org.apache.axis.types.NonNegativeInteger inNonNegativeInteger, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodNonNegativeInteger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inNonNegativeInteger, nonNegativeInteger.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) _output.get(new javax.xml.namespace.QName("", "NonNegativeInteger"));
            } catch (java.lang.Exception _exception) {
                nonNegativeInteger.value = (org.apache.axis.types.NonNegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NonNegativeInteger")), org.apache.axis.types.NonNegativeInteger.class);
            }
            try {
                return (org.apache.axis.types.NonNegativeInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.NonNegativeInteger) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.NonNegativeInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.PositiveInteger methodPositiveInteger(org.apache.axis.types.PositiveInteger inPositiveInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodPositiveInteger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inPositiveInteger, positiveInteger.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) _output.get(new javax.xml.namespace.QName("", "PositiveInteger"));
            } catch (java.lang.Exception _exception) {
                positiveInteger.value = (org.apache.axis.types.PositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PositiveInteger")), org.apache.axis.types.PositiveInteger.class);
            }
            try {
                return (org.apache.axis.types.PositiveInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.PositiveInteger) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.PositiveInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.NonPositiveInteger methodNonPositiveInteger(org.apache.axis.types.NonPositiveInteger inNonPositiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodNonPositiveInteger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inNonPositiveInteger, nonPositiveInteger.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) _output.get(new javax.xml.namespace.QName("", "NonPositiveInteger"));
            } catch (java.lang.Exception _exception) {
                nonPositiveInteger.value = (org.apache.axis.types.NonPositiveInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NonPositiveInteger")), org.apache.axis.types.NonPositiveInteger.class);
            }
            try {
                return (org.apache.axis.types.NonPositiveInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.NonPositiveInteger) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.NonPositiveInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.NegativeInteger methodNegativeInteger(org.apache.axis.types.NegativeInteger inNegativeInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodNegativeInteger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inNegativeInteger, negativeInteger.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) _output.get(new javax.xml.namespace.QName("", "NegativeInteger"));
            } catch (java.lang.Exception _exception) {
                negativeInteger.value = (org.apache.axis.types.NegativeInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NegativeInteger")), org.apache.axis.types.NegativeInteger.class);
            }
            try {
                return (org.apache.axis.types.NegativeInteger) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.NegativeInteger) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.NegativeInteger.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.URI methodAnyURI(org.apache.axis.types.URI inAnyURI, org.apache.axis.holders.URIHolder anyURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodAnyURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inAnyURI, anyURI.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                anyURI.value = (org.apache.axis.types.URI) _output.get(new javax.xml.namespace.QName("", "anyURI"));
            } catch (java.lang.Exception _exception) {
                anyURI.value = (org.apache.axis.types.URI) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "anyURI")), org.apache.axis.types.URI.class);
            }
            try {
                return (org.apache.axis.types.URI) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.URI) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.URI.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType methodSimpleAnyURI(test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType inAnyURI, test.wsdl.dataobjects.ComprehensiveTypes.holders.SimpleAnyURITypeHolder anyURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSimpleAnyURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inAnyURI, anyURI.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                anyURI.value = (test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType) _output.get(new javax.xml.namespace.QName("", "anyURI"));
            } catch (java.lang.Exception _exception) {
                anyURI.value = (test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "anyURI")), test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class);
            }
            try {
                return (test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.Year methodYear(org.apache.axis.types.Year inYear, org.apache.axis.holders.YearHolder year) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodYear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inYear, year.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                year.value = (org.apache.axis.types.Year) _output.get(new javax.xml.namespace.QName("", "Year"));
            } catch (java.lang.Exception _exception) {
                year.value = (org.apache.axis.types.Year) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Year")), org.apache.axis.types.Year.class);
            }
            try {
                return (org.apache.axis.types.Year) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.Year) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.Year.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.Month methodMonth(org.apache.axis.types.Month inMonth, org.apache.axis.holders.MonthHolder month) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodMonth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inMonth, month.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                month.value = (org.apache.axis.types.Month) _output.get(new javax.xml.namespace.QName("", "Month"));
            } catch (java.lang.Exception _exception) {
                month.value = (org.apache.axis.types.Month) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Month")), org.apache.axis.types.Month.class);
            }
            try {
                return (org.apache.axis.types.Month) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.Month) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.Month.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.Day methodDay(org.apache.axis.types.Day inDay, org.apache.axis.holders.DayHolder day) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodDay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inDay, day.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                day.value = (org.apache.axis.types.Day) _output.get(new javax.xml.namespace.QName("", "Day"));
            } catch (java.lang.Exception _exception) {
                day.value = (org.apache.axis.types.Day) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Day")), org.apache.axis.types.Day.class);
            }
            try {
                return (org.apache.axis.types.Day) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.Day) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.Day.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.YearMonth methodYearMonth(org.apache.axis.types.YearMonth inYearMonth, org.apache.axis.holders.YearMonthHolder yearMonth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodYearMonth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inYearMonth, yearMonth.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                yearMonth.value = (org.apache.axis.types.YearMonth) _output.get(new javax.xml.namespace.QName("", "YearMonth"));
            } catch (java.lang.Exception _exception) {
                yearMonth.value = (org.apache.axis.types.YearMonth) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "YearMonth")), org.apache.axis.types.YearMonth.class);
            }
            try {
                return (org.apache.axis.types.YearMonth) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.YearMonth) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.YearMonth.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.MonthDay methodMonthDay(org.apache.axis.types.MonthDay inMonthDay, org.apache.axis.holders.MonthDayHolder monthDay) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodMonthDay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inMonthDay, monthDay.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                monthDay.value = (org.apache.axis.types.MonthDay) _output.get(new javax.xml.namespace.QName("", "MonthDay"));
            } catch (java.lang.Exception _exception) {
                monthDay.value = (org.apache.axis.types.MonthDay) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "MonthDay")), org.apache.axis.types.MonthDay.class);
            }
            try {
                return (org.apache.axis.types.MonthDay) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.MonthDay) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.MonthDay.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String methodSoapString(java.lang.String inSoapString, javax.xml.rpc.holders.StringHolder soapencString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapString, soapencString.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencString.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "soapencString"));
            } catch (java.lang.Exception _exception) {
                soapencString.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencString")), java.lang.String.class);
            }
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

    public java.lang.Boolean methodSoapBoolean(java.lang.Boolean inSoapBoolean, javax.xml.rpc.holders.BooleanWrapperHolder soapencBoolean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapBoolean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapBoolean, soapencBoolean.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencBoolean.value = (java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "soapencBoolean"));
            } catch (java.lang.Exception _exception) {
                soapencBoolean.value = (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencBoolean")), java.lang.Boolean.class);
            }
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Float methodSoapFloat(java.lang.Float inSoapFloat, javax.xml.rpc.holders.FloatWrapperHolder soapencFloat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapFloat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapFloat, soapencFloat.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencFloat.value = (java.lang.Float) _output.get(new javax.xml.namespace.QName("", "soapencFloat"));
            } catch (java.lang.Exception _exception) {
                soapencFloat.value = (java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencFloat")), java.lang.Float.class);
            }
            try {
                return (java.lang.Float) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Float.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Double methodSoapDouble(java.lang.Double inSoapDouble, javax.xml.rpc.holders.DoubleWrapperHolder soapencDouble) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapDouble"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapDouble, soapencDouble.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencDouble.value = (java.lang.Double) _output.get(new javax.xml.namespace.QName("", "soapencDouble"));
            } catch (java.lang.Exception _exception) {
                soapencDouble.value = (java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencDouble")), java.lang.Double.class);
            }
            try {
                return (java.lang.Double) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Double.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal methodSoapDecimal(java.math.BigDecimal inSoapDecimal, javax.xml.rpc.holders.BigDecimalHolder soapencDecimal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapDecimal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapDecimal, soapencDecimal.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencDecimal.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("", "soapencDecimal"));
            } catch (java.lang.Exception _exception) {
                soapencDecimal.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencDecimal")), java.math.BigDecimal.class);
            }
            try {
                return (java.math.BigDecimal) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Integer methodSoapInt(java.lang.Integer inSoapInt, javax.xml.rpc.holders.IntegerWrapperHolder soapencInt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapInt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapInt, soapencInt.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencInt.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "soapencInt"));
            } catch (java.lang.Exception _exception) {
                soapencInt.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencInt")), java.lang.Integer.class);
            }
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Short methodSoapShort(java.lang.Short inSoapShort, javax.xml.rpc.holders.ShortWrapperHolder soapencShort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodSoapShort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inSoapShort, soapencShort.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                soapencShort.value = (java.lang.Short) _output.get(new javax.xml.namespace.QName("", "soapencShort"));
            } catch (java.lang.Exception _exception) {
                soapencShort.value = (java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "soapencShort")), java.lang.Short.class);
            }
            try {
                return (java.lang.Short) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Short) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Short.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
