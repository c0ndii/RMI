package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIService extends UnicastRemoteObject implements RMIInterface {
    private char[][] board;

    protected RMIService() throws RemoteException {
        super();
        board = new char[3][3];
        resetGame();
    }

    public synchronized boolean makeMove(int row, int col, char player) throws RemoteException {
        if(row >= 3 || col >= 3){
            return false;
        }
        if (board[row][col] == ' ') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public synchronized char[][] getBoard() throws RemoteException {
        return board;
    }

    public synchronized char checkWinner() throws RemoteException {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return board[i][0];
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return board[0][i];
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return board[0][0];
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return board[0][2];
        return ' ';
    }

    public synchronized void resetGame() throws RemoteException {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
}
