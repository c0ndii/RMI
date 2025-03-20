
package com.mycompany.rmi;

import java.io.Serializable;
/**
 *
 * @author MateuszK
 */
public class Product implements Serializable {
    private String Name;
    private double Price;
    
    public Product(String name, double price){
        this.Name = name;
        this.Price = price;
    }
    
    public String GetName(){
        return this.Name;
    }
    
    public double GetPrice(){
        return this.Price;
    }
    
    @Override
    public String toString(){
        return "Produkt o nazwie: "+this.Name+" oraz cenie: "+this.Price;
    }
}
