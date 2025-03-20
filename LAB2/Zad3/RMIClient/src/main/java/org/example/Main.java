package org.example;

import java.rmi.Naming;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String serverUrl = "localhost";
        String projectPath = System.getProperty("user.dir");
        String policyPath = "file:" + projectPath + "/security.policy";
        System.setProperty("java.security.policy", policyPath);
        System.out.println("Security Policy Path: " + System.getProperty("java.security.policy"));
        System.setSecurityManager(new SecurityManager());
        try {
            RMIInterface game = (RMIInterface) Naming.lookup("//"+serverUrl+"/ABC");
            Scanner scanner = new Scanner(System.in);
            char player = 'X';

            while (true) {
                char[][] board = game.getBoard();
                for (char[] row : board) {
                    for (char cell : row) {
                        System.out.print(cell + " ");
                    }
                    System.out.println();
                }

                System.out.println("Gracz " + player + " podaj wiersz i kolumnę: ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (game.makeMove(row, col, player)) {
                    char winner = game.checkWinner();
                    if (winner != ' ') {
                        System.out.println("Gracz " + winner + " wygrywa!");
                        game.resetGame();
                    }
                    player = (player == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Nieprawidłowy ruch, spróbuj ponownie.");
                }

        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}