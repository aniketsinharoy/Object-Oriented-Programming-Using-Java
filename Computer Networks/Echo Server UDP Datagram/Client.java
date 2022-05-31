import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client
{
    static int timeout=3000;        //waiting time to receive data from server
    static int maxTry=30;           //maximum no of attempt to sent a single message to server
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket clientSocket = new DatagramSocket();
            clientSocket.setSoTimeout(timeout);         //seting the maximum waiting time

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the sentence to be echoed: ");
            String sentence = sc.nextLine();

            byte[] byteSentence = sentence.getBytes();          //converting string to byte form

            DatagramPacket sentPacket = new DatagramPacket(byteSentence,byteSentence.length,InetAddress.getLocalHost(),1077);
            //1st arg -> byte form of string message
            //2nd arg -> length of the byte sentence
            //3rd arg -> address of the server
            //4th arg -> port number

            DatagramPacket receivPacket = new DatagramPacket(new byte[byteSentence.length], byteSentence.length);
            //1st arg -> storage space of byte that are going to be sent by the server
            //2nd arg -> size of the byte to be received

            boolean packetReceived = false;                 //packet received from server?
            int tries = 0;                                  //no of tries to sent the message till now
            do
            {
                clientSocket.send(sentPacket);              //sent packet to the server
                try
                {
                    clientSocket.receive(receivPacket);                                     //receive packet from the server
                    if(!receivPacket.getAddress().equals(InetAddress.getLocalHost()))       //check if the message from the right server 
                                                                                            //or not
                    {
                        System.out.println("Message received from unknown source");
                    }
                    packetReceived = true;                                          //message received then make it true
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                    ++tries;
                }
            }
            while((!packetReceived)&&(tries<maxTry));

            System.out.println("Message Received: "+new String(receivPacket.getData()));    //show the echoed message

            clientSocket.close();
        }
        catch(Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        }
    }
}
