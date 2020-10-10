/*This Program is example of unchecked exception.
 * Becoz it throws the FileNotFoundExce which is checked excep. And it is suggested by compiler before  
 * execution of programBut in this code we also have Arithmatic excep. but compiler doesn't know about
 * this excep. so it will not suggest before the execution of code means it is uncheked excp. It is not
 * checked by the compiler weather progammar handle or not
 */
package com.uncheck.excp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

	 public static void main(String[] args) throws FileNotFoundException  {
			PrintWriter pw=new PrintWriter("input.txt");
			pw.println("Hello");
			System.out.println(10/0);//Arithmatic Exception

	}

}
