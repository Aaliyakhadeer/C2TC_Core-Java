package com.cg.Arr;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistHeterogeneousDemo {

	public static void main(String[] args) {
		List list   =new LinkedList();
		list.add("Avinash");
		list.add(6);
		list.add("Ajay");
		list.add(56.7f);
		list.add(null);
		list.add(6);
		System.out.println(((LinkedList) list).offer("Sanjay"));
		System.out.println(list);
		

	}

}
