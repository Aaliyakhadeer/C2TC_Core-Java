package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSShopFactory;
import com.cg.application.GSprimeAcc;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa = new GSprimeAcc(123,"rahul",1000,false);
        NormalAcc na = new GSNormalAcc(456,"ravi",1000,100);
        pa.bookProduct(pa.getCharges());
        pa.toString();
        na.bookProduct(na.getCharges()); 
        na.toString();
	}

}
