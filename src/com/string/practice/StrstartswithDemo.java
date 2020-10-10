package com.string.practice;

public class StrstartswithDemo {

	public static void main(String[] args) {
		String s = "java string split method by javatpoint";
		System.out.println(s.startsWith("ja"));
		System.out.println(s.startsWith("by"));
		System.out.println(s.startsWith("a", 1));

		String myStr = "Hello";
		System.out.println(myStr.startsWith("Hel")); // true
		System.out.println(myStr.startsWith("llo")); // false
		System.out.println(myStr.startsWith("o")); // false

		String Str = new String("Welcome to geeksforgeeks");

		System.out.print("Check whether string starts with Welcome at pos 11 : ");
		System.out.println(Str.startsWith("Welcome", 11));

		System.out.print("Check whether string starts with geeks at pos 11 : ");
		System.out.println(Str.startsWith("geeks", 11));
	}

}
