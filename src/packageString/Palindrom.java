package packageString;

import java.util.Scanner;

public class Palindrom {
	
      public String reverse(String input) {
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		
		}
	  
		return rev;
	}
      }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Text to check Palindrome");
		String input=sc.next();
		Palindrom p=new Palindrom();
		if(input.equals(p.reverse(input)))
			{
			 System.out.println(" String  " +input+ " Is Palindrome");
			}
		else
		{
			System.out.println("String  " +input+ " Is Not Palindrome");
		}
	}
	}


