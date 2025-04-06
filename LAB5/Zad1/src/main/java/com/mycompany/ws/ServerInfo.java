/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file="handler-chain.xml")
public class ServerInfo{

	@WebMethod
	public String getServerName() {
		
		return "test server";
		
	}

}
