/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.monitor;

import junit.framework.TestCase;

/** The shipped runtime must not contain the removed SOAP Monitor feature. */
public class TestSOAPMonitorIsolation extends TestCase {
    public void testMonitorClassesAreNotAvailable() throws Exception {
        String[] removedClasses = {
            "org.apache.axis.monitor.SOAPMonitorService",
            "org.apache.axis.monitor.SOAPMonitorConstants",
            "org.apache.axis.handlers.SOAPMonitorHandler",
            "org.apache.axis.utils.SOAPMonitor"
        };
        for (String name : removedClasses) {
            try {
                Class.forName(name, false, getClass().getClassLoader());
                fail("Removed SOAP Monitor class is still available: " + name);
            } catch (ClassNotFoundException expected) {
                // The runtime must not be able to initialize the monitor listener.
            }
        }
    }
}
