import java.util.*;
class Exception_handling_try_catch
{
	int a,b;
	HandleException(int n)
	{
		a=n;
		b=0;
	}
	void display()
	{
		try
		{
		System.out.println("Result: "+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 not possible!!!");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value: ");
		int a = scan.nextInt();
		HandleException c = new HandleException(a);
		c.display();
	}
}
