/**
 * CPWebServicesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public class CPWebServicesSoapBindingStub extends org.apache.axis.client.Stub implements test.wsdl.dataobjects.good.CPWSImpl {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "createSessionRequest"), test.wsdl.dataobjects.good.CreateSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "createSessionResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.CreateSessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createSessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "releaseRequest"), test.wsdl.dataobjects.good.ReleaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "releaseResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.ReleaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "releaseReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "getSubscriberIdRequest"), test.wsdl.dataobjects.good.GetSubscriberIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "getSubscriberIdResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.GetSubscriberIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSubscriberIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceRequest"), test.wsdl.dataobjects.good.GetPriceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.GetPriceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPriceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startApplicationSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "startApplicationSessionRequest"), test.wsdl.dataobjects.good.StartApplicationSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "startApplicationSessionResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.StartApplicationSessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "startApplicationSessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reserve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "reserveRequest"), test.wsdl.dataobjects.good.ReserveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "reserveResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.ReserveResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "reserveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("chargeReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationRequest"), test.wsdl.dataobjects.good.ChargeReservationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.ChargeReservationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "chargeReservationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notifyConfirmation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "notifyConfirmationRequest"), test.wsdl.dataobjects.good.NotifyConfirmationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "notifyConfirmationResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.NotifyConfirmationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "notifyConfirmationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immediateCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:CPWSImpl", "immediateChargeRequest"), test.wsdl.dataobjects.good.ImmediateChargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:CPWSImpl", "immediateChargeResponse"));
        oper.setReturnClass(test.wsdl.dataobjects.good.ImmediateChargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immediateChargeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

    }

    public CPWebServicesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CPWebServicesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CPWebServicesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSAdditionalParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameters");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSAdditionalParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAmount");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationDescription");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSApplicationDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationExternalId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSApplicationExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSApplicationId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSApplicationId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSBoolean");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSChargingParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameters");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSChargingParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCorrelationId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSCorrelationId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSCurrency");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSInteger");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSNonNegativeInteger");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSNonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerAccountExternalId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPartnerAccountExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPartnerExternalId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPartnerExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPassword");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingModel");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOption");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOptions");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameters");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSQualifiedAmount");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSQualifiedAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSRequestId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSRequestId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResult");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResultParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSResultParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResultParameters");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSResultParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSecurityTicket");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSSecurityTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSessionId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSSessionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSSubscriberExternalId");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSSubscriberExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSText");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeSpan");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSTimeSpan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSTimeStamp");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSTimeStamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSUniversalTime");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSUniversalTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSCommonRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSCommonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSCommonResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSCommonResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://messages.common.api.cs.amdocs.com", "CSResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://snv882:10217/gateway/services/CPWebServices", "ArrayOf_tns1_CSAdditionalParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSAdditionalParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSAdditionalParameter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://snv882:10217/gateway/services/CPWebServices", "ArrayOf_tns1_CSChargingParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSChargingParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSChargingParameter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://snv882:10217/gateway/services/CPWebServices", "ArrayOf_tns1_CSPricingOption");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingOption");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://snv882:10217/gateway/services/CPWebServices", "ArrayOf_tns1_CSPricingParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSPricingParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSPricingParameter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://snv882:10217/gateway/services/CPWebServices", "ArrayOf_tns1_CSResultParameter");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CSResultParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://datatypes.cs.amdocs.com", "CSResultParameter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ChargeReservationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "chargeReservationResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ChargeReservationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "createSessionRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CreateSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "createSessionResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.CreateSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.GetPriceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "getPriceResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.GetPriceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "getSubscriberIdRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.GetSubscriberIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "getSubscriberIdResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.GetSubscriberIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "immediateChargeRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ImmediateChargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "immediateChargeResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ImmediateChargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "notifyConfirmationRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.NotifyConfirmationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "notifyConfirmationResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.NotifyConfirmationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "releaseRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ReleaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "releaseResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ReleaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "reserveRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ReserveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "reserveResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.ReserveResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "startApplicationSessionRequest");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.StartApplicationSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:CPWSImpl", "startApplicationSessionResponse");
            cachedSerQNames.add(qName);
            cls = test.wsdl.dataobjects.good.StartApplicationSessionResponse.class;
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

    public test.wsdl.dataobjects.good.CreateSessionResponse createSession(test.wsdl.dataobjects.good.CreateSessionRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "createSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.CreateSessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.CreateSessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.CreateSessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.ReleaseResponse release(test.wsdl.dataobjects.good.ReleaseRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "release"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.ReleaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.ReleaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.ReleaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.GetSubscriberIdResponse getSubscriberId(test.wsdl.dataobjects.good.GetSubscriberIdRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "getSubscriberId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.GetSubscriberIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.GetSubscriberIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.GetSubscriberIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.GetPriceResponse getPrice(test.wsdl.dataobjects.good.GetPriceRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "getPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.GetPriceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.GetPriceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.GetPriceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.StartApplicationSessionResponse startApplicationSession(test.wsdl.dataobjects.good.StartApplicationSessionRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "startApplicationSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.StartApplicationSessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.StartApplicationSessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.StartApplicationSessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.ReserveResponse reserve(test.wsdl.dataobjects.good.ReserveRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "reserve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.ReserveResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.ReserveResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.ReserveResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.ChargeReservationResponse chargeReservation(test.wsdl.dataobjects.good.ChargeReservationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "chargeReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.ChargeReservationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.ChargeReservationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.ChargeReservationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.NotifyConfirmationResponse notifyConfirmation(test.wsdl.dataobjects.good.NotifyConfirmationRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "notifyConfirmation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.NotifyConfirmationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.NotifyConfirmationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.NotifyConfirmationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public test.wsdl.dataobjects.good.ImmediateChargeResponse immediateCharge(test.wsdl.dataobjects.good.ImmediateChargeRequest in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.partner.provided.api.cs.amdocs.com", "immediateCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (test.wsdl.dataobjects.good.ImmediateChargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (test.wsdl.dataobjects.good.ImmediateChargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, test.wsdl.dataobjects.good.ImmediateChargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
