import java.util.Scanner;
class Find_the_largest_number
{
    public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = reader.nextInt();
		System.out.print("Enter second number: ");
		int n2 = reader.nextInt();
		System.out.print("Enter third number: ");
		int n3 = reader.nextInt();
		if((n1>=n2)&&(n1>=n3))
		{
			System.out.print("Largest Number: "+n1);
		}
		else if((n2>=n1)&&(n2>=n3))
		{
			System.out.print("Largest Number: "+n2);
		}
		else
		{
			System.out.print("Largest Number: "+n3);
		}
	}
}
