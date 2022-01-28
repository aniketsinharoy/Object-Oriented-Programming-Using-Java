 class Parent  
{  
	public static void method()  
	{  
		System.out.println("Method of parent class executed.");  
	}    
}  
public class Method_hiding extends Parent  //use class name and file name as "Child"
{  
	public static void method()  
	{  
		System.out.println("Method of child class executed.");  
	}    
	public static void main(String args[])  
	{    
		Parent p = new Child();    
		p.method();    
	}  
}  
