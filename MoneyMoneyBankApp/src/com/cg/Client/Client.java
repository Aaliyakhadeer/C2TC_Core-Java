package com.cg.Client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMSavingsAcc;
import com.cg.application.MMcurrentAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingsAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingsAcc sa = new MMSavingsAcc(110,"Aaliya",50000,true);
		CurrentAcc ca = new MMcurrentAcc(183,"Khadeer",30000,40000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
