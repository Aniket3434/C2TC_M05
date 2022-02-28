package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	
private final float deliverycharges;

public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
	super(accNo, accNm, charges);
	this.deliverycharges=50;
}

public float getDeliverycharges() {
	return deliverycharges;
}

@Override
public String toString() {
	return "NormalAcc [deliverycharges=" + deliverycharges + ", getDeliverycharges()=" + getDeliverycharges()
			+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
	
}
