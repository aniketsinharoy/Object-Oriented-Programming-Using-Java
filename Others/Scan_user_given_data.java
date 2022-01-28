import java.util.Scanner;
class Scan_user_given_data
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
        	System.out.print("Enter student name: ");
		String n=reader.nextLine();
		System.out.print("Enter student roll number: ");
		String r=reader.nextLine();
		System.out.print("Enter student department: ");
		String d=reader.nextLine();
		System.out.println("Name: "+n);
		System.out.println("Roll number: "+r);
		System.out.println("Department: "+d);
	}	
}
