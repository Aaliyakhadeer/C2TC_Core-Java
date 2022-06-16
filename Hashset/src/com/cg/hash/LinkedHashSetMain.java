package com.cg.hash;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		LinkedHashSet <String> linked =new LinkedHashSet<>();
		linked.add("rahul");
		linked.add("pass");
		linked.add("blood grp");
		linked.add("o+");
		System.out.println(linked);
		Object[] a=linked.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
