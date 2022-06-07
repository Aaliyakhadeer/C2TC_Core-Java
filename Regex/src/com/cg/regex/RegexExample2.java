package com.cg.regex;

import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]","abcd"));
		System.out.println(Pattern.matches("[amn]","b"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
	}

}
