import java.io.*;
class Check_Exception_Example		//this code only demonstrate checked exception but it is not handled
{
	public static void main(String[] args)
    	{
        	FileReader file = new FileReader("C:\\test\\a.txt");
        	BufferedReader fileInput = new BufferedReader(file);
        	for (int counter = 0; counter < 3; counter++)
        	{
        	    	System.out.println(fileInput.readLine());
        	}
        	fileInput.close();
    	}
}
