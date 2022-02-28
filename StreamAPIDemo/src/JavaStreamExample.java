import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<Product>();
		p1.add(new Product(1,"SamsungMobile",15000f));
		p1.add(new Product(1,"NokiaMobile",10000f));
		p1.add(new Product(1,"BlackBerryMobile",13000f));
		p1.add(new Product(1,"Iphone",50000f));
		p1.add(new Product(1,"VivoMobile",15000f));
		p1.add(new Product(1,"OppoMobile",18000f));
		
		List<Float> pp1 = new ArrayList<Float>();
		for(Product product:p1)
		{
			if(product.price<30000)
			{
				pp1.add(product.price);
			}
		}
		
		System.out.println(pp1);
		

	}

}
