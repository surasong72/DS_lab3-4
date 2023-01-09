/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rpc;
import java.rmi.*;
/**
 *
 * @author SWL
 */
public interface ucet extends Remote {
    public int function(int a,int b)throws RemoteException;
    public int power(int a,int b)throws RemoteException;
    public double log(int a)throws RemoteException;
}
