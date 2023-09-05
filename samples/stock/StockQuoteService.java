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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

/**
 * See \samples\stock\readme for info.
 *
 * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com)
 * @author Doug Davis (dug@us.ibm.com)
 */
public class StockQuoteService {
  private HashMap map = new HashMap();
  public String test() {
    return( "Just a test" );
  }

  public float getQuote (String symbol) throws Exception {
    if ( symbol.equals("XXX") ) return( (float) 55.25 );

    Float price = (Float) map.get(symbol);
    if(price != null){
      return price.floatValue();
    }
    return 42.00;
  }

  public void update(String symbol, float price) {
    map.put(symbol, new Float(price));
  }
}
