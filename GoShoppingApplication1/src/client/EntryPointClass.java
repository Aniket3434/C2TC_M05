package client;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class EntryPointClass {
	static ShopFactory Adulteration;
	static PrimeAcc pobj;
	static NormalAcc nobj;
	public static void main(String[] args) {
		Adulteration = new GSShopFactory();
		nobj = Adulteration.getNewNormalAcc(12, "Kshitu", 250, 20);
		pobj = Adulteration.getNewPrimeAcc(1,"Anay",799,true);
		
		System.out.println(nobj.toString());
		System.out.println(nobj.toString());
		
		
		

	}

}
