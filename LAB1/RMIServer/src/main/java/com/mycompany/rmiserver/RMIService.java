/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIService extends UnicastRemoteObject implements RMIInterface {

    int i = 0;

    protected RMIService() throws RemoteException {
        super();
    }

    @Override
    public String getDescription(String text) throws RemoteException {
        i++;
        System.out.println("MyServerImpl.getDescription: " + text + " " + i);
        return "getDescription: " + text + " " + i;
    }
    
    @Override
    public float Add(float x, float y) throws RemoteException {
        return x+y;
    }
    
    @Override
    public float Sub(float x, float y) throws RemoteException {
        return x-y;
    }
    
    @Override
    public float Mult(float x, float y) throws RemoteException {
        return x*y;
    }
    
    @Override
    public float Div(float x, float y) throws RemoteException {
        return x/y;
    }
}
