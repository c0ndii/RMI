package com.mycompany.zad1;

import javax.jws.WebService;
@WebService(endpointInterface = "com.mycompany.zad1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}
