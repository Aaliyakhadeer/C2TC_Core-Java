package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc{
	private Boolean isPrime;
	 private static final float deliveryCharge = 0;
	 
	 
	public PrimeAcc(int accno, String accNM, float charges, Boolean isPrime) {
		super(accno, accNM, charges);
		this.isPrime = isPrime;
	}
	public void bookProduct (float charges) {
		System.out.println("charges are: " +charges);
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
