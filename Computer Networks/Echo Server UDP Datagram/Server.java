import java.net.*;
import java.io.*;

public class Server 
{
    static int size=100;        //maximum size of the data that can be received
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket serverSocket = new DatagramSocket(1077);                 //will accept all the client having port no 1077

            DatagramPacket receivPacket = new DatagramPacket(new byte[size], size); //1st arg ->store byte data that will be sent by the client to the server
                                                                                    //2nd ard -> max length of the byte data that will be received
            for(;;)
            {
                serverSocket.receive(receivPacket);                                         //packet received by server
                System.out.println("Message received from "+receivPacket.getAddress());     //IP address of the client
                serverSocket.send(receivPacket);                                            //packet sent to client
                receivPacket.setLength(size);                                               //resetting the size of receivPacket as after getting one message from client its shrink its size to received Packet size as a result new client packet may not fit in it
            }
        }
        catch(Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        }    
    }
}
