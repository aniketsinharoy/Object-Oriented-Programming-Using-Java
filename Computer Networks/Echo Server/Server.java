import java.net.*;
import java.io.*;

public class Server 
{
   public static void main(String[] args) 
   {
        try
        {
            ServerSocket serverSocket = new ServerSocket(1077);         //port no must be greater than 1024

            byte[] byteSentence = new byte[50];                         //input sentence is stored here

            for(;;)                                                     //to accept clients forever 
            {
                Socket clientSocket = serverSocket.accept();            //clientSocket hold client IP address
                System.out.println("Accepted connection from "+clientSocket.getInetAddress().getHostName()+" having IP adress "+clientSocket.getInetAddress().getHostAddress());  //getHostName tell client name & getHostAddress tell client IP address

                InputStream in = clientSocket.getInputStream();
                OutputStream out = clientSocket.getOutputStream();

                int receivedMessageSize;                                    //take receivedMessageSize from client

                while((receivedMessageSize = in.read(byteSentence))!=-1)    //-1 is returned by read() when no data is comming
                {
                    out.write(byteSentence,0,receivedMessageSize);          //1st arg -> byte[] to be sent
                }                                                           //2nd arf -> starting offset
                                                                            // message size
                clientSocket.close();
            }
        }   
        catch(Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        } 
   } 
}
