import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products 
{
	int id;
	String name;
	float price;
	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class JavaStreamExampleUdpated {

	public static void main(String[] args) {
		List<Products> p1 = new ArrayList<Products>();
		p1.add(new Products(1,"SamsungMobile",15000f));
		p1.add(new Products(1,"NokiaMobile",10000f));
		p1.add(new Products(1,"BlackBerryMobile",13000f));
		p1.add(new Products(1,"Iphone",50000f));
		p1.add(new Products(1,"VivoMobile",15000f));
		p1.add(new Products(1,"OppoMobile",18000f));
		
		List<Float> ppl = p1.stream().filter(p->p.price<30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(ppl);
	}
}
