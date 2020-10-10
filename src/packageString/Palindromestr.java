package packageString;

import java.util.Scanner;

public class Palindromestr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String t="";
		for(int i=s.length()-1; i>=0;i--)
		{
		  t=t+s.charAt(i);
		}
		
		if(s.equals(t))//equals method check the value in the string class 
		{
			System.out.println("String Is Palindrome");
		}
		
		else
		{
			System.out.println("String Is Not Palindrome");
		}
		
		
	}
}
