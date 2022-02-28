package Generics;

import java.util.ArrayList;

public class UpperBoundedWildCardDemo {
	
	public static Double add(ArrayList < ? extends Number> a1)
	{
		double sum = 0.0;
		for(Number n:a1)
		{
			sum=sum+n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		System.out.println("display the sum" +add(a1));
		
		ArrayList<Double> al1 = new ArrayList<Double>();
		al1.add(10.0);
		al1.add(20.0);
		al1.add(30.0);
		System.out.println("display the sum" + add(al1));
		

	}

}
