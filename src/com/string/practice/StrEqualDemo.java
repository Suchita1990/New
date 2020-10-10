package com.string.practice;

public class StrEqualDemo {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";    //o/p :Equal
		//String s2="java";  o/p :Not Equal
		if(s1==s2)
		{
			System.out.println("s1 and s2 have same address");
		}
		else
		{
			System.out.println("Not Equal Address");
		}
		
		String str2=new String("Rani");
		String str3=new String("Rani");
		System.out.println(str2==str3); //refernce check
		System.out.println(str2.equals(str3)); //content check
		
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2));//false
		
		String st1="javatpoint";
		String st2="javatpoint";
		String st3="JAVATPOINT";
		System.out.println(st1.equals(st2));//true
		System.out.println(st1.equals(st3));//false
		String st4="python";
		System.out.println(st1.equals(st4));//false
		
		if(st1.equals(st3))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
	}

}
