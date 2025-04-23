/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.mycompany.ws.HelloWorld;

public class HelloWorldClient{
	
	public static void main(String[] args) throws Exception {
	   
		URL url = new URL("https://localhost:8443/HelloWorld/hello?wsdl");
        QName qname = new QName("http://ws.mycompany.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString());
       
    }

}

