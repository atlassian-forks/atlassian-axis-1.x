package test.saaj;

/**
 * SAAJ PackageTests tests
 */
public class PackageTests extends junit.framework.TestCase {
    public PackageTests(String name) {
        super(name);
    }

    public static junit.framework.Test suite() throws Exception {
        junit.framework.TestSuite suite = new junit.framework.TestSuite();
        // Attachments service test.
        try{
          if( null != org.apache.axis.utils.ClassUtils.forName("javax.activation.DataHandler") &&
              null != org.apache.axis.utils.ClassUtils.forName("javax.mail.internet.MimeMultipart")){
                suite.addTestSuite(TestAttachment.class);
                suite.addTestSuite(TestAttachmentSerialization.class);
          }
        }catch( Throwable t){;}
        suite.addTestSuite(TestEnvelope.class);
        suite.addTestSuite(TestImport.class);
        suite.addTestSuite(TestSOAPFaultDetail.class);
        suite.addTestSuite(TestHeaders.class);
        suite.addTestSuite(TestPrefixes.class);
        suite.addTestSuite(TestSOAPFaults.class);
        suite.addTestSuite(TestDOM.class);
        suite.addTestSuite(TestSOAPElement.class);
        suite.addTestSuite(TestText.class);
        suite.addTestSuite(TestMessageProperty.class);
        return suite;
    }
}

