/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmi;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
/**
 *
 * @author SWL
 */
public class ServerDate extends UnicastRemoteObject implements InterDate {
    public ServerDate() throws Exception
{

}
    @Override
    public String display() throws Exception
{
String str = "";
Date d = new Date();
str = d.toString();
return str;
}
public static void main(String args[]) throws Exception
{
ServerDate s1 = new ServerDate();
Naming.bind("DS",s1);
System.out.println("Object registered.....");
}
}
