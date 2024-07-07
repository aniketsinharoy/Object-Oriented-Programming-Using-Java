Given two linked lists that store integer values, return a linked list containing the common elements from both the lists. Implement the logic inside findCommonElements() method.
Test the functionalities using the main() method of the Tester class.

Sample Input and Output
listOne: 10->12->21->1->5
listTwo: 11->21->25->53->47
Output: 21->53
---------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Tester {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    Set<Integer> elements = new LinkedHashSet<>();
		for(Integer i: listOne){
			elements.add(i);
		}
		List<Integer> ans = new LinkedList<>();
		for(Integer i: listTwo){
			if(elements.contains(i)){
				ans.add(i);
			}
		}
		return ans;
	}
	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}
