package com.string.practice;

public class StrcharAtDemo {

	public static void main(String[] args) {
		/*String s="Javatpoint";
		char ch=s.charAt(8);
		System.out.println(ch);*/
		
		/*String s="Testing Shastra";
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)== 't')
			{
				count++;
			}
		}
		System.out.println("Frequency of t is :" +count);
*/
		String str= "Testing Shastra";
		int str1=str.length();
		System.out.println("Length of String is:" +str1);
		System.out.println("Character at 0th Index :" +str.charAt(7));
		System.out.println("Character at last Index :" +str.charAt(str.length()-1));
	}

}
