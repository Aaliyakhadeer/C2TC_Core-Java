package com.cg.multi;

class Eclipse extends Thread {
 public void run() {
	 //for(int i=0;i<5;i++) {
	 System.out.println("eclipse thread id is" +Thread.currentThread().getId());
	 System.out.println("eclipse thread id priority is" +Thread.currentThread().getPriority());
 }
}

class PPT extends Thread{
	public void run() {
		//for(int i=0;i<5;i++) {
		System.out.println("PPT thread id is" +Thread.currentThread().getId());
	 }
	}

 class NotePad extends Thread{
	 public void run() {
		// for(int i=0;i<5;i++) {
			System.out.println("notepad thread id is" +Thread.currentThread().getId());
			System.out.println("notepad thread priority is" +Thread.currentThread().getPriority());
		 }
 }
 
public class multiThread {

	public static void main(String[] args) {
		Eclipse obj1 =new Eclipse();
		obj1.start();
		obj1.setPriority(6);
		PPT obj2 = new PPT();
		obj2.start();
		obj2.setPriority(8);
		NotePad obj3 =new NotePad();
		obj3.start();
		obj3.setPriority(9);
		System.out.println("main thread id is" +Thread.currentThread().getId());
		
	}
}

