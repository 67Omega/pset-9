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
		boolean emptyTest = true;
    if ((values == null) || (values.length < n) || (n <= 0)){
    	return emptyList;
    }
    ArrayList <String> returnEnds = new ArrayList<String>();
		for (int i = 0; i <= n; i++) {
      if (i > (values.size() - 1)) {
        return emptyArray;
      }
      returnEnds.set(i, values.get(i));
	    if (values.get(i) != null) {
    		emptyTest = false;
    		break;
  	    }
      }
    for (int i = 0; i <= n; i++) {
      returnEnds.set(returnEnds.size() + i, values.get((values.size() - n) + i));
    }
		  if (returnEnds == null || returnEnds.size() == 0 || emptyTest == true){
        return emptyArray;
      } else {
        return returnEnds;
      }
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
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
