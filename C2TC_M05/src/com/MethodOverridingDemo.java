package com;

class Bank
{
	float getRateofInterest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{
	float getRateofInterest()
	{
		return 7.0f;
	}
}

class HDFC extends Bank
{
	float getRateofInterest()
	{
		return 6.8f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI obj = new SBI();
		System.out.println(obj.getRateofInterest());
		
		Bank obj1 = new SBI();
		System.out.println(obj1.getRateofInterest());

	}

}
