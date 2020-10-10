package com.string.practice;

public class StrsubStringDemo {

	public static void main(String[] args) {
		String s="Automation";
		System.out.println(s.substring(2, 8));
		System.out.println(s.substring(5));
		System.out.println(s.substring(6, 15));//StringIndexOutOfBoundsException
	}

}
