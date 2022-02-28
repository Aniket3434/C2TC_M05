package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	@Override
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return new MMSavingAcc(accNo,accNm,accBal,isSalaried);
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
}
}
