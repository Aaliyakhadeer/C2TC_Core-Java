package com.cg.framework;

public abstract class ShopFactory {
	  public abstract PrimeAcc getNewPrimeAccount(int accno, String accNM,float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount( int accno, String accNM, float charges, float deliveryCharges);

}
