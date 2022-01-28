import java.util.Scanner;
class Use_of_static_member_2 			//use class name and file name as "Student"
{
	String name;
	int s_id;
	static String college_name="STCET";
	Student(String a,int b)
	{
		name=a;
		s_id=b;
	}
	static void show()
	{
		System.out.println("Student name: "+name);
		System.out.println("College name: "+college_name);
	}
	void display()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student ID: "+s_id);
	}
	public static void main(String args[])
	{
		Scanner r1 = new Scanner(System.in);
		int a;
		String b;
		System.out.print("Enter Student ID: ");
		a=r1.nextInt();
		System.out.print("Enter Student nmae: ");
		r1.nextLine();
		b=r1.nextLine();
		Student s1 = new Student(b,a);
		s1.display();
		Student.show();
	}
}

