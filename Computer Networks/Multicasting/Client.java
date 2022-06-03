import java.io.*;
import java.net.*;
import java.util.Date;

public class Client
{
    public static void main(String[] args) 
    {
        try
        {
            MulticastSocket clientSocket = new MulticastSocket(1077);           //creating multicasting socket
            InetAddress group = InetAddress.getByName("224.0.0.1");             //making group
            clientSocket.joinGroup(group);                                      //joining group in multicastSocket

            for(int i=0;i<10;++i)
            {
                byte[] byteDate = new byte[50];                                 //place to store date sent by server

                DatagramPacket receivingPacket = new DatagramPacket(byteDate,byteDate.length);  //1st arg->place to store 2nd arg-> length of storage space
                clientSocket.receive(receivingPacket);                          //receiving packet from server

                String receivedString = new String(receivingPacket.getData());      //convertig byte to string
                String byteToString = new String (byteDate);                        //converting byte to string

                System.out.println("Received message: "+receivedString);            //printing data received from server
                System.out.println("received message: "+byteToString);
            }

            clientSocket.leaveGroup(group);                                         //leaving group
            clientSocket.close();                                                   //closing socket
        }   
        catch(Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        } 
    }
}
