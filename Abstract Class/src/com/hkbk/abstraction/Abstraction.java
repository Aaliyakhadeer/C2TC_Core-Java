package com.hkbk.abstraction;

abstract class Bike{
	abstract void run();
	
}
 class Honda extends Bike{
	 void run() {
		 System.out.println("it is running safely");
	 }
 }
 public class Abstraction {
	  public static void main(String[] args) {
		   Honda h = new Honda();
		   h.run();
	  }
	 
 }