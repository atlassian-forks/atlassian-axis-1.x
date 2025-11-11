package org.apache.axis.components.net;

import junit.framework.TestCase;
import java.util.Arrays;

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
    public void testWildcardDotCountingLogic() {
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
                       JSSESocketFactory.isAcceptableWildCard(testCase));
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
                       JSSESocketFactory.isAcceptableWildCard(testCase));
        }

        // Test cases that should be valid for proper wildcard certificates
        String[] validCases = {
            "*.example.com",
            "*.test.example.org",
            "*.mysite.net"
        };

        for (String testCase : validCases) {
            assertTrue("Case '" + testCase + "' should be valid for proper wildcard format",
                       JSSESocketFactory.isAcceptableWildCard(testCase));
        }
    }

    /**
     * Test that all known bad second level domains are correctly handled.
     */
    public void testAllKnownBadSecondLevelDomains() {
        String[] badSecondLevelDomains = JSSESocketFactory.BAD_COUNTRY_2LDS;

        // Verify that array is sorted (required for Arrays.binarySearch)
        String[] sortedCopy = badSecondLevelDomains.clone();
        Arrays.sort(sortedCopy);
        assertTrue("BAD_COUNTRY_2LDS array must be sorted", Arrays.equals(badSecondLevelDomains, sortedCopy));

        // Test each bad second level domain in wildcard format *.bad.xx
        for (String badDomain : badSecondLevelDomains) {
            String wildcardCert = "*." + badDomain + ".uk";
            assertFalse("Wildcard certificate '" + wildcardCert +
                       "' should be rejected as it contains bad second level domain '" + badDomain + "'",
                       JSSESocketFactory.isAcceptableWildCard(wildcardCert));

            // Also test with different country codes
            String wildcardCertJp = "*." + badDomain + ".jp";
            assertFalse("Wildcard certificate '" + wildcardCertJp +
                       "' should be rejected as it contains bad second level domain '" + badDomain + "'",
                       JSSESocketFactory.isAcceptableWildCard(wildcardCertJp));
        }

        // Test that non-bad domains are accepted
        String[] goodDomains = {"example", "test", "mydomain", "company", "site", "web"};
        for (String goodDomain : goodDomains) {
            String wildcardCert = "*." + goodDomain + ".uk";
            assertTrue("Wildcard certificate '" + wildcardCert +
                      "' should be accepted as '" + goodDomain + "' is not a bad second level domain",
                      JSSESocketFactory.isAcceptableWildCard(wildcardCert));
        }

        // Test cases that should be accepted (don't match dangerous pattern)
        String[] acceptedCases = {
            "*.example.com",             // Valid wildcard with 2+ dots
            "*.a.b.c.d.e.f.g.h.i.j.uk",  // Very long
            "*.verylongdomain.uk"        // Long domain
        };

        for (String acceptedCase : acceptedCases) {
            assertTrue("Wildcard certificate '" + acceptedCase +
                      "' should be accepted as it doesn't match the dangerous pattern",
                      JSSESocketFactory.isAcceptableWildCard(acceptedCase));
        }

        // Test cases that should be rejected due to insufficient dots
        String[] rejectedCases = {
            "*.uk",      // No second level domain
            "*.example"  // Only 1 dot - insufficient for wildcard validation
        };

        for (String rejectedCase : rejectedCases) {
            assertFalse("Wildcard certificate '" + rejectedCase + "' should be rejected due to insufficient dots",
                       JSSESocketFactory.isAcceptableWildCard(rejectedCase));
        }

        // Test non-wildcard certificates (should be rejected by isAcceptableWildCard)
        String[] nonWildcardCases = {"example.uk", "co.uk", "test.com"};
        for (String nonWildcard : nonWildcardCases) {
            assertFalse("Non-wildcard certificate '" + nonWildcard + "' should be rejected",
                       JSSESocketFactory.isAcceptableWildCard(nonWildcard));
        }
    }
}
