/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;

public class RMIService extends UnicastRemoteObject implements RMIInterface {

    private List<Product> Products;

    protected RMIService() throws RemoteException {
        super();
        SeedProducts();
    }
    
    private void SeedProducts(){
        this.Products = new ArrayList<>();
        this.Products.add(new Product("Telefon", 1500.00));
        this.Products.add(new Product("Komputer", 6000.99));
        this.Products.add(new Product("Książka", 44.10));
        this.Products.add(new Product("Krzesło", 100.00));
        this.Products.add(new Product("Woda", 1.99));
        
    }

    @Override
    public List<Product> GetProducts() throws RemoteException {
        return this.Products;
    }
    
    @Override
    public Product GetProductByName(String name) throws RemoteException {
        return this.Products.stream().filter(x -> x.GetName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
