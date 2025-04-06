/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zad1;

/**
 *
 * @author MateuszK
 */
public class Product {
private String nazwa;
private String opis;
private int cena;

    public Product(String nazwa, String opis, int cena){
        this.nazwa = nazwa;
        this.opis=opis;
        this.cena=cena;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa=nazwa;
    }
    
    public String getNazwa(){
        return this.nazwa;
    }
    
    public void setOpis(String opis) {
        this.opis=opis;
    }
    
    public String getOpis(){
        return this.opis;
    }
    
    public void setCena(int cena) {
        this.cena=cena;
    }
    
    public int getCena(){
        return this.cena;
    }
}
