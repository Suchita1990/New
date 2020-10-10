package com.various.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test3 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("abc.txt");//Checked Exception filenotfound
		pw.println("Hello");
	}

}
