package com.string.practice;

public class StrisEmptyDemo {

	public static void main(String[] args) {
		String s1="";
		String s2="javatpoint";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		if(s1.length()==0 || s1.isEmpty())
		{
			System.out.println("String s1 is Empty");
		}
		else
		{
			System.out.println("s1");
		}
		
		if(s2.length()==0 || s2.isEmpty())
		{
			System.out.println("String s2 is Empty");
		}
		else
		{
			System.out.println(s2);
		}
		
	}
}
	  


