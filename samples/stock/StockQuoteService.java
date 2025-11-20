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

package samples.stock;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;

/**
 * See \samples\stock\readme for info.
 *
 * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com)
 * @author Doug Davis (dug@us.ibm.com)
 */
public class StockQuoteService {
  public String test() {
    return( "Just a test" );
  }

  /**
   * This method originally called an external stock quote endpoint.
   * Since that endpoint is no longer available, we now return mock values
   * directly for functional tests.
   */
  public float getQuote (String symbol) throws Exception {
    if ("XXX".equals(symbol)) return 55.25f;
    // Add other mock values as needed
    return 0.0f;
  }
}
