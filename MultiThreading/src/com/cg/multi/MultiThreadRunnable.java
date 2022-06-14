package com.cg.multi;

class Ecl  implements Runnable {
	 public void run() {
		 for(int i=0;i<5;i++) {
		 System.out.println("eclipse thread id is" +Thread.currentThread().getId());
	 }
	}
}
	class PPL implements Runnable{
		public void run() {
			for(int i=0;i<5;i++) {
			System.out.println("PPT thread id is" +Thread.currentThread().getId());
		 }
		}
	}
	 class Note  implements Runnable{
		 public void run() {
			 for(int i=0;i<5;i++) {
				System.out.println("notepad thread id is" +Thread.currentThread().getId());
			 }
	 }
	 }

public class MultiThreadRunnable {

	public static void main(String[] args) {
		Eclipse obj1 =new Eclipse();
		Thread t =new Thread(obj1);
		t.start();
		PPT obj2 = new PPT();
		Thread t2 = new Thread(obj2);
		t2.start();
		
	}

}
