import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		if ((a.get(0) == b.get(0))||(a.get(a.size() - 1) == b.get(b.size() - 1))) {
      			return true;
		} else {
      			return false;	// default return value to ensure compilation
    		}
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		ArrayList<String> emptyList = new ArrayList<String>();
    if ((values == null) || (values.size() < n) || (n <= 0)){
    	return emptyList;
    }
    ArrayList <String> returnEnds = new ArrayList<String>();
    returnEnds.addAll(values.subList(0, n));
    returnEnds.addAll(values.subList(values.size() - n, values.size()));
		if (returnEnds == null || returnEnds.size() == 0){
      return emptyList;
    } else {
      return returnEnds;
    }
	}
	
	public int difference(ArrayList<Integer> numbers) {
		if ((numbers == null) || (numbers.size() < 1)) {
    	return -1;
    }
    int largeEnd = numbers.get(0);
    int smallEnd = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++){
      if (numbers.get(i) > largeEnd) {
        largeEnd = numbers.get(i);
      } else if (numbers.get(i) < smallEnd) {
        smallEnd = numbers.get(i);
      }
    }
    int difference = largeEnd - smallEnd;
    return difference;
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
