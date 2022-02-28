package com.tns.framework;

public abstract class SavingAcc {
	private boolean isSalaried;
	private static final float MINBAL = 5000.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal,Boolean isSalaried) {
		super();
		this.isSalaried = isSalaried; 
	}
	

	public void withdrawn(float amount) {
		
	}
	
	protected abstract String getAccNm();
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccNm()=" + getAccNm()
				+ ", getAccNo()=" + getAccNm() + ", getAccBal()=" + getMinbal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
