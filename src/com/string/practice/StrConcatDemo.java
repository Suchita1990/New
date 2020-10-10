package com.string.practice;

public class StrConcatDemo {

	public static void main(String[] args) {
		String str = "Suchita";
		// str.concat("Hello");
		System.out.println(str);
		str = str.concat("! Good Morning");
		System.out.println(str);

		String s1 = "Java String";
		s1.concat("is immutable");
		System.out.println(s1);
		
		s1=s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);
		
		String st1="Hello";
		String st2="Javapoint";
		String st3="Reader";
		String st4=st1.concat(st2);
		System.out.println(st4);
		String st5=st1.concat(st2).concat(st3);
		System.out.println(st5);
		
		st4=st1.concat(" ").concat(st2).concat(" ").concat(st3);
		System.out.println(st4);
		
		st5=st1.concat("!!!");
		System.out.println(st5);
		
		String st6=st1.concat(("@").concat(st2));
		System.out.println(st6);

	}

}
