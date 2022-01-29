import java.util.*;

public class Map_Class
{
    public static void main(String[] args) 
    {
        Map<Integer, String> hm = new HashMap<Integer, String>();  //declaring a hashmap
        hm.put(1, "one");                                         //put key value pairs in hashmap
        hm.put(4, "four");
        hm.put(2, "two");
        hm.put(5, "five");
        hm.put(3, "three");
        hm.put(15, "fifteen");
        System.out.println(hm.toString());                      //printing hashmap by converting it into string

        hm.put(1,"once");
        System.out.println(hm);                                 //printing hashmap by default it convert into string
        
        boolean isKeyPresent = hm.containsKey(1);		// Check if key exists in the Map
        
        hm.replace(1,"one");
        for (Integer keys : hm.keySet())                        //printing hashmap by using for loop
        {
            System.out.println(keys+" "+hm.get(keys));    
        }
        System.out.println(hm.values());                        //printing hashmap values

        Map<Integer,String> tm = new TreeMap<>(hm);             //copying hashmap into treemap (treemap store the map in sorted order)
        tm.put(12,"twelve");
        for (Integer key: tm.keySet())
        {
            System.out.println(key+" "+tm.get(key));
        }
        
        int last_key= tm.lastKey();				                //to get last key of treemap
	int first_key=tm.firstKey();				            	//to get first key of treemap
        
        hm.clear();                                             //it make the map empty or we can say it clear it all
        System.out.println(hm);
    }
}
