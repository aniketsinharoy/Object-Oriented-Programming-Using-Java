import java.util.Scanner;
import java.lang.Math;
class Shape
{
   double area;
   void calarea(float l,float b)
   {
       area=l*b;
   }
   void calarea(float r)
   {
      area=3.14*r*r;
   }
   void calarea(float l,float b,float r)
   {
      double s;
      s=(l+b+r)/2;
      area=Math.sqrt(s*(s-l)*(s-b)*(s-r));
   }
   void display(float r)
   {
      System.out.println("The area of the circle is: "+area);
   }
   void display(float l,float b,float r)
   {
      System.out.println("The area of the scalar triangle is: "+area);
   }
   void display(float l,float b)
   {
      System.out.println("The area of the rectangle is: "+area);
   }
   public static void main(String[] args)
   {
      Scanner r1 = new Scanner(System.in);
      float l,b,r;
      Shape s1 = new Shape();
      System.out.print("Enter the length of rectangle: ");
      l=r1.nextFloat();
      System.out.print("Enter the breadth of rectangle: ");
      b=r1.nextFloat();
      s1.calarea(l,b);
      s1.display(l,b);
      System.out.print("Enter the radius of the circle: ");
      r=r1.nextFloat();
      s1.calarea(r);
      s1.display(r);
      System.out.print("Enter the first side of triangle: ");
      l=r1.nextFloat();
      System.out.print("Enter the second side of triangle: ");
      b=r1.nextFloat();
      System.out.print("Enter the third side of triangle: ");
      r=r1.nextFloat();
      s1.calarea(l,b,r);
      s1.display(l,b,r);
   }
}
