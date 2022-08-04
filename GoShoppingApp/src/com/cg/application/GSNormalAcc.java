package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc(int accno, String accNM, float charges, float deliveryCharge) {
		super(accno, accNM, charges, deliveryCharge);
		 
	}

	public void bookProduct(float deliverCharge) {
		System.out.println("Dear normal user,your charges are: " + getCharges() + "with delivery charges: " + getDeliveryCharge());
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	 
	}


