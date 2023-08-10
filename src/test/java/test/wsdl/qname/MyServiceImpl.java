package test.wsdl.qname;

public class MyServiceImpl implements MyServiceInterface {
  public MyServiceImpl() {
  }

  public String Hello(String pName) throws java.rmi.RemoteException {
    return "Hello, " + pName;
  }

  public String HelloAgain(int pName) throws java.rmi.RemoteException {
    return "Hello Again, " + Integer.toString(pName);
  }

}
