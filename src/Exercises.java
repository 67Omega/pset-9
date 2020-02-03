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
		if ((numbers == null) || (numbers.size() < 3) || (numbers.size() % 2 == 0)) {
    	return -1;
    }
    double greatest = -1;
    for (int i = 0; i < numbers.size(); i++){
      if (numbers.get(i) < 0) {
        return greatest;
      }
    }
    double frontEnd = numbers.get(0);
    double backEnd = numbers.get(numbers.size() - 1);
    double midCheck = numbers.get((numbers.size() / 2));
    if ((frontEnd > backEnd) && (frontEnd > midCheck)) {
      greatest = frontEnd;
    } else if ((backEnd > frontEnd) && (backEnd > midCheck)) {
      greatest = backEnd;
    } else if ((midCheck > frontEnd) && (midCheck > backEnd)){
      greatest = midCheck;
    } else if ((backEnd == frontEnd) && (frontEnd == midCheck)){
greatest = midCheck;
}
    return greatest;
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		ArrayList <String> midThree = new ArrayList<String>();
    if ((values == null) || (values.size() < 3) || (values.size() % 2 == 0)) {
    	return midThree;
    }
    for (int i = 0; i < values.size(); i++){
      if (values.get(i) == null) {
        return midThree;
      }
    }
    String middle = values.get((values.size() / 2));
    String middleMinus = values.get((values.size() / 2) - 1);
    String middlePlus = values.get((values.size() / 2) + 1);
    midThree.add(middleMinus);
    midThree.add(middle);
    midThree.add(middlePlus);
    return midThree;
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
