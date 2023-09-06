/*
 * Copyright 2002-2004 The Apache Software Foundation.
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
package test.servicedesc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import junit.framework.TestCase;

import org.apache.axis.description.JavaServiceDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.encoding.DefaultTypeMappingImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TestServiceDesc extends TestCase {
    public TestServiceDesc() {
        super("Test ServiceDesc Synch");
    }

    public void testFaultSynch() {
        JavaServiceDesc desc = new JavaServiceDesc();
        desc.setTypeMapping(DefaultTypeMappingImpl.getSingletonDelegate());

        desc.loadServiceDescByIntrospection(ServiceClass.class);

        ArrayList<OperationDesc> operations = desc.getOperations();
        List<String> operationNames = operations
                .stream()
                .map(OperationDesc::getName)
                .collect(Collectors.toList());

        assertEquals("invalid number of registered operations",
                2, operations.size());
        assertThat(operationNames, containsInAnyOrder("doIt1", "doIt2"));


        for (OperationDesc operation : operations) {
            List faults = operation.getFaults();
            assertTrue(faults != null);
            assertEquals("invalid number of registered faults",
                    2, faults.size());
        }
    }
}
