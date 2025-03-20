/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    String getDescription(String text) throws RemoteException;
    float Add(float x, float y) throws RemoteException;
    float Sub(float x, float y) throws RemoteException;
    float Mult(float x, float y) throws RemoteException;
    float Div(float x, float y) throws RemoteException;
}
