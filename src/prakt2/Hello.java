package prakt2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    void remoteMsg() throws RemoteException;
}
