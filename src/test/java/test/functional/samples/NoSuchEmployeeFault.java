/**
 * NoSuchEmployeeFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package test.functional.samples;

import java.rmi.RemoteException;

public class NoSuchEmployeeFault extends RemoteException  implements java.io.Serializable {
    private String info;

    public NoSuchEmployeeFault() {
    }

    public NoSuchEmployeeFault(
           String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
