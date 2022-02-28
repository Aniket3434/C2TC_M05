package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int accNo, String accNm, float accBal, Boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	private static final float MINBAL=3000;

	@Override
	protected String getAccNm() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void withdrawn(float amount) {
		// TODO Auto-generated method stub
		super.withdrawn(amount);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried=" + isSalaried() + ", AccNm="
				+ getAccNm() + "]";
	}

}
