package com.cg.regex;

import java.util.regex.Pattern;

public class RegexExample3 {

	public static void main(String[] args) {
		System.out.println("? quantifer......");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaa"));
		System.out.println(Pattern.matches("[amn]?", "ammmna"));
		System.out.println(Pattern.matches("[amn]?", "aazzzttttt"));
		System.out.println(Pattern.matches("[amn]?", "am"));

	}

}
