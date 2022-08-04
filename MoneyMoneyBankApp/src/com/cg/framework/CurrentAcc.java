package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public float getCreditLimit() {
	return creditLimit;
	}

	public void withdraw(float creditLimit) {
	System.out.println("Account CreditLimit: " +creditLimit);
	
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
	}
}