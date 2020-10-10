package com.string.practice;

public class StrequalIgnoranceDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3="HELLO";
		String s4="good";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
