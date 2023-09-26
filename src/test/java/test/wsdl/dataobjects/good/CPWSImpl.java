/**
 * CPWSImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.good;

public interface CPWSImpl extends java.rmi.Remote {
    public test.wsdl.dataobjects.good.CreateSessionResponse createSession(test.wsdl.dataobjects.good.CreateSessionRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.ReleaseResponse release(test.wsdl.dataobjects.good.ReleaseRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.GetSubscriberIdResponse getSubscriberId(test.wsdl.dataobjects.good.GetSubscriberIdRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.GetPriceResponse getPrice(test.wsdl.dataobjects.good.GetPriceRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.StartApplicationSessionResponse startApplicationSession(test.wsdl.dataobjects.good.StartApplicationSessionRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.ReserveResponse reserve(test.wsdl.dataobjects.good.ReserveRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.ChargeReservationResponse chargeReservation(test.wsdl.dataobjects.good.ChargeReservationRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.NotifyConfirmationResponse notifyConfirmation(test.wsdl.dataobjects.good.NotifyConfirmationRequest in0) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.good.ImmediateChargeResponse immediateCharge(test.wsdl.dataobjects.good.ImmediateChargeRequest in0) throws java.rmi.RemoteException;
}
