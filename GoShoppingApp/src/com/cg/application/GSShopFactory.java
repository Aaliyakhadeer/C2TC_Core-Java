package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public   class GSShopFactory extends ShopFactory {
	
      public PrimeAcc getNowPrimeAccount( int accno,String accNM, float charges, boolean isPrime) {
    	  GSprimeAcc gsprime = new GSprimeAcc(accno,accNM,charges,isPrime); 
		return null;
		
		 
}

	public NormalAcc getNewNormalAccount(int accno,String accNM, float charges, float deliveryCharge ) {
		GSNormalAcc gsnormal = new GSNormalAcc(accno,accNM,charges,deliveryCharge); 
		return null;
		
		 
	}

	@Override
	public PrimeAcc getNewPrimeAccount(int accno, String accNM, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
