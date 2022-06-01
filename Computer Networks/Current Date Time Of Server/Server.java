import java.net.*;
import java.io.*;
import java.util.Date;

public class Server 
{
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(1077); //creating server which accept port no 1077

            for(;;)
            {
                try
                {
                    Socket clientSocket = serverSocket.accept();        //accepting client having port no 1077
                    System.out.println("Request received from client having IP address "+clientSocket.getLocalAddress()); //showing client IP

                    ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream()); //since Date is an class so we are using ObjectOutputStream

                    out.writeObject(new Date());        //sending Date to the client

                    out.close();                        //Since out is an object so we are closing it
                    clientSocket.close();               //closing client socket
                }
                catch(Exception e)
                {
                    System.out.println("Error!!! "+e.getMessage());
                }
            }
        } catch (Exception e) 
        {
            System.out.println("Error!!! "+e.getMessage());
        }    
    }
}
