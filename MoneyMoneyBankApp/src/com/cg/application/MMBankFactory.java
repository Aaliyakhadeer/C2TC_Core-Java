package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingsAcc;

public class MMBankFactory extends BankFactory  {

	@Override
	public SavingsAcc getNewSavingsAccount(int accNo, String accNm, float accBal, float isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewcurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

