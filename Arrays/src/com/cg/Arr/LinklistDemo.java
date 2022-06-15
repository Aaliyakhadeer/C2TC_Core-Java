package com.cg.Arr;

import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args) {
		LinkedList <String> names = new LinkedList<>();
       names.add("Ravi");
       names.add("Rahul");
       names.add("avinash");
       names.add("Ajay");
       names.add("Ajay");//linkedlist accepts dulicate values
       names.add(null);// linkedlist accepts null values
       
       System.out.println("the names in the list are:"+ names);
	}

}
