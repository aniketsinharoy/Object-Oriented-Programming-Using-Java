class Parameterized_constructor   // use class name and file name as "Employee"
{
   int e_id;
   String e_name,e_dept;
   Employee(int a,String b,String c)
   {
      this.e_id=a;
      this.e_name=b;
      this.e_dept=c;
   }
   public static void main(String[] args)
   {
       Employee a = new Employee(01,"Aniket","IT");
       Employee b = new Employee(02,"Avik","Account");
       Employee c = new Employee(03,"Shounak","HR");
       Employee d = new Employee(04,"Madhurima","IT");
       System.out.println("Employee ID: "+a.e_id+" Employee NAME: "+a.e_name+" Employee DEPT: "+a.e_dept);
       System.out.println("Employee ID: "+b.e_id+" Employee NAME: "+b.e_name+" Employee DEPT: "+b.e_dept);
       System.out.println("Employee ID: "+c.e_id+" Employee NAME: "+c.e_name+" Employee DEPT: "+c.e_dept);
       System.out.println("Employee ID: "+d.e_id+" Employee NAME: "+d.e_name+" Employee DEPT: "+d.e_dept);
   }
}
