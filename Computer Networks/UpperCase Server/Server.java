import java.net.*;
import java.io.*;


public class Server 
{
    static int MaxBytes = 50;
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket serverSocket = new ServerSocket(1077);

            for(;;)
            {
                try
                {
                    Socket clientSocket = serverSocket.accept();            //accepting client
                    System.out.println("Connection received from "+clientSocket.getInetAddress().getHostName()+" having IP address "+clientSocket.getInetAddress().getHostAddress());

                    InputStream in = clientSocket.getInputStream();
                    OutputStream out = clientSocket.getOutputStream();

                    byte[] byteSentence = new byte[MaxBytes];

                    int currentReceivedMessageSize;                                 //current no of bytes received
                    while((currentReceivedMessageSize = in.read(byteSentence))!=-1) //-1 when no byte is comming
                    {
                        String partialSentence = new String(byteSentence).toUpperCase();    //converting byte into string of uppercase
                        byteSentence = partialSentence.getBytes();                          //converting string to byte
                        out.write(byteSentence,0,currentReceivedMessageSize);               //sending to client
                    }

                    clientSocket.close();
                }
                catch (Exception e) 
                {
                    System.out.println("Error!!! "+e.getMessage());
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error!!! "+e.getMessage());
        }
    }
}
