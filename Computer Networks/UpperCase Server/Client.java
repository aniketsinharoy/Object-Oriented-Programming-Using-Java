import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) 
    {
        try 
        {
            Socket clientSocket = new Socket("localhost",1077);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the sentence: ");
            String sentence = sc.nextLine();
            byte[] byteSentence = sentence.getBytes();      //converting string to byte

            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();

            out.write(byteSentence);                        //sending bytes to server
            
            int totalByteReceived=0;                        //no of bytes received till now
            int currentByteReceived;                        //current no of bytes received

            while(totalByteReceived<byteSentence.length)
            {
                if((currentByteReceived = in.read(byteSentence,totalByteReceived,byteSentence.length-totalByteReceived))==-1)
                {
                    throw new SocketException("Connection closed permentaly");  //1st arg -> store place   2nd arg->data offset
                }                                                               //3rd arg -> maximum space
                totalByteReceived+=currentByteReceived;
            }

            System.out.println("Received message: "+ new String(byteSentence)); //bytes to string

            clientSocket.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error!!! "+e.getMessage());
        }    
    }
}
