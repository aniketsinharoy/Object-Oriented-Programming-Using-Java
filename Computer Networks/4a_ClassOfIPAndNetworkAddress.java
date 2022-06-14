import java.util.*;

public class ClassOfIPAndNetworkAddress 
{
    public static void main(String[] args) 
    {
        String ipAddress;
        String part1,part2,part3,part4;
        int part1InInt;
        int firstDotIndex, secondDotIndex, thirdDotIndex;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the IP Address: ");
        ipAddress=sc.nextLine();

        firstDotIndex = ipAddress.indexOf('.');
        secondDotIndex = ipAddress.indexOf('.',firstDotIndex+1);
        thirdDotIndex = ipAddress.lastIndexOf('.');

        part1 = ipAddress.substring(0,firstDotIndex);
        part2 = ipAddress.substring(firstDotIndex+1,secondDotIndex);
        part3 = ipAddress.substring(secondDotIndex+1, thirdDotIndex);
        part4 = ipAddress.substring(thirdDotIndex+1);

        part1InInt = Integer.parseInt(part1);

        if((part1InInt>=0)&&(part1InInt<=127))
        {
            System.out.println(ipAddress+" belongs to class A.");
            System.out.println("Network Address: "+part1+".0.0.0");
        }
        else if((part1InInt>=128)&&(part1InInt<=191))
        {
            System.out.println(ipAddress+" belongs to class B.");
            System.out.println("Network Address: "+part1+"."+part2+".0.0");
        }
        else if((part1InInt>=192)&&(part1InInt<=223))
        {
            System.out.println(ipAddress+" belongs to class C.");
            System.out.println("Network Address: "+part1+"."+part2+"."+part3+".0");
        }
        else
        {
            if((part1InInt>=224)&&(part1InInt<=239))
            {
                System.out.println(ipAddress+" belongs to class D.");
                System.out.println("This class does have any kind of Network Address.");
            }
            else if((part1InInt>=240)&&(part1InInt<=255))
            {
                System.out.println(ipAddress+" belongs to class E.");
                System.out.println("This class does have any kind of Network Address.");
            }
            else
            {
                System.out.println(ipAddress+" does not belong to any class. Please enter valid IP address.");
            }
        }
    }
}
