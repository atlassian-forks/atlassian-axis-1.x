/**
 * SalesRankNPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public interface SalesRankNPrice extends javax.xml.rpc.Service {

/**
 * <b>This Web Service can be used to get the Sales Rank and/or price
 * for any book available on Amazon and/or B&N Web sites.</b> This Web
 * Service is created by <a href=http://www.PerfectXML.com target=_blank>PerfectXML
 * Team</a>.<br><br>Please email your questions/comments/suggestions
 * to <a href=mailto:darshan@PerfectXML.com><b>darshan@PerfectXML.com</b></a>.<br>Web
 * Service built using ASP.NET (<b>1.0.3705</b>) and Visual Studio .NET
 * (<b>7.0.9466</b>)<br><br>The C# client application that accesses SalesRankNPrice
 * Web Service is available (with source code)to download at <A href=http://www.perfectxml.com/Downloads/SalesRankNPriceWinClient.zip
 * >http://www.PerfectXML.com/Downloads/SalesRankNPriceWinClient.zip</A>.<br><br><A
 * href=http://www.perfectxml.com/images/SalesRankNPrice.jpg target=_blank>Click
 * here</A> to view the screenshot image of this client application.<br><br>You
 * can configure which books to monitor, the settings are saved in XML
 * configuration files locally.<br><br>For <b>more information on Web
 * Services</b>, visit <a href=http://www.PerfectXML.com/WebSvc1.asp
 * target=_blank>PerfectXML Web Services focus section</a>.<br><br>Note
 * that this Web Service posts data directly to Amazon and BarnesAndNoble
 * Web sites. This Web Service is intended only for non-commercial, personal
 * use.<br><br><u>Few sample ISBN Numbers</u>:<blockquote>186100589X:
 * <b>XML Application Development with MSXML 4.0</b> (Wrox Press)<br>1861005628
 * : <b>Early Adopter VoiceXML</b> (Wrox Press)<br>073571052X : <b>C++
 * XML</b> (New Riders)<br>1861005466 : <b>Professional SQL Server 2000
 * XML</b> (Wrox Press)<br>1861005318 : <b>Professional XML for .NET
 * Developers</b> (Wrox Press)<br>1893115976 : <b>Moving to VB.NET: Strategies,
 * Concepts, and Code (Beta 2)</b> (APress)</blockquote>
 */
    public java.lang.String getSalesRankNPriceSoapAddress();

    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_PortType getSalesRankNPriceSoap() throws javax.xml.rpc.ServiceException;

    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPriceSoap_PortType getSalesRankNPriceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
