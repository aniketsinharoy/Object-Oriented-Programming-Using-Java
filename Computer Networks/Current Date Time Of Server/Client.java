import java.net.*;
import java.io.*;
import java.util.Date;

class Client
{
    public static void main(String[] args) 
    {
        try
        {
            Socket clientSocket = new Socket("localhost", 1077);         //connecting clientSocket to servervat loaclhost at port no 1077

            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());    //read date from server

            try
            {
                Date receivedDate = (Date)in.readObject();                      //store Date 
                System.out.println("Current Server Time: "+receivedDate);
            }
            catch(Exception e)
            {
                System.out.println("Error!!! "+e.getMessage());
            }

            in.close();
            clientSocket.close();
        }   
        catch(Exception e)
        {
            System.out.println("Error!!! "+e.getMessage());
        } 
    }
}
