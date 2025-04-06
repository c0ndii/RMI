/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zad1client;

import com.mycompany.ws.ServerInfo;
import com.mycompany.ws.ServerInfoService;

public class Zad1Client{
	
	public static void main(String[] args) throws Exception {
	   
		ServerInfoService sis = new ServerInfoService();
		ServerInfo si = sis.getServerInfoPort();

		System.out.println(si.getServerName());
       
    }

}
