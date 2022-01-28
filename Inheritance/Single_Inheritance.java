import java.util.Scanner;
class Room
{
   int length, breadth;
   Room(int x, int y)
   {
     length=x;
     breadth=y;
   }
   int area()
   {
     return (length*breadth);
   }
}
class BedRoom extends Room
{
   int height;
   BedRoom(int x, int y, int z)
   {
     super(x,y);
     height=z;
   }
   int volume()
   {
     return (length*breadth*height);
   }
}
class Single_Inheritance
{
  public static void main(String args[])
   {
      Scanner r1 = new Scanner(System.in);
      int m,n,p;
      System.out.print("Enter the length of the bedroom: ");
      m=r1.nextInt();
      System.out.print("Enter the breadth of the bedroom: ");
      n=r1.nextInt();
      System.out.print("Enter the height of the bedroom: ");
      p=r1.nextInt();
      BedRoom b1 = new BedRoom(m,n,p);
      System.out.println("Area of the bedroom: "+b1.area()+" square unit");
      System.out.println("Area of the bedroom: "+b1.volume()+" square unit");
   }
}

