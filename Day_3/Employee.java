class Employee
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
       Employee e = new Employee(05,"Anustup","Sales");
       System.out.println("EMPLOYEE ID: "+a.e_id+" EMPLOYEE NAME: "+a.e_name+" EMPLOYEE DEPT: "+a.e_dept);
       System.out.println("EMPLOYEE ID: "+b.e_id+" EMPLOYEE NAME: "+b.e_name+" EMPLOYEE DEPT: "+b.e_dept);
       System.out.println("EMPLOYEE ID: "+c.e_id+" EMPLOYEE NAME: "+c.e_name+" EMPLOYEE DEPT: "+c.e_dept);
       System.out.println("EMPLOYEE ID: "+d.e_id+" EMPLOYEE NAME: "+d.e_name+" EMPLOYEE DEPT: "+d.e_dept);
       System.out.println("EMPLOYEE ID: "+e.e_id+" EMPLOYEE NAME: "+e.e_name+" EMPLOYEE DEPT: "+e.e_dept);
   }
}
