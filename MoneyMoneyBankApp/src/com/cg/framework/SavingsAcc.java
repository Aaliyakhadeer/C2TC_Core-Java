package com.cg.framework;

public abstract class SavingsAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL = 0;
	
public void withdraw(float accBal) {
	System.out.println("Account balance after withdrawal " +accBal);
}
public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);

}
@Override
public String toString() {
	return "SavingsAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}




}