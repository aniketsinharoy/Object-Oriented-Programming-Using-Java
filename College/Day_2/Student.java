import java.util.Scanner;
class Student
{
    String name, dept;
    int year, id; 
    public static void main(String[] args)
    {
        Student s=new Student();
        s.insertinfo();
        s.displayinfo();
    }
    void insertinfo()
    {
       Scanner r = new Scanner(System.in);
       System.out.print("ID: ");
       id=r.nextInt();
       r.nextLine();
       System.out.print("Name: ");
       name=r.nextLine();
       System.out.print("Department: ");
       dept=r.nextLine();
       System.out.print("Year: ");
       year=r.nextInt();  
    }
    void displayinfo()
    {
       System.out.println("ID: "+id);
       System.out.println("Name: "+name);
       System.out.println("Department: "+dept);
       System.out.println("Year: "+year);
       System.out.println(""); 
    }
}
