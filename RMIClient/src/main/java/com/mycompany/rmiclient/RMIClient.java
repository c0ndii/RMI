
package com.mycompany.rmiclient;

import com.mycompany.rmiserver.RMIInterface;
import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        System.setSecurityManager(new SecurityManager());
        try {
            RMIInterface myRemoteObject = (RMIInterface) Naming.lookup("//localhost/ABC");
            String text = "Hallo :-)";
            String result = myRemoteObject.getDescription(text);
            System.out.println("Wysłano do servera: " + text);
            System.out.println("Otrzymana z serwera odpowiedź: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
