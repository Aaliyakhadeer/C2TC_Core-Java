package com.cg.lamdaexpressions;
 
interface Lamda{
	void display();
}
 
 
 
public class App {

	public static void main(String[] args) {
		 
		 Lamda obj = ()->{System.out.println("i am from display method");
		 System.out.println("i am from display method");
		 System.out.println("i am from display method");
		 System.out.println("i am from display method");
		 
		 };
		 obj.display();

	}

}
