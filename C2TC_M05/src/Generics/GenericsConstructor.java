package Generics;

public class GenericsConstructor {
public double v;
public <T extends Number>GenericsConstructor(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Val of v is: "+v );
}
	public static void main(String[] args) {
		System.out.println("Number to Double Conversion: ");
		GenericsConstructor obj = new GenericsConstructor(10);
		obj.show();
		
		GenericsConstructor obj1 = new GenericsConstructor(136.8f);
		obj1.show();
		

	}

}
