/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmi;
import java.rmi.*;
/**
 *
 * @author SWL
 */
public interface InterDate extends Remote{
    public String display() throws Exception;
}
