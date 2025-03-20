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
            RMIInterface myRemoteObject = (RMIInterface) Naming.lookup("//"+serverUrl+"/ABC");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadź swoje imie: ");
            String name = scanner.nextLine();

            ClientService client = new ClientService(name, myRemoteObject);

            System.out.println("Dołączono do czatu. Twoja wiadomość:");
            while (true) {
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) break;
                client.sendMessage(message);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}