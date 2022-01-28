import java.util.*;  
class Lexical_sort_strings
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of names: ");
		int n=scan.nextInt();
		scan.nextLine();
		String[] s = new String[n];
		for(int i=0;i<s.length;++i)
		{
			s[i]=scan.nextLine();
		}
		//Arrays.sort(s);                           //quick sort using 2 pivort
		Arrays.parallelSort(s);                     // merge sort 
		for(int i=0;i<s.length;++i)
		{
			System.out.println(s[i]);
		}
	}
}
