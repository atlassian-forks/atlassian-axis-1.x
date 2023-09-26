/**
 * TypeTest_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.ComprehensiveTypes;

public interface TypeTest_PortType extends java.rmi.Remote {
    public void allPrimitivesIn(java.lang.String string, java.math.BigInteger integer, int _int, long _long, short _short, java.math.BigDecimal decimal, float _float, double _double, boolean _boolean, byte _byte, javax.xml.namespace.QName QName, java.util.Calendar dateTime, byte[] base64Binary, byte[] hexBinary, java.lang.String soapString, java.lang.Boolean soapBoolean, java.lang.Float soapFloat, java.lang.Double soapDouble, java.math.BigDecimal soapDecimal, java.lang.Integer soapInt, java.lang.Short soapShort, byte[] soapBase64, org.apache.axis.types.Time time, org.apache.axis.types.UnsignedLong unsignedLong, org.apache.axis.types.UnsignedInt unsignedInt, org.apache.axis.types.UnsignedShort unsignedShort, org.apache.axis.types.UnsignedByte unsignedByte, org.apache.axis.types.NonNegativeInteger nonNegativeInteger, org.apache.axis.types.PositiveInteger positiveInteger, org.apache.axis.types.NonPositiveInteger nonPositiveInteger, org.apache.axis.types.NegativeInteger negativeInteger, org.apache.axis.types.URI anyURI, org.apache.axis.types.Year gYear, org.apache.axis.types.Month gMonth, org.apache.axis.types.Day gDay, org.apache.axis.types.YearMonth gYearMonth, org.apache.axis.types.MonthDay gMonthDay) throws java.rmi.RemoteException;
    public void allPrimitivesInout(javax.xml.rpc.holders.StringHolder string, javax.xml.rpc.holders.BigIntegerHolder integer, javax.xml.rpc.holders.IntHolder _int, javax.xml.rpc.holders.LongHolder _long, javax.xml.rpc.holders.ShortHolder _short, javax.xml.rpc.holders.BigDecimalHolder decimal, javax.xml.rpc.holders.FloatHolder _float, javax.xml.rpc.holders.DoubleHolder _double, javax.xml.rpc.holders.BooleanHolder _boolean, javax.xml.rpc.holders.ByteHolder _byte, javax.xml.rpc.holders.QNameHolder QName, javax.xml.rpc.holders.CalendarHolder dateTime, javax.xml.rpc.holders.ByteArrayHolder base64Binary, javax.xml.rpc.holders.ByteArrayHolder hexBinary, javax.xml.rpc.holders.StringHolder soapString, javax.xml.rpc.holders.BooleanWrapperHolder soapBoolean, javax.xml.rpc.holders.FloatWrapperHolder soapFloat, javax.xml.rpc.holders.DoubleWrapperHolder soapDouble, javax.xml.rpc.holders.BigDecimalHolder soapDecimal, javax.xml.rpc.holders.IntegerWrapperHolder soapInt, javax.xml.rpc.holders.ShortWrapperHolder soapShort, javax.xml.rpc.holders.ByteArrayHolder soapBase64, org.apache.axis.holders.TimeHolder time, org.apache.axis.holders.UnsignedLongHolder unsignedLong, org.apache.axis.holders.UnsignedIntHolder unsignedInt, org.apache.axis.holders.UnsignedShortHolder unsignedShort, org.apache.axis.holders.UnsignedByteHolder unsignedByte, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger, org.apache.axis.holders.URIHolder anyURI, org.apache.axis.holders.YearHolder gYear, org.apache.axis.holders.MonthHolder gMonth, org.apache.axis.holders.DayHolder gDay, org.apache.axis.holders.YearMonthHolder gYearMonth, org.apache.axis.holders.MonthDayHolder gMonthDay) throws java.rmi.RemoteException;
    public void allPrimitivesOut(javax.xml.rpc.holders.StringHolder string, javax.xml.rpc.holders.BigIntegerHolder integer, javax.xml.rpc.holders.IntHolder _int, javax.xml.rpc.holders.LongHolder _long, javax.xml.rpc.holders.ShortHolder _short, javax.xml.rpc.holders.BigDecimalHolder decimal, javax.xml.rpc.holders.FloatHolder _float, javax.xml.rpc.holders.DoubleHolder _double, javax.xml.rpc.holders.BooleanHolder _boolean, javax.xml.rpc.holders.ByteHolder _byte, javax.xml.rpc.holders.QNameHolder QName, javax.xml.rpc.holders.CalendarHolder dateTime, javax.xml.rpc.holders.ByteArrayHolder base64Binary, javax.xml.rpc.holders.ByteArrayHolder hexBinary, javax.xml.rpc.holders.StringHolder soapString, javax.xml.rpc.holders.BooleanWrapperHolder soapBoolean, javax.xml.rpc.holders.FloatWrapperHolder soapFloat, javax.xml.rpc.holders.DoubleWrapperHolder soapDouble, javax.xml.rpc.holders.BigDecimalHolder soapDecimal, javax.xml.rpc.holders.IntegerWrapperHolder soapInt, javax.xml.rpc.holders.ShortWrapperHolder soapShort, javax.xml.rpc.holders.ByteArrayHolder soapBase64, org.apache.axis.holders.TimeHolder time, org.apache.axis.holders.UnsignedLongHolder unsignedLong, org.apache.axis.holders.UnsignedIntHolder unsignedInt, org.apache.axis.holders.UnsignedShortHolder unsignedShort, org.apache.axis.holders.UnsignedByteHolder unsignedByte, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger, org.apache.axis.holders.URIHolder anyURI, org.apache.axis.holders.YearHolder gYear, org.apache.axis.holders.MonthHolder gMonth, org.apache.axis.holders.DayHolder gDay, org.apache.axis.holders.YearMonthHolder gYearMonth, org.apache.axis.holders.MonthDayHolder gMonthDay) throws java.rmi.RemoteException;
    public void enumIn(test.wsdl.dataobjects.ComprehensiveTypes.Enum enum) throws java.rmi.RemoteException;
    public void enumInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumHolder enum) throws java.rmi.RemoteException;
    public void enumOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumHolder enum) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.Enum enumReturn() throws java.rmi.RemoteException;
    public void enumIntIn(test.wsdl.dataobjects.ComprehensiveTypes.EnumInt enumInt) throws java.rmi.RemoteException;
    public void enumIntInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumIntHolder enumInt) throws java.rmi.RemoteException;
    public void enumIntOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EnumIntHolder enumInt) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.EnumInt enumIntReturn() throws java.rmi.RemoteException;
    public void arrayIn(java.lang.String[] array) throws java.rmi.RemoteException;
    public void arrayInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayHolder array) throws java.rmi.RemoteException;
    public void arrayOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayHolder array) throws java.rmi.RemoteException;
    public java.lang.String[] arrayReturn() throws java.rmi.RemoteException;
    public void arrayMIn(int[][][] arrayM) throws java.rmi.RemoteException;
    public void arrayMInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayMHolder arrayM) throws java.rmi.RemoteException;
    public void arrayMOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ArrayMHolder arrayM) throws java.rmi.RemoteException;
    public int[][][] arrayMReturn() throws java.rmi.RemoteException;
    public void complexAllIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll complexAll) throws java.rmi.RemoteException;
    public void complexAllInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexAllHolder complexAll) throws java.rmi.RemoteException;
    public void complexAllOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexAllHolder complexAll) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexAll complexAllReturn() throws java.rmi.RemoteException;
    public void complexSequenceIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence complexSequence) throws java.rmi.RemoteException;
    public void complexSequenceInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexSequenceHolder complexSequence) throws java.rmi.RemoteException;
    public void complexSequenceOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexSequenceHolder complexSequence) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexSequence complexSequenceReturn() throws java.rmi.RemoteException;
    public void complexWComplexIn(test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex complexWComplex) throws java.rmi.RemoteException;
    public void complexWComplexInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexWComplexHolder complexWComplex) throws java.rmi.RemoteException;
    public void complexWComplexOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.ComplexWComplexHolder complexWComplex) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.ComplexWComplex complexWComplexReturn() throws java.rmi.RemoteException;
    public void emptyComplexTypeIn(test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault;
    public void emptyComplexTypeInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.EmptyComplexTypeHolder emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault;
    public void emptyComplexTypeOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.EmptyComplexTypeHolder emptyComplexType) throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault;
    public test.wsdl.dataobjects.ComprehensiveTypes.EmptyComplexType emptyComplexTypeReturn() throws java.rmi.RemoteException, test.wsdl.dataobjects.ComprehensiveTypes.EmptyFault;
    public void anyIn(java.lang.Object any) throws java.rmi.RemoteException;
    public void anyInout(javax.xml.rpc.holders.ObjectHolder any) throws java.rmi.RemoteException;
    public void anyOut(javax.xml.rpc.holders.ObjectHolder any) throws java.rmi.RemoteException;
    public java.lang.Object anyReturn() throws java.rmi.RemoteException;
    public void animalIn(test.wsdl.dataobjects.ComprehensiveTypes.Animal animal) throws java.rmi.RemoteException;
    public void animalInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.AnimalHolder animal) throws java.rmi.RemoteException;
    public void animalOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.AnimalHolder animal) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.Animal animalReturn() throws java.rmi.RemoteException;
    public void catIn(test.wsdl.dataobjects.ComprehensiveTypes.Cat cat) throws java.rmi.RemoteException;
    public void catInout(test.wsdl.dataobjects.ComprehensiveTypes.holders.CatHolder cat) throws java.rmi.RemoteException;
    public void catOut(test.wsdl.dataobjects.ComprehensiveTypes.holders.CatHolder cat) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.Cat catReturn() throws java.rmi.RemoteException;
    public boolean methodBoolean(boolean inBoolean, javax.xml.rpc.holders.BooleanHolder _boolean) throws java.rmi.RemoteException;
    public byte methodByte(byte inByte, javax.xml.rpc.holders.ByteHolder _byte) throws java.rmi.RemoteException;
    public short methodShort(short inShort, javax.xml.rpc.holders.ShortHolder _short) throws java.rmi.RemoteException;
    public int methodInt(int inInt, javax.xml.rpc.holders.IntHolder _int) throws java.rmi.RemoteException;
    public long methodLong(long inLong, javax.xml.rpc.holders.LongHolder _long) throws java.rmi.RemoteException;
    public float methodFloat(float inFloat, javax.xml.rpc.holders.FloatHolder _float) throws java.rmi.RemoteException;
    public double methodDouble(double inDouble, javax.xml.rpc.holders.DoubleHolder _double) throws java.rmi.RemoteException;
    public java.lang.String methodString(java.lang.String inString, javax.xml.rpc.holders.StringHolder string) throws java.rmi.RemoteException;
    public java.math.BigInteger methodInteger(java.math.BigInteger inInteger, javax.xml.rpc.holders.BigIntegerHolder integer) throws java.rmi.RemoteException;
    public java.math.BigDecimal methodDecimal(java.math.BigDecimal inDecimal, javax.xml.rpc.holders.BigDecimalHolder decimal) throws java.rmi.RemoteException;
    public java.util.Calendar methodDateTime(java.util.Calendar inDateTime, javax.xml.rpc.holders.CalendarHolder dateTime) throws java.rmi.RemoteException;
    public javax.xml.namespace.QName methodQName(javax.xml.namespace.QName inQName, javax.xml.rpc.holders.QNameHolder qName) throws java.rmi.RemoteException;
    public org.apache.axis.types.Time methodTime(org.apache.axis.types.Time inTime, org.apache.axis.holders.TimeHolder time) throws java.rmi.RemoteException;
    public org.apache.axis.types.UnsignedLong methodUnsignedLong(org.apache.axis.types.UnsignedLong inUnsignedLong, org.apache.axis.holders.UnsignedLongHolder unsignedLong) throws java.rmi.RemoteException;
    public org.apache.axis.types.UnsignedInt methodUnsignedInt(org.apache.axis.types.UnsignedInt inUnsignedInt, org.apache.axis.holders.UnsignedIntHolder unsignedInt) throws java.rmi.RemoteException;
    public org.apache.axis.types.UnsignedShort methodUnsignedShort(org.apache.axis.types.UnsignedShort inUnsignedShort, org.apache.axis.holders.UnsignedShortHolder unsignedShort) throws java.rmi.RemoteException;
    public org.apache.axis.types.UnsignedByte methodUnsignedByte(org.apache.axis.types.UnsignedByte inUnsignedByte, org.apache.axis.holders.UnsignedByteHolder unsignedByte) throws java.rmi.RemoteException;
    public org.apache.axis.types.NonNegativeInteger methodNonNegativeInteger(org.apache.axis.types.NonNegativeInteger inNonNegativeInteger, org.apache.axis.holders.NonNegativeIntegerHolder nonNegativeInteger) throws java.rmi.RemoteException;
    public org.apache.axis.types.PositiveInteger methodPositiveInteger(org.apache.axis.types.PositiveInteger inPositiveInteger, org.apache.axis.holders.PositiveIntegerHolder positiveInteger) throws java.rmi.RemoteException;
    public org.apache.axis.types.NonPositiveInteger methodNonPositiveInteger(org.apache.axis.types.NonPositiveInteger inNonPositiveInteger, org.apache.axis.holders.NonPositiveIntegerHolder nonPositiveInteger) throws java.rmi.RemoteException;
    public org.apache.axis.types.NegativeInteger methodNegativeInteger(org.apache.axis.types.NegativeInteger inNegativeInteger, org.apache.axis.holders.NegativeIntegerHolder negativeInteger) throws java.rmi.RemoteException;
    public org.apache.axis.types.URI methodAnyURI(org.apache.axis.types.URI inAnyURI, org.apache.axis.holders.URIHolder anyURI) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType methodSimpleAnyURI(test.wsdl.dataobjects.ComprehensiveTypes.SimpleAnyURIType inAnyURI, test.wsdl.dataobjects.ComprehensiveTypes.holders.SimpleAnyURITypeHolder anyURI) throws java.rmi.RemoteException;
    public org.apache.axis.types.Year methodYear(org.apache.axis.types.Year inYear, org.apache.axis.holders.YearHolder year) throws java.rmi.RemoteException;
    public org.apache.axis.types.Month methodMonth(org.apache.axis.types.Month inMonth, org.apache.axis.holders.MonthHolder month) throws java.rmi.RemoteException;
    public org.apache.axis.types.Day methodDay(org.apache.axis.types.Day inDay, org.apache.axis.holders.DayHolder day) throws java.rmi.RemoteException;
    public org.apache.axis.types.YearMonth methodYearMonth(org.apache.axis.types.YearMonth inYearMonth, org.apache.axis.holders.YearMonthHolder yearMonth) throws java.rmi.RemoteException;
    public org.apache.axis.types.MonthDay methodMonthDay(org.apache.axis.types.MonthDay inMonthDay, org.apache.axis.holders.MonthDayHolder monthDay) throws java.rmi.RemoteException;
    public java.lang.String methodSoapString(java.lang.String inSoapString, javax.xml.rpc.holders.StringHolder soapencString) throws java.rmi.RemoteException;
    public java.lang.Boolean methodSoapBoolean(java.lang.Boolean inSoapBoolean, javax.xml.rpc.holders.BooleanWrapperHolder soapencBoolean) throws java.rmi.RemoteException;
    public java.lang.Float methodSoapFloat(java.lang.Float inSoapFloat, javax.xml.rpc.holders.FloatWrapperHolder soapencFloat) throws java.rmi.RemoteException;
    public java.lang.Double methodSoapDouble(java.lang.Double inSoapDouble, javax.xml.rpc.holders.DoubleWrapperHolder soapencDouble) throws java.rmi.RemoteException;
    public java.math.BigDecimal methodSoapDecimal(java.math.BigDecimal inSoapDecimal, javax.xml.rpc.holders.BigDecimalHolder soapencDecimal) throws java.rmi.RemoteException;
    public java.lang.Integer methodSoapInt(java.lang.Integer inSoapInt, javax.xml.rpc.holders.IntegerWrapperHolder soapencInt) throws java.rmi.RemoteException;
    public java.lang.Short methodSoapShort(java.lang.Short inSoapShort, javax.xml.rpc.holders.ShortWrapperHolder soapencShort) throws java.rmi.RemoteException;
}
