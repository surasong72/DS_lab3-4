/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rpc;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author SWL
 */
public class rpc extends UnicastRemoteObject implements ucet {
    public rpc()throws Exception
{}
    @Override
    public int function(int a,int b)throws RemoteException
{
int m;
m=(a*a)+(b*b)+(2*a*b);
return m;
}
    @Override
    public int power(int a,int b)throws RemoteException
{
int m=(int)Math.pow(a,b);
return m;
}
    @Override
    public double log(int a)throws RemoteException
{
return(Math.log(a));
}}


