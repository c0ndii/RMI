/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rmiserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            System.setProperty("java.security.policy", "security.policy");
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            //System.setProperty("java.rmi.server.codebase","file:/C:/Users/Jacek/workspace/RMIServer / bin /");
            System.setProperty("java.rmi.server.codebase", "file:/C:/Users/student/Documents/NetBeansProjects/RMIServer/target/classes/");
            System.setProperty("java.rmi.server.hostname", "10.20.16.2");
            //System.setProperty("java.rmi.server.codebase", "http://192.168.1.102/jaco/");
            System.out.println("Codebase: " + System.getProperty("java.rmi.server.codebase"));
            LocateRegistry.createRegistry(1099);
            RMIService obj1 = new RMIService();
            Naming.rebind("//10.20.16.2/ABC", obj1);
            System.out.println("Serwer oczekuje ...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
