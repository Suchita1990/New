package com.string.practice;

import java.util.Locale;

public class StrtoLowercaseDemo {

	public static void main(String[] args) {
		String s="TESTINGSHASTRA";
		String l=s.toLowerCase();
		System.out.println(l);
		
		String str="HELLO teSTING SHASTRA";
		String eng=str.toLowerCase(Locale.ENGLISH);
		System.out.println(eng);
		
		String turkish=str.toLowerCase(Locale.forLanguageTag("tr"));
		System.out.println(turkish);
	}

}
