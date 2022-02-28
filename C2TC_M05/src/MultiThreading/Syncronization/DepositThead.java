package MultiThreading.Syncronization;

public class DepositThead extends Thread{
	AClass obj;
	int amt;
	
	public DepositThead(AClass obj, int amt) {
		this.obj = obj;
		this.amt = amt;	
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		obj.deposit(amt);
	}
}
