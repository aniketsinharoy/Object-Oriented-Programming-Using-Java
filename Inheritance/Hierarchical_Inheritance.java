import java.util.Scanner;
class RBI
{
   String user_name;
   String bank_type;
   String bank_name;
   RBI(String a, String b, String c)
   {
     user_name=c;
     bank_type=b;
     bank_name=a;
   }
   void display()
   {
     System.out.println("");
     System.out.println("USER Name: "+user_name);
     System.out.println("Bank Name: "+bank_name);
     System.out.println("Bank Type: "+bank_type);
   }
}
class HDFC extends RBI
{
   int balance;
   HDFC(String c, int b)
   {
     super("HDFC BANK","PRIVATE BANK",c);
     balance=b;
   }
   void balance_detail()
   {
     System.out.println("User Balance: "+balance);
     System.out.println("");
   }
}
class SBI extends RBI
{
   int balance;
   SBI(String c, int b)
   {
     super("SBI BANK","GOVERNMENT OWN",c);
     balance=b;
   }
   void balance_detail()
   {
     System.out.println("User Balance: "+balance);
     System.out.println("");
   }
}
class Hierarchical_Inheritance
{
  public static void main(String args[])
  {
    Scanner r1 = new Scanner(System.in);
    String a;
    int b;
    System.out.print("Enter SBI Bank user name: ");
    a=r1.nextLine();
    System.out.print("Enter SBI Bank user balance: ");
    b=r1.nextInt();
    SBI s1 = new SBI(a,b);
    System.out.print("Enter HDFC Bank user name: ");
    r1.nextLine();
    a=r1.nextLine();
    System.out.print("Enter HDFC Bank user balance: ");
    b=r1.nextInt();
    HDFC h1 = new HDFC(a,b);
    s1.display();
    s1.balance_detail();
    h1.display();
    h1.balance_detail();
  }
}

