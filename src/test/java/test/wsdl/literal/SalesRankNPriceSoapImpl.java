/**
 * SalesRankNPriceSoapImpl.java
 *
 * Mock implementation for testing literal binding
 */

package test.wsdl.literal;

public class SalesRankNPriceSoapImpl implements test.wsdl.literal.SalesRankNPriceSoap{
    public java.lang.String getAmazonSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "123456";
    }

    public java.lang.String getAmazonUKSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "789012";
    }

    public java.lang.String getBNSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "345678";
    }

    public java.lang.String getAmazonPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "$29.99";
    }

    public java.lang.String getAmazonUKPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "£24.99";
    }

    public java.lang.String getBNPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        return "$28.95";
    }

    public test.wsdl.literal.SalesRankNPrice1 getAmazonSalesRankNPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        SalesRankNPrice1 result = new SalesRankNPrice1();
        result.setPrice("$29.99");
        result.setSalesRank("123456");
        return result;
    }

    public test.wsdl.literal.SalesRankNPrice1 getBNSalesRankNPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        SalesRankNPrice1 result = new SalesRankNPrice1();
        result.setPrice("$28.95");
        result.setSalesRank("345678");
        return result;
    }

    public test.wsdl.literal.SalesRanks getAmazonAndBNSalesRank(java.lang.String ISBN) throws java.rmi.RemoteException {
        SalesRanks result = new SalesRanks();
        result.setAmazonSalesRank("123456");
        result.setBNSalesRank("345678");
        return result;
    }

    public test.wsdl.literal.Prices getAmazonAndBNPrice(java.lang.String ISBN) throws java.rmi.RemoteException {
        Prices result = new Prices();
        result.setAmazonPrice("$29.99");
        result.setBNPrice("$28.95");
        return result;
    }

    public test.wsdl.literal.All getAll(java.lang.String ISBN) throws java.rmi.RemoteException {
        All result = new All();
        result.setAmazonPrice("$29.99");
        result.setAmazonSalesRank("123456");
        result.setBNPrice("$28.95");
        result.setBNSalesRank("345678");
        return result;
    }

}