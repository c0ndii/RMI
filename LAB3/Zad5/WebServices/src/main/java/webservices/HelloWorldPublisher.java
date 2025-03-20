package webservices;

import javax.xml.ws.Endpoint;
import org.js.rsi.HelloWorldImpl;

public class HelloWorldPublisher {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Web service czeka na klienta....");
    }
}
