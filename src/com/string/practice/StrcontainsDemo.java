package com.string.practice;

import javax.swing.plaf.synth.SynthStyle;

public class StrcontainsDemo {

	public static void main(String[] args) {
		/*String s="What do you know about Java";
		System.out.println(s.contains("do you know"));
		System.out.println(s.contains("about"));
		System.out.println(s.contains("Hello"));
*/
		/*String s="Hello Automation Engineers";
		boolean isContains = s.contains("Automation");
		System.out.println(isContains);
		System.out.println(s.contains("automation"));
		if(s.contains("engineers"))
		{
			System.out.println("String is found");
		}
		else
		{
			System.out.println("String is not found");
		}*/
		
		String str="Just a Simple STRING";
		String str2="string";
		
		System.out.println(str.toLowerCase().contains(str2.toLowerCase()));
		
		System.out.println(str.toUpperCase().contains(str2.toUpperCase()));
	}

}
