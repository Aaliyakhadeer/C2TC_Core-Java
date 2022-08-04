package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMcurrentAcc extends CurrentAcc {

	

	public MMcurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	public void withdraw (float creditLimit) {
		System.out.println("Account Balance after Withdrawal : " +getAccBal() + " and creditLimit provided: " +getCreditLimit());
		
	}
	@Override
	public String toString() {
		return "MMcurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
