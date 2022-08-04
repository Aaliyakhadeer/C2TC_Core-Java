package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSprimeAcc extends PrimeAcc{
	public GSprimeAcc(int accno, String accNM, float charges, Boolean isPrime) {
		super(accno, accNM, charges, isPrime);
		 
	}

	private static final float charges = 10;
	
	public void bookProduct(float charges) {
		
		System.out.println("Dear prime user,your charges are: " + getCharges());
	}

	@Override
	public String toString() {
		return "GSprimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	 

}
