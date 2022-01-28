import java.util.Scanner;
class CEO
{
   String ceo;
   CEO(String a)
   {
   	ceo=a;
   }
}
class Manager extends CEO
{
  String manager;
  Manager(String b, String c)
  {
    super(c);
    manager=b;
  }
}
class Employer extends Manager
{
  String emp;
  Employer(String a, String b, String c)
  {
    super(b,c);
    emp=a;
  }
  void display()
  {
    System.out.println("CEO: "+ceo);
    System.out.println("Manager: "+manager);
    System.out.println("Employer: "+emp);
  }
}
class Multilevel_Inheritance
{
  public static void main(String args[])
  {
    Scanner r1 = new Scanner(System.in);
    String a,b,c;
    System.out.print("Enter Employer name: ");
    a=r1.nextLine();
    System.out.print("Enter Manager name: ");
    b=r1.nextLine();
    System.out.print("Enter CEO name: ");
    c=r1.nextLine();
    Employer e1 = new Employer(a,b,c);
    e1.display();
  }
}
