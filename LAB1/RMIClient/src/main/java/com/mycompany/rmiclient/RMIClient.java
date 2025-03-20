
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
            System.out.println("Dodawanie 5 + 6 ="+myRemoteObject.Add(5, 6));
            System.out.println("Odejmowanie 10 - 4 ="+myRemoteObject.Sub(10, 4));
            System.out.println("Mnożenie 5 * 6 ="+myRemoteObject.Mult(5, 6));
            System.out.println("Dzielenie 100 / 10 ="+myRemoteObject.Div(100, 10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
