package com.string.practice;

public class StrsplitDemo {

	public static void main(String[] args) {
		/*
		 * String s = "I am very good Java Programmar"; String[] words = s.split("\\s");
		 * for (String w : words) { System.out.println(w);
		 * 
		 * }
		 * 
		 * 
		 * String str = "geekss@for@geekss"; String[] arrOfStr = str.split("s", 5);
		 * 
		 * for (String a : arrOfStr) System.out.println(a);
		 */

		String str1 = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr1 = str1.split(":");
	    	for (String a1 : arrOfStr1)
			System.out.println(a1);
		

		String st = "GeeksforGeeksforStudents";
		String[] arrOfst = st.split("for");
		   for (String a0 : arrOfst)
			System.out.println(a0);

		String str = "word1, word2 word3@word4?word5.word6";
		String[] arrOfStr = str.split("[, ?.@]+");
    		for (String a : arrOfStr)
			System.out.println(a);
	}

}
