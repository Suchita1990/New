package com.checked.excp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

	/*public static void main(String[] args) throws FileNotFoundException  {
		PrintWriter pw=new PrintWriter("input.txt");
		pw.println("Hello");
*/
	public static void main(String[] args)  {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("input.txt");
		} catch (FileNotFoundException e) {
			//Method printable format
			e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
		pw.println("Hello");

	}

}
