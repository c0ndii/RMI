package webservices;

import org.js.rsi.HelloWorld;
import org.js.rsi.HelloWorldImplService;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;

public class WebServicesClient2 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
        QName qname = new QName("http://rsi.js.org/","HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        String zapytanie = "To ja - klient2";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wysłał: "+zapytanie);
        System.out.println("Klient otrzymał: "+response);
    }
}
