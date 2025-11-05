package test.components.net;

import junit.framework.TestCase;
import org.apache.axis.components.net.JSSESocketFactory;
import java.lang.reflect.Method;

/**
 * Test case for JSSESocketFactory.
 */
public class TestJSSESocketFactory extends TestCase {

    public TestJSSESocketFactory(String name) {
        super(name);
    }

    /**
     * Test wildcard certificate validation prevents dangerous country code wildcards.
     */
    public void testWildcardDotCountingLogic() throws Exception {
        Method method = JSSESocketFactory.class.getDeclaredMethod("isAcceptableWildCard", String.class);
        method.setAccessible(true);

        // Test cases that should be invalid because of insufficient dots (position <= 2)
        String[] insufficientDotsCases = {
            "*",
            "*.",
            "*.c",
            "*.co",
            "*.com",
            "*.org",
            "*.net"
        };

        for (String testCase : insufficientDotsCases) {
            assertFalse("Case '" + testCase + "' should be invalid for no dot after position 2",
                       (Boolean) method.invoke(null, testCase));
        }

        // Test cases that should be invalid because of dangerous country code wildcards
        String[] dangerousCountryCases = {
            "*.co.uk",
            "*.co.jp",
            "*.org.uk",
            "*.gov.uk",
            "*.com.au"
        };

        for (String testCase : dangerousCountryCases) {
            assertFalse("Case '" + testCase + "' should be invalid for dangerous country code wildcard",
                       (Boolean) method.invoke(null, testCase));
        }

        // Test cases that should be valid for proper wildcard certificates
        String[] validCases = {
            "*.example.com",
            "*.test.example.org",
            "*.mysite.net"
        };

        for (String testCase : validCases) {
            assertTrue("Case '" + testCase + "' should be valid for proper wildcard format",
                       (Boolean) method.invoke(null, testCase));
        }
    }
}
