package webservices;

import org.js.rsi.HelloWorld;
import org.js.rsi.HelloWorldImplService;

public class WebServicesClient {
    public static void main(String[] args){
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();

        String zapytanie = "To ja - klient";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wysłał: "+zapytanie);
        System.out.println("Klient otrzymał: "+response);

    }
}
