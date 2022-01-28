import java.util.Scanner;
abstract class Employee
{
	String emp_name,emp_doj; 
	int emp_id;
	double emp_salary;
	void getinfo(String name,String doj,int id)
	{
		emp_name=name;
		emp_doj=doj;
		emp_id=id;
	}
	void display()
	{
		System.out.println("\nEmployer Information");
		System.out.println("Employer ID: "+emp_id);
		System.out.println("Employer Name: "+emp_name);
		System.out.println("Employer's date of joining: "+emp_doj);
		System.out.println("Employer Salary: Rs. "+emp_salary);
	}
	abstract void getsal();
}
class Manager extends Employee
{
	double basic_pay=65000;
	void getsal()
	{
		emp_salary=basic_pay+(0.99*basic_pay);
	}
}
class Salesman extends Employee
{
	double basic_pay=15000;
	void getsal()
	{
		emp_salary=basic_pay+(0.85*basic_pay);
	}
}
class Abstract_method
{
	public static void main(String[] args)
	{
		Scanner r = new Scanner(System.in);
		String name,doj;
		int id;
		System.out.print("Enter employer's ID (manager): ");
		id=r.nextInt();
		r.nextLine();
		System.out.print("Enter employer's name (manager): ");
		name=r.nextLine();
		System.out.print("Enter employer's date of joining (manager): ");
		doj=r.nextLine();
		Manager m = new Manager();
		m.getinfo(name,doj,id);
		m.getsal();
		System.out.print("Enter employer's ID (salesman): ");
		id=r.nextInt();
		r.nextLine();
		System.out.print("Enter employer's name (salesman): ");
		name=r.nextLine();
		System.out.print("Enter employer's date of joining (salesman): ");
		doj=r.nextLine();
		Salesman s = new Salesman();
		s.getinfo(name,doj,id);
		s.getsal();
		m.display();
		s.display();	
	}
}
