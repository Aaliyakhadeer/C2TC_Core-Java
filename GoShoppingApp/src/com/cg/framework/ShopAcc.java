package com.cg.framework;

public abstract class ShopAcc {
	private int accno;
	 private String accNM;
	 private float charges;
   public void bookProduct(float charges) {
	   System.out.println("product booked and charges are:" +charges);
	   
	   
   }
   public ShopAcc(int accno, String accNM, float charges) {
	super();
	this.accno = accno;
	this.accNM = accNM;
	this.charges = charges;
}
   
  public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAccNM() {
	return accNM;
}
public void setAccNM(String accNM) {
	this.accNM = accNM;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}
public void items(float charges) {
	System.out.println("items are delivered with charges:" +charges);
	   
   }
@Override
public String toString() {
	return "ShopAcc [accno=" + accno + ", accNM=" + accNM + ", charges=" + charges + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
   
}
