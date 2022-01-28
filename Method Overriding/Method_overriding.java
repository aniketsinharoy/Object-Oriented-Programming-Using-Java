import java.util.Scanner;
class Parent
{
   int l,b;
   Parent(int x, int y)
   {
     l=x;
     b=y;
   }
   void show()
   {
      System.out.println("The two numbers are: "+l+" "+b);
   }
}
class Child extends Parent
{
   int h;
   Child(int x, int y, int z)
   {
     super(x,y);
     h=z;
   }
   void show()
   {
      System.out.println("The three numbers are: "+l+" "+b+" "+h);
   }
}
class Method_overriding
{
  public static void main(String args[])
   {
      Scanner r1 = new Scanner(System.in);
      int m,n,p;
      System.out.print("Enter the first number: ");
      m=r1.nextInt();
      System.out.print("Enter the second number: ");
      n=r1.nextInt();
      System.out.print("Enter the third number: ");
      p=r1.nextInt();
      Child c1 = new Child(m,n,p);
      c1.show();
   }
}

