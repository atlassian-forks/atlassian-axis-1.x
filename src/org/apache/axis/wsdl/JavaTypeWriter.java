/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2001 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Axis" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.axis.wsdl;

import java.io.IOException;

import java.util.Vector;

import javax.wsdl.QName;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
* This is Wsdl2java's Type Writer.  It writes the following files, as appropriate:
* <typeName>.java, <typeName>Holder.java.
*/
public class JavaTypeWriter implements Writer {
    Writer typeWriter = null;
    Writer holderWriter = null;
    SymbolTable symbolTable = null;

    /**
     * Constructor.
     */
    protected JavaTypeWriter(
            Emitter emitter,
            Type type,
            SymbolTable symbolTable) {
        this.symbolTable = symbolTable;

        // Determine what sort of type this is and instantiate the appropriate Writer.
        Node node = type.getNode();

        // Generate the proper class for either "complex" or "enumeration" types
        Vector v = Utils.getComplexElementTypesAndNames(node, symbolTable);
        if (v != null) {
            typeWriter = new JavaComplexTypeWriter(emitter, type, v);
        }
        else {
            v = getEnumerationBaseAndValues(node);
            if (v != null) {
                typeWriter = new JavaEnumTypeWriter(emitter, type, v);
            }
        }

        // If a type class is written, also write a holder
        if (v != null) {
            holderWriter = new JavaHolderWriter(emitter, type);
        } else {
            if (emitter.bVerbose) {
                System.out.println("No java binding for " + type.getQName());
            }
        }
    } // ctor

    /**
     * Write all the service bindnigs:  service and testcase.
     */
    public void write() throws IOException {
        if (typeWriter != null)
            typeWriter.write();
        if (holderWriter != null) {
            holderWriter.write();
        }
    } // write

    /**
     * If the specified node represents a supported JAX-RPC enumeration,
     * a Vector is returned which contains the base type and the enumeration values.
     * The first element in the vector is the base type (an Type).
     * Subsequent elements are values (Strings).
     * If this is not an enumeration, null is returned.
     */
    public Vector getEnumerationBaseAndValues(Node node) {
        if (node == null) {
            return null;
        }

        // If the node kind is an element, dive into it.
        QName nodeKind = Utils.getNodeQName(node);
        if (nodeKind != null &&
            nodeKind.getLocalPart().equals("element") &&
            Utils.isSchemaNS(nodeKind.getNamespaceURI())) {
            NodeList children = node.getChildNodes();
            Node simpleNode = null;
            for (int j = 0; j < children.getLength() && simpleNode == null; j++) {
                QName simpleKind = Utils.getNodeQName(children.item(j));
                if (simpleKind != null &&
                    simpleKind.getLocalPart().equals("simpleType") &&
                    Utils.isSchemaNS(simpleKind.getNamespaceURI())) {
                    simpleNode = children.item(j);
                    node = simpleNode;
                }
            }
        }
        // Get the node kind, expecting a schema simpleType
        nodeKind = Utils.getNodeQName(node);
        if (nodeKind != null &&
            nodeKind.getLocalPart().equals("simpleType") &&
            Utils.isSchemaNS(nodeKind.getNamespaceURI())) {

            // Under the simpleType there should be a restriction.
            // (There may be other #text nodes, which we will ignore).
            NodeList children = node.getChildNodes();
            Node restrictionNode = null;
            for (int j = 0; j < children.getLength() && restrictionNode == null; j++) {
                QName restrictionKind = Utils.getNodeQName(children.item(j));
                if (restrictionKind != null &&
                    restrictionKind.getLocalPart().equals("restriction") &&
                    Utils.isSchemaNS(restrictionKind.getNamespaceURI()))
                    restrictionNode = children.item(j);
            }

            // The restriction node indicates the type being restricted
            // (the base attribute contains this type).
            // The base type must be a built-in type...and we only think
            // this makes sense for string.
            Type baseEType = null;
            if (restrictionNode != null) {
                QName baseType = Utils.getNodeTypeRefQName(restrictionNode, "base");
                baseEType = symbolTable.getTypeEntry(baseType);
                if (baseEType != null && 
                    !baseEType.getJavaName().equals("java.lang.String")) {
                    baseEType = null;
                }
            }

            // Process the enumeration elements underneath the restriction node
            if (baseEType != null && restrictionNode != null) {

                Vector v = new Vector();
                v.add(baseEType);
                NodeList enums = restrictionNode.getChildNodes();
                for (int i=0; i < enums.getLength(); i++) {
                    QName enumKind = Utils.getNodeQName(enums.item(i));
                    if (enumKind != null &&
                        enumKind.getLocalPart().equals("enumeration") &&
                        Utils.isSchemaNS(enumKind.getNamespaceURI())) {

                        // Put the enum value in the vector.
                        Node enumNode = enums.item(i);
                        String value = Utils.getAttribute(enumNode, "value");
                        if (value != null) {
                            v.add(value);
                        }
                    }
                }
                return v;
            }
        }
        return null;
    }

} // class JavaTypeWriter
