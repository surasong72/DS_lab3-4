/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmi;
import java.rmi.Naming;

/**
 *
 * @author SWL
 */
public class ClientDate {
    public static void main(String args[]) throws Exception
{
String s1;
InterDate h1 = (InterDate)Naming.lookup("DS");
s1 = h1.display();
System.out.println(s1);
} 
}
