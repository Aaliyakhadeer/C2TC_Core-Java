package com.cg.lamdaexpressions;

interface Lamda2{
	public void display();
} 

public class ThreadExample {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("this is one thread");}).start();
		
	}
}

