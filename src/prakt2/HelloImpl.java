package prakt2;

import java.rmi.RemoteException;

public class HelloImpl implements Hello{

    @Override
    public void remoteMsg() throws RemoteException {
        System.out.println("This is an example RMI program");
    }
}
