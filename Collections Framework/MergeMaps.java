Merge two hash maps in such a way that no data is lost. If the maps contain duplicate keys with different values, then while merging add the value of the duplicate key with a new key by concatenating "new" with the key. Implement the logic inside mergeMaps() method and return a HashMap containing the entries of both the HashMaps passed to the method.

Test the functionalities using the main() method of the Tester class.

Sample Input and Output:
mapOne = {"Toby"=15, "Michel"=20, "Jim"=24}
mapTwo = {"Toby"=15,"Michel"=40, "Jack"=30}
Output: {"Toby"=15, "Michel"=20 "Michelnew"=40, "Jim"=24, "Jack"=30}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {
    
    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        Map<String, Integer> ans = new HashMap<>(mapOne);
		for(String s : mapTwo.keySet()){
			if(ans.containsKey(s) && ans.get(s)!=mapTwo.get(s)){
				ans.put((s+"new"), mapTwo.get(s));
			}
			else{
				ans.put(s, mapTwo.get(s));
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);
		
		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Andy", 45);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
	
	}
}
