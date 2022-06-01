package com.hkbk.inheritance;

public class Mobile {
	private String manufacturer;
	private String operating_system;
	protected String model;
	private double cost;
	public Mobile(String manufacturer, String operating_system, String model, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.operating_system = operating_system;
		this.model = model;
		this.cost = cost;
	}
	
		
	
	public String getModel(){
		return "this is a Superclass method: " + this.model;
		
	}
	 
	public String toString() {
		return "mobile [manufacturer=" + manufacturer + ", operating_system=" + operating_system + ", model=" + model
				+ ", cost=" + cost + "]";
	}
	
	
}

