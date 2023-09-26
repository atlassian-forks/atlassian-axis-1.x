/**
 * SalesRankNPriceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.SalesRankNPrice;

public interface SalesRankNPriceSoap_PortType extends java.rmi.Remote {

    /**
     * This method accepts an ISBN string and returns Amazon.com Sales
     * Rank for that book.
     */
    public java.lang.String getAmazonSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * <b>NEW!</b> This method accepts an ISBN string and returns
     * <b>Amazon.co.uk</b> Sales Rank for that book.
     */
    public java.lang.String getAmazonUKSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns BarnesAndNoble.com
     * Sales Rank for that book.
     */
    public java.lang.String getBNSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns Amazon.com Price
     * (in USD) for that book.
     */
    public java.lang.String getAmazonPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * <b>NEW!</b> This method accepts an ISBN string and returns
     * <b>Amazon.co.uk Price (in &pound;)</b> for that book.
     */
    public java.lang.String getAmazonUKPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns BarnesAndNoble.com
     * Price (in USD) for that book.
     */
    public java.lang.String getBNPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns Amazon.com Sales
     * Rank and Price for that book. The returned data is one structure containing
     * two strings (SalesRank and BookPrice).
     */
    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPrice1 getAmazonSalesRankNPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns BarnesAndNoble.com
     * Sales Rank and Price for that book. The returned data is one structure
     * containing two strings (SalesRank and BookPrice).
     */
    public test.wsdl.dataobjects.SalesRankNPrice.SalesRankNPrice1 getBNSalesRankNPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns Amazon.com and
     * BarnesAndNoble.com Sales Ranks for that book. The returned data is
     * one structure containing two strings. (Amazon SalesRank and B&N Sales
     * Rank).
     */
    public test.wsdl.dataobjects.SalesRankNPrice.SalesRanks getAmazonAndBNSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns Amazon.com and
     * BarnesAndNoble.com Prices (in USD) for that book. The returned data
     * is one structure containing two strings. (Amazon SalesRank and B&N
     * Sales Rank).
     */
    public test.wsdl.dataobjects.SalesRankNPrice.Prices getAmazonAndBNPrice(java.lang.String ISBN) throws java.rmi.RemoteException;

    /**
     * This method accepts an ISBN string and returns Amazon.com and
     * BarnesAndNoble.com Sales Ranks as well as Amazon.com and BarnesAndNoble.com
     * Prices (in USD) for that book. The returned data is one structure
     * containing Four strings. (Amazon SalesRank, Amazon Price, B&N Sales
     * Rank, and B&N Price).
     */
    public test.wsdl.dataobjects.SalesRankNPrice.All getAll(java.lang.String ISBN) throws java.rmi.RemoteException;
}
