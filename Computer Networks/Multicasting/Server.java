import java.net.*;
import java.io.*;
import java.util.*;

public class Server 
{
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket serverSocket = new DatagramSocket(5050);                     //must be different from client port no

            for(int i=0;i<10;++i)
            {
                byte[] byteDate = new Date().toString().getBytes();                     //converting Date to string then to byte
                InetAddress group = InetAddress.getByName("224.0.0.1");             //getting IP address of group 224.0.0.1
                DatagramPacket sendingPacket = new DatagramPacket(byteDate,byteDate.length,group,1077);//creating packet to be sent

                serverSocket.send(sendingPacket);                                   //sending packet to client
                Thread.sleep(1000);                                                 //delaying sending speed
            }
            serverSocket.close();                                                   //close socket
        }
        catch (Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        }
    }
}
