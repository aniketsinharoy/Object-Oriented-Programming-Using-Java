class Static_block_come_before_main_method 
{ 
	static 
	{ 
        	System.out.println("Static block created. \nHello World!!!");
 	}
	public static void main(String args[])
	{
        	System.out.println("Main method called.");
 	}
}
