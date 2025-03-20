package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;
public class RMIService extends UnicastRemoteObject implements RMIInterface {

    private List<ClientInterface> Clients;

    protected RMIService() throws RemoteException {
        super();
        this.Clients = new ArrayList<>();
    }

    @Override
    public synchronized void EnterChat(ClientInterface client) throws RemoteException {
        this.Clients.add(client);
        System.out.println(client.getName() + " dołączył do czatu.");
    }

    @Override
    public synchronized void SendMessage(String message, ClientInterface sender) throws RemoteException {
        String formattedMessage = "[" + sender.getName() + "]: " + message;
        System.out.println(formattedMessage);
        for (ClientInterface client : this.Clients) {
            if (!client.equals(sender)) {
                client.receiveMessage(formattedMessage);
            }
        }
    }
}
