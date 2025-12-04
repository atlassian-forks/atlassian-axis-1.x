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
package test.functional.samples;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;

public class DelayedStockQuote {
    public static void main(String[] args) throws Exception {
        DelayedStockQuote stockQuote = new DelayedStockQuote();
        System.out.print("The last price for SUNW is " + stockQuote.getStockQuote("SUNW"));
    }

    public String getStockQuote(String tickerSymbol) throws Exception {
        String endpoint = "http://localhost:8080/jws/DelayedQuote.jws";
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL(endpoint));
        call.setOperationName(new QName("getQuote"));
        Object result = call.invoke(new Object[] { tickerSymbol });
        return result != null ? result.toString() : null;
    }
}

