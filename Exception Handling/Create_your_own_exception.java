import java.util.*;
class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}
class Create_your_own_exception
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("Enter the value of x: ");
		x=sc.nextInt();
		System.out.print("Enter the value of y: ");
		y=sc.nextInt();
		try 
		{
		   float z =(float)(x/y);
		   if(z<0.01)
		   {
		   	throw new MyException("Number is too small");
		   }
		   System.out.println("The value of z is: "+z);
		} 
		catch (Exception e) 
		{
			System.out.println("Caught MyException");
			System.out.println(e.getMessage());
		}
	}
}
