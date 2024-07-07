Implement a program to update a given input stack such that all occurrences of the smallest value are at the bottom of the stack while the order of the other elements remain the same. Implement the logic inside changeSmallest() method.
Test the functionalities using the main() method of the Tester class.

Sample Input and Output:
Stack(top->bottom): 5, 12, 5, 8, 10
Output(top->bottom): 12, 8, 10, 5, 5
--------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		  Deque<Integer> remaining = new ArrayDeque<>();
		  int min = Integer.MAX_VALUE;
		  Deque<Integer> smallest = new ArrayDeque<>();
		  while(!inputStack.isEmpty()){
			  if(min>=inputStack.peek()){
				  min = inputStack.peek();
				  smallest.push(inputStack.pop());
			  }
			  else{
				  remaining.push(inputStack.pop());
			  }
		  }
		  while(!smallest.isEmpty()){
			  if(smallest.peek()==min){
				  inputStack.push(smallest.pop());
			  }
			  else{
				  break;
			  }
		  }
		  while(!remaining.isEmpty()){
			  inputStack.push(remaining.pop());
		  }
		  while(!smallest.isEmpty()){
			  inputStack.push(smallest.pop());
		  }
		  return inputStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}
