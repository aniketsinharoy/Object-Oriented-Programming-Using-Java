import java.util.Scanner;
class Method_overloading_2                   //use class name and file name as "Sum"
{
    int total;
    Sum(int a,int b)
    {
       total=a+b;
    }
    Sum(int a,int b,int c)
    {
       total=a+b+c;
    }
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        int a,b,c,n;
        System.out.print("Enter number of numbers to be added: ");
        n=r.nextInt();
        if(n==0)
        {
           System.out.println("Bucket is empty");
        }
        else if(n==2)
        {
           System.out.print("Enter first number: ");
           a=r.nextInt();
           System.out.print("Enter second number: ");
           b=r.nextInt();
           Sum s1 = new Sum(a,b);
           System.out.println("Sum of two number is: "+s1.total);
        }
        else if(n==3)
        {
           System.out.print("Enter first number: ");
           a=r.nextInt();
           System.out.print("Enter second number: ");
           b=r.nextInt();
           System.out.print("Enter third number: ");
           c=r.nextInt();
           Sum s1 = new Sum(a,b,c);
           System.out.println("Sum of three number is: "+s1.total);
        }
        else
        {
            System.out.print("Invalid input\n");
        }
    }
}
