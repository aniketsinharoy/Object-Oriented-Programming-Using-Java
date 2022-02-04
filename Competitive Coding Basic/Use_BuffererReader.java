import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Use_BuffererReader{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n= Integer.parseInt(br.readLine());  
      int m=Integer.parseInt(br.readLine());    //value must be entered in the new line
      System.out.println(n+" "+m); 

      String[] s = br.readLine().split("\\s");     //take single line input seperated by space
      System.out.println(Arrays.toString(s));

      int[] in = new int[s.length];
      for (int i = 0; i < s.length; i++) 
      {
         in[i]=Integer.parseInt(s[i]);          //converting single line string input to int
      }
   }
}
