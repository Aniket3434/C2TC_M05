package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{
	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges , boolean isPrime) {
		// TODO Auto-generated method stub
		return new GSPrimeAcc(accNo, accNm, charges, isPrime);
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
	}

	

}
	