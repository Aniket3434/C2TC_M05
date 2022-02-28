package general;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		// Creating an empty LinkedHashSet of string type
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//Adding element to LinkedHashSet
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		
		// Note : This will not add new element
		// as A already exists
		lhs.add("A");
		lhs.add("E");
		
		// Getting size of LinkedHashSet
		// Using size() method 
		System.out.println("Size of LinkedHashSet = " + lhs.size());
		
		System.out.println("Original LinkedHashSet:" + lhs);
		
		//Removing existing entry from above set
		//Using remove() method
		System.out.println("Removing D from LinkedHashSet:" + lhs.remove("D"));
		
		//Removing existing entry from the above set
		System.out.println("Trying to Remove z which is not " + "present" + lhs.remove("Z"));
		
		//Checking for element whether it is present inside
		// Set or not using contains() method
		System.out.println("Checking if A is present=" + lhs.contains("A"));
		
		//Now lastly printing the updated LinkedHashSet
		System.out.println("Updated LinkedHashSet:" + lhs);
	
	}
}
