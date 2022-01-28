class Static_block
{
	static int a,b;
	static
	{
		a=1;
		System.out.println("Value of variable a initialized with: "+a);
	}
	static void member(int c)
	{
		System.out.println("Value of variable a: "+a);
		System.out.println("Value of argument passed in method: "+c);
	}
	static
	{
		b=4*a;
		System.out.println("Value of variable b initialized with: "+b);
	}
	public static void main(String args[])
	{
		Static_block.member(6);
	}
}
