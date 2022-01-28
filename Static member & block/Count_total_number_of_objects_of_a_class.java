class 	Count_total_number_of_objects_of_a_class	//use class name and file name as "Counter"
{
	int number;
	static int obj_count=0;
	Counter()
	{
		number=0;
		++obj_count;
	}
	static void display()
	{
		System.out.println("Number of object created: "+obj_count);
	}
	public static void main(String args[])
	{
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
		Counter.display();
	}
}
