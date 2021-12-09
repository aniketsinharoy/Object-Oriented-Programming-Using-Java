import java.util.*;
class InsertIn1DArrayList
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] array = s.split("\\s");
		ArrayList<String> a = new ArrayList<String>(Arrays.asList(array));
		System.out.println(a);
	}
}
