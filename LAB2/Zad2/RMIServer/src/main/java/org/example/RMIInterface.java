package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    void EnterChat(ClientInterface client) throws RemoteException;
    void SendMessage(String message, ClientInterface sender) throws RemoteException;
}
