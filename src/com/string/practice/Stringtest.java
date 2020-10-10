package com.string.practice;

public class Stringtest {
	public static void main(String[] args) {
		String s = "Suchita";
		s.concat("Testing");
		System.out.println(s);// o/p is Suchita bcoz String is immutable
		
		StringBuffer sb = new StringBuffer("Suchita");
		sb.append("Testing");
		System.out.println(sb);// o/p is Suchita Testing bcoz StringBuffer is mutable
		
		String s1 = new String("Suchita");
		String s2 = new String("Suchita");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Suchita");
		StringBuffer sb2 = new StringBuffer("Suchita");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
	}
}
