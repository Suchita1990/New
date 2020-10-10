package com.string.practice;

public class StreplaceAllDemo {

	public static void main(String[] args) {
		
		String s = "Javatpoint is very good website";
		
		/*s = s.replaceAll("a", "e");
		System.out.println(s);

		String str = s.replaceAll("is", "was");
		System.out.println(str);*/

		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
