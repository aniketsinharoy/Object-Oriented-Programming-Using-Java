/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class InsertIn2DArrayList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		ArrayList <ArrayList<String>> array = new ArrayList<ArrayList<String>>();
		int i,j;
		int n=sc.nextInt();
		sc.nextLine();
		String s; 
		while(n>0)
		{
			s=sc.nextLine();
			 array.add(new ArrayList<String>(Arrays.asList(s.split("\\s"))));
			--n;
		}
	}
}
/*
3
1 2 3 4
8 9 
2 35 6 7 8
*/
