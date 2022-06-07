package com.cg.strings;

public class Capacityexample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
        sb.append("java is my fav language");
        System.out.println(sb.capacity());
	}

}
