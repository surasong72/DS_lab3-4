
package com.mycompany.rpc;
import java.rmi.*;
/**
 *
 * @author SWL
 */
public class serverrpc {
   public static void main(String arg[])
{
try
{
rpc ob=new rpc();
Naming.rebind("serverrpc",ob);
}
catch(Exception e) 
    {
    }
}
}

