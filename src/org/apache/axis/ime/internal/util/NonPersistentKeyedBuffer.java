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

package org.apache.axis.ime.internal.util;

import org.apache.axis.i18n.Messages;
import org.apache.axis.components.logger.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Vector;

/**
 * Creates a non-persistent KeyedBuffer.  Queued messages
 * are stored in memory. If the buffer instance is destroyed,
 * so is the Queue.
 * 
 * @author James M Snell (jasnell@us.ibm.com)
 */
public class NonPersistentKeyedBuffer
        implements KeyedBuffer {

    protected static Log log =
        LogFactory.getLog(NonPersistentKeyedBuffer.class.getName());

    private final KeyedQueue messages = new KeyedQueue();

    private WorkerPool WORKERS;

    public NonPersistentKeyedBuffer(
            WorkerPool workers) {
        this.WORKERS = workers;
    }

    public Object peek() {
        KeyedNode node = null;
        synchronized (messages) {
            node = messages.peek();
        }
        if (node != null) {
            return node.value;
        } else {
            return null;
        }
    }

    public void put(
            Object key,
            Object object) {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::put");
        }
        if (key == null ||
                object == null)
            throw new IllegalArgumentException(Messages.getMessage("illegalArgumentException00"));

        synchronized (messages) {
            messages.put(new KeyedNode(key, object));
            messages.notify();
        }
        if (log.isDebugEnabled()) {
            log.debug("Exit: KeyedBuffer::put");
        }
    }

    public Object cancel(Object key) {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::cancel");
        }
        if (key == null)
            throw new IllegalArgumentException(Messages.getMessage("illegalArgumentException00"));
        Object object = null;
        synchronized (messages) {
            KeyedNode node = messages.select(key); // will attempt to find and remove
            if (node != null)
                object = node.value;
            node.key = null;
            node.value = null;
        }
        if (log.isDebugEnabled()) {
            log.debug("Exit: KeyedBuffer::cancel");
        }
        return object;
    }

    public Object[] selectAll() {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::selectAll");
        }
        Vector v = new Vector();
        KeyedNode node = null;
        synchronized (messages) {
            while ((node = messages.select()) != null) {
                v.add(node.value);
                node.key = null;
                node.value = null;
            }
        }
        Object[] objects = new
                Object[v.size()];
        v.copyInto(objects);
        if (log.isDebugEnabled()) {
            log.debug("Exit: KeyedBuffer::selectAll");
        }
        return objects;
    }

    public Object select()
            throws InterruptedException {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::select");
        }
        for (; ;) {
            if (WORKERS.isShuttingDown())
                throw new IllegalStateException(Messages.getMessage("illegalStateException00"));
            KeyedNode node = null;
            synchronized (messages) {
                node = messages.select();
            }
            if (node != null) {
                Object object = node.value;
                node.key = null;
                node.value = null;
                if (log.isDebugEnabled()) {
                    log.debug("Exit: KeyedBuffer::select");
                }
                return object;
            } else {
                messages.wait();
            }
        }
    }

    public Object select(long timeout)
            throws InterruptedException {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::select");
        }
        for (; ;) {
            if (WORKERS.isShuttingDown())
                throw new IllegalStateException(Messages.getMessage("illegalStateException00"));
            KeyedNode node = null;
            synchronized (messages) {
                node = messages.select();
            }
            if (node != null) {
                Object object = node.value;
                node.key = null;
                node.value = null;
                if (log.isDebugEnabled()) {
                    log.debug("Exit: KeyedBuffer::select");
                }
                return object;
            } else {
                messages.wait(timeout);
            }
        }
    }

    public Object select(Object key)
            throws InterruptedException {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::select");
        }
        for (; ;) {
            if (WORKERS.isShuttingDown())
                throw new IllegalStateException(Messages.getMessage("illegalStateException00"));
            KeyedNode node = null;
            synchronized (messages) {
                node = messages.select(key);
            }
            if (node != null) {
                Object object = node.value;
                node.key = null;
                node.value = null;
                if (log.isDebugEnabled()) {
                    log.debug("Exit: KeyedBuffer::select");
                }
                return object;
            } else {
                messages.wait();
            }
        }
    }

    public Object select(Object key, long timeout)
            throws InterruptedException {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::select");
        }
        for (; ;) {
            if (WORKERS.isShuttingDown())
                throw new IllegalStateException(Messages.getMessage("illegalStateException00"));
            KeyedNode node = null;
            synchronized (messages) {
                node = messages.select(key);
            }
            if (node != null) {
                Object object = node.value;
                node.key = null;
                node.value = null;
                if (log.isDebugEnabled()) {
                    log.debug("Exit: KeyedBuffer::select");
                }
                return object;
            } else {
                messages.wait(timeout);
            }
        }
    }

    public Object get() {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::get");
        }
        KeyedNode node = null;
        Object object = null;
        synchronized (messages) {
            node = messages.select();
        }
        if (node != null) {
            object = node.value;
            node.key = null;
            node.value = null;
        }
        if (log.isDebugEnabled()) {
            log.debug("Exit: KeyedBuffer::get");
        }
        return object;
    }

    public Object get(Object key) {
        if (log.isDebugEnabled()) {
            log.debug("Enter: KeyedBuffer::get");
        }
        KeyedNode node = null;
        Object object = null;
        synchronized (messages) {
            node = messages.select(key);
        }
        if (node != null) {
            object = node.value;
            node.key = null;
            node.value = null;
        }
        if (log.isDebugEnabled()) {
            log.debug("Exit: KeyedBuffer::get");
        }
        return object;
    }
    
/// Support Classes ///
    protected static class KeyedNode {
        public Object key;
        public Object value;
        public KeyedNode next;

        public KeyedNode() {
        }

        public KeyedNode(
                Object key,
                Object value) {
            this.key = key;
            this.value = value;
        }

        public KeyedNode(
                Object key,
                Object value,
                KeyedNode next) {
            this(key, value);
            this.next = next;
        }
    }

    protected static class KeyedQueue {

        protected KeyedNode head;
        protected KeyedNode last;

        protected void put(KeyedNode node) {
            if (last == null) {
                last = head = node;
            } else {
                last = last.next = node;
            }
        }

        protected KeyedNode select() {
            KeyedNode node = head;
            if (node != null && (head = node.next) == null) {
                last = null;
            }
            if (node != null)
                node.next = null;
            return node;
        }

        protected KeyedNode select(Object key) {
            KeyedNode previous = null;
            for (KeyedNode node = head; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    if (previous != null)
                        previous.next = node.next;
                    node.next = null;
                    return node;
                }
                previous = node;
            }
            return null;
        }

        protected KeyedNode peek() {
            KeyedNode node = head;
            return node;
        }

    }

}