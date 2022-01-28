import java.util.*;
class Nested_Try_Catch_and_finally_block
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;++i)
		{
			System.out.print("Enter element at index "+i+": ");
			array[i]=sc.nextInt();
		}
		try 
		{
			System.out.print("Enter index of the element: ");
			int f=sc.nextInt();
			System.out.println("The element is: "+array[f]);
		   	try 
		   	{
		        	System.out.print("Enter divisor: ");
		        	int d=sc.nextInt();
		        	System.out.println("The quotient is: "+array[f]/d);
			} 
			catch (ArithmeticException e) 
			{
		        	System.out.println("Number cannot be divided by 0!!!");
		        	System.out.println(e);
			}
		   
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
		   System.out.println("The given index is not in array range!!!");
		   System.out.println(e);
		}
		finally
		{
			System.out.println("Let's hope for the best");
		}
		
	}
}
