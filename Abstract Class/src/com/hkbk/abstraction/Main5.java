package com.hkbk.abstraction;
interface Inf1{
	public void method1();
}

public class Main5 implements Inf1 {
	
	public void method1() {
		System.out.println("method1");
	}
    public static void main(String args[]) {
    	Main5 obj =new Main5();
    	obj.method1();
    }
}
