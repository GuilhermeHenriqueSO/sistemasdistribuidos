package Vers�o4;

import java.io.*;
import java.net.*;

public class RecebeComplexo {

public static void main(String[] args)
    
{  try
        {  ServerSocket ss = new ServerSocket(9000);
           Socket s = ss.accept();
           ObjectInputStream in = new ObjectInputStream(new DataInputStream(s.getInputStream()));
           Complexo c = (Complexo) in.readObject();
           System.out.println("M�dulo = " + c.modulo());
           s.close();
       }

        catch(Exception e){}

    }
}
