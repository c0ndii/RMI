package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public interface RMIInterface extends Remote {
    boolean makeMove(int row, int col, char player) throws RemoteException;
    char[][] getBoard() throws RemoteException;
    char checkWinner() throws RemoteException;
    void resetGame() throws RemoteException;
}
