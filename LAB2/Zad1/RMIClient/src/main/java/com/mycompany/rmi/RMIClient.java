
package com.mycompany.rmi;

import com.mycompany.rmi.Product;
import com.mycompany.rmi.RMIInterface;
import java.rmi.Naming;
import java.util.List;

public class RMIClient {

    public static void main(String[] args) {
        String serverUrl = "localhost";
        String projectPath = System.getProperty("user.dir");
        String policyPath = "file:" + projectPath + "/security.policy";
        System.setProperty("java.security.policy", policyPath);
        System.out.println("Security Policy Path: " + System.getProperty("java.security.policy"));
        System.setSecurityManager(new SecurityManager());
        try {
            RMIInterface myRemoteObject = (RMIInterface) Naming.lookup("//localhost/ABC");
            List<Product> products = myRemoteObject.GetProducts();
            System.out.println("Dostępne produkty: ");
            for (Product item : products){
                System.out.println(item);
            }
            
            String specificItem = "Komputer";
            Product specificItemObject = myRemoteObject.GetProductByName(specificItem);
            System.out.println("Szczegóły szukanego przedmiotu: "+specificItemObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
