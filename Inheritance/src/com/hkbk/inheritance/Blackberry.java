package com.hkbk.inheritance;

public class Blackberry extends Mobile{

	public Blackberry(String man, String os, String mod, double cos) {
		super(man, os, mod, cos);
		 
	}
	public String getModel(){
		return "this is a Superclass method: " + this.model;
	
}
}