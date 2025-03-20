package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientService extends UnicastRemoteObject implements ClientInterface{
    private final String name;
    private final RMIInterface server;

    protected ClientService(String name, RMIInterface server) throws RemoteException {
        super();
        this.name = name;
        this.server = server;
        server.EnterChat(this);
    }

    @Override
    public void receiveMessage(String message) throws RemoteException {
        System.out.println(message);
    }

    @Override
    public String getName() throws RemoteException {
        return name;
    }

    public void sendMessage(String message) throws RemoteException {
        server.SendMessage(message, this);
    }
}
