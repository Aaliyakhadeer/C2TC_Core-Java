package com.cg.application;

import com.cg.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {
	private String getaccBal;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	
	}
	
	private static final float MINBAL = 0;
	

	public void withdraw (float accBal) {
		System.out.println("Account Balance before withdrawal " +getAccBal());
	}


	@Override
	public String toString() {
		return "MMSavingsAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
