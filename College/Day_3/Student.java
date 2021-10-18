class Student
{
   String student_name;
   int student_id;
  /* Student()
   {
       this.student_id=122;
       this.student_name="STCET student";
   }  */
   public static void main(String[] args)
   {
      Student s = new Student();
      System.out.println("STUDENT ID: "+s.student_id);
      System.out.println("STUDENT NAME: "+s.student_name);
   }
}
