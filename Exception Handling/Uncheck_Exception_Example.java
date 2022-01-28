import java.util.Scanner;
class Uncheck_Exception_Example	//this code only show uncheck exception example but exception handling is not done
{
	int a,b;
	UncheckException(int n)
	{
		a=n;
		b=0;
	}
	void display()
	{
		System.out.println("Result: "+a/b);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value: ");
		int a = scan.nextInt();
		UncheckException uc = new UncheckException(a);
		uc.display();
	}
}
