package MultiThreading.Syncronization;

public class Account {

	static int Balance = 10000;
	public static void main(String[] args) {
	   AClass oa = new AClass();
	   
	   DepositThead dt1 = new DepositThead(oa, 5000);
	   DepositThead dt2 = new DepositThead(oa, 4000);
	   
	   dt1.start();
	   dt2.start();
	   
	   try
	   {
		   dt1.join();
		   dt2.join();
	   }
	   catch(Exception e)
	   {  
	   }
System.out.println("Total balance is: "+Balance);
	}
}
