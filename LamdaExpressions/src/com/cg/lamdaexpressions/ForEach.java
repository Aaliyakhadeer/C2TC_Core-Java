package com.cg.lamdaexpressions;
import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("rahul");
		obj.add("ravil");
		obj.add("revanth");
		obj.add("rahu");// 3ways  simple for loop,for each,iterator
        for(String e : obj) {
        	System.out.println(e);
        }
        obj.forEach(temp ->System.out.println(temp));// internal iteration
	}

}
