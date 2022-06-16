package com.cg.hash;
import java.util.SortedSet;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		SortedSet<String>sites = new TreeSet<>();
		sites.add("technical");
		sites.add("technology");
		sites.add("quiz");
		sites.add("code");
		System.out.println("sorted set:" +sites);
		System.out.println("firstt:" +sites.first());
		System.out.println("last:" +sites.last());
		
		

	}

}
