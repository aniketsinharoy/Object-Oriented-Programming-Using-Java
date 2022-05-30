import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Socket clientSocket = new Socket("localhost",1077);         //port no same as server port

            Scanner sc = new Scanner(System.in);
            String sentence; 
            System.out.print("Enter the sentence to be echo: ");
            sentence = sc.nextLine();

            byte[] byteSentence = sentence.getBytes(); //converting string into byte form since while transferring data bytes are used

            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();

            out.write(byteSentence);                //transfering data to server

            int totalByteReceived=0;                //total bytes received from server
            int currentNoOfByteReceived;            //current no of bytes received from server at a particular time

            while(totalByteReceived<byteSentence.length)
            {
                if((currentNoOfByteReceived = in.read(byteSentence,totalByteReceived,byteSentence.length - totalByteReceived))==-1)
                {
                    throw new SocketException("Connection closed prematurely");             //1st arg -> place to hold data from server
                }                                                                           //2nd arg -> data offset
                totalByteReceived+=currentNoOfByteReceived;                                 //3rd arg -> max no of byte to be read
            }

            System.out.println("Echoed Sentence: "+ new String(byteSentence));          //converting byte message into string

            clientSocket.close();
        }
        catch (Exception e)
        {
            System.out.println("Error!!!"+" "+e.getMessage());
        } 
    }
}
