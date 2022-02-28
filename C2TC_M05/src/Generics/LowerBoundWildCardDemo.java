package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCardDemo {
	
	public static void displayNumbers(List<? super Integer> list)
	{
		for(Object n:list)
		{
			System.out.println(n);
		}
	}
		

	public static void main(String[] args) 
	{
	List<Integer> l1= Arrays.asList(1,2,3);
	System.out.println("display values");
	displayNumbers(l1);
	
	List<Number> l2 = Arrays.asList(1.0,2.0,3.0);
	System.out.println("display values");
	displayNumbers(l2); 
}
}