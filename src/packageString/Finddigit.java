package packageString;

import java.util.Scanner;

public class Finddigit {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(char i:ch)
		{
			 if(i>='0' && i<='9')
			 {
				  System.out.println(i);
				  count++;
			 }
		}
		System.out.println("Number Of Digit:"+count);
	}
}
*/
	String str;
	String num;
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter String:");
	str=s.nextLine();
	
	num=str.replaceAll("[0-9]","");//this will give us string rexpect digits
	System.out.println("String is: "+num);
	
	num=str.replaceAll("[^0-9]","");//this will give us characters only
	System.out.println("Digits Are: "+num);
	}
}