package com.string.practice;

public class StrindexOfDemo {

	public static void main(String[] args) {
		String s="This is the Example of IndexOf method";
		int index=s.indexOf("of");
		System.out.println("indexOf Of is :"+index);
		int index1=s.indexOf("is");
		System.out.println("indexOf is is :" +index1);
		System.out.println(index+"  "+index1);
		
		int index2=s.indexOf("IndexOf", 8);
		System.out.println(index2);
		
		int index3=s.indexOf('t');
		System.out.println(index3);
		
		int index4=s.indexOf("method", 34);
		System.out.println(index4);
		
		int index5=s.indexOf('f', 4);
		System.out.println(index5);
	}

}
