package client;

import com.tns.application.MMBankFactory;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class EntryPoint {

	public static void main(String[] args) {
		BankFactory Scammers = new MMBankFactory();
		SavingAcc user = Scammers.getNewSavingAccount(12345, "Bala", 10000.0f, false);
		CurrentAcc user2 = Scammers.getNewCurrentAccount(4578,"Vishal jolly", 4000.0f,200);
		
		System.out.println(user.toString());
		System.out.println(user2.toString());

	}

}
