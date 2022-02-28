package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getAccBal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public void withdrawn(float amount) {
		//TODO Auto-generated method sub
		super.withdrawn(amount);
	}
	
	private String getAccNm() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getAccNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [CreditLimit=" + getCreditLimit() + ", AccNm=" + getAccNm() + " , AccNo=" +getAccNo() + ",AccBal=" + getAccBal() + "]"; 

	

}

	
}

	
