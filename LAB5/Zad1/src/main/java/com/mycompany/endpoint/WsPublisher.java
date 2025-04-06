/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endpoint;

import javax.xml.ws.Endpoint;
import com.mycompany.ws.ServerInfo;

//Endpoint publisher
public class WsPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/ws/server", new ServerInfo());
	   
	   System.out.println("Service is published!");
    }
 
}