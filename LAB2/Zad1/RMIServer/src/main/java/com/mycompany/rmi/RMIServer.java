/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.io.File;


public class RMIServer {

    public static void main(String[] args) {
        try {
            String serverUrl = "localhost";
            String projectPath = System.getProperty("user.dir");
            String policyPath = "file:" + projectPath + "/security.policy";

            
            System.setProperty("java.security.policy", policyPath);
            System.out.println("Security Policy Path: " + System.getProperty("java.security.policy"));
            File policyFile = new File(projectPath + "/security.policy");
            if (!policyFile.exists()) {
                System.err.println("Error: Security policy file not found!");
                return;
            }
            
            System.setProperty("java.rmi.server.codebase", new File(projectPath, "target/classes/").toURI().toString());

            System.out.println("Codebase: " + System.getProperty("java.rmi.server.codebase"));
            LocateRegistry.createRegistry(1099);
            RMIService obj1 = new RMIService();
            Naming.rebind("//localhost/ABC", obj1);
            System.out.println("Serwer oczekuje ...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
