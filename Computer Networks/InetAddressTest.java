import java.net.*;
class InetAddressTest
{
    public static void main(String[] args) 
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);                      //IP address of the local computer(machine in which the code is running)
            System.out.println(address.getHostName());       // Username of the local computer 
            System.out.println(address.getHostAddress());   //IP address of the local computer(machine in which the code is running) 
                                                            //we can say address-->address.getHostName +"/"+ address.getHostAddress()

            address = InetAddress.getByName("google.com");  //adress holds the IP address of the google.com
            System.out.println(address);                    //IP address of google.com
            System.out.println(address.getHostName());      //gives current Ip Address host name i.e google.com
            System.out.println(address.getHostAddress());   //IP address of google.com

        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}