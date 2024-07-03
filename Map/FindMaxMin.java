import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		double max = -1;
		double min = Integer.MAX_VALUE;
		for(Double mark : studentMarks.values()){
			if(max<mark){
				max = mark;
			}
			if(min>mark){
				min = mark;
			}
		}
		Map<String, Double> ans = new LinkedHashMap<>();
		for(String name : studentMarks.keySet()){
			if(studentMarks.get(name) == max){
				ans.put(name, max);
			}
		}
		for(String name : studentMarks.keySet()){
			if(studentMarks.get(name) == min){
				ans.put(name, min);
			}
		}
		return ans;
	}

}

class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	  studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}
