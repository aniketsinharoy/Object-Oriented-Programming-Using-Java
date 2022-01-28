import java.util.Scanner;
class Parameterized_constructor_2          // use class name and file name as "Student"
{
    String student_name;
    int student_id;
    Student(int a,String b)
    {
         this.student_id=a;
         this.student_name=b;
    }
    public static void main(String[] args)
    {
        Student[] s = new Student[5];
        Scanner r = new Scanner(System.in);
        int a;
        String b;
        for(int i=0;i<5;++i)
        {
           System.out.print("Enter Student Id: ");
           a=r.nextInt();
           System.out.print("Enter Student name: ");
           r.nextLine();
           b=r.nextLine();
           s[i] = new Student(a,b);
        }
        for(int i=0;i<5;++i)
        {
           System.out.println("STUDENT ID: "+s[i].student_id+" STUDENT NAME: "+s[i].student_name);
        }
    }
}
