package com.tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public String getAccNm() {
		return accNm;
	}
	
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccBal(float accBal) {
		this.accBal= accBal;
	}
	
	public void withdrawn(float amount)
	{
		
	}
	
	public void deposit(float amount)
	{
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	}

