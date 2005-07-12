package org.apache.axis2.soap.impl.llom;

import org.apache.axis2.om.OMXMLParserWrapper;
import org.apache.axis2.om.OMOutput;
import org.apache.axis2.om.OMNode;
import org.apache.axis2.om.impl.llom.serialize.StreamWriterToContentHandlerConverter;
import org.apache.axis2.om.impl.llom.OMSerializerUtil;
import org.apache.axis2.soap.SOAPFault;
import org.apache.axis2.soap.SOAPFaultCode;
import org.apache.axis2.soap.SOAPFaultSubCode;
import org.apache.axis2.soap.SOAPFaultValue;
import org.apache.axis2.soap.impl.llom.soap12.SOAP12Constants;
import org.apache.axis2.soap.impl.llom.util.UtilProvider;

import javax.xml.stream.XMLStreamException;

/**
 * Copyright 2001-2004 The Apache Software Foundation.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * <p/>
 */
public abstract class SOAPFaultCodeImpl extends SOAPElement implements SOAPFaultCode {


    /**
     * Constructor OMElementImpl
     *
     * @param localName
     * @param ns
     * @param parent
     * @param builder
     */
    public SOAPFaultCodeImpl(SOAPFault parent, OMXMLParserWrapper builder) {
        super(parent, SOAP12Constants.SOAP_FAULT_CODE_LOCAL_NAME, builder);
    }

    /**
     * @param parent
     * @param parent
     */
    public SOAPFaultCodeImpl(SOAPFault parent,
                             boolean extractNamespaceFromParent) throws SOAPProcessingException {
        super(parent,
                SOAP12Constants.SOAP_FAULT_CODE_LOCAL_NAME,
                extractNamespaceFromParent);
    }

    /**
     * Eran Chinthaka (chinthaka@apache.org)
     */
    public void setValue(SOAPFaultValue value) throws SOAPProcessingException {
        UtilProvider.setNewElement(this, value, value);
    }

    public SOAPFaultValue getValue() {
        return (SOAPFaultValue) UtilProvider.getChildWithName(this,
                SOAP12Constants.SOAP_FAULT_VALUE_LOCAL_NAME);
    }

    public void setSubCode(SOAPFaultSubCode value) throws SOAPProcessingException {
        UtilProvider.setNewElement(this, getSubCode(), value);
    }

    public SOAPFaultSubCode getSubCode() {
        return (SOAPFaultSubCode) UtilProvider.getChildWithName(this,
                SOAP12Constants.SOAP_FAULT_SUB_CODE_LOCAL_NAME);
    }

    protected void serialize(OMOutput omOutput, boolean cache) throws XMLStreamException {
        // select the builder
        short builderType = PULL_TYPE_BUILDER;    // default is pull type
        if (builder != null) {
            builderType = this.builder.getBuilderType();
        }
        if ((builderType == PUSH_TYPE_BUILDER)
                && (builder.getRegisteredContentHandler() == null)) {
            builder.registerExternalContentHandler(new StreamWriterToContentHandlerConverter(omOutput));
        }


        if (!cache) {
            //No caching
            if (this.firstChild != null) {
                OMSerializerUtil.serializeStartpart(this, omOutput);
                firstChild.serialize(omOutput);
                OMSerializerUtil.serializeEndpart(omOutput);
            } else if (!this.done) {
                if (builderType == PULL_TYPE_BUILDER) {
                    OMSerializerUtil.serializeByPullStream(this, omOutput);
                } else {
                    OMSerializerUtil.serializeStartpart(this, omOutput);
                    builder.setCache(cache);
                    builder.next();
                    OMSerializerUtil.serializeEndpart(omOutput);
                }
            } else {
                OMSerializerUtil.serializeNormal(this, omOutput, cache);
            }
            // do not serialise the siblings


        } else {
            //Cached
            OMSerializerUtil.serializeNormal(this, omOutput, cache);

            // do not serialise the siblings
        }


    }

}
