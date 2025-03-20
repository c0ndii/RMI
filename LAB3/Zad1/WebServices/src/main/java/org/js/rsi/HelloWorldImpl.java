package org.js.rsi;

import javax.jws.WebService;
@WebService(endpointInterface = "org.js.rsi.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}
