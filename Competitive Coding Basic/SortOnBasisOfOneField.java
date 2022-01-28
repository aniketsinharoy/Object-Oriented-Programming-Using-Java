//Collections.sort(studentList,Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));
import java.util.*;

class Student
{
   int id;
   String fname;
   double cgpa;
   Student(int id, String fname, double cgpa) 
   {
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() 
   {
      return id;
   }
   public String getFname() 
   {
      return fname;
   }
   public double getCgpa() 
   {
      return cgpa;
   }
}

//Complete the code
public class SortOnBasisOfOneField
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0)
      {
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       
       Collections.sort(studentList,  Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));
       //sort the list 1st using getFname in desc order then using name and then using getId
       //just use like pair of C++
      
         for(Student st: studentList)
         {
         	System.out.println(st.getFname());
      	 }
   }
}
