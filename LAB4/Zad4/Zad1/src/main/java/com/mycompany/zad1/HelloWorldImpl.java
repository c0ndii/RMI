package com.mycompany.zad1;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
@WebService(endpointInterface = "com.mycompany.zad1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
    @Override
    public List<Product> getProducts() {
        List<Product> produkty = new ArrayList<>();

        produkty.add(new Product("Test1", "Test1", 1));
        produkty.add(new Product("Test2", "Test2", 2));
        produkty.add(new Product("Test3", "Test3", 3));
        
        return produkty;
    }
}
