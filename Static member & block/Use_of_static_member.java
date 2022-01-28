class Student
{  
   int rollno;
   String name;  
   static String college ="STCET";
   Student(int r, String n)
   {  
     rollno = r;  
     name = n;  
   }  
   void display()
   {
     System.out.println(rollno+" "+name+" "+college);
   }  
}  

class Use_of_static_member
{  
   public static void main(String args[])
   {  
      Student s1 = new Student(73,"Aniket");  
      Student s2 = new Student(74,"Subham");    
      s1.display();  
      s2.display();  
   }  
}  
