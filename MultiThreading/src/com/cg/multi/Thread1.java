package com.cg.multi;

 class Ecli   extends Thread
 {
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println("eclipse thread id is"+ Thread.currentThread().getId());
			 try {
				 sleep(1000);
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
			 }
	 }
 }
public class Thread1 {

	public static void main(String[] args) {
		Ecli  obj = new Ecli ();
		obj.start();

	}

}
