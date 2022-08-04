package com.cg.framework;

public abstract class BankFactory {
	public abstract SavingsAcc getNewSavingsAccount(int accNo, String accNm,float accBal, float isSalaried);
	public abstract CurrentAcc getNewcurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
}
