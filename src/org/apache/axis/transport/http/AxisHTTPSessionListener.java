/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2003 The Apache Software Foundation.  All rights
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
package org.apache.axis.transport.http;

import org.apache.commons.logging.Log;
import org.apache.axis.components.logger.LogFactory;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.server.ServiceLifecycle;
import java.util.Enumeration;

/**
 * A simple listener for Servlet 2.3 session lifecycle events.
 * @web.listener
 * @author Glen Daniels (gdaniels@apache.org)
 */ 
public class AxisHTTPSessionListener implements HttpSessionListener {
    protected static Log log =
            LogFactory.getLog(AxisHTTPSessionListener.class.getName());
    
    /**
     * Static method to destroy all ServiceLifecycle objects within an
     * Axis session.
     */ 
    static void destroySession(HttpSession session)
    {
        // Check for our marker so as not to do unneeded work
        if (session.getAttribute(AxisHttpSession.AXIS_SESSION_MARKER) == null)
            return;
        
        if (log.isDebugEnabled()) {
            log.debug("Got destroySession event : " + session);
        }
        
        Enumeration e = session.getAttributeNames();
        while (e.hasMoreElements()) {
            Object next = e.nextElement();
            if (next instanceof ServiceLifecycle) {
                ((ServiceLifecycle)next).destroy();
            }
        }
    }        
    
    /** No-op for now */
    public void sessionCreated(HttpSessionEvent event) {
    }

    /**
     * Called when a session is destroyed by the servlet engine.  We use
     * the relevant HttpSession to look up an AxisHttpSession, and destroy
     * all the appropriate objects stored therein.
     *  
     * @param event the event descriptor passed in by the servlet engine
     */ 
    public void sessionDestroyed(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        destroySession(session);
    }
}