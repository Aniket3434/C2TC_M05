package com.tns.framework;

public abstract class CurrentAcc {
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super();
		this.creditLimit = creditLimit;
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	protected abstract String getAccBal();
	

	public void withdrawn(float amount) {
		
	}
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNm()=" + getAccBal() + ", getAccNo()=" + getAccBal()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	

	
	

	
	
	
	
}
